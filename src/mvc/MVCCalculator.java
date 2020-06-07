package mvc;

public class MVCCalculator {
    public static void main(String[] args) {

        CalculationView theView = new CalculationView();

        CalculatorModel theModel = new CalculatorModel();

        CalculationController theController = new CalculationController(theView, theModel);
    }

}
