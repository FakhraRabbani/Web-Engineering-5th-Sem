import java.net.*;
import java.io.*;

class s{
	public static void main(String args[]){
		try
		{
			System.out.println("Server Started");
			ServerSocket ss = new ServerSocket(9898);
			System.out.println("Waiting for client request!");
			Socket s = ss.accept();
			
			PrintStream ps = new PrintStream(s.getOutputStream());
			String str = "Message from server machine";
		
			ps.write(str.getBytes());

			s.close();
		}
		catch(IOException ioe)
		{
			ioe.getMessage();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}
	}
}