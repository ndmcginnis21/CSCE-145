//	Nathaniel McGinnis

import java.util.Scanner;

public class ShipNavigator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ShipNavigator!!!");

        while (true)
        {
        	//	asks user for name of ship
            System.out.println("Enter the name of the ship:");
            String name = scanner.nextLine();

            //	asks user for date of launch
            System.out.println("Enter its launch date (mm/dd/yyyy):");
            String launchDate = scanner.nextLine();

            //	asks user for type of ship
            System.out.println("Is it a cruise ship or a cargo ship?");
            String shipType = scanner.nextLine();

            
            if (shipType.equalsIgnoreCase("cruise ship"))
            {
            	//	asks user for capacity for passengers
                System.out.println("Enter the ship's passenger capacity:");
                int passengerCapacity = scanner.nextInt();

                //	asks user for crew count
                System.out.println("How many crew members are on this ship?");
                int crewCount = scanner.nextInt();

                //	prints out results for cruise ship
                CruiseShip cruiseShip = new CruiseShip(name, launchDate, passengerCapacity, crewCount);
                System.out.println("Creating a cruise ship...");
                System.out.println("Printing the ship's details:\n" + cruiseShip);

            }
            else if (shipType.equalsIgnoreCase("cargo ship"))
            {
            	//	asks user for tonnage of ship
                System.out.println("Enter the ship's tonnage (DWT):");
                double tonnage = scanner.nextDouble();

                //	asks user for the maximum speed of ship
                System.out.println("Enter the maximum speed of the ship (in mph):");
                double maxSpeed = scanner.nextDouble();

                //	prints out results for cargo ship
                CargoShip cargoShip = new CargoShip(name, launchDate, tonnage, maxSpeed);
                System.out.println("Creating a cargo ship...");
                System.out.println("Printing the ship's details:\n" + cargoShip);

            }
            else
            {
                System.out.println("Error: Invalid ship type.");
            }

            scanner.nextLine();
            System.out.println("Do you want to construct another ship object? Enter yes or no:");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes"))
            {
                break;
            }
        }

        System.out.println("Goodbye!");
    }
}
