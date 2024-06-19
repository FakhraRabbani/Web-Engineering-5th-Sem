import java.io.*;
import java.util.*;

class Match
{
	public static void main(String args[])
	{
		try
		{
			int count = 0;

			File obj1 = new File("file1.txt");
			File obj2 = new File("file2.txt");

			Scanner in1 = new Scanner(obj1);
			Scanner in2 = new Scanner(obj1);

			while(in1.hasNextLine())
			{
				String d1 = in1.nextLine();
				String d2 = in2.nextLine();
				if(d1.equals(d2))
				{
					count++;
				}
			}

			
			System.out.println("Count : " + count);

			in1.close();
			in2.close();
		}
		catch(Exception e)
		{
			e.getMessage();
		}

	}
}