import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        highLow(scanner);
    }
//        int min = 1;
//        int max = 100;
//        double computerNumber = Math.ceil((Math.random() * ((max - min) + 1)));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(computerNumber);
//        System.out.println("Pick a number between 1 and 100");
//        if (scanner.hasNextInt()) {
//            int userGuess = scanner.nextInt();
//            //stopping condition
//            if (userGuess == computerNumber) {
//                System.out.println("Good guess!");
//                return;
//            } else if (userGuess > computerNumber) {
//                System.out.println("Guess Lower");
//            } else {
//                System.out.println("Guess Higher");
//            }
//            HighLow();
//        }
//    }

    //5 walkthrough
    public static void highLow(Scanner scanner) {
        int range = 100 - 1 + 1;
        int numberToGuess = ((int) (Math.random() * range) + 1);
        System.out.println("number to guess= " + numberToGuess);
        while (true) {
            System.out.println("Guess a number between 1 and 10");
            int userInput = Integer.parseInt(scanner.nextLine());
            if (userInput > numberToGuess) {
                System.out.println("Lower");
            } else if (userInput < numberToGuess) {
                System.out.println("Higher");
            } else {
                System.out.println("Good Guess");
                break;
            }
        }
    }
}
