import java.io.*;

public class BIS
{

	public static void main(String args[])
	{

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		try
		{
			fis = new FileInputStream("FIS.java");
			bis = new BufferedInputStream(fis);

			int ch = 0;
			while (( ch = bis.read()) > -1)
			{
				//System.out.println("Char: " + (char) ch + "ASCII value: " + ch );
				System.out.print((char) ch);
			}
		
			fis.close();
			bis.close();
		}
		catch(IOException e)
		{
			System.out.println("IO Exception: " + e.getMessage());
		}
	}
}