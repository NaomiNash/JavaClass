// -----------------------------------------------------------------------
// DomesticDivision - A subclasses with a state field, that creates a
// display method that uses the division title and account number from the
// Division superclass and new state field. 
//             Naomi Nash - Saint Leo University - 6 June 2021
// -----------------------------------------------------------------------
// Declares DomesticDivision as a subclass of Division
public class DomesticDivision extends Division
{
    // Declares necessary variables
    protected String state;
    // Constructor that uses the Division and Domestic Division fields
    public DomesticDivision(String title, int acct, String st)
    {
        super(title, acct);
        state = st;
    }
    // Displays the International Division's information
    @Override
    public void display()
    {
        System.out.println("Domestic Division: " + divisionTitle + "  Acct #"
            + acctNum + "\nLocated in " + state);
    }
}

