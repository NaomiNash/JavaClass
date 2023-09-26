// --------------------------------------------------------------------
// RetirementGoal2 - Uses the user inserted number of years till
// retirement and amount of money able to be saved annually. If a
// negative number or 0 is entered then the user will be reprompted.
// After recieving inputs, output will be displayed for how much money
// the user will have at retirement, then displays how much money the
// user will have if there is 4% interest used every year.
//          Naomi Nash - Saint Leo University - 21 May 2021
// --------------------------------------------------------------------
// Imports Scanner
import java.util.Scanner;
public class RetirementGoal2
{
   public static void main (String[] args)
   {
      // Declaring necessary variables
      Scanner input = new Scanner(System.in);
      int years;
      int saveAmount;
      int total;
      final double RATE = 0.04;

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
      // Initiates while statement to check for valid saveAmount variable
      while(saveAmount <= 0)
      {
         System.out.println("Amount cannot be 0 or negative");
         System.out.print("Please renter amount to save annually >> ");
         saveAmount = input.nextInt();
      }  
      // Calculates total money for user at retirement
      total = saveAmount * years;
      // Displays each variable entered as well as total amount saved
      System.out.println("If you save $" + saveAmount + " for " + 
        years + " years without interest, you will have $" + total);
      double total2 = 0;
      // Initiates for loop using ++y preincrement
      for(int y = 0; y < years; ++y)
      {
          total2 += saveAmount;
      }
      // Displays each variable entered as well as total rated amount saved
      System.out.println("If you save $" + saveAmount +
        " for " + years + " years, with " + (RATE * 100) +
        "% interest, you will have $" + total2);
   }
}

