// ------------------------------------------------------------------------
// DemoPizzas - Uses a class named Pizza with description and price data
// fields and displays these fields, then uses a subclass named
// DeliveryPizza with additional deliveryFee and address data fields and
// displays these additional fields as well as the previous Pizza ones.
//              Naomi Nash - Saint Leo University - 5 June 2021
// ------------------------------------------------------------------------
// Imports java.util
import java.util.*;
public class DemoPizzas
{
    public static void main(String args[])
    {
        // Declares and displays new Pizza object
        Pizza pizza = new Pizza("sausage and onion pizza",14.99);
        System.out.println(pizza.display());
        // Declares and displays new DeliveryPizza object
        DeliveryPizza deliveryPizza = new DeliveryPizza("sausage and onion pizza",14.99,"22 Acorn Street, APT 882");
        System.out.println(deliveryPizza.display());
    }
}
