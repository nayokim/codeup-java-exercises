package oop;

public class Employee extends personLecture {
    //you may be a person but you only have a salary if you are an employee.
    private double salary;

    //follow the same rules as the PersonLecture class
    //create a constructor
    //employee is a person
    //extends basically copies the personLecture class automatically
    public Employee(String firstName, String lastName, boolean isAlive) {
//        new personLecture("fer","mendoza",true);
        //super - you can replace the new PersonLecture() with "super"
        //this next line allows you to use the defualt constructor from personLecture class. It is inheiriting from PersonLecture class and you only have to edit that class.
        super(firstName, lastName, isAlive);

    }

    //this is allowing you to replace or "override" the previous behavior from the superclass and replace anything with the employeeclass.
    public String sayHello(){
        return "how can i help you?";
    }

    public void doWork(){
        System.out.println("working");
    }
//    public String Test(){
//        this.isAlive = false;// even though it doesnt exist in this class( employee class) you can see have access to personLecture class.
//        this.sayHello();
//    }
}
