package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
    
class CalculateListener implements ActionListener{
    /**
     * Las variables finales solo se usan en aquellos valores que sabemos de 
     * antemano no van a variar, osea, permanecerán constantes durante la 
     * ejecución del programa 
     */
    private final CalculatorController calculatorController;

    /**
     * @param calculatorController
     */
    CalculateListener(CalculatorController calculatorController){
        this.calculatorController = calculatorController;
    }

    /**
     * Las acciones envolventes con la vista con un bloque de prueba en caso de que los números no se hayan introducido correctamente
     */
    public void actionPerformed(ActionEvent e){
        int firstNumber;
        int secondNumber = 0;
        try {
            firstNumber = this.calculatorController.theView.getFirstNumber();
            secondNumber = this.calculatorController.theView.getSecondNumber();

            this.calculatorController.themodel.addtwoNumbers(firstNumber , secondNumber );
            this.calculatorController.theView.setCalcSolution(this.calculatorController.themodel.getCalculationValue());
        }catch (NumberFormatException ex) {
            System.out.println(ex);
            this.calculatorController.theView.displayErrorMessage("ingrese dos numeros enteros");
        }
    }
}