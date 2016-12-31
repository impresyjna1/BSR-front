package bsr.front.controllers;

import bsr.front.utils.DialogsUtil;
import bsr.front.helpers.HashUtils;
import bsr.front.singletonInstances.ServerConnection;
import bsr.front.utils.StagesUtil;
import bsr.server.AuthException_Exception;
import bsr.server.NotValidException_Exception;
import bsr.server.ServerException_Exception;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
        try {
            ServerConnection serverConnection = ServerConnection.getInstance();
            int sessionId = serverConnection.getUserService().login(login, password);
            serverConnection.setSessionId(sessionId);
            new StagesUtil().openNewStage("/dashboard_activity.fxml", "Impresyjny bank", event);
        } catch (AuthException_Exception | NotValidException_Exception | ServerException_Exception e) {
            DialogsUtil.showError(e.getMessage());
        }
    }
}