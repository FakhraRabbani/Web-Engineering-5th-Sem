import java.util.*;

class Health
{

	//Data Members
	private String name;
	private double weight, height, BMI;

	//Constructor
	Health(String name, double weight, double height)
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.BMI = calculateBMI();
	}

	//Over-riding toString function
	@Override
	public String toString()
	{
		return ("Name: " + name + "\nWeight: " + weight + "\nHeight: " + height + "\nBMI: " + BMI);
	}	

	private double calculateBMI()
	{
		return ((this.weight) / (this.height * this.height));
	}

	public String getName()
	{
		return this.name;
	}
	
	public double getWeight()
	{
		return this.weight;
	}

	public double getHeight()
	{
		return this.height;
	}

	public double getBMI()
	{
		return this.BMI;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}
				
}

class IndexOccupiedException extends Exception {

	String message;
	
	public IndexOccupiedException(String message) {
        	this.message = message;
    	}

	@Override
	public String getMessage()
	{
		return this.message;
	}
}

class IndexException extends Exception {

	String message;
	
	public IndexException(String message) {
        	this.message = message;
    	}

	@Override
	public String getMessage()
	{
		return this.message;
	}

}

class Driver
{

	private Health[] people; //Array of people of n size //	Reference Variable

	public Driver(int size) {
       		people = new Health[size];  //Instance 
    	}

	//Save function
	 public void Save() {
        	Scanner in = new Scanner(System.in);

        	System.out.println("Tell the index in which u want to save data: ");
        	int index = in.nextInt();

        	try {
            		if (index < 0 || index >= people.length) {
                		throw new IndexException("Invalid index");
            		}

            		if (people[index] != null) {
                		throw new IndexOccupiedException("Index already occupied");
            		}
	
            		System.out.println("Enter name: ");
           		String name = in.next();
            		System.out.println("Enter weight in kg: ");
            		double weight = in.nextDouble();
            		System.out.println("Enter height: ");
            		double height = in.nextDouble();

            		people[index] = new Health(name, weight, height);
            		System.out.println("Data has been now saved successfully!");
        	} catch (IndexException e) {
            		System.out.println("Error: " + e.getMessage());
        	}
		catch(IndexOccupiedException e){
            		System.out.println("Error: " + e.getMessage());
        	}
    	}
	
	//Retriever function
	public void Retrieve()
	{

		Scanner in = new Scanner(System.in);
		
		int index; 
		System.out.println("Tell the index from which u want to retrieve data: ");
		index = in.nextInt();

		try
		{
			if(index < 0 || people[index] == null || index >= people.length)
			{
				throw new IndexException("Invalid Index");
			}
	
			people[index].toString();
			System.out.println("Data retrieved Successfully");
		}
		catch(IndexException e)
		{
			System.out.println("Exception: " + e.getMessage());
		}
	}

	public static void main(String args[])
	{

		Scanner in = new Scanner(System.in);
		int N; //size

        	System.out.println("Enter the number(size) of people(array): ");
        	N = in.nextInt();

        	try {
            		if (N <= 0){
                		throw new NegativeArraySizeException("Size of array of people (N) can not be negative| Exception occured");
			}

			Driver d = new Driver(N);

            		int choice; //To chose
		
            		do {
                		System.out.println("Menu:");
                		System.out.println("1. Add value in the array");
                		System.out.println("2. Retrieve and print the information of a specific user at index n");
                		System.out.println("3. Exit");

                		System.out.print("Enter your choice: ");
                		choice = in.nextInt();

				//Swicth Statements
                		switch (choice) {
                    		case 1:
                        		d.Save();
                        		break;
                    		case 2:
                        		d.Retrieve();
                        		break;
                    		case 3:
                        		System.out.println("Thus Exiting the program.");
					//System.exit(0);
                        		break;
                    		default:
                        		System.out.println("Invalid choice!!");
				}
                	}while(choice != 3);

            	}
		catch (NegativeArraySizeException e) 
		{
            			System.out.println("Exception: " + e.getMessage());
       		}
    	}

}
		

	