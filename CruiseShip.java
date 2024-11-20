//	Nathaniel McGinnis

public class CruiseShip extends Ship
{
    private int passengerCapacity;
    private int crewCount;

    //	constructor
    public CruiseShip(String xName, String xLaunchDate, int xPassengerCapacity, int xCrewCount)
    {
        super(xName, xLaunchDate);
        this.setPassengerCapacity(xPassengerCapacity);
        this.setCrewCount(xCrewCount);
    }

    //	accessors
    public int getPassengerCapacity()
    {
        return this.passengerCapacity;
    }

    public int getCrewCount()
    {
        return this.crewCount;
    }

    //	mutators
    public void setPassengerCapacity(int xPassengerCapacity)
    {
        this.passengerCapacity = xPassengerCapacity;
    }

    public void setCrewCount(int xCrewCount) {
        this.crewCount = xCrewCount;
    }

    //	toString Method
    public String toString()
    {
        return "Name: " + getName() + "\nPassenger Capacity: " + passengerCapacity + "\nCrew: " + crewCount;
    }
}
