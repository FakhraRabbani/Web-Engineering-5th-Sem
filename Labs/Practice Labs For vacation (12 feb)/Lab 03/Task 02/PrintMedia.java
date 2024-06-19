class PrintMedia implements Media
{

	//Data Member
	String title;

	PrintMedia()
	{
		//this.title = "";
	}

	PrintMedia(String title)
	{
		this.title = title;
	}

	/*
	public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
	*/

	//Implementing abstract function of Interface Media
	public void display()
	{
		System.out.println("Title(Print Media): " + title);
	}
}