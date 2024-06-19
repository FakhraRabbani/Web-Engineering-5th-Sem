interface I1
{
	void show();
}

interface I2
{
	void show();
}

interface I3
{
	void show();
}

interface I4
{
	void show();
}

class Test implements I1, I2, I3, I4
{

	public void show()
	{
		System.out.println("Multiple Inheritance");
	}

	public static void main(String args[])
	{
		I1 ref1; //Reference variable of I1
			ref1 = new Test(); //Conatins object of child class
			ref1.show();

		I2 ref2; 
			ref2 = new Test();
			ref2.show();

		I3 ref3; 
			ref3 = new Test();
			ref3.show();
	}

}
