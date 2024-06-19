import java.io.*;
import javax.swing.*;
import java.util.*;


public class Bank
{
String name;
String accountNo;
double amount;


public Bank()
{
	this.name = "";
	this.accountNo = "00000000";
	this.amount = 0.0;
	
}


public Bank(String n, String an, double a)
{
	this.name = n;
	this.accountNo = an;
	this.amount = a;
	
}

public Bank(Bank obj)
{
	this.name = obj.name;
	this.accountNo = obj.accountNo;
	this.amount = obj.amount;
}

public void setName(String n)
{
	this.name = n;
}

public void setAccountNo(String an)
{
	this.accountNo = an;
}

public void setAmount(double a)
{
	this.amount = a;
}

String getName()
{
	return this.name;
}

String getAccountNo()
{
	return this.accountNo;
}

double getAmount()
{
	return this.amount;
}


public static void addNewRecord()
{
	ArrayList arr = new ArrayList();
try
{
	String n = JOptionPane.showInputDialog("Enter Name: ");
	String an = JOptionPane.showInputDialog("Enter Account Number ");
	double a = Double.parseDouble(JOptionPane.showInputDialog("Enter Amount: "));
	Bank p = new Bank(n, an, a);
	arr.add(p);

	String line;
	Bank p1;

	FileWriter fw = new FileWriter("records.txt", true);
	PrintWriter pw = new PrintWriter(fw);
	
	
	for(int i=0; i <arr.size(); i++)
	{	
		p1 = (Bank) arr.get(i);
		line = p1.name + "\t;\t" + p1.accountNo + "\t;\t" + p1.amount;
		pw.println(line);
	}
	
	//line = p.name + "\t;\t" + p.accountNo + "\t;\t" + p.amount;
	//pw.println(line);

	pw.flush();
	pw.close();
	fw.close();

}
catch(IOException e) 
{
	System.out.println(e);
}

}


public static void  transfer(String sender, double t_amount, String reciever)
{

ArrayList array = new ArrayList();
String tokens[] = null;
String n, an; 
double a;

	try  // loading record
	{
		FileReader fr = new FileReader("records.txt");
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();

		while(line != null)
		{
			tokens = line.split("\t;\t");
			n = tokens[0];
			an = tokens[1];
			a = Double.parseDouble(tokens[2]);
			
			Bank p = new Bank(n, an, a);
			array.add(p);
			line = br.readLine();

			
		}

		int s_i = -1;
		int r_i = -1;

		// finding sender
		for( int i=0; i < array.size(); i++)
		{

			Bank p = (Bank) array.get(i);
		
			if(sender.equals(p.name))
			{
			
				s_i =i;	
			
			}

		}
		if(s_i == -1)
		{
			System.out.println("Sender Dont Exist");
			System.exit(0);
		}

		// finding Reciever
		for( int i=0; i < array.size(); i++)
		{

			Bank p = (Bank) array.get(i);
		
			if(reciever.equals(p.name))
			{
			
				r_i =i;	
			
			}

		}
		if(r_i == -1)
		{
			System.out.println("Reciever Dont Exist");
			System.exit(0);
		}

		if(((Bank)array.get(s_i)).amount >= t_amount)
		{
			Bank s = (Bank) array.get(s_i);
			Bank r = (Bank) array.get(r_i);
			
			s.amount = s.amount - t_amount;
			r.amount = r.amount + t_amount;

			FileWriter fw = new FileWriter("records.txt");
			PrintWriter pw = new PrintWriter(fw);
	
	
			for(int i=0; i <array.size(); i++)
			{	
				Bank p1 = (Bank) array.get(i);
				line = p1.name + "\t;\t" + p1.accountNo + "\t;\t" + p1.amount;
				pw.println(line);
			}
	
	

			pw.flush();
			pw.close();
			fw.close();
			
		}
		else
		{
			System.out.println("Not Enough Amount");
		}

		
		
	br.close();
	fr.close();	
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
}


public static void main(String args[])
{
	int input = 0;
	String s, sender,reciever;
	double t_amount=0;

	ArrayList br = new ArrayList();

	while(input != 3)
	{
		input = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 to add" + "\nEnter 2 to transfer" 
			+ "\nEnter 3 to exit"));

		switch(input)
		{
			case 1:
				addNewRecord();
				break;
			case 2: 
				sender = JOptionPane.showInputDialog("Enter the Sender Name: ");
				t_amount = Double.parseDouble(JOptionPane.showInputDialog("Enter the transfer amount: "));
				reciever = JOptionPane.showInputDialog("Enter the Reciever Name: ");
				
				transfer(sender, t_amount, reciever);
				break;
			
			case 3:
				
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null,"Invalid Input! Please Enter Again");
		}
	}
}


}
