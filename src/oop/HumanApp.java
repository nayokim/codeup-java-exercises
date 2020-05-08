package oop;

public class HumanApp {
    public static void main (String [] args){

    Human stacy = new Human(); // making a new object named stacy

        System.out.println(stacy.getName()); // prints null because nothing has been assigned
        stacy.setName("stacy"); // using the constructor setName, we can give the object stacy a property
        System.out.println(stacy.getName()); // prints "stacy"

        System.out.println(stacy.getEmail());//null because no properties have been given to it
        stacy.setEmail("Stacy@stacy.com");
        System.out.println("stacy's email: " + stacy.getEmail());

        System.out.println(stacy.getAddress());
        stacy.setAddress("123 address street");
        System.out.println("stacy's address:  " + stacy.getAddress());

        System.out.println(stacy.verify(stacy.getEmail()));
        stacy.sendMail("stacy@stacy.com");

        Human nayoung = new Human();

        //set the name and get the name
        nayoung.setName("Nayoung");
        System.out.println("The objects name is: " + nayoung.getName());

        //set the email and get the mail
        nayoung.setEmail("Nayoung@nayoung.com");
        System.out.println("Nayoung's email is: " + nayoung.getEmail());

        //get the address and set the address
        nayoung.setAddress("123 address road");
        System.out.println("Nayoungs address is : " + nayoung.getAddress() );





    }
}
