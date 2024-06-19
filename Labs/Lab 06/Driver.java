import java.util.*;

class Words
{

	public String word_name, meaning;

	//Constructors

	public Words(){}

	public Words(String word_name, String meaning)
	{
		this.word_name = word_name;
		this.meaning = meaning;
	}

	//Getter
	String getWord()
	{
		return this.word_name;
	}

	String getMeaning()
	{
		return this.meaning;
	}

	//Setter
	void setWord(String word_name)
	{
		this.word_name = word_name;
	}

	void setMeaning(String meaning)
	{
		this.meaning = meaning;
	}

}

class Dictionary
{

	HashMap<String, String> map = new HashMap<>();

	//Insert Record
	public void insertRecord(String word_name, String meaning)
	{
		map.put(word_name, meaning);
		System.out.println("Successfully inserted");

	}

	//Find
	public String findString()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter word you want to search: ");
		String searchWord = in.nextLine();
	
		
		if(map.containsKey(searchWord))
		{
			System.out.println("Key is present");
			return (map.get(searchWord));
		}
		else
		{
			return (map.get(searchWord));	//Null will return
		}
	}
}

public class Driver
{
	public static void main(String args[])
	{

		try
		{
			Scanner in = new Scanner(System.in);
			Dictionary d = new Dictionary();

			while(true)
			{	

				System.out.println("Enter 1 if u want to insert a record\n" + 
				   "Enter 2 to find meaning of a word\n" +
					"Enter 3 to exit\n");

				int choice = in.nextInt();
	
				switch(choice)
				{
				case 1:
					System.out.println("Enter the word you want to insert");
					String word = in.next();
					System.out.println("Enter meaning of the word you inserted");
					String meaning = in.next();
					d.insertRecord(word, meaning);
					break;
	
				case 2:
					String value = d.findString();
					if(value == null)
					{
						System.out.println("Key doesnt exist");
					}
					else
					{
						System.out.println("Meaning of word: " + value);
					}
					break;

				case 3:
					System.out.println("Exiting System");
					System.exit(0);
					//break;
		
				deafault:
					System.out.println("Invalid Choice! Enter choice again!");			
				}

			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured" + e);
		}
		

	}
		

}
		
		 