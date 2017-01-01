package bsr.front.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

/**
 * Created by Impresyjna on 31.12.2016.
 */
public class DashboardActivityController {
    @FXML
    private AnchorPane containerAnchor;

    @FXML
    public void initialize() {
        anchorWithFragment("/dashboard_fragment.fxml");
    }

    public void anchorWithFragment(String fragmentPathName) {
        try {
            Node view = FXMLLoader.load(getClass().getResource(fragmentPathName));
            containerAnchor.getChildren().addAll(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
