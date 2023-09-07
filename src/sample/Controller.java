package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class Controller {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField action;

    @FXML
    private Button calculate;

    @FXML
    private Text error1;

    @FXML
    private Text error2;

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private Text result;

    @FXML
    void initialize() {
        calculate.setOnAction(event -> {
            error1.setText("");
            result.setText("");
            double firstNumber = Double.parseDouble(num1.getText());
            double secondNumber = Double.parseDouble(num2.getText());
            if (action.getText().equals("+")) {
                result.setText(String.valueOf(firstNumber + secondNumber));
            }
            if (action.getText().equals("-")) {
                result.setText(String.valueOf(firstNumber - secondNumber));
            }
            if (action.getText().equals("*")) {
                result.setText(String.valueOf(firstNumber * secondNumber));
            }
            if (action.getText().equals("^")) {
                result.setText(String.valueOf(Math.pow(firstNumber, secondNumber)));
            }

            try {
                if (secondNumber == 0) {
                    error1.setText("You can't divide numbers by zero!");
                    throw new ArithmeticException("You can't divide numbers by zero!");

                }
                if (action.getText().equals("/")) {
                    result.setText(String.valueOf(firstNumber / secondNumber));
                }


            } catch (ArithmeticException e) {

            }

        });

    }
}
