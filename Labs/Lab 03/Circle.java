import java.util.*;

class Circle implements TwoDimensionalShape
{

	//Variables
	double radius;
	final double Pi = 3.14;

	//Default Constructor
	Circle()
	{
		this.radius = 0;
	}

	//Parameterized Constructor
	Circle(double radius)
	{
		this.radius = radius;
	}

	//Getter
	double getRadius()
	{
		return this.radius;
	}

	double getPi()
	{
		return Pi;
	}

	//Setter
	void setRadius(double radius)
	{
		this.radius = radius;
	}

	//getArea function
	@Override
	public double getArea()
	{
		return (Pi * radius * radius);
	}

	
	//Overriding toString() method
	@Override 
	public String toString()
	{
		return ("Class Name: Circle\n" + "Radius: " + getRadius());
	}

	//Function to take input for variables
	void getInput()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter radius of Circle: ");
		this.radius = in.nextDouble();
	}


}