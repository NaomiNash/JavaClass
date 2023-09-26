// -----------------------------------------------------------------------
// UseDivision - Uses an abstract Division class with division name,
// account number, and abstract display method as well as two subclasses,
// InternationalDivision, with a country and language field, and 
// DomesticDivision, with a state field, that each display their
// respective company divisions with their additional fields.
//             Naomi Nash - Saint Leo University - 6 June 2021
// -----------------------------------------------------------------------
// Creates abstract class
public abstract class UseDivision
{
    public static void main(String[] args)
    {
        // Declares new DomesticDivision objects
        DomesticDivision abcDomDiv = new 
            DomesticDivision("Sales", 123, "California");
        DomesticDivision xyzDomDiv = new
            DomesticDivision("Technology", 234, "Kansas");
        // Declares new InternationalDivision objects
        InternationalDivision abcIntDiv = new
            InternationalDivision("Technology", 345, "Germany", "German");
        InternationalDivision xyzIntDiv = new 
            InternationalDivision("Marketing", 456, "Japan",
                    "Japanese");
        // Displays DomesticDivision and International Division objects
        abcDomDiv.display();
        xyzDomDiv.display();
        abcIntDiv.display();
        xyzIntDiv.display();
    }
}

