// ------------------------------------------------------------
// ShadyRestRoom - ask user to choose between a queen, king,
// and suite room, then takes input and displays the cost for
// the selected room. If invalid room number is chosen, program
// displays that is is an invalid option and costs 0.
//       Naomi Nash - Saint Leo University - 17 May 2021
// ------------------------------------------------------------
// Imports Scanner
import java.util.Scanner;
public class ShadyRestRoom
{
   public static void main (String args[])
   {
      // Declares Variables
      int selection;
      int price;
      String result;
      final int QUEEN = 1, KING = 2, SUITE = 3;
      final int QPRICE = 125, KPRICE = 139,
         SPRICE = 165;
      final String QSTRING = "Queen bed", KSTRING = "King bed",
         SSTRING = "Suite with a king bed and pull-out couch",
         INVALIDSTRING = "an invalid option";
      // Displays bed opstions and requests input
      Scanner in = new Scanner(System.in);
      System.out.println("\t\n\nMenu\n");
      System.out.println("(" + QUEEN + ") " + QSTRING);
      System.out.println("(" + KING + ") " + KSTRING);
      System.out.println("(" + SUITE + ") " + SSTRING);
      System.out.print("Enter Selection (1, 2, or 3) >> ");
      selection = in.nextInt();
      // If... else loop for options
      if(selection == QUEEN)
      {
         result = QSTRING;
         price = QPRICE;
      }
      else
         if(selection == KING)
         {
            result = KSTRING;
            price = KPRICE;
         }
         else
            if (selection == SUITE)
            {
                result = SSTRING;
                price = SPRICE;
            }
            else
            {
                result = INVALIDSTRING;
                price = 0;
             }
      // Displayes user's chosen option and the designated price
      System.out.println("You selected " + result + "  $" + price);
   }
}
