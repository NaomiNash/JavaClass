// --------------------------------------------------------------------
// RetirementGoal - Uses the user inserted number of years till
// retirement and amount of money able to be saved annually. If a
// negative number or 0 is entered then the user will be reprompted.
// After recieving inputs, output will be displayed for how much money
// the user will have at retirement.
//          Naomi Nash - Saint Leo University - 21 May 2021
// --------------------------------------------------------------------
// Imports Scanner
import java.util.Scanner;
public class RetirementGoal
{
   public static void main (String[] args)
   {
      // Declaring necessary variables
      Scanner input = new Scanner(System.in);
      int years;
      int saveAmount;
      int total;

      // Asks for user input for years variable
      System.out.print("How many years until retirement? >> ");
      years = input.nextInt();
      // Initiates while statement to check for valid year variable
      while(years <= 0)
      {
         System.out.println("Years cannot be 0 or negative");
         System.out.print("Please renter years >> ");
         years = input.nextInt();
      }  
      // Asks for user input for saveAmount variable
      System.out.print("How much can you save annually? >> ");
      saveAmount = input.nextInt();
      while(saveAmount <= 0)
      {
         System.out.println("Amount cannot be 0 or negative");
         System.out.print("Please renter amount to save annually >> ");
         saveAmount = input.nextInt();
      }  
      // Calculates total money for user at retirement
      total = saveAmount * years;
      System.out.println("If you save $" + saveAmount + " for " + 
        years + " years without interest, you will have $" + total);
   }
}
