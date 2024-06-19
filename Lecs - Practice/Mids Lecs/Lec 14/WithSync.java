class Message
{
	synchronized void Go(String message)
	{
		System.out.print("[ " + message);
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread Interrupted: " + e.getMessage());
		}
		
		System.out.println(" ]");
	}
}

class NewThread implements Runnable
{

	String msg;
	Thread t;
	Message obj_m;

	NewThread(Message obj_m, String msg)
	{
		this.obj_m = obj_m;
		this.msg = msg;
		t = new Thread(this, msg);
		t.start();
	}

	public void run()
	{
		obj_m.Go(msg);		
	}
}

class WithSync
{
	public static void main(String args[])
	{
		Message obj_m = new Message();

		NewThread t1 = new NewThread(obj_m, "Hello");
		NewThread t2 = new NewThread(obj_m, "World");
	}
}
	