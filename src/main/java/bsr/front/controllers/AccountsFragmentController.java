package bsr.front.controllers;

import bsr.front.models.AccountModel;
import bsr.front.singletonInstances.ServerConnection;
import bsr.server.innerservices.Account;
import bsr.server.innerservices.SessionException_Exception;
import bsr.server.innerservices.UserException_Exception;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

import java.util.List;

/**
 * Created by Impresyjna on 01.01.2017.
 */

/**
 * Controller for accounts fragment in application
 */
public class AccountsFragmentController {

    @FXML
    private javafx.scene.control.TableView<AccountModel> accountTable;
    @FXML
    private javafx.scene.control.TableColumn<AccountModel, String> accountNumberColumn;
    @FXML
    private javafx.scene.control.TableColumn<AccountModel, String> accountAmountColumn;
    @FXML
    private javafx.scene.control.TableColumn<AccountModel, String> accountTitleColumn;

    public AccountsFragmentController() {
        super();

    }

    /**
     * Triggered when fragment is shown
     */
    @FXML
    public void initialize() {
        ServerConnection serverConnection = ServerConnection.getInstance();
        try {
            List<Account> accountsList = serverConnection.getAccountService().getAccounts();
            ObservableList<AccountModel> accountModels = FXCollections.observableArrayList();
            for(Account account: accountsList) {
                accountModels.add(new AccountModel(account.getAccountNumber(), account.getBalance(), account.getTitleOFAccount()));
            }
            accountTable.setItems(accountModels);
            initializeTab();
        } catch (SessionException_Exception | UserException_Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Connect data to cell in table
     */
    private void initializeTab() {
        accountNumberColumn.setCellValueFactory(cellData -> cellData.getValue().accountNumberProperty());
        accountAmountColumn.setCellValueFactory(cellData -> cellData.getValue().accountAmountProperty());
        accountTitleColumn.setCellValueFactory(cellData -> cellData.getValue().accountTitleProperty());
    }
}
