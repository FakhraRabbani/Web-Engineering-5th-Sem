import java.util.*;

class Account
{
	public double balance;

	public Account()
	{
		balance = 0.0;
	}

	public Account(double amount)
	{
		balance = amount;
	}

	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public double withdraw(double amount)
	{
		return (balance -= amount);
	}

	public double getBalance()
	{
		return balance;
	}

	public static void main(String args[])
	{
		Account obj1 = new Account();
		Account obj2 = new Account(1000.00);
		Account obj3 = new Account();

		ArrayList bank = new ArrayList();

		bank.add(obj1);
		bank.add(obj2);
		bank.add(obj3);

		System.out.println("Size of array list is: " + bank.size());

		for(int i = 0; i < bank.size(); i++)
		{
			Account a = (Account) bank.get(i);
			if(a.getBalance() <= 0)
			{
				System.out.println("Removing");
				bank.remove(i);
			}
		}

		System.out.println("Size of array list after deletion is: " + bank.size());
	}
}

		

