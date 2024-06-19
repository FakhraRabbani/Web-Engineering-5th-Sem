public class ArmStrongNumbers
{

	//Function to check if a number is an armstrong number
	static boolean isArmStrong(int number)
	{
		int originalNumber = number;
		int sum = 0;
		int digit;

		while(number != 0)
		{
			digit = number % 10;
			sum = sum + (digit * digit * digit);
			number = number / 10;
		}

		if(sum == originalNumber)
			return true;
		else
			return false;
	}

	public static void main(String args[])
	{
		//Variables
		int startRange = 0;
		int endRange = 500;

		System.out.println("Following are some ArmStrong numbers: ");

		for(int i = startRange; i <= endRange; i++)
		{
			if(isArmStrong(i))
			{
				System.out.println( i );
			}
		}
	}

}