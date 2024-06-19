import java.io.*;
import java.net.*;

public class Clint
{
	public static void main(String args[])
	{
		try
		{
			Socket c = new Socket("localhost", 2024);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));

			for(int i = 0; i < 100; i++)
			{
				System.out.println(br.readLine());
			}
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}