package oop;


// Basic class definition: A class can be considered as a blueprint using which you can create as many objects as you like.
// public means this class can be used by other classes
// Class names should begin with a capital letter
// A file can't contain two public classes. It can contain classes that are not public
// If you place class files in the same folder the java compiler will be able to find them

public class Husband {

    //field (instance variables and object states). With this information, we can create a husband objects (or instances) that represent a husband.
    //private fields are not visible outside of the class
    private String name;
    private byte age =37;
    private boolean male;
    private String occupation = "lawyer";

    //constructor - the constructor provides separate properties to the object.
    // Why do we need constructors? You know Java being an OOP language. -Now that means you need to create objects to perform operations. OBJECT is an instance of class which is having unique identity and contains all the behaviour and attributes.
    //Constructors save you a lot of time.You can create multiple objects and perform any work on it and there is no need to create a separate class for similar work.Constructors takes up all such load.

    public Husband (String name, byte age, boolean male){
        this.name = name;
        this.age = age;
        this.male= male;
    }

    //class methods
    //accessor methods are used to get and set the values of private fields
    public String getName(){
        return name;
    }

    public byte getAge(){
        return age;
    }

    public boolean getGender(){
        return male;
    }

    public String getOccupation(){
        return occupation;
    }

    public static void main(String[] args) {
        //new keyword creates the object of Husband and invokes the constructor to initialize the created object;
        //edward is an instance of Husband
        //Object: is a bundle of data and its behaviour(often known as methods).Objects have two characteristics: They have states and behaviors.

       // If you look at the right side of this statement, we are calling the default constructor of class Husband to create a new object (or instance).Typically , we use constructor to give initial value to the instance variables defined by the class , or to perform any other startup procedures required to make a fully formed object.
        Husband edward = new Husband("edward", (byte) 35, true);
        System.out.println(edward);

        System.out.println(edward.age);
        System.out.println(edward.getAge());
        System.out.println(edward.getOccupation());
        System.out.println(edward.occupation);


    }







}
