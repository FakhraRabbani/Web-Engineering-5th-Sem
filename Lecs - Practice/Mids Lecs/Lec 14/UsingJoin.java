class NewThread implements Runnable
{

	String t_name;
	Thread t;

	NewThread(String t_name)
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
			for(int i = 0; i<5; i++)
			{
				System.out.println("Thread: " + t_name + i);
				t.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Thread Interrupted: " + e.getMessage());
		}
		System.out.println("Child Exiting");
	}
}

class UsingJoin
{

	public static void main(String args[])
	{

		NewThread t1 = new NewThread("One");
		NewThread t2 = new NewThread("Two");
		NewThread t3 = new NewThread("Three");

		//Checking Status
		System.out.println("Thread: " + t1.t_name + "Is Alive: " + t1.t.isAlive());
		System.out.println("Thread: " + t2.t_name + "Is Alive: " + t2.t.isAlive());
		System.out.println("Thread: " + t3.t_name + "Is Alive: " + t3.t.isAlive());

		try
		{
			t1.t.join();
			t2.t.join();
			t3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread Interrupted: " + e.getMessage());
		}

		//Checking Status
		System.out.println("Thread: " + t1.t_name + "Is Alive: " + t1.t.isAlive());
		System.out.println("Thread: " + t2.t_name + "Is Alive: " + t2.t.isAlive());
		System.out.println("Thread: " + t3.t_name + "Is Alive: " + t3.t.isAlive());

		System.out.println("Main Exiting");
	}
}

		
	