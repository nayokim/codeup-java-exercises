import java.util.Arrays;

public class ArraysExercises {

    //create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

    public static String[] addPerson(String[] people, String newPerson){

        String [] newArray = new String[people.length + 1];
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
//        Person nayoung = new Person ("nayoung");
//        Person edward = new Person ("edward");
//        Person willump = new Person ("willump");

        String [] people  = new String [3];

        people [0] = "nayoung";
        people [1] = "edward";
        people [2] = "willump";

        people = (addPerson(people,"nunu"));
        System.out.println(Arrays.toString(people));

        System.out.println(people[0]);
        System.out.println(people[1]);
        System.out.println(people[2]);


        //Iterate through the array and print out the name of each person in the array.
//        for (Person name: person){
//            System.out.println(name.getName());
//        }

    }
}
