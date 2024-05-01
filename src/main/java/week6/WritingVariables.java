package week6;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WritingVariables {
    public static void main(String[] args) throws IOException {     // start of main method

        int classCode = 2454;       // initialize our classCode variable
        double averageEnrollment = 22.16;       // average number of students in a semester
        String className = "Java";        // initialize our className variable

        FileWriter writer = new FileWriter("java.txt");     //initialize using file writer to write to java.txt
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        // initialize bufferedWriter to write faster programs

        bufferedWriter.write("The class name is " + className + ".\n");     // write our className to our file
        bufferedWriter.write("The class code is " + classCode + ".\n");     // write our classCode to our file
        bufferedWriter.write("The average enrollment is " + averageEnrollment + " students.\n");
        // write to buffered writer our averageEnrollment double variable and a string of text

        bufferedWriter.close();     // you can do either!
        // writer.close(); // this works as well
    }       // end of main method
}       // end of public class
