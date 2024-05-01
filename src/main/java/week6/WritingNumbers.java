package week6;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class WritingNumbers {
    public static void main(String[] args) throws IOException {

        int data1 = 67;     // initialize 3 int variables
        int data2 = 65;
        int data3 = 84;

        double number = 12.34;      // initialize a double variable called "number"

        FileWriter writer = new FileWriter("numbers.txt");      // initialize our file writer variable "writer"
        BufferedWriter bufferedWriter = new BufferedWriter(writer);     // initialize buffered writer on "writer"

        bufferedWriter.write(Integer.toString(data1) + "\n");       // print Integer value as a string to writer
        bufferedWriter.write(Integer.toString(data2) + "\n");   //  print Integer value as a string to writer
        bufferedWriter.write(data3 + "\n");        // int number argument

        bufferedWriter.write(number + "\n");        // write a double variable to file
        bufferedWriter.write("test");       // write a string

        bufferedWriter.close();     // close our file writer, this will save our file writing.
    }   // end of main method that also throws IOException
}       // end of public class WritingNumbers