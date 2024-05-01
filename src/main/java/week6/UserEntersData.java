package week6;

import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.io.*;

import static input.InputUtils.intInput;

public class UserEntersData {

    public static void main(String[] args) {

        // Example: you want the user to enter a number between 1 and 10

        int userInput;      // initialize userInput variable... outside of any loops!
        do {        // do-while loop below...we need to use intInput to ask our user for a single digit number...
            userInput = intInput("Please enter a number between 1 and 10");
        } while (userInput < 1 || userInput > 10);      // conditions for loop.
        // we only want our program to run further if input was between 1-10
        // if user enters any number not between 1 and 10, our program will continue to run forever.............

        System.out.println("Thanks, the number you entered is " + userInput);
        // print if our user enters a number between 1-10
    }       // end of main method
}       // end of UserEntersData class
