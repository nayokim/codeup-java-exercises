package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        //grades placeholder
        this.grades = new ArrayList<>();
    }

    //we dont need parameters because we have everything we need in the variable
    public String getName(){
        return this.name;
    };


    //since we are adding a grade, we need a grade to add. We need something from the outside - which will be the parameters
    public void addGrade(int grade){
        //array list has a method to add().
        this.grades.add(grade);
    }

    public double getGradesAverage(){
        double sum = 0;
        for (Integer grade: this.grades){
            sum += grade;
        }
        return (sum/this.grades.size());
    }

    public static void main(String[] args){
        Student nayo= new Student("Nayoung");

        nayo.addGrade(100);
        nayo.addGrade(95);
        nayo.addGrade(80);
        nayo.addGrade(70);
        System.out.println(nayo.getGradesAverage());

    }

}
