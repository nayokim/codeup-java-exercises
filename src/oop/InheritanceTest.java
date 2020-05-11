package oop;

public class InheritanceTest {
    public static void main(String[] args) {
        personLecture myMom = new personLecture("Tomasa", "sosa", true);
        Employee fer = new Employee("Fer", "Mendoza", true);


        System.out.println(myMom.sayHello());
        System.out.println(fer.sayHello());
        fer.doWork();

        //creating a superhero who is a person
        SuperHero leslie = new SuperHero("leslie", "Hirsh","SuperKid");


        System.out.println(leslie.sayHello());
        //overriding
        System.out.println("leslie.getFirstname()= " + leslie.getFirstName());
        System.out.println("leslie.getLastName()= " + leslie.getLastName());

        System.out.println("leslie.getSecretIdentity()= " + leslie.getSecretIdentity());

        //polymorphism
//        Manager dimitri = new Manager("dimitri", "antonio",true);

//        fer.doWork();
//        //overriding because of polymorphism
//        dimitri.doWork();

        //big example of polymorphism
        Employee dimitri = new Manager("dimitri", "antonio",true);

        Employee[] employees = new Employee [3];
        employees[0] = dimitri;
        employees[1] = fer;
        //creating new managers on the fly
        //polymorphism is allowing us to have different datatypes and morph into a different datatype
        employees[2] = new Manager("Liz", "Maya", true);

        //another way to write this
        //Employee [] employees = {fer, dimitri, new Manager("liz","Maya", true);



        //for (the datatype theName: theArrayname)
        for (Employee emp : employees){
            System.out.println(emp.getFirstName() + " " + emp.getLastName());
            emp.doWork();
        }
    }
}
