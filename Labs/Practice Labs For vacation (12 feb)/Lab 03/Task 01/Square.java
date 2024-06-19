class Square implements Shape
{

	//Data Members
	double length, width;

	//Default Constructor
	Square()
	{
		//this.length = 0.0;
		//this.width = 0.0;
	}

	//Parameterized Constructor
	Square(double length, double width)
	{
		this.length = length;
		this.width = width;
	}

	//Copy Constructor
	Square(Square obj)
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
		return (4 * this.length);
	}

	@Override
	public String toString()
	{
		return ("Class Name: " + getClass().getSimpleName() + "\nShape: Square\n" + "Area: " + CalculateArea() + "\nPerimeter: " + CalculatePerimeter());
	}


}