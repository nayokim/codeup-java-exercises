public class Person {

    //field
    private String name;

    //constructor
    public Person(String name){
        setName(name);
        // this.name = name;
    }


    // returns the person's name
    //you dont need any parameters since its already in the Person class.
    public String getName() {

        return this.name;
    }

    // changes the name property to the passed value
    //this one you want an outside information so we will pass a name that is a string.
    //if they want to change the name, they need to go through the process to actually change it.
    public void setName(String name) {
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello " + getName());
    }



    public static void main(String[] args) {

        //make new object that makes the object person. Nayoung will pass into the name.
        Person person = new Person("Nayoung");
        person.sayHello();
//
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1);// prints the unique identifier
//        System.out.println(person1.toString());

//        System.out.println(person1.getName().equals(person2.getName())); //true since they have the same caharacters
//        System.out.println(person1 == person2); // false because they are two different objects.

//        Person person1 = new Person("John");
//        Person person2 = person1; // cloned it
//        System.out.println(person1 == person2); // true because you set person 2 to person 1.

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); // John
//        System.out.println(person2.getName()); // John
//
//        person2.setName("Jane");
//        System.out.println(person1.getName()); // Jane because in line 45, person 2 was set to person 1.
//        System.out.println(person2.getName());//Jane


    }
}

