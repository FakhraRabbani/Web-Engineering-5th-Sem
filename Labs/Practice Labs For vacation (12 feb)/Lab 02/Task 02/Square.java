import javax.swing.*;

class Square extends Shape
{

	//Data members
	double width, length, height;

	Square()
	{
		super();
		this.width = 0.0;
		this.length = 0.0;
		this.height = 0.0;
	}

	Square(double area, double volume, double width, double length, double height)
	{
		super(length * width, length * width * height);
		this.width = width;
		this.length = length;
		this.height = height;
	}

	Square(Square obj)
	{
		super(obj);
		this.width = obj.width;
		this.length = obj.length;
		this.height = obj.height;
	}

	//Over-riding parent class function toInput()
	@Override
	void getInput()
	{
		//super.getInput(); //Immediate call to parent class over-rided function
		width = Double.parseDouble(JOptionPane.showInputDialog("Enter Width of square: "));
		length = Double.parseDouble(JOptionPane.showInputDialog("Enter Length of square: "));
		height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height of square: "));

		//According to the formulas, update
        this.area = width * length;
        this.volume = width * length * height;
	}
	

	//Over-riding toString function
	@Override
	public String toString()
	{
		return (super.toString() +"\nWidth: " + width + "\nLength: " + length + "\nHeight: " + height);
	}

}	