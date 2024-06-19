import javax.swing.*;

public class Practice {

	private int n1;    
    	private int n2;
	
	// PARAMETRIZED CONSTRUCTOR
    	public Practice(int n1, int n2) 
	{
        	while (n1 < 0 || n2 < 0) 
		{
            		if (n1 < 0) 	
			{
                		JOptionPane.showMessageDialog(null, "First number cannot be negative. Enter it again: ");
                		n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
            		}
            		if (n2 < 0) 
			{
                		JOptionPane.showMessageDialog(null, "Second number cannot be negative. Enter it again: ");
                		n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
            		}
        	}
		this.n1 = n1;
		this.n2 = n2;
    	}

	// DEFAULT CONSTRUCTOR
	public Practice() {}


	// GETTERS
    	public int getN1() 
	{
        	return n1;
    	}

    	public int getN2() 
	{
        	return n2;
    	}


    	// MEMBER FUNCTIONS
    	public static int add(int n1, int n2) 
	{
        	return n1 + n2;
    	}

    	public static int subtract(int n1, int n2) 
	{
        	return n1 - n2;
    	}

    	public static int multiply(int n1, int n2) 
	{
        	return n1 * n2;
    	}

    	public static int divide(int n1, int n2) 
	{
        	return n1 / n2;
    	}


    	public static void main(String[] args) 
	{
        	int n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
        	int n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));

        	// USING CONSTRUCTOR TO CHECK FOR NEGATIVE NUMBERS AND UPDATING VALUES
        	Practice calculator = new Practice(n1, n2);

	        n1 = calculator.getN1();
       		n2 = calculator.getN2();

        	String[] options = {"Addition", "Subtraction", "Multiplication", "Division"};
        	String choice = (String) JOptionPane.showInputDialog(null, "Choose an operation:", "Calculator", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        	switch (choice) 
		{
            		case "Addition":
                		JOptionPane.showMessageDialog(null, "YOUR RESULT:" + add(n1, n2));
                		break;

            		case "Subtraction":
                		JOptionPane.showMessageDialog(null, "YOUR RESULT:" + subtract(n1, n2));
                		break;

            		case "Multiplication":
                		JOptionPane.showMessageDialog(null, "YOUR RESULT:" + multiply(n1, n2));
                		break;

            		case "Division":
                		if (n2 == 0) 
				{
                    			JOptionPane.showMessageDialog(null, "Division by zero in denominator is not allowed.");
                    			return;
                		}
                		JOptionPane.showMessageDialog(null, "YOUR RESULT:" + divide(n1, n2));
                		break;
            		default:
                		JOptionPane.showMessageDialog(null, "OOPS! INVALID CHOICE");
                		break;
        	}
 	   }
}