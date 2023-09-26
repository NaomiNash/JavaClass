// ------------------------------------------------------------------
// SqrtException.java - Prompts the user for a value and uses a try
// to attempt to square root the value. If the value is positive, it
// will display the squareroot, however if the value is negative it
// will throw an Exception and tell the user it cannot square root a
// negative number. 
//         Naomi Nash - Saint Leo University - 11 June 2021
// ------------------------------------------------------------------
// imports java.util.*
import java.util.*;
public class SqrtException 
{
    public static void main(String[] args) throws ArithmeticException 
    {
        // Declares necessary variable
        int number;
        // Declares try statement
        try
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a positive number: ");
            number = input.nextInt();
            // If...throw statement for a number less than 0
            if (number < 0)
                throw (new ArithmeticException());
            // Displays the square root of the positive inputed number
            System.out.println("The square root of " +
                number + " is " + Math.sqrt(number));
        }
        // Declares catch Exception
        catch (ArithmeticException e) 
        {
            // Displays Exception statement
            System.out.println("Can't take square root of" +
                " negative number.");
        }
    }     
}
