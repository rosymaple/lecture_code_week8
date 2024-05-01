package org.example;

import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            System.out.println("Hello world!");
            // TODO get user input
            String userName = stringInput("Please enter your name: ");
        System.out.println("Welcome " + userName);

        int howManyClasses = intInput("How many classes are you taking?");
        System.out.println("You are taking " + howManyClasses + " classes.");

    }       // end of main method
}       // end of public class Main
