package collections;

import oop.PersonTest;
import oop.personLecture;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLec {
    public static void main(String[] args) {


//        String[] names = {"fer","stacy"};

        ArrayList<String> namesList = new ArrayList<>();
        // if namelist is empty
        System.out.println(namesList.isEmpty());

        namesList.add("fer");
        namesList.add("stacy");
        namesList.add("douglas");
        namesList.add("emily");
        namesList.add("emily");

        //to get a specific element
//        namesList[0];
        System.out.println(namesList.get(0));

        //to check the length
        System.out.println(namesList.size());

        //how to find the index of the element
        System.out.println(namesList.indexOf("emily"));

        //check if the arraylist contains an object
        System.out.println(namesList.contains("nayoung"));
        System.out.println(namesList.contains("stacy"));

        //last index of
        System.out.println(namesList.lastIndexOf("emily"));

        //remove an element - works with the first instance that it finds
//        namesList.remove("emily");
        //remove the lastIndexOf emily
        namesList.remove(namesList.lastIndexOf("emily"));

        // if namelist is empty
        if (!namesList.isEmpty()) {
            for (String name : namesList) {
                System.out.println("namesList " + name);
            }
        }

        for (String name : namesList) {
            System.out.println("name = " + name);
        }

        //creating and looping through an arraylist
        personTest();
        hashMapTest();
    }

    public static void personTest() {
        //Person [] people = size? which properties?

        ArrayList<personLecture> people = new ArrayList<>();
        //people[0] = new Person ("fer", "mendoza", true);
        people.add(new personLecture("fer", "mendoza", true));
        people.add(new personLecture("stacy", "mendoza", true));
        people.add(new personLecture("lisa", "simpson", false));

        for (personLecture person : people) {
            System.out.println("person.getFullName() = " + person.getFullName());
        }
    }

    public static void hashMapTest() {
        //setting the rules
//        HashMap<Long, String>users = new HashMap<>();
//        //putting the long and string into the hashmap
//        users.put(1L,"fmendozaro");
//        users.put(200000000l, "douglas");
//        //getting information out of it  - will only get the key
//        System.out.println(users.get(1L));
//        System.out.println(users.get("fmendozaro"));//prints null because it is looking for the key datatype
//        System.out.println("users.getorDefault = " + users.getOrDefault(20L, "No record found with that key"));
//        System.out.println("users.containValues(douglas)= " + users.containsValue("douglas"));
//        System.out.println("users.containValues(douglas)= " + users.containsValue("doulas"));


        //example 2
        HashMap<Long, personLecture> githubUserNames = new HashMap<>();
        githubUserNames.putIfAbsent(1L, new personLecture("fer", "Mendoza", true));
        githubUserNames.putIfAbsent(2L, new personLecture("stacy", "Mendoza", false));
        githubUserNames.putIfAbsent(7L, new personLecture("stacy", "Mendoza", false));

        //remove
        githubUserNames.remove(7L);

        // if you print this, it will print the reference address. you can leave a message to keep record that it once existed
//        personLecture deletedRecord = githubUserNames.remove(7L);
//        System.out.println(deletedRecord.getFullName() + " was removed.");

        githubUserNames.replace(1L,new personLecture("Laura", "stephens", true));




        //loop through a list of values
        for (personLecture person:githubUserNames.values()) {
            System.out.println("person.getFullName() = " + person.getFullName());
        }
        //loop through list of keys
        for (long id : githubUserNames.keySet()) {
            System.out.println("id = " + id);
        }

        //print the id and full name of each element (personLecture) in the map

        for (Long key : githubUserNames.keySet()){
            System.out.println("Key = " + key);
            System.out.println("fullName = " + githubUserNames.get(key).getFullName());
        }

        //clears the hashmap
        githubUserNames.clear();
        System.out.println("githubusernames = " + githubUserNames.isEmpty());
    }

}
