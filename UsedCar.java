// ----------------------------------------------------------------------------
// UsedCar - Takes the vin, make, year, mileage, and price using a constructor
// and checks to see if these fields are valid and meet the designated criteria
// and if not it will display a thrown Exception.
//              Naomi Nash - Saint Leo University - 13 June 2021
// ----------------------------------------------------------------------------
// Imports java.util
import java.util.*;
public class UsedCar 
{
    // Declares necessary variables
    String vin;
    String make;
    int year;
    int mileage;
    int price;
    String num;
    String carMake;
    int carYear;
    int miles;
    int pr;
    public final static String DEFAULT_VIN = "999";
    final int VIN_NUM_LENGTH = 4;
    final int LOW_YEAR = 1997;
    final int HIGH_YEAR = 2017;
    final String[] MAKES = {"Ford", "Honda", "Toyota", "Chrysler", "Other"};
    // Initiates UsedCar constructor
    public UsedCar(String num, String carMake,
                   int carYear, int miles, int pr) throws UsedCarException 
    {
        // Throws Exception if num is not four digits
        if(num.length() != VIN_NUM_LENGTH)
        {
            throw(new UsedCarException("The object was not constructed successfully."));  
        }
        // Throws Exception if carMake is not in the UsedCar array
        if(carMake != "Ford" || carMake != "Honda" || carMake != "Toyota" 
            || carMake != "Chrysler" || carMake != "Other")
        {
            throw(new UsedCarException("The object was not constructed successfully."));
        }
        // Throws Exception if carYear is not between LOW_YEAR and HIGH_YEAR
        if(carYear <= LOW_YEAR || year >= HIGH_YEAR)
        {
            throw(new UsedCarException("The object was not constructed successfully."));
        }
        // Throws Exception if mileage is negative
        if(miles < 0)
        {
            throw(new UsedCarException("The object was not constructed successfully."));
        }
        // Throws Exception if price is a negative
        if(pr < 0)
        {
            throw(new UsedCarException("The object was not constructed successfully."));
        }
    }
    // Sets values equal to eachother for display
    public UsedCar() 
    {
        vin = num;
        make = carMake;
        year = carYear;
        mileage = miles;
        price = pr;
    } 
    // Gets vin number
    public String getVin() 
    {
        return vin;
    }
    // Displays the used car information
    public String toString() 
    {
        return "VIN " + vin + "  Make: " + make +
               "\n   Year: " + year + "  " + mileage + " miles   $" +
               price;
    }
}
