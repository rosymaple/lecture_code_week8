package week6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;


public class ThrowsFromMethod {     // start of public class method
    public static void main(String[] args) {        // start of main method!
        String filename = "numbers.txt";        // we will read from fileName "numbers.txt"

        try {       // try-catch block for reading from file...
            List<String> data = readFromFile(filename);
            // we will use a method called readFromFile
            System.out.println(data);           // print List of String values from data variable
        }       // end of our try block
        catch (FileNotFoundException fnfe) {        // our catch block for file not found errors...
            System.out.println("The file " + filename + " was not found. Fix and try again.");
        }       // end of catch block, error message will print for the user.

        catch (IOException ioe ) {      // another catch file io exception block...
            System.out.println("Could not read from file " + filename);
            // print error message for the user
        }       // end of try catch blocks
    }       // end of main method

    private static List<String> readFromFile(String filename) throws IOException {
        // this will be our method we will call when we want to "readFromFile"
        // this will make our code easier to understand, read, and write!!!!
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        // initialize bufferedReader for fileName
        List<String> lines = new ArrayList<>();     // initialize arrayList for our line variable...
        String line = bufferedReader.readLine();        // our readLine() function uses "line"...
        while (line != null) {      // while our line reader does not return null, run this loop...
            lines.add(line);        // add line from .readLine() into list of String values "lines"
            line = bufferedReader.readLine();       // run .readLine() again otherwise our program will halt.
        }       // end of while line is not null loop.

        return lines;       // return lines array to main method, so we can read from an entire file using one word :)
    }       // end of readFromFile method to read from String filename
}       // end of public class ThrowsFromMethod