import java.util.*;

class Student
{
	//Data members
	private int rollNo;
	private String name, email, address;

	//Default Constructor
	Student()
	{

	}

	//Student()
	//{
	//	 this.rollNo = 0;
	//	 this.name = "";
	//	 this.email = "";
	//	 this.address = "";
	//}

	//Parameterized Constructor
	Student(int rollNo, String name, String email, String address)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	//Student(int rollNo1, String name1, String email1, String address1)
	//{
	// 	 setRollNo(rollNo1);
	//	 setName(name1);
	//	 setEmail(email1);
	//	 setAddress(address1);
	//}


	//Copy Constructor
	Student(Student obj)
	{
		this.rollNo = obj.rollNo;
		this.name = obj.name;
		this.email = obj.email;
		this.address = obj.address;
	}

	//Getters
	int getRollNo()
	{
		return this.rollNo;
	}

	String getName()
	{
		return this.name;
	}

	String getEmail()
	{
		return this.email;
	}

	String getAddress()
	{
		return this.address;
	}
	
	//Setters
	void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}

	void setName(String name)
	{
		this.name = name;
	}

	void setEmail(String email)
	{
		this.email = email;
	}

	void setAddress(String address)
	{
		this.address = address;
	}

	//Method to take input about student information
	void inputData()
	{
		Scanner in = new Scanner(System.in);
 
		System.out.println("Enter rollNo of Student: ");
		setRollNo(in.nextInt());
		//this.rollNo = in.nextInt();
		in.nextLine();

		System.out.println("Enter name of Student:");
		setName(in.nextLine());
		//this.name = in.next();

		System.out.println("Enter email: ");
		setEmail(in.next());
		//this.email = in.next();
		in.nextLine();

		System.out.println("Enter address: ");
		setAddress(in.nextLine());
		//this.address = in.next();

	}

	//Method to show data of student information
	void showData()
	{
		System.out.println("Student Information: " );
		System.out.println("Roll No: "  + getRollNo() + "\nName: " + getName() + "\nEmail: " + getEmail() + "\nAddress: " + getAddress() + "\n");
	}

	//Driver
	public static void main(String args[])
	{
		Student[] s = new Student[5];

		s[0] = new Student();
		s[1] = new Student(510, "Fakhra Rabbani", "fakhrarabbani@gmail.com", "Lahore");
		s[2] = new Student(s[1]);
		s[3] = new Student(501, "Ayesha Ashraf", "ayesha@gmail.com", "Kasur");
		s[4] = new Student(s[3]);


		
		//Call for Printing data
		for(int i = 0; i < 5; i++)
		{
			s[i].showData();
		}

		//Call for Assigning data
		s[0].inputData();

		//Call for printing data
		for(int i = 0; i < 5; i++)
		{
			s[i].showData();
		}



	}

} 