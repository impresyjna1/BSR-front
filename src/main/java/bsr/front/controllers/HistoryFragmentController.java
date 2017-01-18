package bsr.front.controllers;

import bsr.front.models.AccountChoiceBoxModel;
import bsr.front.models.OperationModel;
import bsr.front.singletonInstances.ServerConnection;
import bsr.server.innerservices.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.util.List;

/**
 * Created by Impresyjna on 18.01.2017.
 */
public class HistoryFragmentController {
    @FXML
    private javafx.scene.control.ChoiceBox<AccountChoiceBoxModel> accountChoiceBox;
    @FXML
    private javafx.scene.control.TableView<OperationModel> operationsTable;
    @FXML
    private javafx.scene.control.TableColumn<OperationModel, String> typeColumn;
    @FXML
    private javafx.scene.control.TableColumn<OperationModel, String> titleColumn;
    @FXML
    private javafx.scene.control.TableColumn<OperationModel, String> amountColumn;
    @FXML
    private javafx.scene.control.TableColumn<OperationModel, String> sourceColumn;
    @FXML
    private javafx.scene.control.TableColumn<OperationModel, String> targetColumn;
    @FXML
    private javafx.scene.control.TableColumn<OperationModel, String> balanceAfterColumn;

    @FXML
    public void initialize() {
        getAccountsFromServer();
    }

    @FXML
    public void displayAction(ActionEvent event) {
        String selectedBankAccountNumber = accountChoiceBox.getValue().getKey();
        ServerConnection serverConnection = ServerConnection.getInstance();
        try {
            List<Account> accountsList = serverConnection.getAccountService().getAccounts();
            Account choosenAccount = null;
            for(Account account: accountsList) {
                if(account.getAccountNumber().equals(selectedBankAccountNumber)) {
                    choosenAccount = account;
                    break;
                }
            }
            ObservableList<OperationModel> operationsModels = FXCollections.observableArrayList();
            for(Operation operation: choosenAccount.getOperations().getOperationOrDepositOrTransfer()) {
                if(operation instanceof Transfer) {
                    Transfer transfer = (Transfer) operation;
                    operationsModels.add(new OperationModel(operation.getClass().getSimpleName(),
                            operation.getTitle(),
                            operation.getAmount(),
                            transfer.getFrom(),
                            operation.getTargetAccount(),
                            operation.getBalanceAfter()));
                } else {
                    operationsModels.add(new OperationModel(operation.getClass().getSimpleName(),
                            operation.getTitle(),
                            operation.getAmount(),
                            "-------",
                            operation.getTargetAccount(),
                            operation.getBalanceAfter()));
                }

            }
            operationsTable.setItems(operationsModels);
            initializeTab();
        } catch (SessionException_Exception | UserException_Exception e) {
            e.printStackTrace();
        }
    }

    private void initializeTab() {
        typeColumn.setCellValueFactory(cellData -> cellData.getValue().typePropertyProperty());
        titleColumn.setCellValueFactory(cellData -> cellData.getValue().titlePropertyProperty());
        amountColumn.setCellValueFactory(cellData -> cellData.getValue().amountPropertyProperty());
        sourceColumn.setCellValueFactory(cellData -> cellData.getValue().sourcePropertyProperty());
        targetColumn.setCellValueFactory(cellData -> cellData.getValue().targetPropertyProperty());
        balanceAfterColumn.setCellValueFactory(cellData -> cellData.getValue().balanceAfterPropertyProperty());
    }

    private void getAccountsFromServer() {
        accountChoiceBox.getItems().clear();
        ServerConnection serverConnection = ServerConnection.getInstance();
        try {
            List<Account> accountsList = serverConnection.getAccountService().getAccounts();
            ObservableList<AccountChoiceBoxModel> accountModels = FXCollections.observableArrayList();
            for (Account account : accountsList)
                accountModels.add(new AccountChoiceBoxModel(account.getAccountNumber(), "Name: " + account.getTitleOFAccount() + "\nNumber: " + account.getAccountNumber()));
            accountChoiceBox.setItems(accountModels);
        } catch (SessionException_Exception | UserException_Exception e) {
            e.printStackTrace();
        }
    }
}
