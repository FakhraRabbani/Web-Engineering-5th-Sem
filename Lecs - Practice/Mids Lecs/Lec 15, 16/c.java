import java.io.*;
import java.net.*;

class c{
	public static void main(String args[]){
		try
		{
			System.out.println("Client Started!");
			Socket c = new Socket("localhost", 9898);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
			System.out.println(br.readLine());

			br.close();
			c.close();
		}
		catch(IOException ioe)
		{
			ioe.getMessage();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}