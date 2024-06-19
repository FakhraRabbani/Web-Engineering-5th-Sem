class Driver
{

	public static void main(String args[])
	{

		//Creating objects of type Square, Rectangle and Circle
		Square mySquare = new Square(2.0);
		Triangle myTriangle = new Triangle(3.0, 2.0);
		Circle myCircle = new Circle(2.0);

		//Saving these objects into an array
		//Creating reference variable of TwoDimensionalShape class 
		TwoDimensionalShape[] myShape = new TwoDimensionalShape[3];
		myShape[0] = mySquare;
		myShape[1] = myTriangle;
		myShape[2] = myCircle;
		
		//Iterating over the array to print Shape's Information
		for(int i = 0; i < myShape.length; i++)
		{
			if(myShape[i] instanceof Circle)
			{
				System.out.println("Circle Info: \n" + myShape[i] + "\nArea: " + myShape[i].getArea());
			}
			else if(myShape[i] instanceof Triangle)
			{
				System.out.println("Triangle Info: \n" + myShape[i] + "\nArea: " + myShape[i].getArea());
			}
			else if(myShape[i] instanceof Square)
			{
				System.out.println("Square Info: \n" + myShape[i] + "\nArea: " + myShape[i].getArea());
			}
		}



	}
	

}
	
