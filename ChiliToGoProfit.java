// ---------------------------------------------------------------
// ChiliToGoProfit - Accepts number of meals for child and adult,
// then returns display of the total price and profits for each
// meal type and all meals combined.
//       Naomi Nash - Saint Leo University - 8 May 2021
// ---------------------------------------------------------------
import java.util.Scanner;
class ChiliToGoProfit
{
  public static void main(String[] args) 
  {
      // sets prices for meal types
      final double ADULT_PRICE = 7;
      final double CHILD_PRICE = 4;
      final double ADULT_COST = 4.35;
      final double CHILD_COST = 3.10;
      // creates instance for meal types as ints
      int adultMeals;
      int childMeals;
      // sets these variables to double float points
      double totalAdult, totalChild, grandTotal;
      double totalProfitAdult, totalProfitChild, profitTotal;
      // sets up where user can input using the keyboard
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of adult meals ordered >> ");
      adultMeals = input.nextInt();
      System.out.print("Enter number of child meals ordered >> ");
      childMeals = input.nextInt();
      // does the math for total price of meal types and all meals
      totalAdult = adultMeals * ADULT_PRICE;
      totalChild = childMeals * CHILD_PRICE;
      grandTotal = totalAdult + totalChild;
      // does the math for total profit for meal types and all meals
      totalProfitAdult = totalAdult - adultMeals * ADULT_COST;
      totalProfitChild = totalChild - childMeals * CHILD_COST;
      profitTotal = totalProfitAdult + totalProfitChild;
      // returns total prices
      System.out.println(adultMeals + " adult meals were ordered at " + 
        ADULT_PRICE + " each.");
      System.out.println("      Total is " + totalAdult);
      System.out.println(childMeals + " child meals were ordered at " 
        + CHILD_PRICE + " each.");
      System.out.println("      Total is " + totalChild);
      System.out.println("Grand total for all meals is " + grandTotal);
      // returns total profits
      System.out.println("Profits:");
      System.out.println("      Adult profit is " + totalProfitAdult);
      System.out.println("      Child profit is " + totalProfitChild);
      System.out.println("Total prfoit is " + profitTotal);
   }
}
