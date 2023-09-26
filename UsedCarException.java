// ----------------------------------------------------------------------------
// UsedCarException - extends Exception and returns an Exception message
// and uses getMessage() from ThrowUsedCarException when there is an error in 
// constructing the object.
//              Naomi Nash - Saint Leo University - 13 June 2021
// ----------------------------------------------------------------------------
public class UsedCarException extends Exception 
{
    public UsedCarException(String s) 
    {
        // Declares Exception message
        super("The object was not constructed successfully.");
    }
}
