package bsr.front.utils;

import javafx.scene.control.Alert;

/**
 * Created by Impresyjna on 31.12.2016.
 */

/**
 * Util to show dialogs while using message
 */
public abstract class DialogsUtil {
    /**
     * Shows message as error
     * @param message String with message
     */
    public static void showError(String message) {
        showDialog(message, "Error", Alert.AlertType.ERROR);
    }

    /**
     * Shows exceptions as warnings
     * @param message String with message
     */
    public static void showException(String message) {
        showDialog(message, "Warning", Alert.AlertType.WARNING);
    }

    /**
     * Shows information about success
     * @param message String with message
     */
    public static void showSuccess(String message) {showDialog(message, "Success", Alert.AlertType.INFORMATION);}

    /**
     * Shows dialog with given type
     * @param message String with message
     * @param title Title of dialog
     * @param alertType Type of dialog
     */
    private static void showDialog(String message, String title, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.showAndWait();
    }
}
