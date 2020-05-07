package oop;

public class PersonTest {
    public static void main(String[] args) {
        personLecture nayoung= new personLecture();
        personLecture ana = new personLecture();
        nayoung.firstName = "Nayoung";
        nayoung.lastName = "kim";

        ana.firstName="Ana";
        ana.lastName= "Plant";
        System.out.println("nayoung.sayHello()= " + nayoung.sayHello());
        System.out.println("ana.sayHello() = " + ana.sayHello());
    }
}
