import java.io.*;
import java.util.*;

class WordOccurrence
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("test.txt"));
			
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the word whose occurrence you want to find: ");
			String word = in.next();

			String line;
			int count = 0;

			while((line = br.readLine()) != null)
			{
				String words[] = line.split(" ");

				for(int i = 0; i < words.length; i++)
				{
					if(words[i].equals(word))
					{
						count++;
					}
				}
			}

			System.out.println("The word: " + word + " has occurred " + count + " times in the file.");
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}