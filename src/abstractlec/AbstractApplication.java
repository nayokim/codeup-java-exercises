package abstractlec;

public class AbstractApplication {
    public static void main(String[] args){
        //there is no default work that an employee does - each employee does a specific job. this is why we made an abstract class
        Employee douglas = new Instructor("Douglas", "delivery");

        String douglasWork = douglas.work();
        System.out.println("douglas.work() =  " + douglasWork);
//        System.out.println(douglas.getDepartment());
//        System.out.println(douglas.getName());
//        ConsoleEmployeeFormatter formatter = new ConsoleEmployeeFormatter();
//        System.out.println(formatter.display(douglas));
//
//        Formatter htmlFormatter = new HtmlEmployeeFormatter();
//        System.out.println(htmlFormatter.display(douglas));

        //the same as lines 12-16
        Formatter[] formatters ={new ConsoleEmployeeFormatter(), new HtmlEmployeeFormatter()};
        for (Formatter formatter: formatters){
            System.out.println("");
            System.out.println(formatter.display(douglas));
        }

    }
}
