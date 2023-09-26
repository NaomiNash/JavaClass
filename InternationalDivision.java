// -----------------------------------------------------------------------
// InternationalDivision - A subclasses with country and language fields
// that creates a display method that uses the division title and account 
// number fields from the Division superclass and new country and language
// fields. 
//             Naomi Nash - Saint Leo University - 6 June 2021
// -----------------------------------------------------------------------
// Declares InternationalDivision as a subclass of Division
public class InternationalDivision extends Division
{
    // Declares necessary variables
    protected String country;
    protected String language;
    // Constructor that uses the Division and International Division fields
    public InternationalDivision(String title, int acct, String cty, String lang)
    {
        super(title, acct);
        country = cty;
        language = lang;
    }
    // Displays the International Division's information
    @Override
    public void display()
    {
        System.out.println("International Division: " + divisionTitle + "  Acct #"
            + acctNum + "\nLocated in " + country + " Language is " 
            + language);
    }
}

