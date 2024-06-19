import javax.swing.*;

public class Calculator2{

	//Default Constructor
	public Calculator2(){

	}

	//Instance Variables
	public int num1, num2;

	//Parameterized Calculator
	public Calculator2(int num1, int num2){
		
		if(num1 < 0 || num2 < 0){
            throw new IllegalArgumentException("Cannot accept negative numbers!");
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
			throw new ArithmeticException("Division not possible! Cannot divide by zero.");
		}
    }

	public static void main(String args[])
	{
	
	try{

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
}catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
        } catch (IllegalArgumentException | ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
		

		
	}


}