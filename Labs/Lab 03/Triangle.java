import java.util.*;

class Triangle implements TwoDimensionalShape
{

	//Data members
	double base, height;

	//Default Constructor
	Triangle()
	{
		this.base = 0.0;
		this.height = 0.0;
	}

	//Parameterized Constructor
	Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}

	//Getter
	double getBase()
	{
		return this.base;
	}

	double getHeight()
	{
		return this.height;
	}

	//Setter
	void setBase(double base)
	{
		this.base = base;
	}

	void setHeight(double height)
	{
		this.height = height;
	}

	//getArea function
	@Override
	public double getArea()
	{
		return ((1.0 / 2.0)*(base * height));
	}

	
	//Overriding toString() method
	@Override 
	public String toString()
	{
		return ("Class Name: Triangle\n" + "height: " + getHeight() + "\nBase: " + getBase());
	}

	//Function to take input for variables
	void getInput()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter base of triangle: ");
		this.base = in.nextDouble();

		System.out.println("Enter height of triangle: ");
		this.height = in.nextDouble();
	}


}



































