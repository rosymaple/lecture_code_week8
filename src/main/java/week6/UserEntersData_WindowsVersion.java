package week6;

import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.io.*;

import static input.InputUtils.stringInput;


public class UserEntersData_WindowsVersion {

    public static void main(String[] args) {        // start of main method

        // example: enter your version of windows. only "XP" "7" "8" and "10" are acceptable answers.

        List<String> windowsVersions = List.of("XP", "7", "8", "10");       // make immutable list of values!!!
        String windowsVersionsString = String.join(", ", windowsVersions);  // XP, 7, 8, 10
        // join our WindowsVersions list with the string "," to create a readable string of text for our user.
        String version = stringInput("Enter your version of Windows from these choices: "
                + windowsVersionsString.toUpperCase());
        // "version" is user input, and we can print our windowsVersionsString in all uppercase to make sense...
        // for our user to read. "XP" is always in caps for example.
        while (!windowsVersions.contains(version)) {        // while our original List.of list does NOT contain...
            // the user input "version"
            version = stringInput("Not a recognized version. " +
                    "Enter your version of Window from these choices: " + windowsVersionsString.toUpperCase());
            // print another loop for our user that they need to enter a valid version of Windows into our program.
        }       // end of while loop. exists to correct our user and obtain valid input.
    }       // end of main method. determines if our user has an acceptable version of Windows software for their PC.
} // end of public class
