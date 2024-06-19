import javax.swing.*;
import java.util.*;

class Sphere extends Shape
{

	//Variables
	double radius;
	final double Pi = 3.14;

	Sphere()
	{
		super();
		this.radius = 0.0;
	}

	Sphere(double area, double volume, double radius)
	{
		super(4*Math.PI*radius*radius, (4.0/3.0)*Math.PI*Math.pow(radius,3));
		this.radius = radius;
	}

	Sphere(Sphere obj)
	{
		super(obj);
		this.radius = obj.radius;
	}

	//Over-riding getInput function
	@Override
	void getInput()
	{
		//super.getInput();
		radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius of Sphere: "));

		//According to the formulas, update
        this.area = 4 * Pi * radius * radius;
        this.volume = (4.0/3.0) * Pi * Math.pow(radius, 3);
	}

	//Over-riding toString function
	@Override
	public String toString()
	{
		return (super.toString() + "\nRadius: " + radius);
	}

}