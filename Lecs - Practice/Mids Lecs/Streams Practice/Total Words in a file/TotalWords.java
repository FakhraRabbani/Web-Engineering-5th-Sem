import java.io.*;

class TotalWords
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("test.txt"));
	
			String line;
			String words[];
			int count = 0;

			while((line = br.readLine()) != null)
			{
				words = line.split(" ");
				count = count + words.length;

			}
		
			br.close();

			System.out.println("Total Words in a file: " + count);
		}
		catch(IOException ioe)
		{
			ioe.getMessage();
		}
	}
	
}