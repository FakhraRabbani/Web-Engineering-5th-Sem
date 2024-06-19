import java.io.*;

public class WriteEx
{

	public static void main(String args[])
	{

		PersonInfo p1 = new PersonInfo("Fakhra", "Sahiwal", "1234");
		PersonInfo p2 = new PersonInfo("Aiman Ijaz", "Lahore", "45678");

		try
		{

			FileOutputStream fos = new FileOutputStream("persons.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(p1);
			oos.writeObject(p2);

			System.out.println("Succesfully wrote objects on stream");

			oos.close();
			fos.close();
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
		