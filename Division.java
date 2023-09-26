// -----------------------------------------------------------------------
// Division - An abstract Division class with division name, account
// number, and abstract display method that is used within its two
// subclasses.
//             Naomi Nash - Saint Leo University - 6 June 2021
// -----------------------------------------------------------------------
// Creates abstract class
public abstract class Division
{
    // Declares necessary variables
    protected String divisionTitle;
    protected int acctNum;
    // Constructor that uses the Division fields
    public Division(String title, int acct)
    {
        divisionTitle = title;
        acctNum = acct;
    }
    // Creates a display method that the subclasses must have
    public abstract void display();
}

