import java.net.*;
import java.io.*;

class EchoClient{

	public static void main(String args[]){
		System.out.println("Client Started");

		try{
			Socket c = new Socket("localhost", 9888);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a String: ");
			String str = br.readLine();
			//Sending String to server
			PrintWriter pw = new PrintWriter(c.getOutputStream(), true);
			pw.println(str);
			BufferedReader br2 = new BufferedReader(new InputStreamReader(c.getInputStream()));
			System.out.println(br2.readLine());
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
} 