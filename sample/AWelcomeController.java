package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class AWelcomeController {

    @FXML private TextField txtUsername;
    @FXML private PasswordField txtPassword;
    @FXML private Label lblStatus;

    public void loginclicked() throws Exception {
        if(txtUsername.getText ().equals ("anantha") && txtPassword.getText ().equals ("123")) {
        Stage PrimaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene scene = new Scene(root);
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("B.A.Distributors");
        PrimaryStage.show();
        }else {
            lblStatus.setText("Username or password is incorrect");
        }

    }



}
