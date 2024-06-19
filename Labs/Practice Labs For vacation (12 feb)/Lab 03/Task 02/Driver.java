class Driver
{

	public static void main(String args[])
	{
		//Creating an array of type media
		Media[] myMedia = new Media[10];

		myMedia[0] = new PrintMedia("Title PM1");
		myMedia[1] = new PrintMedia("Title PM2");
		myMedia[2] = new Book("Book1", "A", "1A");
		myMedia[3] = new Book("Book2", "B", "2B");
		myMedia[4] = new Magazine("Magazine1", "January", 2001);
		myMedia[5] = new Magazine("Magazine2", "February", 2002);	
		myMedia[6] = new SocialMedia("Title SM1");
		myMedia[7] = new SocialMedia("Title SM2");	
		myMedia[8] = new Facebook("Facebook1", "F1", "1K");
		myMedia[9] = new Facebook("Facebook2", "F2", "2K");
		

		for(int i = 0; i < myMedia.length; i++)
		{
			myMedia[i].display();
			System.out.println("\n");
		}

	}
}