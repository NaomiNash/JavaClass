// ------------------------------------------------------------------------------------
// ValidateCheckDigits.java - reads six-digit account numbers in AcctNumsIn.txt file,
// checks if sum of first 5 digits, when divided by 10, is equal to the last digit.
// Then write the valid account numbers into the AcctNumsOut.txt file.
//                  Naomi Nash - Saint Leo University - 13 June 2021
// ------------------------------------------------------------------------------------
// Imports necessary methods
import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;
public class ValidateCheckDigits 
{
    public static void main(String[] args) 
    {
        // Creates paths to fileIn and fileOut files
        Path fileIn = Paths.get("/root/sandbox/AcctNumsIn.txt");
        Path fileOut = Paths.get("/root/sandbox/AcctNumsOut.txt");
        // Declares necessary variables
        InputStream input = null;
        OutputStream output = null;
        byte[] data;
        int digit1, digit2, digit3, digit4, digit5, digit6;
        // Checks acct numbers and put valid acct numbers input AcctNumsOut.txt
        try
        {
            // Declares necessary variables
            input = Files.newInputStream(fileIn);
            output = new BufferedOutputStream(Files.newOutputStream(fileOut, CREATE));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String str = reader.readLine();
            // Determines which acct numbers are valid
            while(str!=null)
            {
                // Declares neccessary variables
                digit1 = Integer.parseInt(String.valueOf(str.charAt(0)));
                digit2 = Integer.parseInt(String.valueOf(str.charAt(1)));
                digit3 = Integer.parseInt(String.valueOf(str.charAt(2)));
                digit4 = Integer.parseInt(String.valueOf(str.charAt(3)));
                digit5 = Integer.parseInt(String.valueOf(str.charAt(4)));
                digit6 = Integer.parseInt(String.valueOf(str.charAt(5)));
                // Puts valid acct numbers into fileOut file
                if((digit1 + digit2 + digit3 + digit4 + digit5)%10 == digit6)
                {
                    str += "\n";
                    data = str.getBytes();
                    output.write(data);
                    output.flush();
                }
                str = reader.readLine();
            }
            // Closes files
            input.close();
            output.close();
        }
        // Declares catch Exception and prints message if necessary
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
    }
}
