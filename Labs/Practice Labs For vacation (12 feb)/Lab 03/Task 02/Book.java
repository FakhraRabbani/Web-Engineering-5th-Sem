class Book extends PrintMedia
{

	//Data Members
	String name, ISBN;

	//Default constructor 
	Book()
	{
		super();
		//this.name = "";
		//this.ISBN = "";
	}

	//Parameterized Constructor
	Book(String title, String name, String ISBN)
	{
		super(title);
		this.name = name;
		this.ISBN = ISBN;
	}

	//Setters
	public void setName(String name)
	{
		this.name = name;
	}

	public void setISBN(String ISBN)
	{
		this.ISBN = ISBN;
	}

	public void setTitle(String title)
	{
		this.title = title;
	} 

	//Getters
	String getName()
	{
		return this.name;
	}

	String getISBN()
	{
		return this.ISBN;
	}

	String getTitle()
	{
		return this.title;
	}

	@Override
	public void display()
	{
		super.display();
		System.out.println("Book Name: " + getName() + "\nISBN: " + getISBN());
	}

}