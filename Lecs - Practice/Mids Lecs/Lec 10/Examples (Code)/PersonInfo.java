import java.util.*;
import javax.swing.*;
import java.io.*;

public class PersonInfo implements Serializable
{

	//Data Members
	String name;
	String address;
	String phoneNumber;

	//Constructor
	public PersonInfo(String name, String address, String phoneNumber)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public void printPersonInfo()
	{
		JOptionPane.showMessageDialog(null, "Name: " + name + "Address: " + address + "Phone Number: " + phoneNumber);
	}
}
