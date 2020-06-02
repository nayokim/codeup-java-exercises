
public class ServerNameGenerator {

    //Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    public static String [] adjectives = {
            "Bitter",
            "Chubby",
            "Massive",
            "Thin",
            "flat",
            "round",
            "Wide",
            "Heavy",
            "embarrassed",
            "manic"
    };

    public static String [] nouns = {
            "Tv",
            "Cat",
            "dog",
            "boy",
            "girl",
            "car",
            "desk",
            "table",
            "chair",
            "tree"
    };

    //Create a method that will return a random element from an array of strings.
//Math.random() * (max - min + 1) + min
    //creating a method that will pass in a string array (so noun or adjective array)
    public static String randomNounAdjective(String[] arr) {
        int random = (int) (Math.random() * (arr.length-1) + 1);
        System.out.println(random);
        return arr[random];
    }

    //Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.

    public static void main (String[] args){
//        System.out.println("here is your server name: " + randomNounAdjective(nouns) +"-"+  randomNounAdjective(adjectives));
        System.out.println(randomNounAdjective(nouns));
        System.out.println(randomNounAdjective(adjectives));
    }

    //test
}
