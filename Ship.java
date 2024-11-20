//	Nathaniel McGinnis

public class Ship
{
	private String name;
	private String launchDate;
	
	//	constructor
	public Ship(String xName, String xLaunchDate)
	{
		this.setName(xName);
		this.setLaunchDate(xLaunchDate);
	}
	
	//	accessors
	public String getName()
	{
		return this.name;
	}
	
	public String getLaunchDate()
	{
		return this.launchDate;
	}
	
	//	mutators
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	public void setLaunchDate(String xLaunchDate)
	{
		String[] dateParts = xLaunchDate.split("/");
		int year = Integer.parseInt(dateParts[2]);
		
		if(year >= 1990 && year <= 2019)
		{
			this.launchDate = xLaunchDate;
		}
		else
		{
			System.out.println("Error: Launch date prior to 1990. Resetting Astoria's launch date to the default 01/01/1990");
            this.launchDate = "01/01/1990";
		}
	}
	
	// toString Method
    public String toString()
    {
        return "Name: " + name + "\nLaunch Date: " + launchDate;
    }
}