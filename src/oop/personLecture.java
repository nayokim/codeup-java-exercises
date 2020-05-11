package oop;

public class personLecture {

    public static String race = "HUMAN RACE";


    //creating properties in the class instead of the main method. This is the "global" scope.
    private String firstName;
    private String lastName;
    protected boolean isAlive;

    //creating rules in order to create an instance
    // setting rules: everyone should have a first name, last name, and a value to know if they are alive
    public personLecture(String fName, String lName, boolean alive) {
        //using the this keyword will keep things organized (what is this vs what is the argument)
        this.firstName = fName;
        this.lastName = lName;
        this.isAlive = alive;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFullName(){
        return this.getFirstName() + " " + this.getLastName();
    }


    // object{
//    number : 1
//    function() {
//        this.number
//    }
    //}
    public String sayHello() {
        if (this.isAlive) {
            return String.format("Hello from %s %s!", this.firstName, this.lastName);
        } else {
            return "This person is not alive anymore :(";
        }
    }
}
