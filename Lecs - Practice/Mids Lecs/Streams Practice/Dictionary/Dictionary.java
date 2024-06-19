import java.util.*;

class Dictionary
{

	HashMap<String, String> map = new HashMap();

	Dictionary()
	{
		map.put("Hello", "Hi");
		map.put("Similar", "Like");
	}

	public void findWord(String word)
	{

		if(map.containsKey(word))
		{
			System.out.println(map.get(word)) ;
		}
	
	}

	public static void main(String args[])
	{
		Dictionary d = new Dictionary();

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the word u want to find: ");
		String word = in.nextLine();

		System.out.println("Meaning of word is: " );
		d.findWord(word);

		
	}

	
}
			
		