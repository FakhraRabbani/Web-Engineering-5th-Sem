import java.net.*;
import java.io.*;

class EchoServer{
	public static void main(String args[]){
		System.out.println("Waiting for client request");
		try
		{
			ServerSocket ss = new ServerSocket(9888);
			Socket s = ss.accept();
			System.out.println("Connection Established");
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str = br.readLine();
			//Sending String back to client
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			pw.println("Server says: " + str);														}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}