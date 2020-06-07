package mvc;

//the Model
public class CalculatorModel {

    //the data
    private int calculationValue;

    //performs the method that is needed
    public void addTwoNumbers(int firstNumber, int secondNumber){
        calculationValue = firstNumber + secondNumber;
    }

    //provides access to the data
    public int getCalculationValue(){
        return calculationValue;
    }
}
