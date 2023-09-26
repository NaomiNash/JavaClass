// ------------------------------------------------------------
// ShadyRestRoom2 - Ask user to choose between a queen, king,
// and suite room, then asks user to choose betweena lake view
// and a park view, then takes input and displays the cost for
// the selected room and view. If invalid room number or view 
// is chosen, program displays that is is an invalid option 
// and costs $0 for the room and as the lakeview price for the
// view.
//       Naomi Nash - Saint Leo University - 21 May 2021
// ------------------------------------------------------------
// Imports Scanner
import java.util.Scanner;
public class ShadyRestRoom2
{
   public static void main (String args[])
   {
      // Declares Variables
      int selection;
      int price;
      String result;
      String view = "no";
      final int QUEEN = 1, KING = 2, SUITE = 3;
      final int QPRICE = 125, KPRICE = 139,
         SPRICE = 165;
      final String QSTRING = "Queen bed", KSTRING = "King bed",
         SSTRING = "Suite with a king bed and pull-out couch",
         INVALIDSTRING = "an invalid option";
      final int LAKEVIEW = 1, PARKVIEW = 2;
      final int LPRICE = 15;
      final String LSTRING = "a lake", PSTRING = "a park",
         VIEW_INVALIDSTRING = "an invalid view";
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
             // Displays view opstions and requests input
             if(price != 0)
             {
                 System.out.println("Please choose a view:");
                 System.out.println("(" + LAKEVIEW + ") " + LSTRING);
                 System.out.println("(" + PARKVIEW + ") " + PSTRING);
                 System.out.print("Enter Selection (1 or 2) >> ");
                 selection = in.nextInt();
                 // If... else loop for options
                 if(selection == LAKEVIEW)
                 {
                    view = LSTRING;
                    price += LPRICE;  
                 }
                    else 
                    if(selection == PARKVIEW)
                    {
                        view = PSTRING;
                    }
                    else 
                    {
                        price += LPRICE;
                        view = VIEW_INVALIDSTRING;
                    }
                }
      // Displayes user's chosen options and the designated price
      System.out.println("You selected " + result + " with a " + view + 
        " for $" + price);
   }
}
