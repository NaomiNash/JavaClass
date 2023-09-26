// ------------------------------------------------------------------
// Haiku.java - A subclass with a constructor that only requires
// a title; and lines field set using a constant value reflecting the
// number of lines in the specific poem type
//          Naomi Nash - Saint Leo University - 3 June 2021
// ------------------------------------------------------------------
// States the parent-child class relationship for Poem and Haiku
public class Haiku extends Poem
{
    // Declares variables
    private String title;
    private int lines;
    // Sets number of lines for Haiku
    public Haiku(String name)
    {
        super(name, 3);
    }
}
