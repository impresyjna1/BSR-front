package bsr.front.utils;

import javafx.scene.control.Alert;

/**
 * Created by Impresyjna on 31.12.2016.
 */
public abstract class DialogsUtil {
    public static void showError(String message) {
        showDialog(message, "Error", Alert.AlertType.ERROR);
    }

    public static void showException(String message) {
        showDialog(message, "Warning", Alert.AlertType.WARNING);
    }

    public static void showSuccess(String message) {showDialog(message, "Success", Alert.AlertType.INFORMATION);}

    private static void showDialog(String message, String title, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.showAndWait();
    }
}
