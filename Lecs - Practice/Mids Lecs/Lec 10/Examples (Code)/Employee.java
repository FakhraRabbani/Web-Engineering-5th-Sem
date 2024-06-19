import java.io.*;

public class Employee implements Serializable
{

	public String name;
	public String address;
	public transient int SSN;
	public int number;

	public void mailCheck()
	{
		System.out.println("Name: " + name + "\nAddress: " + address + "\nSSN: " + SSN + "\nNumber: " + number);
	}
}
	