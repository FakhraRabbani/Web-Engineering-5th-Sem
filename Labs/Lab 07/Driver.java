import java.io.*;
 
class ReadFile implements Runnable{ 
 	String fileName; 
 
 	// param constructor 
	public ReadFile(String fn) 
	{ 
		this.fileName = fn; 
		Thread t = new Thread(this, fileName);
		t.start();
	} 

	// overriding run method 
	// this method contains the code for file reading 
	// Read and print data line by line with the fileName 
	public void run ( ) 
	{ 
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(fileName));
		
			String line;
			while((line = br.readLine()) != null)
			{
				System.out.println(fileName + " " + line);
			}
		}
		catch(IOException ioe)
		{
			System.out.println("Exception Occured: " + ioe.getMessage());
		}
				
	} 
} // end of class 
 
public class Driver{ 
public static void main (String args[]) 
{ 
	// create ReadFile objects by passing file names to them 
	ReadFile rf1 = new ReadFile("file1.txt");
	ReadFile rf2 = new ReadFile("file2.txt");

	// create and start multiple threads (at least two)
	//Thread t1 = new Thread(rf1);
	//Thread t2 = new Thread(rf2);
	

	//t1.start();
	//t2.start();
 }
}