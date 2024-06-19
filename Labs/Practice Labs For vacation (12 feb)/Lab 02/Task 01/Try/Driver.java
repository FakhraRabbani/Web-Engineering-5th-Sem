class Driver
{

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