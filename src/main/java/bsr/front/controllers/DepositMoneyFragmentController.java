package bsr.front.controllers;

import bsr.front.singletonInstances.ServerConnection;
import bsr.server.innerservices.Account;
import bsr.server.innerservices.SessionException_Exception;
import bsr.server.innerservices.UserException_Exception;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import java.util.List;

/**
 * Created by Impresyjna on 01.01.2017.
 */
public class DepositMoneyFragmentController {
    @FXML
    private javafx.scene.control.ChoiceBox<String> accountChoice;

    @FXML
    public void initialize() {
        ServerConnection serverConnection = ServerConnection.getInstance();
        try {
            List<Account> accountsList = serverConnection.getAccountService().getAccounts();
            ObservableList<String> accountModels = FXCollections.observableArrayList();
            for(Account account: accountsList) {
                accountModels.add(account.getAccountNumber());
            }
            accountChoice.setItems(accountModels);
        } catch (SessionException_Exception | UserException_Exception e) {
            e.printStackTrace();
        }
    }
}
