class Manager extends Employee
{
	
	public void show()
	{
		//Implementation
	}

	public static void main()
	{
		Manager m =  new Manager(); //We can create object of this class as it is concrete class
		Employee e = new Manager(); //Reference variable of abstract parent class may contain object of child class(which implements all its abstract functions)
		//Employee e2 = new Employee(); //Error: We cant create object of abstract class
	}

}