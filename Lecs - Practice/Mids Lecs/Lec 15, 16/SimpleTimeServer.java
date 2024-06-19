import java.io.*;
import java.net.*;
import java.util.*;

class SimpleTimeServer{

	public SimpleTimeServer()
	{
		Socket s = null;

		try
		{
			System.out.println("Server Started");
			ServerSocket ss = new ServerSocket(9999);

			while(true)
			{
				try
				{
					s = ss.accept();
					System.out.println("Connection established!");

					PrintStream ps = new PrintStream(s.getOutputStream());

					Date d = new Date();
					ps.write(d.toString().getBytes());

					s.close();
				}
				catch(Exception e)
				{
					System.out.println("Exception occured!" + e);
				}
			}
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}

	public static void main(String args[])
	{
		new SimpleTimeServer();
	}
}

				
