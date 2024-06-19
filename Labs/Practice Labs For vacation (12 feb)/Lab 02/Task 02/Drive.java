class Drive
{

	public static void main(String args[])
	{
		//Object of Square Class
		Square mySquare = new Square();
		mySquare.getInput();
		System.out.println("Square Info: " + mySquare.toString());

		Sphere mySphere = new Sphere();
		mySphere.getInput();
		System.out.println("My sphere Info: " + mySphere.toString());

		Square mySquare1 = new Square(mySquare);
		System.out.println("Square Info: " + mySquare1.toString());
		

	}

}