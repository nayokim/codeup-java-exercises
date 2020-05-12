package abstractlec;

public class Instructor extends Employee {

    public Instructor(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "Instructor like instructors do.";
    }
}


