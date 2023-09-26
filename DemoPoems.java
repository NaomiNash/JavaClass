// ------------------------------------------------------------------
// DemoPoem.java - Create a class named Poem that contain the fields
// title and lines as well as three subclasses: Couplet, Limerick,
// and Haiku where each subclass has their designated line length
// within their constructor as well as a title. Use this to display
// The names of several poems and how many lines they have.
//          Naomi Nash - Saint Leo University - 3 June 2021
// ------------------------------------------------------------------
// Imports Java
import java.util.*;
public class DemoPoems
{
   public static void main(String[] args)
   {
      //Declares each poem subclass's specific poem
      Poem poem1 = new Poem("The Raven", 84);
      Couplet poem2 = new Couplet("True Wit");
      Limerick poem3 = new Limerick("There was an Old Man with a Beard");
      Haiku poem4 = new Haiku("The Wren");
      // Displays poems
      display(poem1);
      display(poem2);
      display(poem3);
      display(poem4);
   }
   // How each poem is displayed
   public static void display(Poem p)
   {
      System.out.println("Poem: " + p.getTitle() +
         "   Lines: " + p.getLines());
   }
}  
