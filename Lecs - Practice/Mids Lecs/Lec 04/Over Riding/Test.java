public class Test
{

	public static void main(String args[])
	{

		//Circle class
		Circle myCircle = new Circle(1.20);
		System.out.println("Area of my Circle: " + myCircle.getArea()); //4.523893421169302

		//Cylinder class
		Cylinder myCylinder = new Cylinder(1.20, 2.50);
		System.out.println("Area of my Cylinder: " + myCylinder.getArea());  //27.89734276387736

		//Implicit/ Up Casting
		Circle myCircle1 = new Cylinder(1.20, 2.50);
		System.out.println("Up Casting ....");
		System.out.println("Area od myCircle1: " + myCircle1.getArea()); //27.89734276387736

		//Explicit/ Down Casting
		Circle myCircle2 = new Cylinder(1.20, 2.50);
		Cylinder myCylinder2;
		myCylinder2 = (Cylinder) myCircle2;
		System.out.println("Area: " + myCylinder2.getArea());  //27.89734276387736
 
		//Try
		Circle myCircle3 = new Circle(1.20);
		Cylinder myCylinder3 = new Cylinder(1.20, 2.50);
		//myCircle3 = myCylinder3; //No error Okay
		//System.out.println("Area of my Circle3: " + myCircle3.getArea());  //27.89734276387736
		//System.out.println("Area of my Cylinder3: " + myCylinder3.getArea());  //27.89734276387736
		//myCylinder3 = myCircle3; //error: incompatible types: Circle cannot be converted to Cylinder
		//myCylinder3 = (Cylinder) myCircle3;  //Exception in thread "main" java.lang.ClassCastException: class Circle cannot be cast to class Cylinder (Circle and Cylinder are in unnamed module of loader 'app') at Test.main(Test.java:33)
   


	}

}