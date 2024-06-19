import java.io.*;
import java.net.*;

class SimpleTimeClient2
{
	int portNo = 8002;
	String s_host = "localhost";

	public SimpleTimeClient2()
	{

		for(int i = 0; i < 5; i++)
		{
			try
			{
				Socket s = new Socket(s_host, portNo);
				if(s != null)
				{
					BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
					System.out.println(br.readLine());
					System.out.println("On client Side,  port No: " + s.getPort());
					System.out.println("On client Side,  local port No: " + s.getLocalPort());
					s.close();
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
			catch(Exception e)
			{
				e.getMessage();
			}
		}
	}

	public static void main(String args[])
	{
		new SimpleTimeClient2();
	}
}	