package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {
    public static void main(String[] args) throws IOException {


        // file will be created if it does not exist
        // if exists, these edits will override file

        //  FileWriter writer = new FileWriter("hello.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hello.txt"))) {
        // initialize buffered writer to write in our file, hello.txt...
            bufferedWriter.write("Hello!\n");       // write a new line to fileName
            bufferedWriter.write("Hello Java Students!\n");     // write a new line to fileName
            bufferedWriter.write("Goodbye!\n");         // write a new line to fileName
        } catch (IOException e) {               // try-catch block, catch IOException errors here.
            System.out.println("Error writing to file" + e);        // print full error message for user.
        }       // end of try-catch block

//            bufferedWriter.close();     // must close bufferedWriter to save file

        try (FileWriter writer2 = new FileWriter("hello.txt", true);
             // initialize another fileWriter to append our file hello.txt that we started writing to already...
             BufferedWriter bufferedWriter2 = new BufferedWriter(writer2) ) { // append flag - true means add data to the end
            // initialize bufferedWriter a second time using bufferedWriter2
            bufferedWriter2.write("Other data!");       // write a new line to fileName...
            bufferedWriter2.newLine();      // write a blank line to fileName
            bufferedWriter2.write("Hello programmers!");        // write new line
            bufferedWriter2.newLine();          // write black line
            bufferedWriter2.write("End of file!");          // write new line
            bufferedWriter2.newLine();      // write a black line
        } catch (IOException e) {       // try-catch block, catch IOException....
            System.out.println("Error appending data to file " + e);        // print error message for our user
        }       // end of try-catch block...
    }       // end of public method, throws IOException in start of main...
}       // end of public class HelloWriting