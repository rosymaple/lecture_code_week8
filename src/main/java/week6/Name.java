package week6;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;


public class Name {
    public static void main(String[] args) throws IOException {     // throw IOException

        String filename = "data.txt";       // initialize filename that can be buffered read and write to
        String name = "Candace";            // a variable we will write to our buffered writer...
        String favoriteColor = "blue";      // a variable we will write to our buffered writer...
        int classCode = 2454;           // a variable we will write to our buffered writer to filename "data.txt"...

        // write to the file
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));       // initialize file writer..
        bufferedWriter.write(name + "\n");      // write variable to filename and line break
        bufferedWriter.write(favoriteColor);        // write variable to filename
        bufferedWriter.newLine();           // write blank line to bufferedWriter
        bufferedWriter.write(classCode + "\n");     // write blank writer

        bufferedWriter.close();     // close the buffered high speed file writer

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));       // start a different buffer
        // start bufferedReader instead of writer

        String line = bufferedReader.readLine();        // initialize line reading variable "line"

        while (line != null) {      // when line in bufferedReader returns NOT line...
            System.out.println(line);       // print line from buffered reader
            line = bufferedReader.readLine();       // print the rest of the lines from the filename
        }       // end of while loop

        bufferedReader.close();     // when bufferedReader
    }       // end of main method
}       // end of public class