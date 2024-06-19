public class SoftDrinkCompanySurvey1
{

	public static void main(String args[])
	{
		//Variables
		int totalCustomers = 12467;
		int energyDrinkCustomers;
		int citrusFlavoredDrinkCustomers;

		energyDrinkCustomers = (int) ((14.0/100) * totalCustomers); //TypeCasting
		citrusFlavoredDrinkCustomers = (int) ((64.0/100) * energyDrinkCustomers);
		
		System.out.println("The approximate number of customers in the survey who purchase one or more energy drinks per week: " + energyDrinkCustomers);
		System.out.println("The approximate number of customers in the survey who prefer citrus flavored energy drinks: " + citrusFlavoredDrinkCustomers);

	}

}