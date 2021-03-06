package bsr.front.controllers;

import bsr.front.models.AccountChoiceBoxModel;
import bsr.front.singletonInstances.ServerConnection;
import bsr.front.utils.DialogsUtil;
import bsr.server.innerservices.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.List;

/**
 * Created by Impresyjna on 17.01.2017.
 */

/**
 * Controller for withdraw money fragment
 */
public class WithdrawMoneyFragmentController {
    @FXML
    private javafx.scene.control.ChoiceBox<AccountChoiceBoxModel> accountChoiceBox;
    @FXML
    private TextField amountTextField;
    @FXML
    private TextField titleTextField;

    /**
     * Triggered when view is shown
     */
    @FXML
    public void initialize() {
        getAccountsFromServer();
    }

    /**
     * Action triggered on button click.
     * @param event
     */
    @FXML
    public void withdrawAction(ActionEvent event) {
        String selectedBankAccountNumber = accountChoiceBox.getValue().getKey();
        String amount = amountTextField.getText();
        String title = titleTextField.getText();

        try {
            Operation newOperation = null;
            newOperation = ServerConnection.getInstance().getAccountService().withdrawMoney(title, amount, selectedBankAccountNumber);
            DialogsUtil.showSuccess("Withdraw succeeded \n Account balance: " + (double) newOperation.getBalanceAfter()/100 + "$");
            clearFormAndRefresh();
        } catch (AccountServiceException_Exception | NotValidException_Exception | OperationException_Exception | SessionException_Exception | AccountException_Exception | UserException_Exception  e) {
            DialogsUtil.showException(e.getMessage());
        }
    }

    /**
     * Clears all textFields and choiceBox
     */
    private void clearFormAndRefresh() {
        accountChoiceBox.valueProperty().set(null);
        amountTextField.clear();
        titleTextField.clear();
        getAccountsFromServer();
    }

    /**
     * Method to get user accounts list from server and prepare data to be shown in checkboxes
     */
    private void getAccountsFromServer() {
        accountChoiceBox.getItems().clear();
        ServerConnection serverConnection = ServerConnection.getInstance();
        try {
            List<Account> accountsList = serverConnection.getAccountService().getAccounts();
            ObservableList<AccountChoiceBoxModel> accountModels = FXCollections.observableArrayList();
            for (Account account : accountsList)
                accountModels.add(new AccountChoiceBoxModel(account.getAccountNumber(), "Name: " + account.getTitleOFAccount() + "\nNumber: " + account.getAccountNumber() + "\nBalance: " + (double) account.getBalance()/100 + " $"));
            accountChoiceBox.setItems(accountModels);
        } catch (SessionException_Exception | UserException_Exception e) {
            e.printStackTrace();
        }
    }
}
