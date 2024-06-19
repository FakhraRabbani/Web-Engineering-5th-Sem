class Excep
{

	public static void main(String args[])
	{
		try
		{
			int array[] = new int[100];
			array[100] = 100;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("AIOB exception");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception");
		}
		
		
	}

}
			