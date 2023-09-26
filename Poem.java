// ------------------------------------------------------------------
// Poem.java - A class that contains the fields title and lines where
// title is the name of the poem as type String and lines is the 
// number lines in the poem as type int.
//          Naomi Nash - Saint Leo University - 3 June 2021
// ------------------------------------------------------------------
public class Poem
{
    // Declares title and lines
    private String title;
    private int lines;
    // States the fields of Poem
    public Poem(String name, int numLines)
    {
        title = name;
        lines = numLines;
    }
    // Declares getTitle
    public String getTitle()
    {
        return title;
    }
    // Declares getLines
    public int getLines()
    {
        return lines;
    }
}
