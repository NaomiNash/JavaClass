// ------------------------------------------------------------- 
// Insurance - Calculates an estimate for a remodeling job 
// using inputed cost of materials, hours required, and hours
// travel time. Returns estimated price with job name back to 
// the user.
//       Naomi Nash - Saint Leo University - 14 May 2021
// -------------------------------------------------------------
// Imports Scanner and Math
import java.util.Scanner;
import java.lang.Math;
class Insurance 
{
    public static void main (String args[]) 
    {
        // Declares necessary variables
        int curr;
        int birth;
        double premium;
        // Prompts for input of current and birth years
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the current year >> ");
        curr = input.nextInt();
        System.out.print("Enter the birth year >> ");
        birth = input.nextInt();
        // Calculates and returns premium price
        premium = calculatePremium(curr, birth);
        System.out.println("The premium is $" + premium);
    }
    // Calculates the premium using the current and birth years
    public static double calculatePremium(int curr, int birth)
    {
        // Declares necessary variables
        double premium;
        int age;
        int decade;
        double decadeFinal;
        // Calculates the age of the customer
        age = curr - birth;
        // Calculates to find the decade of the customer
        decade = age/10;
        decadeFinal = Math.floor(decade);
        // Calculates the premium 
        premium = (decadeFinal + 15) * 20; 
        return premium;
    }
}
