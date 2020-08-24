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
        //myString = 'c'; //if you are using char, you need to use single quotes ('') NOT (""). However, since you assigned it a STRING class, it will not print

        //change your code to assign the value 3.14159 to myString. What happens?
       // myString = 3.14159; //type error! it was declared as a string when it was intialized. If you want to just print the number and not do any math, you can say String myString = "3.14159"
        System.out.println(myString);

        //Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        //long myNumber; // has not been set to anything
        //Change your code to assign the value 3.14 to myNumber. What do you notice?
        //long myNumber = 3.14;// this is actually a double
        //Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
       //long myNumber = 123L; // this will print the number without errors
        //Change your code to assign the value 123 to myNumber.
        //myNumber=123; // java cannot find symbol (variable myNumber);
//        System.out.println(myNumber);

       // Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this? // error - add 'f' to the end. By default, java will change decimals to float. However, if you declare your variable explicitely as a float, you need to add an 'f' to signify that it is a float.
        float myNumber = 3.14f;
        System.out.println("float myNumber: " + myNumber);

        //Copy and paste the following code blocks one at a time and execute them.
//        int x = 5;
//        x++; //  do the step.
//        System.out.println(x); //print the variable
        // you are printing pre-increment and then printing post increment



        //int x = 5; // initialize the variable
        //System.out.println(++x); // do the step and print the value (two steps in one line)
        //System.out.println(x);// print the variable
        // you are incrementing and then printing post-increment

        //Try to create a variable named class. What happens?
        //String class = "apex"; // class is a keyword that cannot be used

        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o;// you cannot cast a string into numbers.
//        int three = (int) "three"; // you cannot cast a string into a string. you can do 3 or:
        int three = Integer.parseInt("3");


//        int x = 4;
//        x = x + 5;
//        x+=5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        y*=x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
//        x = x / y
        x /=y;
//        y = y - x;
        y -=x;

        System.out.println(x);
        System.out.println(y);

//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type
//        can hold? What happens if you increment a numeric variable past the type's capacity?
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later)
//                that holds the maximum value for the int type.
                x = Integer.MAX_VALUE;
                x++;

        System.out.println("MAX VAL + 1: " + x); // the value went back to the start because you went over the max value





    }
}
