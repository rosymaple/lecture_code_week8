package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HelloReading {
    public static void main(String[] args) {

        BufferedReader bufferedReader = null;       // initialize bufferedReader variable as null...
        try {       // start of try-catch block
//            FileReader reader = new FileReader("hello.txt");
            bufferedReader = new BufferedReader(new FileReader("nu.txt"));
            // start our bufferedReader for file reader on "nu.text" file...
            String line = bufferedReader.readLine();        // initialize our line reader variable

            while (line != null) {      // while line does not return null value...
                System.out.println(line);       // print each line from fileName to our user. loop over nu.text
                line = bufferedReader.readLine();       // read each line from the file not just the first line
            }       // end of while loop
        } catch (IOException e) {       // catch IOException e
            System.out.println("Error or the file does not exist." + e);     // only runs if IOException is thrown
        } finally {         // end of try-catch block, we will add one more loop to the end of our main method...
            // this will always run even if a file io exception is caught and handled...
            if (bufferedReader != null) {       // if bufferedReader does not return null...
                try {       // try block for bufferedReader, we will close our file reader here.
                    bufferedReader.close();     // close our reader here
                    // close buffered file reader once we finish reading our entire file and catching exceptions...
                }       // end of try block
                catch (IOException e) {     // catch block at the end of our 2nd try-catch block...
                    System.out.println("Error closing the file" + e);
                    // if we experience any errors closing file reader, we need to print error message for user
                }       // end of try-catch block
            }       // end of if bufferedReader is null...
        }       // end of finally block that will serve to close our file reader or print an error message.
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//
//        bufferedReader.close();
    }       // end of main method
}       // end of public class
