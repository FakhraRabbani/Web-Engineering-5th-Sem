import java.net.ServerSocket;
import java.net.Socket;

class EchoServer
{
	public static void main(String args[])
	{
		System.out.println("Waiting for Client!");
		
		try
		{
			ServerSocket ss = new ServerSocket(9806); //creating server socket object
			Socket soc = ss.accept(); //accept method - blocking call //waiting for client request, returns socket object as soon as it gets connection
			System.out.println("Connection Established");
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}