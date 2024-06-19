import java.io.*;

public class DeserializeDemo
{

	public static void main(String args[])
	{

		Employee e = null;;
	
		try
		{

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("output.txt"));

			e = (Employee) ois.readObject();
		
			ois.close();
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

		System.out.println("Name: " + e.name);
    		System.out.println("Address: " + e.address);
    		System.out.println("SSN: " + e.SSN);
    		System.out.println("Number: " + e.number);
	}
}