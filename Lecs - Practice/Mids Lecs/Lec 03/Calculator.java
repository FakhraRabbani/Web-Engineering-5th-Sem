import javax.swing.*;

public class Calculator{

	//Default Constructor
	public Calculator(){

	}

	//Instance Variables
	public int num1, num2;

	//Parameterized Calculator
	public Calculator(int num1, int num2){
		
		if(num1 < 0 || num2 < 0){
            JOptionPane.showMessageDialog(null, "Cant accept negative numbers!");
            System.exit(1);
        }
    	this.num1 = num1;
    	this.num2 = num2;
    }

	public static int sum(int num1, int num2){
		return (num1 + num2);
	}

	public static int subtraction(int num1, int num2){
		return (num1 - num2);
	}

	public static int product(int num1, int num2){
		return (num1 * num2);
	}

	public static int division(int num1, int num2){
		if(num2 != 0)
			return (num1 / num2);
		else{
			JOptionPane.showMessageDialog(null, "Division not possible! Cant divide by zero.");
			return -1; //Throw an error 
		}
    }

	public static void main(String args[])
	{

	String integer1 = JOptionPane.showInputDialog("Enter number 1: ");
	String integer2 = JOptionPane.showInputDialog("Enter number 2: ");

	int n1 = Integer.parseInt(integer1);
	int n2 = Integer.parseInt(integer2);

	Calculator obj = new Calculator(n1, n2);

	String choice = JOptionPane.showInputDialog(null, "Which operation do u want to perform? Chose number: \n" + 
		   													  "1. SUM \n" + 
															  "2. Subtraction \n" 
															  + "3. Multiplication \n" 
															  + "4. Division");

	int operation = Integer.parseInt(choice);

    switch (operation) {

	    case 1:
			JOptionPane.showMessageDialog(null, "Sum of " + n1 + " and " + n2 + " : " + obj.sum(n1, n2));
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Subtraction of " + n1 + " and " + n2 + " : " + obj.subtraction(n1, n2));
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Product of " + n1 + " and " + n2 + " : " + obj.product(n1, n2));
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Division of " + n1 + " and " + n2 + " : " + obj.division(n1, n2));
			break;
		default:
            JOptionPane.showMessageDialog(null, "Invalid choice");
            break;
		}
		

		
	}


}