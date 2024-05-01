package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadNumberFromFile {
    public static void main(String[] args) throws IOException {     // throw IOException

        List<Integer> numbers = new ArrayList<>();      // initialize new ArrayList
        String filename = "numbers.txt";            // initialize filename variable to read a txt file "numbers.txt"

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {    // resource is closed
        // try-catch block to read a text file (filename) called numbers.txt
            String line = reader.readLine();        // read line from file initialized inside loop

            while (line != null) {      // loop runs if the line variable is NOT null...
                // ignore anything that isn't an integer
                try {       // try block inside of try block
                    int number = Integer.parseInt(line);        // pull int values from our file reader variable "line"
                    numbers.add(number);        // add int value to numbers arrayList
                } catch (NumberFormatException e) {         // catch NumberFormatException errors here from our program
                    // ignore NumberFormatException.forInputString()
                    System.out.println(line + "is not an integer, ignoring.");      // print a message for the user
                }       // end of second try-catch block inside the first...
                line = reader.readLine();       // read the rest of the lines in filename otherwise reader will end...
            }
            System.out.println(numbers);        // print "numbers" arrayList compiled from above
        } catch (IOException e) {       // catch IO file errors...
            System.out.println("Error reading file " + e);      // print error message for the user
        }       // end of try-catch block
    }       // end of main method
}       // end of public class
