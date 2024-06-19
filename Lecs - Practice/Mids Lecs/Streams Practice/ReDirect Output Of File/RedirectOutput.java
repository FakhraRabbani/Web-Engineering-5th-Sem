import java.io.*;

class RedirectOutput
{

	public static void main(String args[])
	{
		try
		{

			PrintStream ps = new PrintStream(new FileOutputStream("test.txt"));
			PrintStream OriginalOut = System.out;

			System.setOut(ps);

			System.out.println("HTML");
			System.out.println("CSS");
			System.out.println("Java");

			System.setOut(OriginalOut);

			System.out.println("Finished");

			ps.close();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}

	