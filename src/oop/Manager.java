package oop;

public class Manager extends Employee {
    //you need to make a constructor that will match the personlecture class
    public Manager(String firstName, String lastName, boolean isAlive){
        //
        super(firstName, lastName,isAlive);
    }

    public void doWork(){
        System.out.println("Managing employees");
    }

}
