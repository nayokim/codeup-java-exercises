import java.util.Scanner;

//2. Create a class named Bob with a main method for the following exercise.
public class bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Say something to Bob");
        String userResponse = scanner.nextLine().trim();
        System.out.println(userResponse);
        String bobResponse;

        if (userResponse.endsWith("?")){
            bobResponse = "Sure";
        } else if (userResponse.endsWith("!")){
            bobResponse = "Whoa, chill out!";
        } else if(userResponse.isEmpty()){
            bobResponse = "Fine, be that way!";
        } else {
            bobResponse = "Whatever";
        }
        System.out.println(bobResponse);
    }
}