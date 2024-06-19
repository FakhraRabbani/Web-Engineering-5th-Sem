class Facebook extends SocialMedia
{

	//Data Members
	String name, likes;

	//Default Constructor
	Facebook()
	{
		super();
		//this.name = "";
		//this.likes = "";
	}

	//Parameterized Constructor
	Facebook(String title, String name, String likes)
	{
		super(title);
		this.name = name;
		this.likes = likes;
	}

	//Setters 
	public void setName(String name)
	{
		this.name = name;
	}

	public void setLikes(String likes)
	{
		this.likes = likes;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	//Getters
	String getTitle()
	{
		return this.title;
	}

	String getName()
	{
		return this.name;
	} 

	String getLikes()
	{
		return this.likes;
	}

	@Override
	public void display()
	{
		super.display();
		System.out.println("Facebook Name: " + name + "\nLikes: " + likes);
	}
}