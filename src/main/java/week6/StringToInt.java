package week6;

public class StringToInt {
    public static void main (String[] args) {

        String hopeThisIsANumber = "50";        // initialize variable

        try {       // initialize try-catch block
            int number = Integer.parseInt(hopeThisIsANumber);       // pull(parse) any int values from hopeThisIsANumber
            System.out.println("The number is " + number);      // print the parsed int value(s) from hopeThisIsANumber
        } catch (NumberFormatException e) {     // catch numberformatexception errors and print error message below...
            System.out.println(hopeThisIsANumber + " is not a valid number.");
        }       // end of try-catch block

        System.out.println("This is the end of the program.");      // print end of program message for user...
    }       // end of main method
}       // end of public class StringToInt
