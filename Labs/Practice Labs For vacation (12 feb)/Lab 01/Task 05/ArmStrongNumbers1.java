import java.util.*;

public class ArmStrongNumbers1
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
			sum = sum + (int) (Math.pow(digit, 3));
			number = number / 10;
		}

		if(sum == originalNumber)
			return true;
		else
			return false;
	}

	//Function to print ArmStrong Numbers
	static void printArmStrongNumbers(int start, int end)
	{
		for(int i = start; i <= end; i++)
		{
			if(isArmStrong(i))
			{
				System.out.println( i );
			}
		}
	}

	public static void main(String args[])
	{
		//Variables
		int startRange;
		int endRange;

		Scanner in = new Scanner(System.in);

		//Taking input from user
		System.out.println("Enter starting range: ");
		startRange = in.nextInt();
		System.out.println("Enter ending range: ");
		endRange = in.nextInt();

		System.out.println("Following are some ArmStrong numbers from: " + startRange + " to " + endRange);
		printArmStrongNumbers(startRange, endRange);

		
	}

}