// ------------------------------------------------------------------------
// Pizza - Uses String description and double price data fields to store
// and display a type of pizza and includes a constructor that requires
// these areguments. 
//              Naomi Nash - Saint Leo University - 5 June 2021
// ------------------------------------------------------------------------
public class Pizza
{
    // Declares necessary variables
    public String description;
    public double price;
    // Assigns variables
    public Pizza(String desc, double pri)
    {
        description = desc;
        price = pri;
    }
    // Displays description and price of pizza
    public String display()
    {
        return description + " Price: $" + price;
    }
}
