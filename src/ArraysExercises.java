import java.util.Arrays;

public class ArraysExercises {

    //create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

    public static Person[] addPerson(Person[] people, Person newPerson){

        Person [] newArray = new Person[people.length + 1];
        for (int i = 0; i < people.length; i+=1){
            newArray[i] = people[i];
            newArray[newArray.length-1] = newPerson;
        }
        return newArray;
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        //Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.


        Person person1 = new Person ("Nayoung");
        Person person2 = new Person ("edward");
        Person person3 = new Person ("Nunu");

        Person [] people = {person1, person2, person3};
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());

        people = (addPerson(people, new Person("Willump")));
        System.out.println(people);

//        Person[] person = new Person[3];
//        person [0] =  new Person("Nayoung");
//        person [1] =  new Person("Edward");
//        person [2] =  new Person("Willump");

//        String [] people  = new String [3];
//
//        people = (addPerson(people,"nunu"));
//        System.out.println(Arrays.toString(people));

        //Iterate through the array and print out the name of each person in the array.
        for (Person name: people){
            System.out.println(name.getName());
        }

    }
}
