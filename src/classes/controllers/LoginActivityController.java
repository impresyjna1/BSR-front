package classes.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Created by Asia on 30.12.2016.
 */
public class LoginActivityController {
    @FXML
    private TextField clientNumberTextField;
    @FXML
    private TextField passwordTextField;


    @FXML
    private void closeAppAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void loginAction(ActionEvent event) {
        System.out.println("Login");
    }
}
