import java.util.Scanner;

public class MethodsLecture {



    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        validateCurrency(input);

        countdownRecursion(5);
        countdown();

        System.out.println("sum(1,2)= " + sum(1,2));
        System.out.println("decimal sum() = " + sum(1.5, 4.3));

    //overload
        System.out.println("sayHello(): "+ sayHello("Nayoung"));
        System.out.println(sayHello());
        System.out.println(sayHello("Kim", "Nayoung"));
    }

    public static String sayHello(){
        return "Hello World";
    }

    //how to write a method in java. It is outside the main method but can be referred into the main method
    public static String sayHello(String name){
        return "Hi " + name;
    }

    public static String sayHello(String firstName, String lastName){
        return "Hi " + firstName + " " + lastName;
    }

    //method using numbers
    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static double sum (double num1, double num2){
        return num1 + num2;
    }

    //counting from 5 to 1 using a loop
    public static void countdown (){
        for (byte x = 5;x>=1;x--){
            System.out.println("for loop x= " + x);
        }
    }

    public static void countdownRecursion(int n){
        //how to stop
        System.out.println("recursion n= " + n);
        if (n < 1){
            return; // return in a void is a functionality for a method to stop running
        }
        //how to proceed
        n = n - 1;
        countdownRecursion(n);


    }

    //that only looks for $
    public static void validateCurrency(Scanner scan){ // so you dont have to copy and paste the same line to initialize the scanner, you can pass it in as a parameter once it is declared in the main method
        System.out.println("Give me an amount: ");
        String amount = scan.nextLine(); // the variable that is going to represent the user response
        System.out.println("amount= " + amount);
        //how to stop
        if(amount.startsWith("$")){
            System.out.println("its valid money format");
            return;
        }
        //how to proceed, how to run process
        System.out.println("Invalid money format, try again");
        validateCurrency(scan);
    }

}
