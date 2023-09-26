// --------------------------------------------------------------
// Alphabetize - Takes 3 user inputed strings and compares them
// to see whether or not they were entered in alphabetical order.
// Displays whether they were or were not entered in alphabetical
// order by the user.
//        Naomi Nash - Saint Leo University - 28 May 2021
// --------------------------------------------------------------
// Imports java.util
import java.util.*;
public class Alphabetize
{
   public static void main(String[] args)
   {
      // Declares necessary variables
      String str1, str2, str3;
      Scanner in = new Scanner(System.in);
      // Displays and requests string inputs
      System.out.print("Enter first string >> ");
      str1 = in.nextLine();
      System.out.print("Enter second string >> ");
      str2 = in.nextLine();
      System.out.print("Enter third string >> ");
      str3 = in.nextLine();
      // Compares strings for alphabetical order
      if(str1.toLowerCase().compareTo(str2.toLowerCase()) < 0 &&
       str2.toLowerCase().compareTo(str3.toLowerCase()) < 0)
      // Displays whether strings were entered alphabetically
        System.out.println("You entered the strings in" +
         " alphabetical order");
     else
        System.out.println("You did not enter the words in" +
         " alphabetical order");
  }
}
