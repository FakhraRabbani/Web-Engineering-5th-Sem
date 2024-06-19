import java.net.*;
import java.io.*;

public class Srvr
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss = new ServerSocket(2024);
			while(true)
			{
				Socket s = ss.accept();
				SThread st = new SThread(s);
				st.start();
			}
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}

class SThread extends Thread
{
	Socket st = null;
	SThread(Socket s)
	{
		this.st = s;
	}

	public void run()
	{
		try
		{
			PrintStream ps = new PrintStream(st.getOutputStream());
			for(int i = 0; i < 100; i++)
			{
				ps.println(i);
			}
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		try
		{
			st.close();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}
		