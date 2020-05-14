package collections;

import grades.Student;
import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    static Input input = new Input();
    public static void main(String[] args) {


        Student edwin = new Student("Edwin");
        edwin.addGrade(90);
        edwin.addGrade(100);
        System.out.println(edwin.getGradesAverage() == 95);
        System.out.println(edwin.getGradesAverage());
        Student anders = new Student("Anders");
        anders.addGrade(100);
        anders.addGrade(80);
        Student cas  = new Student("Edwin");
        cas.addGrade(75);
        cas.addGrade(50);
        Student mayo = new Student("nayo");
        mayo.addGrade(10);
        mayo.addGrade(49);

        HashMap<String, Student> students = new HashMap<>();
        //Create at least 4 student objects with at least 3 grades each, and add them to the map.
//        students.put("cmplpakage", new Student ("Edwin"));
        students.put("complpkge", edwin);
//        students.putIfAbsent("qwsory", new Student("Anders"));
        students.putIfAbsent("qwsor", anders);
//        students.put("yll10", new Student ("cas"));
        students.putIfAbsent("ypp10",cas);
//        students.put("mayonaise", new Student("nayo"));
        students.putIfAbsent("mayonaise",mayo);

//        for (String id : students.keySet() ){
//            System.out.println(" id = " + id);
//        }

//        for (Student person : students.values()){
//            System.out.println(person.getGradesAverage());
//        }
        cLi(students);



    }
    public static void cLi(HashMap<String, Student> students){
        System.out.println("Welcome! " + "Here are the github user names: " );
        for (String key: students.keySet()){
            System.out.println(key + " ");
        }
        do {
            for (String key: students.keySet()){
                System.out.println(key + " ");
            }
            System.out.println("What student would you like to see more information on?\n");
            String userInput = input.getString();
            if (students.containsKey(userInput)) {
                Student currentStudent = students.get(userInput);
                //students.get(key).getName() - through the map, get me the key and give me the specific peices of that object
//                System.out.println(students.get(userInput).getName());
                System.out.println(String.format("Name: %s - Github username: %s - Current average: %.2f ",
                        currentStudent.getName(), //name
                        userInput, //github username
                        currentStudent.getGradesAverage())); // average
            } else {
                System.out.println("Sorry no student was found with the user name of " + userInput);
            }
            System.out.println("would you like to see another student?");
        } while(input.yesNo());
    }
}
