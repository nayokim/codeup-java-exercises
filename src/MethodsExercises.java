
import java.util.Random;
import java.util.Scanner;


public class MethodsExercises {
    public static void main(String[] args) {
        //1
//        System.out.println(addition(1,2));
//        System.out.println( 2 == addition(1,1)); // testing
//        System.out.println( 0 == addition(-1,1));// testing
//        System.out.println( 0 != addition(-2,-5));// testing
////        System.out.println(subtraction(1,2));
//        System.out.println( 4 == subtraction(5,1));// testing
//        System.out.println( -2 == subtraction(-1,1));// testing
////        System.out.println(division(1,2));
//        System.out.println(2 == division (10,5));// testing
//        System.out.println(2 == division (5,10));// testing
//        System.out.println(2 == division (5,0));// testing
//
////        System.out.println(multiplication(1,2));
//        System.out.println(2 == multiplication (10,5));// testing
//        System.out.println(50 == multiplication (5,10));// testing
//
////        System.out.println(modulus(1,2));
//        System.out.println(1 == modulus(5,2));
//        System.out.println(0 == modulus(6,2));

        //2
//        getInteger(1, 10);

        //3 factorial
//        continueFactorial();
//        Scanner scan = new Scanner (System.in);
//        while(true){
//            factorial();
//            System.out.println("Do you wish to continue (y/n)?");
//            String answer = scan.nextLine();
//            if (!answer.toLowerCase().equals("y")){
//                break;
//            }
//        }


        //4 dice
//        rollDice();

        //5 guessing game
        HighLow();


    } // end main class

    //1.Basic Arithmetic
    //Create four separate methods. Each will perform an arithmetic operation:
    //Each function needs to take two parameters/arguments so that the operation can be performed.
    //Addition
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    //Subtraction
    public static double subtraction(double input1, double input2) {
        return input1 - input2;
    }

    //Multiplication
    public static double multiplication(double input1, double input2) {
        return input1 * input2;
    }

    //Division
    public static double division(double input1, double input2) {
        if (input2 == 0) {
            System.out.println("division by 0 is not possible");
            return 0;
        }
        return input1 / input2;
    }

    //modulus
    public static double modulus(double input1, double input2) {
        return input1 % input2;
    }


    //2. Create a method that validates that user input is in a certain range
//    public static void getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please Enter a number between " + min + " and " + max);
//        if (scanner.hasNextInt()) {
//            int userInput = scanner.nextInt();
//            //stopping condition
//            if (userInput >= min && userInput <= max) {
//                System.out.println("Your number is: " + userInput);
//
//            } else {
//                System.out.println("Your number is not in between " + min + " and " + max + " enter a new number");
//                getInteger(min, max);
//            }
//
//        } else {
//            System.out.println("This is not a number.");
//            getInteger(min, max);
//        }
//    }

    //2-walkthrough
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number between 1 and 10");
        int userInput = Integer.parseInt(scanner.nextLine());

        //how to proceed
        if (userInput < min || userInput > max) {
            System.out.println("number is outside of the range");
            return getInteger(min, max);
        } else {
            //how to stop
            System.out.println("number is within the range");
            return userInput;
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

//    public static long calculateFactorial(int n) {
//        long fact = 1;
//        for (int i = 1; i <= n; i++) {
//            fact *= i;
//            //fact = 1 * 1 = 1
//            //fact = 1 * 2 = 2
//            //fact = 2 * 3 = 6
//            //fact = 6 * 4 = 24
//        }
//        return fact;
//    }
//
//    public static void continueFactorial() {
//        boolean userContinue;
//        boolean userEnterAnotherNumber;
//        do {
//            System.out.println("Enter an integer from 1 to 10");
//            Scanner scanner = new Scanner(System.in);
//            int userFactorialInput = scanner.nextInt();
//            System.out.println("Do you want to continue(y/n)?");
//            userContinue = scanner.next().equals("y");
//            System.out.println(userFactorialInput + "! = " + calculateFactorial(userFactorialInput));
//            System.out.println("Do you want to enter another number (y/n)?");
//            userEnterAnotherNumber = scanner.next().equals("y");
//        } while (userContinue && userEnterAnotherNumber);
//        System.out.println("okay, that's cool, continue on. ");
//    }

    //3 walkthrough
    public static void factorial() {
        //4
        int userInput = getInteger(1, 10);
        int sum = 1;
        System.out.println("userInput = " + userInput);
        for (int fa = userInput; fa > 0; fa--) {
//            System.out.println("fa= " + fa);
            sum *= fa;
        }
        System.out.println("factorial of  " + userInput + "!= " + sum);
    }

    //4. Create an application that simulates dice rolling.
    //Ask the user to enter the number of sides for a pair of dice.
    //Prompt the user to roll the dice.
    //"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    //Use static methods to implement the method(s) that generate the random numbers.
    //Use the .random method of the java.lang.Math class to generate random numbers.

    public static void rollDice() {
        int userInputDie1;
        int userInputDie2;
        boolean rollAgain;
        do {
            System.out.println("Enter the number of sides you would like your dice to have");
            Scanner scanner = new Scanner(System.in);
            userInputDie1 = scanner.nextInt();
            userInputDie2 = scanner.nextInt();
            double randomDie1 = Math.ceil(Math.random() * (((userInputDie1 - 1) + 1)));
            double randomDie2 = Math.ceil(Math.random() * (((userInputDie2 - 1) + 1)));
            System.out.println("Your first die rolled : " + randomDie1 + " Your second die rolled : " + randomDie2);
            System.out.println("DO you want to roll again (y/n)?");
            rollAgain = scanner.next().equals("y");
        } while (rollAgain);
        System.out.println("okay, be that way.");
    }

    //5.Game Development 101
//Welcome to the world of game development!
//You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//The specs for the game are:
//Game picks a random number between 1 and 100.
//Prompts user to guess the number.
//All user inputs are validated.
//If user's guess is less than the number, it outputs "HIGHER".
//If user's guess is more than the number, it outputs "LOWER".
//If a user guesses the number, the game should declare "GOOD GUESS!"

    public static void HighLow() {
        int min = 1;
        int max = 100;
        double computerNumber = Math.ceil((Math.random() * ((max - min) + 1)));
        Scanner scanner = new Scanner(System.in);
        System.out.println(computerNumber);
        System.out.println("Pick a number between 1 and 100");
        if (scanner.hasNextInt()) {
            int userGuess = scanner.nextInt();
            //stopping condition
            if (userGuess == computerNumber) {
                System.out.println("Good guess!");
                return;

            } else if (userGuess > computerNumber) {
                System.out.println("Guess Lower");
            } else {
                System.out.println("Guess Higher");
            }
            HighLow();
        }
    }


}//end class
