package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculationController {
    private CalculationView theView;
    private CalculatorModel theModel;

    public CalculationController(CalculationView theView, CalculatorModel theModel){
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;

            try{
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.addTwoNumbers(firstNumber,secondNumber);

                theView.setCalcSolution(theModel.getCalculationValue());

            }catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You need to enter 2 integers");
            }
        }
    }
}
