package bsr.front.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Impresyjna on 18.01.2017.
 */
public class OperationModel {
    private StringProperty typeProperty = new SimpleStringProperty();
    private StringProperty titleProperty = new SimpleStringProperty();
    private StringProperty amountProperty = new SimpleStringProperty();
    private StringProperty sourceProperty = new SimpleStringProperty();
    private StringProperty targetProperty = new SimpleStringProperty();
    private StringProperty balanceAfterProperty = new SimpleStringProperty();

    public OperationModel(String type, String title, int amount, String source, String target, int balanceAfter) {
        this.typeProperty.set(type);
        this.titleProperty.set(title);
        this.amountProperty.set((double) amount/100 + " $");
        this.sourceProperty.set(source);
        this.targetProperty.set(target);
        this.balanceAfterProperty.set((double) balanceAfter/100 + " $");
    }

    public String getTypeProperty() {
        return typeProperty.get();
    }

    public StringProperty typePropertyProperty() {
        return typeProperty;
    }

    public String getTitleProperty() {
        return titleProperty.get();
    }

    public StringProperty titlePropertyProperty() {
        return titleProperty;
    }

    public String getAmountProperty() {
        return amountProperty.get();
    }

    public StringProperty amountPropertyProperty() {
        return amountProperty;
    }

    public String getSourceProperty() {
        return sourceProperty.get();
    }

    public StringProperty sourcePropertyProperty() {
        return sourceProperty;
    }

    public String getTargetProperty() {
        return targetProperty.get();
    }

    public StringProperty targetPropertyProperty() {
        return targetProperty;
    }

    public String getBalanceAfterProperty() {
        return balanceAfterProperty.get();
    }

    public StringProperty balanceAfterPropertyProperty() {
        return balanceAfterProperty;
    }
}
