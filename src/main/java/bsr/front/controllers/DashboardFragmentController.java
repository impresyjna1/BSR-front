package bsr.front.controllers;

import bsr.front.singletonInstances.ServerConnection;
import bsr.server.innerservices.Account;
import bsr.server.innerservices.SessionException_Exception;
import bsr.server.innerservices.User;
import bsr.server.innerservices.UserException_Exception;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


/**
 * Created by Impresyjna on 18.01.2017.
 */
public class DashboardFragmentController {

    @FXML
    private Label operationsCountLabel;
    @FXML
    private Label accountsCountLabel;
    @FXML
    private Label sumBalanceLabel;

    @FXML
    public void initialize() {
        ServerConnection serverConnection = ServerConnection.getInstance();
        try {
            User user = serverConnection.getUserService().getUser();
            int accountsCount = user.getAccounts().size();
            double sumBalance = 0.0;
            int operationsCount = 0;
            for(Account account: user.getAccounts()) {
                sumBalance += (double) account.getBalance()/100;
                operationsCount += account.getOperations().getOperationOrDepositOrTransfer().size();
            }
            operationsCountLabel.setText(String.valueOf(operationsCount));
            accountsCountLabel.setText(String.valueOf(accountsCount));
            sumBalanceLabel.setText(String.valueOf(sumBalance) + "$");
        } catch (SessionException_Exception | UserException_Exception e) {
            e.printStackTrace();
        }
    }
}
