package model;

public class CalculatorModel {
    //holds the value of the sum of the mumber enteredin the view
    private int CalculationValue;

    public void addtwoNumbers(int firstNumber, int secondNumber) {
        CalculationValue = firstNumber + secondNumber;
    }

    public int getCalculationValue(){
        return  CalculationValue;
    }
}