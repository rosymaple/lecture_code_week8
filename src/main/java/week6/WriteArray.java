package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class WriteArray {

    public static void main(String[] args) throws Exception {

        String[] months = {"Jan", "Feb", "Mar"};        // initialize String[] array called "months"

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("months.txt"));
            // initialize bufferedWriter to write to our file "months.txt"
        for (String month : months) {       // loop through months array in this for loop...
            bufferedWriter.write(month);        // write to months.txt using "months" array using bufferedWriter
            bufferedWriter.newLine();       // write a new blank line to "months.txt"
        }       // end of for loop over months array. exists to write stuff to "months.txt" file.

        bufferedWriter.close();     // close our bufferedWriter to close our file. must include every time.
    }           // end of main method
}       // end of public class