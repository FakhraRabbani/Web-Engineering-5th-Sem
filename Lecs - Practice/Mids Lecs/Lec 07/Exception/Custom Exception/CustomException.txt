class NewException extends Exception
{

	int value;
	
	NewException(int v)
	{
		this.value = v;
	}

	public String toString()
	{
		return("New Exception: " + value);
	}
}

class CustomException
{

	public static void main(String args[])
	{

		try{
			doWork(1);
			doWork(69);
			doWork(0);
		}
		catch(NewException e) 
		{
			System.out.println("Exception: " + e);
		}
	}

	static void doWork(int value) throws NewException
	{
		if(value == 0){ throw new NewException(value);}
		else{ System.out.println("No prblm");}
	}
 }

		
	