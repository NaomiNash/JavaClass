// --------------------------------------------------------------
// Alphabetize2 - Takes three string inputs from user and
// returns them in alphabetical order without regard to case. 
//        Naomi Nash - Saint Leo University - 28 May 2021
// --------------------------------------------------------------
// Imports java.util
import java.util.*;
public class Alphabetize2
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
      // Compares strings for alphabetical order and prints them
      if(str1.toLowerCase().compareTo(str2.toLowerCase()) < 0)
        if(str2.toLowerCase().compareTo(str3.toLowerCase()) < 0)
            System.out.println(str1 + " " + str2 + " " + str3);
            else
      if(str3.toLowerCase().compareTo(str1.toLowerCase()) < 0)
        System.out.println(str3 + " " + str1 + " " + str2);
        else
      if(str1.toLowerCase().compareTo(str3.toLowerCase()) < 0)
        System.out.println(str2 + " " + str1 + " " + str3);
        else
      if(str3.toLowerCase().compareTo(str2.toLowerCase()) < 0)
        System.out.println(str3 + " " + str2 + " " + str1);
        else
        System.out.println(str2 + " " + str3 + " " + str1);
  }
}
