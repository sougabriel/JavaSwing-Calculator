package Operations;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Souza
 */
public class Operations {
    
    private String operation = "";

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double addition(double number1, double number2) {
        setOperation("addition");
        try {
            double result = number1 + number2;
            return result;
        } catch (Exception e) {
            errorMessage(e, this.operation);
            return 0;
        }
    }

    private void errorMessage(Exception e, String operation) {
        String title;
        switch (operation) {
            case "addition":
                title = "Addition Error!";
                break;
            case "subtraction":
                title = "Subtraction Error!";
                break;
            case "division":
                title = "Division Error!";
                break;
            case "multiplication":
                title = "Multiplication Error!";
                break;
            default:
                title = "Error!";
                break;
        }
        JOptionPane optionPane = new JOptionPane(title, JOptionPane.ERROR_MESSAGE);
        JDialog dialog = optionPane.createDialog("Failure to calculate the operation!");
        System.out.println(e.getMessage());
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    

}
