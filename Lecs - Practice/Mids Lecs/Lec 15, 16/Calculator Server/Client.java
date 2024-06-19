import java.io.*;
import java.net.*;

class Client{
	public static void main(String args[]){
		System.out.println("Client Started!");
		try{
			Socket c = new Socket("localhost", 9999);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter first number: ");
			int num1 = Integer.parseInt(br.readLine());
			System.out.println("Enter second number: ");
			int num2 = Integer.parseInt(br.readLine());

			PrintWriter pw = new PrintWriter(c.getOutputStream(), true);
			pw.println(num1);
			pw.println(num2);

			BufferedReader br2 = new BufferedReader(new InputStreamReader(c.getInputStream()));
			System.out.println(br2.readLine());
			System.out.println(br2.readLine());
			System.out.println(br2.readLine());
			System.out.println(br2.readLine());
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}