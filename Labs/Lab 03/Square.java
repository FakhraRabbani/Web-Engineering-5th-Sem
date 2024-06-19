import java.util.*;

class Square implements TwoDimensionalShape
{

	//Data members
	double a; //Side of Square

	//Default Constructor
	Square()
	{
		this.a = 0.0;
	}

	//Parameterized Constructor
	Square(double a)
	{
		this.a = a;
	}

	//Getter
	double getA()
	{
		return this.a;
	}

	//Setter
	void setA(double a)
	{
		this.a = a;
	}

	//getArea function
	@Override
	public double getArea()
	{
		return (a * a);
	}

	
	//Overriding toString() method
	@Override 
	public String toString()
	{
		return ("Class Name: Square\n" + "Length: " + a);
	}

	//Function to take input for variables
	void getInput()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of side of Square: ");
		this.a = in.nextDouble();
	}


}



































