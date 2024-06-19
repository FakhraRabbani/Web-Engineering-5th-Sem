import java.io.*;

public class SerializeDemo
{

	public static void main(String args[])
	{

		Employee e = new Employee();
		e.name = "Fakhra";
		e.address = "Lahore";
		e.SSN = 123;
		e.number = 10;

		try
		{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("output.txt"));

			oos.writeObject(e);

			oos.close();
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}

	