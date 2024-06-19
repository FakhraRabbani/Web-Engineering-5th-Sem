import java.io.*;
import java.net.*;
import java.util.*;

class SimpleTimeServer2{
	SimpleTimeServer2()
	{
		Socket ClientSocket = null;
		int portNo = 8002;
		try
		{
			ServerSocket ss = new ServerSocket(portNo);
			while(ss != null)
			{
				try
				{
					ClientSocket = ss.accept();
					
					System.out.println("On server side, getPort(): " + ClientSocket.getPort());
					System.out.println("On server side, localPort()  " + ClientSocket.getLocalPort());
					System.out.println("Host Name: " + ClientSocket.getInetAddress());

					OutputStream os =ClientSocket.getOutputStream();
					Date d = new Date();
					os.write(d.toString().getBytes());

					ClientSocket.close();
				}
				catch(Exception e)
				{
					e.getMessage();
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
		new SimpleTimeServer2();
	}
}