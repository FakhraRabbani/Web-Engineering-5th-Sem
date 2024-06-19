import java.net.Socket;

public class EchoClient
{
	public static void main(String args[])
	{
		System.out.println("Client Started");
		try
		{
			Socket soc = new Socket("localhost", 9806); //Creating socket on client side (IP_address of server, portNo)
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}
			