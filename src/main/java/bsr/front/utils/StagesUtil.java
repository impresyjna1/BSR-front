package bsr.front.utils;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Impresyjna on 31.12.2016.
 */
public class StagesUtil {
    public void openNewStage(String resourcePathName, String title, ActionEvent event) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource(resourcePathName));
            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(new Scene(root, 800, 600));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
