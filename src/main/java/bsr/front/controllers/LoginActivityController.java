package bsr.front.controllers;

import bsr.front.helpers.HashUtils;
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
    private void loginAction(ActionEvent event) {
        String login = clientNumberTextField.getText();
        String password = HashUtils.hashPassword(passwordTextField.getText());
//        try {
//            ServerConnection serverConnection = ServerConnection.getInstance();
//            String sessionId = BankServiceUtil.getInstance().getUserService().login(login, password);
//            BankServiceUtil.getInstance().setSessionId(sessionId);
//            InformationDialogsUtil.showSuccessDialog("Logged in successful");
//            Stage stage = (Stage) loginButton.getScene().getWindow();
//            stage.close();
//        } catch (BankServiceException_Exception | ValidationException_Exception e) {
//            InformationDialogsUtil.showExceptionDialog(e.getMessage());
//        }
    }
}
