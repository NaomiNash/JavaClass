// ------------------------------------------------------------------------
// DeliveryPizza - A subclass of Pizza that adds the double deliveryFee
// and String address data fields as well as calculated a delivery fee
// depending on the price of the pizza. Requires the description, price,
// and address in a new constructor and displays the description, price,
// delivery address, and delivery fee of the pizza.
//              Naomi Nash - Saint Leo University - 5 June 2021
// ------------------------------------------------------------------------
public class DeliveryPizza extends Pizza
{
    // Displays necessary variables
    public double deliveryFee;
    public String address;
    // Uses Pizza constructor and assigns a deliveryFee based on Pizza price
    public DeliveryPizza(String desc, double pri, String add)
    {
        super(desc, pri);
        address = add;
        // Calculates delivery fee of the pizza based on Pizza price
        if(super.price > 15)
        {
            deliveryFee = 3;
        }
        else
        {
            deliveryFee = 5;
        }
    }
    // Displays the Pizza discription and price
        // as well as delivery fee and address
    public String display()
    {
        return super.display() + "\n\t Deliver to: " + address 
            + ". Fee is $" + deliveryFee;
    }
}
