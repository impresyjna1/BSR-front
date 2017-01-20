package bsr.front.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

/**
 * Created by Impresyjna on 31.12.2016.
 */

/**
 * Controller for whole dashboard in app  - the one with anchor pane to show all fragments
 */
public class DashboardActivityController {
    @FXML
    private AnchorPane containerAnchor;

    @FXML
    public void initialize() {
        anchorWithFragment("/dashboard_fragment.fxml");
    }

    @FXML
    private void homeButtonAction(ActionEvent event) {
        anchorWithFragment("/dashboard_fragment.fxml");
    }

    @FXML
    private void accountsButtonAction(ActionEvent event) {
        anchorWithFragment("/accounts_fragment.fxml");
    }

    @FXML
    private void bankPaymentAction(ActionEvent event) {
        anchorWithFragment("/bank_payment_fragment.fxml");
    }

    @FXML
    private void depositMoneyAction(ActionEvent event) {
        anchorWithFragment("/deposit_money_fragment.fxml");
    }

    @FXML
    private void historyAction(ActionEvent event) {
        anchorWithFragment("/history_fragment.fxml");
    }

    @FXML
    private void transferMoneyAction(ActionEvent event) {
        anchorWithFragment("/transfer_money_fragment.fxml");
    }

    @FXML
    private void withdrawMoneyAction(ActionEvent event) {
        anchorWithFragment("/withdraw_money_fragment.fxml");
    }

    /**
     * Show chosen fragment in anchor pane
     * @param fragmentPathName path to resource to be shown
     */
    public void anchorWithFragment(String fragmentPathName) {
        try {
            Node view = FXMLLoader.load(getClass().getResource(fragmentPathName));
            containerAnchor.getChildren().addAll(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
