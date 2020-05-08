package util;

import java.util.Scanner;

// create a class named Input
public class Input {

    //public Input (){} - a constructor but not needed in this exercise since there are no rules. Java will automatically do this without you typing it out
    // private property named scanner.
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Type anything");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("yes or no");
        String answer = scanner.nextLine().toLowerCase();
//        String input = getString().toLowerCase();
//        return answer.equals("yes") || answer.equals("y");
        return answer.equals("y")? true: false;
    }


    public int getInt(int min, int max) {
        System.out.println("Give me a number between " + min + " " + max);
        int aNumber = Integer.parseInt(scanner.nextLine());

        if (aNumber < min || aNumber > max) {
            System.out.println("that is outside the range. Try again.");
            return getInt(min, max); //recursion. You need the recursion
        }
        return aNumber; // else is not needed here because you will just return the number
    }



    //method overloading
    public int getInt(){
        System.out.println("Give me an integer");
        return Integer.parseInt(scanner.nextLine());

    }

  public double getDouble(double min, double max) {
      System.out.println("give me a decimal between " + min + " and " + max);
      double aDecimal = Double.parseDouble(scanner.nextLine());
      if (aDecimal < min || aDecimal > max) {
          System.out.println("outside the range");
          return getDouble(min, max);
      }
      return aDecimal;
  }

    //method overloading
    public double getDouble(){
        System.out.println("enter a number");
        return Double.parseDouble(scanner.nextLine());
    }


}


// end of class





