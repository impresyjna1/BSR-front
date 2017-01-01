package bsr.front.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Impresyjna on 01.01.2017.
 */
public class AccountModel {
    private StringProperty accountNumber = new SimpleStringProperty();
    private StringProperty accountAmount = new SimpleStringProperty();

    public AccountModel(String accountNumberString, int accountAmountInt) {
        this.accountNumber.set(accountNumberString);
        String accountAmountString = Float.toString(accountAmountInt/100) + "$";
        this.accountAmount.set(accountAmountString);
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
}
