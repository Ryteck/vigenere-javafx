package controllers;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;
import javafx.fxml.FXML;
import function.Conversor;
import models.Codigo;

public class HomeController {

    private Codigo code;
    private Conversor convert;

    @FXML
    private JFXTextArea txtInput;

    @FXML
    private JFXTextArea txtOutput;

    @FXML
    private JFXTextField txtPassword;

    @FXML
    private JFXToggleButton decode;

    @FXML
    private void convert(){

        code = new Codigo(txtInput.getText(), txtOutput.getText(), txtPassword.getText(), decode.isSelected());
        convert = new Conversor(code);

        txtOutput.setText(code.getSaida());
    }
}
