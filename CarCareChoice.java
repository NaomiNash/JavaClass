// -----------------------------------------------------
// CarCareChoice - lists available services for a car
// care shop and lets the user type in their needed 
// service. Returns the price for each service if the
// entered service is valid, shows Invalid Entry if not.
//   Naomi Nash - Saint Leo University - 28 May 2021
// -----------------------------------------------------
// Imports java.util
import java.util.*;
public class CarCareChoice
{
   public static void main (String[] args)
   {    
      // Declares neccessary variables
      Scanner input = new Scanner(System.in);
      boolean isMatch = false;
      String[] items =  { "oil change", "tire rotation",
         "battery check", "brake inspection"};
      int[] prices = {25, 22, 15, 5};
      int x;
      int matchIndex = 0;
      String menu = "Enter selection:";
      for(x = 0; x < items.length; ++x)
        menu += "\n   " + items[x];
      // Displays selections for user to chose from
      System.out.println(menu);
      // Takes user's selection
      String selection = input.nextLine();
      // Determines selections form user input
      for (x = 0; x < items.length; x++)
      if(selection.equals(items[x]))
      {
	  isMatch = true;
	  matchIndex = x;
      }
      // Displays results depending on input
      if(isMatch)
          System.out.println(selection + " price is $" + 
            prices[matchIndex]);
      else
          System.out.println("Invalid Entry");
  }
}
