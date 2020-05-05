import java.util.Scanner;

//2. Create a class named Bob with a main method for the following exercise.
public class bob {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Say something to Bob");
        String userResponse = scanner.nextLine();
        String bobResponse;

        //Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        //Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        //He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        //He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        //He answers 'Whatever.' to anything else.
        if (userResponse.endsWith("?")){
            bobResponse = "Sure";
        } else if(userResponse.endsWith("!")){
            bobResponse = "Whoa, chill out!";
        } else if (userResponse.isEmpty()){
            bobResponse = "Fine. Be that way!";
        } else {
            bobResponse = "Whatever.";
        }

        System.out.println(bobResponse);
    }

}
