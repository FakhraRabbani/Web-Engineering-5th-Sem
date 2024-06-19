class NewThreads implements Runnable
{
	String t_name;
	Thread t;

	NewThreads(String t_name)
	{
		this.t_name = t_name;
		t = new Thread(this, t_name);
		System.out.println("New Thread: " + t);
		t.start();
	}

	public void run()
	{
		try
		{
			for(int i = 0; i < 5; i++)
			{
				System.out.println("Thread: " + t_name + i );
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Thread Interrupted " + e.getMessage());
		}
		
		System.out.println("Thread " + t_name + "Exiting");
	}  
}

class MultipleThread
{

	public static void main(String args[])
	{
		NewThreads t1 = new NewThreads("One");
		NewThreads t2 = new NewThreads("Two");
		NewThreads t3 = new NewThreads("Three");

		try
		{
			System.out.println("Main");
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted " + e.getMessage());
		}
		
		System.out.println("Main Exiting");
	}
}
