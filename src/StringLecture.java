import java.util.Scanner;

public class StringLecture {
    public static void main(String[] args) {
        //in primitive types, the variable has the value stored inside it.
        //int counter = 100; The value 100 is stored inside counter.
        //for example, the lecture site has all the information is stored inside the page. But within the lecture, there is a link to another page with more information. in code, when we create a scanner, its referencing a scanner stored in another location. Just like how the link isnt an actual value in the page- it is a reference to another page.
        //we are comparing the values when using primitives and ==
//        int number1 = 10;
//        int number2 = 20;// the actual values are stored in these variables
//        if (number1 == number2){
//            System.out.println("the numbers are equal");
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();
//
//        // Never do this!
//        boolean confirmation = userInput == "y"; // when you use double equals, its not comparing the values. Its comparing the references.
//
//        // Do this instead!
//        if ("I am a string".equals("I am a string")) {
//            System.out.println("Strings are equal");
//        }
//        System.out.println("Trim: "+ "I am a string".trim());
//        //Never do this
//        if ("I am a string" == "I am a string".trim()){
//            System.out.println("Strings references are equal");
//        }else {
//            System.out.println("String references are not equal");
//        }
//
//
//        //always do this when dealing with strings. test for value
//        if ("I am a string".equals("I am a string".trim())){
//            System.out.println("Strings references are equal");
//        }else {
//            System.out.println("String references are not equal");
//        }

//        String greeting = "howdy";
//        System.out.println(greeting.equalsIgnoreCase("HowDy"));

        //.startsWith(String prefix)
//        String title = "Dr.Doctor";
//        boolean isADoctor = title.toLowerCase().startsWith("dr");
//        System.out.println("isADoctor = " + isADoctor);

        //.endsWith(String suffix)

//        String codeupDallas = "701 commerce St, Dallas,TX 78202";
//        String downtownDallasZip = "78202";
//        boolean sameZipAsCodeup = codeupDallas.endsWith(downtownDallasZip);
//
//        System.out.println(sameZipAsCodeup);

        //.charAt(int index)
//        boolean firstLetterCapitalized = false;
//        String word = "Test";
//
//        char firstLetter = word.charAt(0);
//
//        if (firstLetter == Character.toUpperCase(firstLetter)){ // you can use the == here because we are comparing characters which is a primitive type in java
//            firstLetterCapitalized = true;
//        }
//        System.out.println(firstLetterCapitalized);

        //.indexOf(String subString)
//        String cat = "cat";
//        System.out.println(cat.indexOf("at"));

        //.lastIndexOf(String subString)
//        String good = "Good";
//        System.out.println(good.lastIndexOf("o"));

        //.length()
//        String longestWord = "ijdsfoijeaqoidgjdaoisjdfdosjfdoisajfdosifajsdoifjweorew";
//        System.out.println(longestWord.length());
//

        //.replace (char oldChar, char newChar)

//        String search = "tiny cats looking cute";
//        String parsedSearch = search.replace("cats", "dogs");
//        System.out.println(parsedSearch);

        //.subString (int beginIndex[,int endIndex]) - see lecture notes
//        String name = "Justin Bob Reich";

        //.toUpperCase()
        //.toLowerCase()

        String hello = "hElLo";
        System.out.println(hello.toLowerCase());
        System.out.println(hello.toUpperCase());
        System.out.println(hello);

        //.trim() - see lecture




    }//end
}
