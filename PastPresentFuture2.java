// ------------------------------------------------------------
// PastPresentFuture2 - Asks for user input for a month, day,
// and year, then displayes whether the inputed date is in the
// past, today's date, or in the future.
//       Naomi Nash - Saint Leo University - 21 May 2021
// ------------------------------------------------------------
// Imports util and time
import java.util.*;
import java.time.*;
public class PastPresentFuture2
{
  public static void main (String args[]) 
  {
      // Declares variables
      LocalDate today = LocalDate.now();
      int mo, da, yr;
      int todayMo, todayDa, todayYr;
      todayMo = today.getMonthValue();
      todayDa = today.getDayOfMonth();
      todayYr = today.getYear();
      Scanner input = new Scanner(System.in);
      // Requests input for month, day, and year
      System.out.print("Enter a month >> ");
      mo = input.nextInt();
      System.out.print("Enter a day >> ");
      da = input.nextInt();
      System.out.print("Enter a year (four digits) >> ");
      yr = input.nextInt();
      // Assigns inputed values to date variable
      LocalDate userDate = LocalDate.of(yr,mo,da);
      // Displays appropriate outputs depending on inputs 
      //    of given date
      if(userDate.isBefore(today))
      {
            System.out.println(userDate + " is in the past.");
      }
      if(userDate.isAfter(today))
      {
            System.out.println(userDate + " is in the future.");
      }
      if(userDate.equals(today))
      {
            System.out.println(userDate + " is the current date.");
      }

   }
}


