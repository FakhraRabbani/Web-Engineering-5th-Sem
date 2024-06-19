public class MySubClass extends MyClass
{

	//Abstract Functions Implementation
	public void display()
	{
		System.out.println("This method is 'display something' and declared in abstract class");
	}

	public void displaySomething()
	{
		System.out.println("This method is 'display' and is declared in abstract class");
	}

	
	public static void main(String args[])
	{
		
		//Creating object of this child class
		MySubClass b = new MySubClass();
		b.display();
		b.displaySomething();
		b.show(); //This method is available here due to inheritance

		/*
		//HW
		//Reference variable of abstract class containing object of this child(concrete) class
		MyClass b = new MySubClass();
		//Calling functions to check behavior
		b.display();
		b.displaySomething();
		b.show(); 
		*/

	}
}