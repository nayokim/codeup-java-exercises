import java.util.Scanner;

public class ControlFlowLec {
    public static void main(String[] args){
        System.out.println("Control flow lecture");

//        boolean isTrue = true;
//        System.out.println("isTrue = " + isTrue);
//
//        //Relational operators
//        int age = 38;
//
//        //equality ==
//        boolean isTwentyOne = age == 21;
//        System.out.println("isTwentyOne= " + isTwentyOne);
//
//        //inequality !=
//        boolean isNotTwentyOne = age != 21;
//        System.out.println ("isNotTwentyOne = " + isNotTwentyOne);
//
//        //less Than <
//        boolean isLessThanTwentyOne = age < 21;
//        System.out.println("isLessThanTwentyOne " + isLessThanTwentyOne);
//
//        //more Than <
//        boolean isMoreThanTwentyOne = age > 21;
//        System.out.println("isMoreThanTwentyOne " + isMoreThanTwentyOne);

//        //Greater than or Equal >=
//        float orderTotal = 35.38f;
//        boolean applyFreeShipping = orderTotal >= 30;
//        System.out.println("Apply free shipping: " + applyFreeShipping);

//        //less than or Equal <=
//        float orderTotal = 14.99f;
//        boolean applySmallOrderSurcharge = orderTotal <= 15.00F;
//        System.out.println("applySmallOrderSurcharge = " + applySmallOrderSurcharge);

//        //Logical operators
//        //&& And
//        boolean isLoggedIn = true;
//        boolean isAdmin = true;
//        boolean showTheAdminPanel = isLoggedIn && isAdmin && age > 21;
//        System.out.println("Show the admin panel: " + showTheAdminPanel);

        // || or
//        boolean isAdmin = false;
//        boolean isAuthor = false;
//        boolean canEditArticle = isAdmin || isAuthor;
//        System.out.println("canEditArticle: " + canEditArticle);

//        //& And
//        boolean isLoggedIn = false;
//        boolean isAdmin = true;
//        boolean showTheAdminPanel = isLoggedIn & isAdmin;
//        System.out.println("Show the admin panel: " + showTheAdminPanel);


//        // | or
//        boolean isAdmin = true;
//        boolean isAuthor = false;
//        boolean canEditArticle = isAdmin | isAuthor;
//        System.out.println("canEditArticle: " + canEditArticle);

//        //! Not
//        boolean isLoggedIn = false;
//        boolean shouldShowLogin = !isLoggedIn;
//        System.out.println("shouldShowLogIn " + shouldShowLogin);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/n]");
//        String userInput = sc.next();
//
//        //COMPARING STRINGS- never do this!
////        boolean confirmation = userInput == "y";
////        System.out.println("confirmation: " + confirmation); //prints false.
//
//        //COMPARING STRINGS - THE CORRECT WAY. Always use .equals() to compare strings
//        boolean confirmation = userInput.equals("y");

//        // control structures
//        //if

//        int weeksInClass = 0;
//        boolean moreThanHalfwayDone = weeksInClass >=10;
//        if (moreThanHalfwayDone){
//            System.out.println("We are halfway done now!");
//        } else if (weeksInClass != 0){
//             System.out.printf("We are %s weeks in class.", weeksInClass);
//         } else{
//             System.out.println("We have not started class yet.");
//         }

//        //Switch
//        int dayNumber = 1;
//
//        switch(dayNumber){
//            case 1:
//                System.out.println("monday");
//                //fell through. we need a break.
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            default:
//                System.out.println("Unknown");
//                break;
//        }

//        // While loop
//        int i = 0;
//        while (i < 10){
//            System.out.println("from a while loop : i = " + i);
//            i++;
//        }

//        //Do while loop - do the body of the condition before the condition is met
//        int counter = 0;
//        do{
//            System.out.println("from a do while loop : Counter = " + counter);
//            counter++;
//        }while (counter < 10);

//        //for loop
//        for (int a = 0; a  < 10; a++){
//            System.out.println("From a for loop: a = " + a);
//        }

//        //continue and break
//        for (int i = 1; i<=10 ; i++){
//            if (i % 2 == 1){
//                continue;
//            }else if( i> 5){
//                break;
//            }
//            System.out.println("Even numbers: i = " + i);
//        }

    }
}
