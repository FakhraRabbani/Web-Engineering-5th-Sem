import java.io.*;
import java.net.*;

class Server{
	public static void main(String args[]){
		System.out.println("Server Started!");
		try{
			ServerSocket ss = new ServerSocket(9999);
			Socket s = ss.accept();
			System.out.println("Connection Established!");

			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			int num1 = Integer.parseInt(br.readLine());
			int num2 = Integer.parseInt(br.readLine());
		
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			pw.println("Sum of " + num1 + " and " + num2 + " is: " + sum(num1, num2));
			pw.println("Subtraction of " + num1 + " and " + num2 + " is: " + subtract(num1, num2));
			pw.println("Product of " + num1 + " and " + num2 + " is: " + product(num1, num2));
			pw.println("Division of " + num1 + " and " + num2 + " is: " + div(num1, num2));
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}

	public static int sum(int a, int b)
	{
		return (a + b);
	}

	public static int product(int a, int b)
	{
		return (a * b);
	}

	public static int subtract(int a, int b)
	{
		return (a - b);
	}

	public static double div(int a, int b)
	{
		return ((double) a / b);
	}
}