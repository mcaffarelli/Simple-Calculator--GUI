
package com.csc262.supercalculator;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SuperCalculatorController {
//Variables in SuperCalculator
    private int number1; 
    private int number2;
    private int total;
    
    @FXML
    private Label firstNumberLabel;

    @FXML
    private TextField firstNumberTextField;

    @FXML
    private TextField secondNumberTextField;

    @FXML
    private TextField ReultText;

    @FXML
    private Button ExitButton;

    @FXML
    private Label SecondNumberLabel;

    @FXML
    private Button ClearButton;

    @FXML
    private Button SubtractButton;

    @FXML
    private Button AddButton;
    @FXML
    private Button MultiplyButton;

    @FXML
    private Button DivideButton;

    @FXML
    private Label Result;

    @FXML //Exit GUI
    void ExitButtonPressed(ActionEvent event) {
    Platform.exit();
  
    }

    @FXML //Add First Number and Second Number
    void addButtonPressed(ActionEvent event) {
    number1 = Integer.parseInt(firstNumberTextField.getText());
    number2 = Integer.parseInt(secondNumberTextField.getText());
    total = number1+number2; //Add Numbers
    //return total to resulttext after converted to a string.    
    ReultText.setText(String.valueOf(total));
    }

    @FXML //Clear all data
    void clearButtonPressed(ActionEvent event) {
    ReultText.clear();
    secondNumberTextField.clear();
    firstNumberTextField.clear();
    }

    @FXML//Divide First Number and Second Number
    void divideButtonPressed(ActionEvent event) {
    number1 = Integer.parseInt(firstNumberTextField.getText());
    number2 = Integer.parseInt(secondNumberTextField.getText());
    total = number1/number2; //Divide the two numbers
    //return total to resulttext after converted to a string.
    ReultText.setText(String.valueOf(total));
    }

    @FXML//Mulitply First Number and Second Number
    void multButtonPressed(ActionEvent event) {
    number1 = Integer.parseInt(firstNumberTextField.getText());
    number2 = Integer.parseInt(secondNumberTextField.getText());
    total = number1*number2;//Multiply Numbers
    //return total to resulttext after converted to a string.
    ReultText.setText(String.valueOf(total));
    }

    @FXML//Subtract First and Second Number
    void subButtonPressed(ActionEvent event) {
        
    number1 = Integer.parseInt(firstNumberTextField.getText());
    number2 = Integer.parseInt(secondNumberTextField.getText());
    total = number1-number2; //Subtract Numbers
    //return total to resulttext after converted to a string.
    ReultText.setText(String.valueOf(total));
    }

}