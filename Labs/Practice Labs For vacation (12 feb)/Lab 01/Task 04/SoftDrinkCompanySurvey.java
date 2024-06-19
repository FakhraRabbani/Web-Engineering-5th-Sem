public class SoftDrinkCompanySurvey
{

	public static void main(String args[])
	{
		//Variables
		int totalCustomers = 12467;
		double percentageEnergyDrinkCustomers;
		int energyDrinkCustomers;
		double percentageCitrusFlavoredDrinkCustomers;
		int citrusFlavoredDrinkCustomers;

		percentageEnergyDrinkCustomers = 14.0/100;
		energyDrinkCustomers = (int) (percentageEnergyDrinkCustomers * totalCustomers); //TypeCasting

		percentageCitrusFlavoredDrinkCustomers = 64.0/100;
		citrusFlavoredDrinkCustomers = (int) (percentageCitrusFlavoredDrinkCustomers * energyDrinkCustomers);
		
		System.out.println("The approximate number of customers in the survey who purchase one or more energy drinks per week: " + energyDrinkCustomers);
		System.out.println("The approximate number of customers in the survey who prefer citrus flavored energy drinks: " + citrusFlavoredDrinkCustomers);

	}

}