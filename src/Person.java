public class Person {

    //field
    private String name;

    //constructor - attributes to the object that will be made in  the main class
    public Person(String name) {
        this.name = name;
    }

    // returns the person's name
    public String getName() {
        return name;
    }

    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello " + name);
    }



    public static void main(String[] args) {

        //make new object that makes the object person. Nayoung will pass into the name.
//        Person person = new Person("Nayoung");
//        person.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//
//        System.out.println(person1.getName().equals(person2.getName())); //true since they have the same caharacters
//        System.out.println(person1 == person2); // false because they are two different objects.

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // true because you set person 2 to person 1.

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName()); // John
        System.out.println(person2.getName()); // John

        person2.setName("Jane");
        System.out.println(person1.getName()); // Jane because in line 45, person 2 was set to person 1.
        System.out.println(person2.getName());//Jane


    }
}

