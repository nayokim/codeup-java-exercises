import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String args[]){
        double pi = 3.14159;
        System.out.println("The value of pi is approximately " + pi);
        System.out.printf("The value of pi is approximately %.2f.", pi);
        System.out.format("The value of pi is approximately %.2f%n", pi);


        //1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer");
        int userInt = scanner.nextInt();
        System.out.println(userInt);
        // if user does not enter a number, you will get an error in mismatch variable types.

        //2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.println("enter 3 words");
        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();
        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);
        System.out.printf("your three words were: %s, %s, and %s", wordOne, wordTwo, wordThree);
        //What happens if you enter less than 3 words?

        //What happens if you enter more than 3 words?





    }
}
