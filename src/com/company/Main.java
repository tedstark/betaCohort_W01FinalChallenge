package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*      Create a calculator! One that can add, subtract, multiply, and divide.
        -First ask the user to enter a number.
        -Then ask them what operator they want to use ("+", "-", "*", or "/").
        -Finally, ask them to enter a second number.
        -Display the correctsponding calculation to the screen.

        Feel free to take the calculator above and beyond, here are some ideas:
        - Ask the user if they would like to do another calculation,
        - Look into 'try/catch' to handle entries that were unexpected,
        - Carry the calulation over after an original calculation was done. For example, 2 + 2 = 4, then prompt the user to use another operator (+, -, *, or /).
          Then take the previous answer, with the new operator, and a new number for a new calculation.
        - With the above scenario, add a 'clear' entry option that starts the application over.
*/
        Scanner mrRoboto = new Scanner(System.in);
        //Greeting and play decision
        System.out.println("Hello, this is a calculation app. You can enter two different numbers and calculate with different operations to see the result.");
        System.out.println("Would you like to try it? (Yes/No)");
        String useCalc = mrRoboto.nextLine();
        //Loop to deal with any answer other than Yes or No, ignoring capitalization
        while (!(useCalc.equalsIgnoreCase("yes")) && (!(useCalc.equalsIgnoreCase("no")))) {
            System.out.println("You seem uncertain, is it 'Yes' or 'No?'");
            useCalc = mrRoboto.nextLine();
        }
        //------MAIN WHILE LOOP START
        while (useCalc.equalsIgnoreCase("Yes")) {
            //First number input
            System.out.println("Pick a number for me:");
            //loop to deal with any character besides a number (although not a space or empty line
            while (!mrRoboto.hasNextDouble()) {
                mrRoboto.nextLine();
                System.out.println("Whoops! You need to enter a number, like '123' or '1.75' for the calculator to work. Try again");
            }
            String userInput1 = mrRoboto.nextLine();
            double userNumber1 = Double.parseDouble(userInput1);
            //Second number input
            System.out.println("What's your second number?");
            //loop to deal with any character besides a number (although not a space or empty line
            while (!mrRoboto.hasNextDouble()) {
                mrRoboto.nextLine();
                System.out.println("Sorry, you need to enter a number, like '78' or '2.34' for the calculator to work. Try again");
            }
            String userInput2 = mrRoboto.nextLine();
            double userNumber2 = Double.parseDouble(userInput2);

            System.out.println("And what kind of mathematical operation would you like to perform between the numbers?");
            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            //code block to validate input is integer only **WORKING**
            while (!mrRoboto.hasNextInt()){
                mrRoboto.nextLine();
                System.out.println("Sorry, you need to enter a number only.");
            }
//
//            //code block to validate input is integer only **NOT WORKING**
//            while (!(mrRoboto.hasNextInt())){
//                System.out.println("Sorry, you need to enter a number only.");
//                operationsStr = Integer.parseInt(mrRoboto.nextLine());
//            }
//            //code block to validate choice is between 1-4 only **NOT WORKING**
//            while (!(Integer.parseInt(mrRoboto.nextLine()) < 5 || (Integer.parseInt(mrRoboto.nextLine()) > 0))) {
//                mrRoboto.nextLine();
//                System.out.println("Please pick from 1 to 4 for the operation choice.");
//            }
            int operations = Integer.parseInt(mrRoboto.nextLine());
            /* code block to validate input is between 1 and 4; kind of working, but requires extra input
            line and only works for anything greater than 4 */
            while (!(operations < 5)) {
                operations = Integer.parseInt(mrRoboto.nextLine());
                System.out.println("Please pick from 1 to 4 for the operation choice.");
                }
            //small array to store user choices
            double[] answers = new double[3];
            answers[0] = userNumber1;
            answers[1] = userNumber2;
            answers[2] = operations;
            //switch block to finalize operator
            String opChoiceString = "";
            switch (operations) {
                case 1:
                    opChoiceString = "+";
                    break;
                case 2:
                    opChoiceString = "-";
                    break;
                case 3:
                    opChoiceString = "*";
                    break;
                case 4:
                    opChoiceString = "/";
                    break;
                }
            //switch blocks to finalize operation
            double opChoiceCalc = 0.0;
            switch (operations) {
                case 1:
                    opChoiceCalc = (answers[0] + answers[1]);
                    break;
                case 2:
                    opChoiceCalc = (answers[0] - answers[1]);
                    break;
                case 3:
                    opChoiceCalc = (answers[0] * answers[1]);
                    break;
                case 4:
                    opChoiceCalc = (answers[0] / answers[1]);
            }
            System.out.println("Okay, here's your calculation:");
            //in the next line, developer opted to display what was originally entered by the user instead of a parsed int or double.
            System.out.println(userInput1 + " " + opChoiceString + " " + userInput2 + " = " + opChoiceCalc);
            System.out.println("");
            //asks the user if they want start over
            System.out.println("Would you like to use the calculator again? (Yes/No)");
            useCalc = mrRoboto.nextLine();
            //Loop to deal with any answer other than Yes or No, ignoring capitalization
            while (!(useCalc.equalsIgnoreCase("yes")) && (!(useCalc.equalsIgnoreCase("no")))) {
                System.out.println("You seem uncertain, is it 'Yes' or 'No?'");
                useCalc = mrRoboto.nextLine();
            }
            if (useCalc.equalsIgnoreCase("yes")) {
                System.out.println("Okay, let's start over...");
                System.out.println("");
            }
        }
        //------MAIN WHILE LOOP END
        System.out.println("Okay, have a nice day!");
        }

    }

