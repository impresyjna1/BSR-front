package bsr.front.controllers;

import bsr.front.singletonInstances.ServerConnection;
import bsr.server.innerservices.Account;
import bsr.server.innerservices.SessionException_Exception;
import bsr.server.innerservices.UserException_Exception;
import javafx.fxml.FXML;

import java.util.List;

/**
 * Created by Impresyjna on 01.01.2017.
 */
public class AccountsFragmentController {
    @FXML
    public void initialize() {
        ServerConnection serverConnection = ServerConnection.getInstance();
        try {
            List<Account> accountList = serverConnection.getAccountService().getAccounts();
        } catch (SessionException_Exception | UserException_Exception e) {
            e.printStackTrace();
        }
        System.out.println("Init");
    }
}
