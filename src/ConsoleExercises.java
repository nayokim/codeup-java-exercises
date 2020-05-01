import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String args[]){
        double pi = 3.14159;

        System.out.println("The value of pi is approximately " + pi);
        System.out.printf("The value of pi is approximately %.2f%n", pi);//%
        System.out.format("The value of pi is approximately %.2f%n", pi); //n makes a new line//


        //1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer");
//        int userInt = scanner.nextInt(); // next() always returns a string. nextInt() parses it
        int userInt = Integer.parseInt(scanner.nextLine());
        System.out.println("you entered: " + userInt);
        // if user does not enter a number, you will get an error in mismatch variable types.

        //2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.println("enter 3 words");
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
        //scanner.nextLine() - it doesnt work because its conflicting with the previous nextInt(). If you want to keep it together, instead of using nextInt() use nextLine (use strings and parseInt).
//        String wordOne = scanner.nextLine();
//        String wordTwo = scanner.nextLine();
//        String wordThree = scanner.nextLine();
//        System.out.println("word one: " + wordOne);
//        System.out.println("word two: " + wordTwo);
//        System.out.println("word three: " + wordThree);
//        System.out.printf("your three words were: %s, %s, and %s", wordOne, wordTwo, wordThree);
        //What happens if you enter less than 3 words? - it will not let you continue
        //What happens if you enter more than 3 words? - only 3 will be printed

        //3.Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//        System.out.println("Enter a sentence");
//        String userSentence1 = scanner.next();
//        System.out.println(userSentence1);

        //do you capture all of the words? -no because it is only capturing the next word.
        //4. Rewrite the above example using the nextLine method.
        System.out.println("Okay, rewrite your sentence");
        String userSentence2 = scanner.nextLine();
        System.out.println(userSentence2);


        //5 Prompt the user to enter values of length and width of a classroom at Codeup.
        System.out.println("Enter the length of the classroom");
        String userLength = scanner.nextLine();
        System.out.println("Enter the width of the classroom");
        String userWidth = scanner.nextLine();

        //Use the nextLine method to get user input and [parse](https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt(java.lang.String) the resulting string to a numeric type.
        int length = Integer.parseInt(userLength);
        int width = Integer.parseInt(userWidth);

        int perimeter = (2 * length) + (2 * width);
        int area = length * width;
        System.out.println ("perimeter of the class is: " + perimeter);
        System.out.println ("Area of the class is: " + area);


        //Assume that the rooms are perfect rectangles.
        //Assume that the user will enter valid numeric data for length and width.

        //Bonuses

        //Accept decimal entries.
        //Calculate the volume of the rooms in addition to the area and perimeter.


    }
}
