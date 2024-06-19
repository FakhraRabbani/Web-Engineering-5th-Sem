class Rectangle implements Shape
{

	//Data Members
	double length, width;

	//Default Constructor
	Rectangle()
	{
		//this.length = 0.0;
		//this.width = 0.0;
	}

	//Parameterized Constructor
	Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}

	//Copy Constructor
	Rectangle(Square obj)
	{
		this.length = obj.length;
		this.width = obj.width;
	}

	//Mutators
	void setLength(double length)
	{
		this.length = length;
	}

	void setWidth(double width)
	{
		this.width = width;
	}

	//Accessors
	double getLength()
	{
		return this.length;
	}

	double getWidth()
	{
		return this.width;
	}

	//Implementation of abstract functions of Shape
	@Override
	public double CalculateArea()
	{
		return (this.length * this.width);
	}

	@Override
	public double CalculatePerimeter()
	{
		return (2 * (this.length + this.width));
	}

	@Override
	public String toString()
	{
		return ("Class Name: Recatangle\n" + "Area: " + CalculateArea() + "\nPerimeter: " + CalculatePerimeter());
	}

	/*
	public String toString() {
        return "Class: " + getClass().getSimpleName() +
               "\nShape: Square" +
               "\nSide: " + side +
               "\nArea: " + calculateArea() +
               "\nPerimeter: " + calculatePerimeter();
    }*/

}