import java.io.*;

public class FOS
{

	public static void main(String args[])
	{
		String s = new String("New Another Line");

		try
		{
    			FileOutputStream fos = new FileOutputStream("test.txt");

			byte buff[] = s.getBytes();
	
			for(int i = 0; i < buff.length; i++)
			{
				fos.write(buff[i]);
			}
		
			System.out.println("Suucessfully wrote data");

			fos.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}

	}

}