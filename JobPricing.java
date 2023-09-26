// ---------------------------------------------------------------------------------
// JobPricing - Calculates an estimate for a remodeling job using inputed cost of
// materials, hours required, and hours travel time. Returns estimated price with 
// job name back to the user.
//                  Naomi Nash - Saint Leo University - 14 May 2021
// ---------------------------------------------------------------------------------
// Imports Scanner
import java.util.Scanner;
class JobPricing 
{
    public static void main(String[] args) 
    {
        // Decalares variables neccesary    
        String description;
        double materials;
        double hoursOnJob;
        double hoursTraveling;
        double price;
        Scanner input = new Scanner(System.in);
        // Requests information from user and recieves input values
        System.out.print("Enter job description >> ");
        description = input.nextLine();
        System.out.print("Enter cost of materials >> ");
        materials = input.nextDouble();
        System.out.print("Enter hours on the job work >> ");
        hoursOnJob = input.nextDouble();
        System.out.print("Enter hours traveling >> ");
        hoursTraveling = input.nextDouble();
        // Calculates and returns price estimation to the user
        price = computePrice(materials, hoursOnJob, hoursTraveling);
        System.out.println("The price for " + description +
                           " is $" + price);
    }
    // Calculates the estimated price for the job
    public static double computePrice(double materials, double hours, double travel) 
    {
        // Declares price variable
        double price;
        // Sets rate and travel rate variables and makes them constant
        final double RATE = 35;
        final double TRAVEL_RATE = 12;
        // Calculates the estimated price and returns the value
        price = materials + hours * RATE + travel * TRAVEL_RATE;
        return price;
    }
}
