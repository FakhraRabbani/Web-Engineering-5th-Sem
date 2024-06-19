//Importing package for Java Built-in GUI component
import javax.swing.*;

public class Input1{

	public static void main(String args[]){
		
			//Initialization of variables
			String degree, batch, session, id;

			//Prompt and read input for degree
			degree = JOptionPane.showInputDialog("Enter your degree: ");

			//Prompt and read input for batch
			batch = JOptionPane.showInputDialog("Enter your batch: ");

			//Prompt and read input for session
			session = JOptionPane.showInputDialog("Enter your session: ");

			//Prompt and read input for id
			id = JOptionPane.showInputDialog("Enter your id: ");

			//Display output
			JOptionPane.showMessageDialog(null, "Roll Number: " +degree+batch+session+id);
		}

}