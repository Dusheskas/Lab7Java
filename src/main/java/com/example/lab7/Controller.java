package com.example.lab7;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textField;
    @FXML
    private Label labelRes;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void onExitBtn(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void onSetBtn(ActionEvent event) {
        labelRes.setText(textField.getText());
        String text = labelRes.getText();
    }

    @FXML
    void initialize() {

    }

}
