class Driver
{
	public static void main(String args[])
	{
		//Creating objects of type Square, Rectangle and Circle
		Square mySquare = new Square(2.0, 2.0);
		Rectangle myRectangle = new Rectangle(3.0, 2.0);
		Circle myCircle = new Circle(2.0);

		//Saving these objects into an array
		//Creating reference variable of Shape class 
		Shape[] myShape = new Shape[3];
		myShape[0] = mySquare;
		myShape[1] = myRectangle;
		myShape[2] = myCircle;

		//Iterating over the array to print Shape's Information
		for(int i = 0; i < myShape.length; i++)
		{
			System.out.println("Shape Info: \n" + myShape[i].toString());
		}
	}
}