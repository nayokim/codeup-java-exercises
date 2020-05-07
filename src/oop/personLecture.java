package oop;

public class personLecture {
    //creating properties in the class instead of the main method. This is the "global" scope.
    public String firstName;
    public String lastName;

    public String sayHello(){
        return String.format ("Hello from %s %s!", firstName, lastName);
    }

}
