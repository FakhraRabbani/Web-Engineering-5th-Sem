import java.util.*;

public class Cylinder extends Circle
{

	//Instance variable
	protected double length;

	//Constructor
	public Cylinder(double radius, double length)
	{
		super(radius);	//Immediate call to parent class
		this.length = length;
	}

	//getArea()
	public double getArea()
	{
		return 2*super.getArea() + 2*Math.PI*length*radius;
	}

} 