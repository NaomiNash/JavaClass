// ------------------------------------------------------------
// TenThousandDaysOld - Calculates and displays the day when
// the user will become 10,000 days old
//       Naomi Nash - Saint Leo University - 14 May 2021
// ------------------------------------------------------------
// Imports Time and Scanner
import java.time.*;
import java.util.Scanner;
public class TenThousandDaysOld 
{
    public static void main(String[] args) 
    {
         // Declares necessary variables 
         int monthBorn;
         int dayBorn;
         int yearBorn;
         final int TEN_THOUSAND_DAYS = 10000;
         LocalDate birthday;
         // Requests birthdate inputs from the user
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the month you were born >> ");
         monthBorn = input.nextInt();
         System.out.print("Enter the day you were born >> ");
         dayBorn = input.nextInt();
         System.out.print("Enter the year you were born >> ");
         yearBorn = input.nextInt();
         // Creates date of birthday
         birthday = LocalDate.of(yearBorn, monthBorn, dayBorn);
         // Calculates and outputs when user will be 10000 days old
         System.out.println("I will be 10000 days old on " + 
            birthday.plusDays(TEN_THOUSAND_DAYS) + ".");
    }
}
