package oop;

public class PersonTest {
    public static void main(String[] args) {
        //creating 2 instances for each case.
//        personLecture nayoung= new personLecture();
//        personLecture ana = new personLecture();
//        personLecture deadPerson = new personLecture();

        //assigning values to the fields
//        nayoung.firstName = "Nayoung";
//        nayoung.lastName = "kim";
//        nayoung.isAlive = true;
//
//        System.out.println("Person. = " + personLecture.race);
//
//        ana.firstName="Ana";
//        ana.lastName= "Plant";
//        ana.isAlive = true;
//        deadPerson.isAlive = false;
       // nayoung.person  since you made the firstName private, the user cannot change the first name


        //being specific in the constructor to set rules.
        personLecture nayoung = new personLecture ("Nayoung", "Kim", true);
        personLecture ana = new personLecture("Ana", "Plant", true);
        personLecture deadPerson = new personLecture(null, null, false);


        System.out.println("personLecture.race= " + personLecture.race);
        System.out.println("nayoung.sayHello()= " + nayoung.sayHello());
        System.out.println("ana.sayHello() = " + ana.sayHello());
        System.out.println("deadPerson.sayHello() = " + deadPerson.sayHello());

    }
}
