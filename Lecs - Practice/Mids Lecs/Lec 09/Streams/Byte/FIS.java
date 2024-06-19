import java.io.*;

public class FIS
{

	public static void main(String args[])
	{
	
		try
		{
			//FileInputStream fis = new FileInputStream("FIS.java");
			FileInputStream fis = new FileInputStream("FIS.class");
			int ch = 0;
			while (( ch = fis.read()) > -1)
			{
				//System.out.println("Char: " + (char) ch + "ASCII value: " + ch );
				System.out.print((char) ch);
			}
		
			fis.close();
		}
		catch(IOException e)
		{
			System.out.println("IO Exception: " + e.getMessage());
		}
	}
}