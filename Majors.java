// -----------------------------------------------------------------------------
// Majors - Displays 6 majors offered by a college and askes the user to enter
// in their major. Displays the division the major is in depening on the input.
//               Naomi Nash - Saint Leo University - 30 May 2021
// -----------------------------------------------------------------------------
// Imports Scanner and ArrayList
import java.util.Scanner;
import java.util.ArrayList;
public class Majors {
    // Declares Major enumerations
    enum Major {ACC, CHEM, CIS, ENG, HIS, PHYS};

    public static void main(String[] args) {
        // Declares variables
        Major degree;
        String chosen;
        int position;
        Scanner in = new Scanner(System.in);
        // Displays majors
        for(Major maj : Major.values())
            System.out.println(maj + " ");
        // Asks user for major
        System.out.print("What is your major as it's letter identifier? >> ");
        chosen = in.nextLine().toUpperCase();
        degree = Major.valueOf(chosen);
        // Checks and displays the major's specific division
        position = degree.ordinal();
        if(position == 0 || position == 2)
            System.out.println("You are in the Business Division");
        if(position == 1 || position == 5)
            System.out.println("You are in the Science Division");
        if(position == 3 || position == 4)
            System.out.println("You are in the Humanities Division");
    }
}
