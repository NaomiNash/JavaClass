// ------------------------------------------------------------
// PastPresentFuture - Asks for user input for a month, day,
// and year, then displayes whether the year is not this year
// and if the month was earlier or later this year, or is the 
// current month.
//       Naomi Nash - Saint Leo University - 21 May 2021
// ------------------------------------------------------------
// Imports util and time
import java.util.*;
import java.time.*;
public class PastPresentFuture
{
  public static void main (String args[]) 
  {
      // Declares variables
      LocalDate today = LocalDate.now();
      LocalDate enteredDate;
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
      // Displays appropriate outputs depending on inputs
      //    and current date
      if(todayYr != yr)
      {
          System.out.println(yr + " is not this year");
      }
      if(todayMo > mo)
      {
          System.out.println(mo + " was a month earlier this year");
      }
      if(todayMo < mo)
      {
          System.out.println(mo + " is a month later this year");
      }
      if(todayMo == mo)
      {
          System.out.println(mo + " is this month");
      }
   }
}
