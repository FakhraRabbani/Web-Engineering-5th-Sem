import java.util.*;
import javax.swing.*;
import java.io.*;

class PersonInfo
{

	//Data Members
	String name;
	String address;
	String phoneNumber;

	//Constructor
	public PersonInfo(String name, String address, String phoneNumber)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public void print()
	{
		JOptionPane.showMessageDialog(null, "Name: " + name + "Address: " + address + "Phone Number: " + phoneNumber);
	}
}	

class AddressBook
{

	ArrayList persons;
	

	public AddressBook()
	{
		persons = new ArrayList();
		loadPersons();
	}

	//Load Persons
	void loadPersons(){

			try{
				FileReader fr = new FileReader("persons.txt");
				BufferedReader br = new BufferedReader(fr);

				String line, name, add, ph;
				String tokens[] = null;
				while((line = br.readLine()) != null){
					tokens = line.split(",");
					name = tokens[0];
					add = tokens[1];
					ph = tokens[2];

					PersonInfo p = new PersonInfo(name, add, ph);
					persons.add(p);
				}

				br.close();
				fr.close();
			}
			catch(IOException ioe){
				System.out.println(ioe);
			}
	}

	//Save Persons
	public void savePersons(){
		try{
			PersonInfo p;
			String line;

			FileWriter fw = new FileWriter("persons.txt");
			PrintWriter pw = new PrintWriter(fw);

			for(int i = 0; i < persons.size(); i++)
			{
				p = (PersonInfo) persons.get(i);
				line = p.name + "," + p.address + "," + p.phoneNumber;
				pw.println(line);
			}

			pw.flush();
			pw.close();
			fw.close();
		}
		catch(IOException ioe){
			System.out.println(ioe);
		}
	}

	//Add Person Method
	public void addPerson(int index)
	{
		String name = JOptionPane.showInputDialog("Enter name of person: ");
		String address = JOptionPane.showInputDialog("Enter address: ");
		String phoneNumber = JOptionPane.showInputDialog("Enter phone Number: ");

		PersonInfo p = new PersonInfo(name, address, phoneNumber);
		persons.add(index, p);
	}

	//Delete A person
	void deletePerson(String n)
	{
		for(int i = 0; i < persons.size(); i++)
		{
			PersonInfo p = (PersonInfo) persons.get(i);
	
			if(n.equals(p.name))
			{
				persons.remove(i);
			}
		}
	}

	//Search A person
	void searchPerson(String n)
	{
		for(int i = 0; i < persons.size(); i++)
		{
			PersonInfo p = (PersonInfo) persons.get(i);
			
			if(n.equals(p.name))
			{
				p.print();
			}
		}
	}



}

public class Test
{

	public static void main(String args[])
	{
		AddressBook ab = new AddressBook();

		try
		{
			while(true)
			{

				String input = JOptionPane.showInputDialog("Enter 1 to add "
							  	 							+ "\nEnter 2 to Delete "
							   								+ "\nEnter 3 to Search "
							   								+ "\nEnter 4 to Exit ");

				int choice = Integer.parseInt(input);

				String s;
	
				switch(choice)
				{
					case 1:
						int i = Integer.parseInt(JOptionPane.showInputDialog("Enter index at which you want to add: "));
						ab.addPerson(i);
						break;
	
					case 2:
						s = JOptionPane.showInputDialog("Enter name to Delete: ");
						ab.deletePerson(s);
						break;

					case 3:
						s = JOptionPane.showInputDialog("Enter name to Search: ");
						ab.searchPerson(s);
						break;
					case 4:
						ab.savePersons();
						System.exit(0);
				}

			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured: " + e.getMessage());
		}

		
	}
}
			