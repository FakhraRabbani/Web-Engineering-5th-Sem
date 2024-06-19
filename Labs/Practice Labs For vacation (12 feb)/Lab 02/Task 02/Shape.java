import javax.swing.*;
import java.util.*;

class Shape
{
	//Data members
	double area, volume;

	//Default Constructor
	Shape()
	{

	}

	//Shape()
	//{
	//	 area = volume = 0.0;
	//}

	//Parameterized Constructore
	Shape(double area, double volume)
	{
		this.area = area;
		this.volume = volume;
	}

	//Copy Constructor
	Shape(Shape obj)
	{
		this.area = obj.area;
		this.volume = obj.volume;
	}

	//Input function (using GUI)
	void getInput()
	{
		String string1 = JOptionPane.showInputDialog("Enter area of Shape: ");
		this.area = Double.parseDouble(string1); //Convert string to double

		String string2 = JOptionPane.showInputDialog("Enter volume of Shape: ");
		this.volume = Double.parseDouble(string2);
	}

	//Over-riding toString method to display data members
	//@Override
	public String toString()
	{
		return ("Area: "  + area + "\nVolume: " + volume);
	}


}
		