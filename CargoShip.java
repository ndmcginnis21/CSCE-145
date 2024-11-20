//	Nathaniel McGinnis

public class CargoShip extends Ship {
    private double tonnage; // DWT
    private double maxSpeed; // mph

    //	constructor
    public CargoShip(String xName, String xLaunchDate, double xTonnage, double xMaxSpeed) {
        super(xName, xLaunchDate);
        this.setTonnage(xTonnage);
        this.setMaxSpeed(xMaxSpeed);
    }

    //	accessors
    public double getTonnage()
    {
        return this.tonnage;
    }

    public double getMaxSpeed()
    {
        return this.maxSpeed;
    }

    //	mutators
    public void setTonnage(double xTonnage)
    {
        this.tonnage = xTonnage;
    }

    public void setMaxSpeed(double xMaxSpeed)
    {
        this.maxSpeed = xMaxSpeed;
    }

    // toString Method
    public String toString()
    {
        return "Name: " + getName() + "\nTonnage: " + tonnage + " DWT\nMaximum Speed: " + maxSpeed + " mph";
    }
}
