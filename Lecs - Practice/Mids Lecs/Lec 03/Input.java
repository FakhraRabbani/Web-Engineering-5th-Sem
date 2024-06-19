import java.util.*;

public class Input{
	
	public static void main(String args[])
		{
			//Initialization of variables
			String degree, batch, session, id;

			//Creating instance of scanner class to take input from console
			Scanner in = new Scanner(System.in);

			//Prompt to read degree 
			System.out.println("What is your degree?"); //Read one line from console
			degree = in.nextLine();

			//Prompt to read batch 
			System.out.println("What is your batch?"); 
			batch = in.nextLine();

			//Prompt to read session 
			System.out.println("What is your session?"); 
			session = in.nextLine();

			//Prompt to read id 
			System.out.println("What is your id?"); 
			id  = in.nextLine();

			//Closing the object
			in.close();

			//Displaying output on screen
			System.out.println("Your Roll Number: " +degree+batch+session+id);

		}


}