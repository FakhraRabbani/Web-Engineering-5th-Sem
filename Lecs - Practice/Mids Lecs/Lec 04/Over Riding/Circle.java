import java.util.*;

public class Circle
{

	//Instance variable
	protected double radius;

	//1-parameterized Constructor
	public Circle(double radius)
	{
		this.radius = radius;
	}

	//getArea function
	public double getArea()
	{
		return Math.PI*radius*radius;
	}

 
}