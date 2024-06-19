import java.io.*;
import java.net.*;

class SimpleTimeClient{

	public SimpleTimeClient()
	{
		for(int i = 0; i < 5; i++)
		{
			try
			{
				Socket c = new Socket("127.0.0.1", 9999);
				if(c != null)
				{
					BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
					System.out.println(br.readLine());
					c.close();
				}
			}
			catch(Exception e)
			{
				e.getMessage();
			}
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException ie)
			{
				ie.getMessage();
			}
		}
	}

	public static void main(String args[])
	{
		new SimpleTimeClient();
	}
}