package bsr.front.utils;

import javafx.scene.control.Alert;

/**
 * Created by Impresyjna on 31.12.2016.
 */
public abstract class DialogsUtil {
    public static void showError(String message) {
        showDialog(message, "Error", Alert.AlertType.ERROR);
    }

    private static void showDialog(String message, String title, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.showAndWait();
    }
}
