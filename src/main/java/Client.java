import bsr.front.singletonInstances.ServerConnection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.MalformedURLException;

/**
 * Main class of app. Start whole client
 */
public class Client extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            ServerConnection.getInstance().init();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Parent root = FXMLLoader.load(getClass().getResource("/login_activity.fxml"));
        primaryStage.setTitle("Impresyjny bank");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
