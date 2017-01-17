package bsr.front.controllers;

import bsr.front.models.AccountChoiceBoxModel;
import bsr.front.singletonInstances.ServerConnection;
import bsr.front.utils.DialogsUtil;
import bsr.server.innerservices.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.util.List;

/**
 * Created by Impresyjna on 17.01.2017.
 */
public class BankPaymentFragmentController {

    @FXML
    private javafx.scene.control.ChoiceBox<AccountChoiceBoxModel> accountChoiceBox;

    @FXML
    public void initialize() {
        getAccountsFromServer();
    }

    @FXML
    public void bankPaymentAction(ActionEvent event) {
        String selectedBankAccountNumber = accountChoiceBox.getValue().getKey();
        try {
            Operation newOperation = null;
            newOperation = ServerConnection.getInstance().getAccountService().getBankFeeFromAccount(selectedBankAccountNumber);
            DialogsUtil.showSuccess("Bank fee payed \n Account balance: " + newOperation.getBalanceAfter()/100.0 + "$");
        } catch (AccountServiceException_Exception | NotValidException_Exception | OperationException_Exception | SessionException_Exception | UserException_Exception  | AccountChecksumException_Exception e) {
            DialogsUtil.showException(e.getMessage());
        }
    }

    private void getAccountsFromServer() {
        accountChoiceBox.getItems().clear();
        ServerConnection serverConnection = ServerConnection.getInstance();
        try {
            List<Account> accountsList;
            accountsList = serverConnection.getAccountService().getAccounts();
            ObservableList<AccountChoiceBoxModel> accountModels = FXCollections.observableArrayList();
            for (Account account : accountsList)
                accountModels.add(new AccountChoiceBoxModel(account.getAccountNumber(), "Name: " + account.getTitleOFAccount() + "\nNumber: " + account.getAccountNumber()));
            accountChoiceBox.setItems(accountModels);
        } catch (SessionException_Exception | UserException_Exception e) {
            e.printStackTrace();
        }
    }
}
