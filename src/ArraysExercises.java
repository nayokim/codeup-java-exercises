
import java.util.Arrays;

public class ArraysExercises {

    //create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

    public static Person[] addPerson(Person[] people, Person newPerson){//(first parameter is the existing array and the second parameter: person to add)
        //creating a new array that is one longer than what it is.
//        Person [] newArray = new Person[people.length + 1];
//        for (int i = 0; i < people.length; i++){
//            //make a copy from old array into the new array;
//            newArray[i] = people[i];
//        }
        //use copyOf tool - pass an array and tell the new array how long you want it to beœ
        Person [] newArray = Arrays.copyOf(people, people.length + 1);

        //indexing always starts at 0; Length will always be one more than the length;
        newArray[newArray.length - 1] = newPerson;
        return newArray;
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
        // if you do not use Arrays.toString(), you are targeting the memory location.
//        System.out.println(Arrays.toString(numbers));

        //Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.

        //create the array
        Person [] people = new Person[3];

        people[0] = new Person("Nayoung");
        people[1] = new Person("Nunu");
        people[2] = new Person("Edward");

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }

        people = (addPerson(people, new Person("Willump")));

        for(Person person : people){
            System.out.println("in the enhanced for loop: " + person.getName());
        }

//        Person person1 = new Person ("Nayoung");
//        Person person2 = new Person ("edward");
//        Person person3 = new Person ("Nunu");
//
//        Person [] people = {
//                person1,
//                person2,
//                person3
//        };
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        System.out.println(person3.getName());
//
//        people = (addPerson(people, new Person("Willump")));
//
//        //question - why doesnt this print out when it is ran?
//        System.out.println(Arrays.toString(people));
//
//        //Iterate through the array and print out the name of each person in the array.
//        for (Person name: people){
//            System.out.println(name.getName());
//        }
    }
}



