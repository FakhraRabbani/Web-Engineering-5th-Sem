class B extends A
{

	//Instance variable
	int d;

	//4-parameterized constructor
	B(int l, int m, int n, int o)
	{
		super(l, m, n); // Immediate call to parent constructor
		d = o;
	}

	//Show function
	void show()
	{
		System.out.println("a: " +a);
		System.out.println("b: " +b);
		System.out.println("c: " +c);
		System.out.println("d: " +d);
	}

	//Main function
	public static void main(String args[])
	{
		//Creating object of class B
		B b = new B(1, 2, 3, 4);

		//Calling show function
		b.show();

	}

}