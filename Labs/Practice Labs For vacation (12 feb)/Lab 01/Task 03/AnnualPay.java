public class AnnualPay
{
	
	public static void main(String args[])
	{
		//Variables
		double payAmount = 2000.00;
	    int payPeriods = 12;
		double annualPay;

		//Calculating annual pay
		annualPay = payAmount * payPeriods;

		//Displaying total annual pay on screen
		System.out.println("Total Annual Pay: " + annualPay);
	}

}