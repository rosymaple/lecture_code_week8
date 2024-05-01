package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;

public class WriteArrayList {
    public static void main(String[] args) throws IOException {

        final String filename = "ITEC_Classes.txt";     // final variable, immutable variable.
        // Write lines to the file "ITEC 2545 Java" and "ITEC 2560 Web" etc.
        List<String> classNames = List.of("Java", "Web", "C#");
        // initiate immutable list of values

//        List<String> classes = new ArrayList<>();
//        classes.add("Java");
//        classes.add("Web");
//        classes.add("C#");


        List<Integer> classCodes = List.of(2545, 2560, 2505);       // initiate immutable list of Integer values...

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
        // initialize bufferedWriter for filename ...

        for (int i = 0; i < classNames.size(); i++) {       // loop over the entire size of list of classNames
            String name = classNames.get(i);            // name will pull an element from our immutable classNames list
            int code = classCodes.get(i);       // code will pull an element from our immutable classCodes list
            String outputLine = String.format("ITEC %d %s \n", code, name);
            // outputLine will be a formatted string to print the full class department code, and name for our user.
            bufferedWriter.write(outputLine);       // write our formatted string with our user input and add to file
        }       // end of classNames.size() loop
        bufferedWriter.close();     // close our file writing method

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));       // initialize file reader

        List<String> classDescriptions = new ArrayList<>();     // add lines from our filename into an arrayList

        String line = bufferedReader.readLine();        // our line reader initialized here

        while (line != null) {      // while our fileName does NOT return a null line...
            classDescriptions.add(line);        // add line variable to classDescriptions
            line = bufferedReader.readLine();           // read the rest of the lines from bufferedReader
        }           // end while loop for while "line" is not equal to null...

        System.out.println("End of file reached");      // print a message for our user.
        System.out.println(classDescriptions);          // print classDescriptions arrayList for our user
    }       // end of main method
}       // end of public class WriteArrayList