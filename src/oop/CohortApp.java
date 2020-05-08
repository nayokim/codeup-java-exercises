package oop;

public class CohortApp {
    public static void main(String[] args) {

        System.out.println(Cohort.companyName + " attendance app");
        //apex is an instance of cohort
        Cohort apex = new Cohort("Apex", "2020-02-24", (byte) 16);
        apex.endDate = "2020-07-24";
        String today = "july";
        if (today.equals("apex.endDate")) {
            apex.graduated = true;
        }

        apex.takeAttendance();

        Cohort fortuna = new Cohort("fortuna", "2020-03-24", (byte) 24);
        fortuna.takeAttendance();

        Cohort deimos = new Cohort("deimos", "2019-10-10", (byte) 13);
        deimos.takeAttendance();

    }
}
