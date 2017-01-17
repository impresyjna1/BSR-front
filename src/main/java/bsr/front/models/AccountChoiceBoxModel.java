package bsr.front.models;

/**
 * Created by Impresyjna on 17.01.2017.
 */
public class AccountChoiceBoxModel {
    private final String key;
    private final String value;

    public AccountChoiceBoxModel(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return value;
    }
}
