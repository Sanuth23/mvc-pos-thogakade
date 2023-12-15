package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PlaceOrderFormController {

    public AnchorPane orderPane;
    @FXML
    private JFXComboBox<?> cmbCustId;

    @FXML
    private JFXComboBox<?> cmbCode;

    @FXML
    private JFXTextField txtCustName;

    @FXML
    private JFXTextField txtDesc;

    @FXML
    private JFXTextField txtUnitPrice;

    @FXML
    private JFXTextField txtQty;

    @FXML
    private Label lblTotal;

    @FXML
    private JFXTreeTableView<?> tblItem;

    @FXML
    private TreeTableColumn<?, ?> colCode;

    @FXML
    private TreeTableColumn<?, ?> colDesc;

    @FXML
    private TreeTableColumn<?, ?> colQty;

    @FXML
    private TreeTableColumn<?, ?> colAmount;

    @FXML
    private TreeTableColumn<?, ?> colOption;

    public void initialize(){

    }

    @FXML
    void backButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) orderPane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/DashboardForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void addToCartButtonOnAction(ActionEvent event) {

    }

    @FXML
    void placeOrderButtonOnAction(ActionEvent event) {

    }

}
