import java.io.*;
import java.net.*;

class FactorialServer{
	public static void main(String args[]){
		System.out.println("Server Started!");
		try
		{
			ServerSocket ss = new ServerSocket(9898);
			System.out.println("Waiting for client request");
			Socket s = ss.accept();
			System.out.println("Connection Esatblished!");
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			int number = Integer.parseInt(br.readLine());

			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			pw.println("Factorial of " + number + " is: " + calculateFactorial(number));
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}

	public static int calculateFactorial(int num){
		int fact = 1;
		for(int i = 1; i <= num; i++)
		{
			fact = fact * i;
		}
		return fact;
	}
}