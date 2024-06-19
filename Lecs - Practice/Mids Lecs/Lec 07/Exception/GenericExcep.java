class GenericExcep
{

	static int num = 34, den = 0, quot = 0;

	public static void main(String args[])
	{		
		try
		{
			quot = num / den;
		}
		catch(Exception e)
		{
			System.out.println("AE: " + e);
		}	
	}
}