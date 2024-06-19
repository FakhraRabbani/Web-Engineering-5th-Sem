import java.util.* ;
import java.io.* ;

public class Driver
{
	public static void createCopy(String filename)
	{

		try
		{
			FileInputStream in1 = new FileInputStream("test.txt") ;
			FileOutputStream in2 = new FileOutputStream("test1.txt") ;

			int a = 0 ;
			while( ( a = in1.read()) != -1 )
				in2.write(a);

			in1.close();
			in2.close();
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage()) ;
		}
		
	}

	public static void main(String args[])
	{
		createCopy("test.txt");
	}
}
