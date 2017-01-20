package bsr.front.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Impresyjna on 01.01.2017.
 */

/**
 * Model of account to be shown in accounts fragment view
 */
public class AccountModel {
    private StringProperty accountNumber = new SimpleStringProperty();
    private StringProperty accountAmount = new SimpleStringProperty();
    private StringProperty accountTitle = new SimpleStringProperty();

    public AccountModel(String accountNumberString, int accountAmountInt, String accountTitleString) {
        this.accountNumber.set(accountNumberString);
        String accountAmountString = Float.toString(accountAmountInt/100) + "$";
        this.accountAmount.set(accountAmountString);
        this.accountTitle.set(accountTitleString);
    }

    public String getAccountNumber() {
        return accountNumber.get();
    }

    public StringProperty accountNumberProperty() {
        return accountNumber;
    }

    public String getAccountAmount() {
        return accountAmount.get();
    }

    public StringProperty accountAmountProperty() {
        return accountAmount;
    }

    public String getAccountTitle() {
        return accountTitle.get();
    }

    public StringProperty accountTitleProperty() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle.set(accountTitle);
    }
}
