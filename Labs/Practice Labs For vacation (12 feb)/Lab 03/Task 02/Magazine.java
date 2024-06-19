class Magazine extends PrintMedia
{

	//Data Members
	String month;
	int year;

	//Default Constructor
	Magazine()
	{
		super();
		//this.month = "";
		//this.year = 0;
	}

	//Parameterized Constructor
	Magazine(String title, String month, int year)
	{
		super(title);
		this.month = month;
		this.year = year;
	}

	//Setters
	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setMonth(String month)
	{
		this.month = month;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	//Getters
	String getTitle()
	{
		return this.title;
	}

	String getMonth()
	{
		return this.month;
	}
 
	int getYear()
	{
		return this.year;
	}

	@Override
	public void display()
	{
		super.display();
		System.out.println("Magazine Month: " + month + "\nYear: " + year);
	}
} 