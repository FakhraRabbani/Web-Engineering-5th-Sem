import java.util.*;

public class Account{

	public double balance; //Instance variable

	//Deposit function
	public void deposit(double amount){
		balance += amount;
	}

	//Withdraw function
	public double withdraw(double amount){
		if(amount <= balance){
			balance -= amount;
			return amount;
		}
		else{
			return 0.0;
		}
	}

	//Get balance
	public double getbalance(){
		return balance;
	}

	public static void main(String args[]){

		//Creating an instance of Scanner class
		Scanner in = new Scanner(System.in);

		//Creating an instance of Account class (empty account creation)
		Account my_account = new Account();  //Default Constructor

		//Prompt and input for amount to be deposited 
		System.out.print("Amount u want to deposit: ");
		double deposit_amount = in.nextDouble();

		//Calling deposit function to deposit it
		my_account.deposit(deposit_amount);


		//Print current balance
		System.out.println("Current balance in my account: " + my_account.getbalance());

		//Propmt and input for withdraw amount
		System.out.print("Amount u want to withdraw: ");
		double withdraw_amount = in.nextDouble();

		//Withdrawing amount
		my_account.withdraw(withdraw_amount);

		//Printing remaining balance
		System.out.println("Remaining balance in my account after withdrawal: " + my_account.getbalance());

	}

}
		

		