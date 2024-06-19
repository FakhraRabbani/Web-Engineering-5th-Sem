import java.io.*;

public class ReadEx
{

	public static void main(String args[])
	{
		try
		{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persons.txt"));
	
			PersonInfo p = (PersonInfo) ois.readObject();
			PersonInfo p1 = (PersonInfo) ois.readObject();
		
			p.printPersonInfo();
			p1.printPersonInfo();

			ois.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			