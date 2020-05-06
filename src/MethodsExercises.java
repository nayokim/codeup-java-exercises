import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        //1
//        System.out.println(addition(1,2));
//        System.out.println(subtraction(1,2));
//        System.out.println(division(1,2));
//        System.out.println(multiplication(1,2));
//        System.out.println(modulus(1,2));

        //2
//        getInteger(1, 10);
//        int userInput = getInteger(1, 10);

        //3 factorial
        continueFactorial();



    } // end main class

    //1.Basic Arithmetic
    //Create four separate methods. Each will perform an arithmetic operation:
    //Each function needs to take two parameters/arguments so that the operation can be performed.
    //Addition
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    //Subtraction
    public static int subtraction(int input1, int input2) {
        return input1 - input2;
    }

    //Multiplication
    public static int multiplication(int input1, int input2) {
        return input1 * input2;
    }

    //Division
    public static int division(int input1, int input2) {
        return input1 / input2;
    }

    //modulus
    public static int modulus(int input1, int input2) {
        return input1 % input2;
    }


    //2. Create a method that validates that user input is in a certain range
    public static void getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a number between " + min + " and " + max);
        if (scanner.hasNextInt()) {
            int userInput = scanner.nextInt();
            //stopping condition
            if (userInput >= min && userInput <= max) {
                System.out.println("Your number is: " + userInput);

            } else {
                System.out.println("Your number is not in between " + min + " and " + max + " enter a new number");
                getInteger(min, max);
            }

        } else {
            System.out.println("This is not a number.");
            getInteger(min, max);
        }
    }


    //3. Calculate the factorial of a number.
    //Prompt the user to enter an integer from 1 to 10. x
    //Display the factorial of the number entered by the user. x
    //Ask if the user wants to continue.
    //Use a for loop to calculate the factorial.
    //Assume that the user will enter an integer, but verify it’s between 1 and 10.
    //Use the long type to store the factorial.
    //Continue only if the user agrees to.
    //A factorial is a number multiplied by each of the numbers before it.
    //Factorials are denoted by the exclamation point (n!). Ex:
    //
    //
    //1! = 1               = 1
    //2! = 1 x 2           = 2
    //3! = 1 x 2 x 3       = 6
    //4! = 1 x 2 x 3 x 4   = 24

    public static long calculateFactorial(int n){
        long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
                //fact = 1 * 1 = 1
                //fact = 1 * 2 = 2
                //fact = 2 * 3 = 6
                //fact = 6 * 4 = 24
            }
            return fact;
    }

    public static void continueFactorial() {
        boolean userContinue;
        boolean userEnterAnotherNumber;
        do {
            System.out.println("Enter an integer from 1 to 10");
            Scanner scanner = new Scanner(System.in);
            int userFactorialInput = scanner.nextInt();
            System.out.println("Do you want to continue(y/n)?");
            userContinue = scanner.next().equals("y");
            System.out.println(userFactorialInput + "! = " + calculateFactorial(userFactorialInput));
            System.out.println("Do you want to enter another number (y/n)?");
            userEnterAnotherNumber = scanner.next().equals("y");
        } while (userContinue && userEnterAnotherNumber);
        System.out.println("okay, that's cool, continue on. ");
    }

    //4. Create an application that simulates dice rolling.
    //Ask the user to enter the number of sides for a pair of dice.
    //Prompt the user to roll the dice.
    //"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    //Use static methods to implement the method(s) that generate the random numbers.
    //Use the .random method of the java.lang.Math class to generate random numbers.


}//end class
