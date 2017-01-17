package bsr.front.controllers;

import bsr.front.singletonInstances.ServerConnection;
import bsr.front.utils.DialogsUtil;
import bsr.server.innerservices.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.util.List;

/**
 * Created by Impresyjna on 01.01.2017.
 */
public class DepositMoneyFragmentController {
    @FXML
    private javafx.scene.control.ChoiceBox<String> accountChoiceBox;
    @FXML
    private TextField amountTextField;
    @FXML
    private TextField titleTextField;

    @FXML
    public void initialize() {
        ServerConnection serverConnection = ServerConnection.getInstance();
        try {
            List<Account> accountsList = serverConnection.getAccountService().getAccounts();
            ObservableList<String> accountModels = FXCollections.observableArrayList();
            for (Account account : accountsList) {
                accountModels.add("Name: " + account.getTitleOFAccount() + "\nNumber: " + account.getAccountNumber() + "\nBalance: " + account.getBalance() + " $");
            }
            accountChoiceBox.setItems(accountModels);
        } catch (SessionException_Exception | UserException_Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void depositAction(ActionEvent event) {
        String selectedBankAccountNumber = accountChoiceBox.getValue();
        String amount = amountTextField.getText();
        String title = titleTextField.getText();
        System.out.println(selectedBankAccountNumber);
        try {
            Operation newOperation = null;
            newOperation = ServerConnection.getInstance().getAccountService().depositMoney(title, amount, selectedBankAccountNumber);
            DialogsUtil.showSuccess("Deposit succeeded \n Account balance: " + newOperation.getBalanceAfter() + "$");
            clearForm();
        } catch (AccountServiceException_Exception | NotValidException_Exception | OperationException_Exception | SessionException_Exception | AccountException_Exception | UserException_Exception  e) {
            DialogsUtil.showException(e.getMessage());
        }
    }

    private void clearForm() {
        accountChoiceBox.valueProperty().set(null);
        amountTextField.clear();
        titleTextField.clear();
    }
}
