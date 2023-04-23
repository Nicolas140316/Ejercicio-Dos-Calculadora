package view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculatorView extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField firstNumber = new JTextField(10);
    private JLabel addtionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("calcular");
    private JTextField calculateSolution = new JTextField(10);

    /**
     * Configura la vista y agrega los componentes
     */
    public CalculatorView() {
        JPanel calculatPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        calculatPanel.add(firstNumber);
        calculatPanel.add(addtionLabel);
        calculatPanel.add(secondNumber);
        calculatPanel.add(calculateButton);
        calculatPanel.add(calculateSolution);
        this.add(calculatPanel);
        //fin de la configuracion de los componentes.
    }
    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }
    public int getSecondNumber(){
        return Integer.parseInt(secondNumber.getText());
    }
    public int getCalcSolution(){
        return Integer.parseInt(calculateSolution.getText());
    }
    public void setCalcSolution(int solution){
        calculateSolution.setText(Integer.toString(solution));
    }
    /**
     * Si se hace clic en CalculateButton, ejecute un método ebn el controlador llamado actionPerformed
     * @param listenForCalcButton
     */
    public void addCalculateListener(ActionListener listenForCalcButton){
        calculateButton.addActionListener(listenForCalcButton);
    }
    /**
     * Abre una ventana emergente que contiene el mensaje de error pasado
     * @param errorMessage
     */
    public void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
