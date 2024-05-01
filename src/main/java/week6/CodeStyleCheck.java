package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CodeStyleCheck {       // start of public class
    public static void main(String[] args) throws IOException {
        // must throw exception for bufferedReader/fileReader to filename

        String filename = "ReadNumberFromFile.java";        // set the file name for bufferedReader to search for
        int maxLineLength = 50;         // this will represent the max amount of characters in a length of text
        //try with resources handling here
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {      //bufferedReader initialized


            boolean linesTooLong = false;           // initialize linesTooLong as a boolean
            int numberOfLinesTooLong = 0;           // initialize numberOfLinesTooLong as 0 for loop counter
            String line = reader.readLine();        // "line" will be used to represent our .readLine() function
            int lineCounter = 1;                    // initialize lineCounter variable for representing a line in file.
            while (line != null) {                  // while loop, if reader.readLine() returns a null string...
                if (line.length() > maxLineLength) {        // if statement - string "line" is longer than maxLineLength
                    System.out.println("The line " + lineCounter + " is too long.");
                    // print lineCounter (the line in our file "filename") as an error message for the user.
                    System.out.println(line);     //print too long String variable "line" from "filename" for the user.
                    linesTooLong = true;        // linesTooLong will return true if this while & if loop runs.
                    numberOfLinesTooLong++;     // add a counter to numberOfLinesTooLong variable
                }               // end of while loop. will only run if linge.length() is greater than maxLineLength.
                lineCounter++;      // while line does not return null, add to line counter...
                line = reader.readLine();       // while line does not return null, read line from filename
            }       // end of while loop

            if (linesTooLong) {         // if linesTooLong variable returns as true, the number of times will print...
                System.out.println("There were " + numberOfLinesTooLong + " lines that were too long.");
                // number of times numberOfLinesTooLong variable will return true
            } else {        // else, if linesTooLong never returns true...
                System.out.println("There were no lines that were too long.");      // print a message for the user.
            }       // end of if-else statement

        } catch (IOException e) {       // initialize catch block for try-catch for our bufferedReader file reader
            System.out.println("Error reading file " + filename + " because " + e);     // print filename and full error
        }       // end of try-catch block
    }       // end of main method with throwsIOException
}       //end of public class variable