import java.io.*;
import java.net.*;

class FactorialClient{
	public static void main(String args[]){
		System.out.println("Client Started!");
		try{
			Socket c = new Socket("localhost", 9898);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number whose factorial u want: ");
			int number = Integer.parseInt(br.readLine());
			
			PrintWriter pw = new PrintWriter(c.getOutputStream(), true);
			pw.println(number);

			BufferedReader br2 = new BufferedReader(new InputStreamReader(c.getInputStream()));
			System.out.println(br2.readLine());
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured: " + e);
		}
	}
}
		