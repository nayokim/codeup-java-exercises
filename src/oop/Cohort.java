package oop;

public class Cohort {

    static String companyName = "codeup"; // every cohort will have this company name (static). properites that belong to the class.


    //list of fields
    private String name;
    private String startDate;
    public String endDate;
    private byte studentCount;
    public boolean graduated;

    //make constructor -needs to be public and match the name of the class
    public Cohort(String name, String startDate, byte studentCount){
        this.name = name;
        this.startDate = startDate;
        this.studentCount = studentCount;
    }

    protected void takeAttendance(){
       for(byte x=1; x <=studentCount ;x++){
           System.out.println("take attendance in " + this.name + x);
       }
    }

}
