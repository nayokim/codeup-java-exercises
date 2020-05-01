public class lecture {
    public static void main(String[] args) {
        System.out.println("hello world!");
        //in js let name = "fer"
        //in java
        String name = "fer";
        byte dayOfMonth = 31;
        short spendingLimit = 30000;
        int carPrice = 90000;

        long distance= 37203685475807L;// if youre typing a long, you have to tell java that the capital L is going to make it interpret as a long

        float grade = 94.34f;
        double distanceToMars = 12345897234897324932.239048230498324;

        boolean isItRaining = false;
        boolean doYouLikePizza = true;

        char gender = 'F';

        //constant
        final int Sides_of_a_dice = 6;
//        Sides_of_a_dice = 8; // cannot resassign it a new value
        final String API_Key = "bbbbbb";
        final String GITHUB_API_BASE_URL = "http://api.github.com";

        carPrice ++;
        System.out.println("carPrice: " + carPrice);

        int aNewVariable = dayOfMonth + carPrice;
        aNewVariable--;
        System.out.println("aNewVariable " + aNewVariable);

        //casting
        double pi = 3.14159;
        int almostPi= (int) pi;
        System.out.println("almostPi: " + almostPi);


        System.out.println(dayOfMonth);
        System.out.println(spendingLimit);

        System.out.println(name);
        System.out.print("mendoza");
        System.out.println("fernando"); // println prints as a new line

        System.out.println(carPrice);
        System.out.println(grade);
        System.out.println(distanceToMars);
    }
}
