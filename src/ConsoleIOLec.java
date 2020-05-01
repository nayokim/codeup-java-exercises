//import all the classes you want to work with


import java.util.Scanner;

public class ConsoleIOLec {
    public static void main (String args[]) {
            Scanner scanner = new Scanner(System.in);
            String greeting = "Salutations";
            System.out.println("Whats your name?");
            String name = scanner.nextLine();
            System.out.printf("%s, %s welcome to my java app!", greeting, name);
    }
}
