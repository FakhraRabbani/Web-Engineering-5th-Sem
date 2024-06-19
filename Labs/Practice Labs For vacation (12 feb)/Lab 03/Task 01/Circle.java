class Circle implements Shape
{

	//Data Members
	final double Pi = 3.14;
	double radius;

	//Default Constructor
	Circle()
	{
		//this.radius = 0.0;
	}

	//Parameterized Constructor
	Circle(double radius)
	{
		this.radius = radius;
	}

	//Copy Constructor
	Circle(Circle obj)
	{
		this.radius = obj.radius;
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

	//Implementing abstract functions of Shape class
	@Override
	public double CalculateArea()
	{
		return (Pi * radius * radius);
	}

	@Override
	public double CalculatePerimeter()
	{
		return (2 * Pi * radius);
	}

	//Overriding toString() method
	@Override 
	public String toString()
	{
		return ("Class Name: Circle\n" + "Area: " + CalculateArea() + "\nPerimeter: " + CalculatePerimeter());
	}

}
	