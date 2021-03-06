import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //Loop Basics
        //
        //While
        //
        //Create an integer variable i with a value of 5.
        //Create a while loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        //Your output should look like this:
        //
        //5 6 7 8 9 10 11 12 13 14 15


//        int i = 5;
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }


//        //for loop
//        for (int i = 5; i <=15; i++){
//            System.out.println(i + " ");
//        }


//Do While
//Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int counter = 0;
//        do {
//            System.out.println("do while by 2's: " + counter );
//            counter+=2;
//        } while (counter <=100);

//        //for loop
//        for (int counter = 0; counter <=100; counter +=2 ){
//            System.out.println("for loop by 2's: " + counter  );
//        }
//Alter your loop to count backwards by 5's from 100 to -10.
//        int counter = 100;
//        do {
//            System.out.println("Do while backward by 5: " + counter);
//            counter -= 5;
//        } while (counter >=-10 );

//        //for loop
//        for (int counter = 100; counter >= -10; counter-=5){
//            System.out.println("for loop backward by 5: " + counter);
//        }
//Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
// 2
// 4
// 16
// 256
// 65536
//        int counter = 2;
//        long counter = 2L;
//        do {
//            System.out.println("Exp. do while: " + counter);
////            counter = (int) Math.pow(counter,2); //or
//            counter *= counter;
//
//        } while(counter < 1000000L);

//        //for loop
//        for (int counter =2; counter < 1000000; counter = (int) Math.pow(counter,2)){
//        for (long counter =2L; counter < 1000000; counter *= counter)){
//            System.out.println("For loop exp: " + counter);
//        }


        //Fizzbuzz
        //One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //Write a program that prints the numbers from 1 to 100.
//        for (int counter = 1; counter <=100; counter++){
//            System.out.println(counter);
//        }
        //For multiples of three: print “Fizz” instead of the number.
//        for (int counter = 1; counter <=100; counter++){
//            if(counter % 3 == 0 && counter % 5 ==0){
//                System.out.println("FizzBuzz");
//            } else if (counter % 3 == 0){
//                System.out.println("fizz");
//                //For the multiples of five: print “Buzz”.
//            } else if (counter % 5 == 0) {
//                System.out.println("buzz");
//                //For numbers which are multiples of both three and five: print “FizzBuzz”.
//            } else{
//                System.out.println(counter);
//            }
//        }


        //Display a table of powers.
        //Prompt the user to enter an integer.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer");
//        int num = scanner.nextInt();
//        System.out.println("Do you want to continue? [y/n]");
//        String userInput = scanner.next();
//        if (userInput.equals("y")) {
//            //Display a table of squares and cubes from 1 to the value entered.
//            System.out.println("Here is your table!");
//            System.out.println("Number | Squared | Cubed");
//            System.out.println("-------|---------|---------");
//            for (int i = 1; i < num; i++) {
//                System.out.printf("    %d  |    %d    |    %d%n", i, i * i, i * i * i);
//            }
//        } else {
//            System.out.println("Okay, thank you!");
//        };

        //using do-while
//        Scanner scanner = new Scanner(System.in);
//        boolean userContinues = true;
//        do {
//            System.out.println("what number would you like to go up to?");
//            int userInt = scanner.nextInt();
//            System.out.println();
//            System.out.println("here is your table");
//            System.out.println();
//            System.out.println("Number | Squared | Cubed");
//            System.out.println("-------|---------|---------");
//            for (int i = 0; i <= userInt; i++) {
//                System.out.format("%-7d", i);
//                System.out.print("|");
//                System.out.format("%-9d", i * i);
//                System.out.print("|");
//                System.out.print(i * i * i);
//                System.out.println();
//            }
//            System.out.println("Would you like to enter another number? [y/n]");
//            String userResponse = scanner.next();
//            if (!userResponse.equalsIgnoreCase("y")) {
//                userContinues = false;
//            }
//
//        } while (userContinues);
//

        //Convert given number grades into letter grades.
        //Prompt the user for a numerical grade from 0 to 100.
//            System.out.println("Enter your grade from 0 to 100");
//            Scanner scanner = new Scanner(System.in);
//            int userInputGrade = scanner.nextInt();
//            System.out.println("Do you want to continue? [y/n]");
//            String userInput = scanner.next();
//            if (userInput.equals("y")) {
//                if (userInputGrade >= 0 && userInputGrade <= 59) {
//                    System.out.println("Your grade is: F");
//                } else if (userInputGrade >= 60 && userInputGrade <= 66) {
//                    System.out.println("Your grade is: D");
//                } else if (userInputGrade >= 67 && userInputGrade <= 79) {
//                    System.out.println("Your grade is: C");
//                } else if (userInputGrade >= 80 && userInputGrade <= 87) {
//                    System.out.println("Your grade is: B");
//                } else if (userInputGrade >= 88 && userInputGrade <= 100) {
//                    System.out.println("Your grade is: A");
//                } else {
//                    System.out.println("Okay, you will not learn your grade");
//                }
//            }

        //using do-while
        Scanner scanner = new Scanner(System.in);

        boolean anotherGrade = true;
        do {
            System.out.print("Please enter a numerical grade from 0 to 100");

            int numericGrade = scanner.nextInt();
                 if (numericGrade >88) {
                    System.out.println("Your grade is: A");
                } else if (numericGrade >= 80) {
                    System.out.println("Your grade is: B");
                } else if (numericGrade >= 67 ) {
                    System.out.println("Your grade is: C");
                } else if (numericGrade >= 60 ) {
                    System.out.println("Your grade is: D");
                } else {
                System.out.println("Your grade is: F");
            }
                System.out.print("do you wish to enter a new grade?");
                String userResponse = scanner.next();
                if (!userResponse.equalsIgnoreCase("y")) {
                    anotherGrade = false;
                }
            }
            while (anotherGrade) ;
    }
}
