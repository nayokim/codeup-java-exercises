public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world!");

        //variables
        //Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 10;
        System.out.println(myFavoriteNumber);

        //Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Nayoung";
        //Change your code to assign a character value to myString. What do you notice?
        //myString = 'c'; //java: incompatible types: char cannot be converted to java.lang.String

        //change your code to assign the value 3.14159 to myString. What happens?
       // myString = 3.14159; //java: incompatible types: char cannot be converted to java.lang.String because it was declared as a string when it was intialized
        System.out.println(myString);

        //Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        //long myNumber; // has not been set to anything
        //Change your code to assign the value 3.14 to myNumber. What do you notice?
        //long myNumber = 3.14;// this is actually a double
        //Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        long myNumber = 123L; // this will print the number without errors
        System.out.println(myNumber);







    }
}