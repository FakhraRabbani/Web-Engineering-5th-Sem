class SocialMedia implements Media
{

	//Data Member
	String title;

	SocialMedia()
	{
		//this.title = "";
	}

	SocialMedia(String title)
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
		System.out.println("Title(Social Media): " + title);
	}
}