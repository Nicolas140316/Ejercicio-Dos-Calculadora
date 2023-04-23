package controller;

import model.CalculatorModel;
import view.CalculatorView;

public class CalculatorController{
    CalculatorView theView;
    CalculatorModel themodel;

    /**
     * Avisa a la vista que siempre que el boton Calcular se hace clic se ejecuta el 
     * método actionPerformed en la clase interna Calculatelistener
     * 
     * @param theView
     * @param themodel
     */
    public CalculatorController(CalculatorView theView, CalculatorModel theModel){
        this.theView = theView;
        this.themodel = theModel;
        this.theView.addCalculateListener(new CalculateListener(this));
    }
}