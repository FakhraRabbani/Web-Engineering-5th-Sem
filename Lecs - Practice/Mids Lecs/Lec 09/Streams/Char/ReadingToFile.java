import java.io.*;

public class ReadingToFile
{

	public static void doRead()
	{
		try
		{
			String fileName = "WritingToFile.txt";
			BufferedReader br = new BufferedReader(new FileReader(fileName));

			String s;
			//Reading line by line
			while((s = br.readLine()) != null)
			{
				System.out.println(s);
			}
		
			System.out.println("Reading Finished");
	
			br.close();
		}
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
	}

	public static void main(String args[])
	{
		doRead();
	}
}