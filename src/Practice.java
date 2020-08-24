import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        double pi = 3.14159;
//
//        Scanner scanner = new Scanner(System.in);
//        //Write some Java code that uses the variable pi to output the following:The value of pi is approximately 3.14.
//        System.out.println("The value of pi is approximately " + pi);
//        System.out.printf("The value of pi is approximately %.2f%n", pi);//%
//        System.out.format("The value of pi is approximately %.2f%n", pi);
//
//        //prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//
//        System.out.println("enter a sentence");
//        String userSentence = scanner.nextLine();
//        System.out.println("you entered: "+ userSentence);
//
        int [] arr = {0,2,3,4};
        int [] subArr = new int [arr.length];
        //the array you want to copy, the position you want to copy from, location to put  new info, length
        System.arraycopy(arr,0,subArr,0,arr.length);
        for(int no:subArr){
            System.out.println(no);
        }


    }
}
