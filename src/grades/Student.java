package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    };

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradesAverage(){
        double sum = 0;
        for (int grade: grades){
            sum += grade;
        }
        return (sum/grades.size());
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
