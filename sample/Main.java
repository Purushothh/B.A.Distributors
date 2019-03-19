package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.swing.plaf.basic.BasicPasswordFieldUI;
import java.awt.*;

public class Main extends Application {



/*    @FXML private TextField txtUsername;
    @FXML private PasswordField txtPassword;
    @FXML private Label  lblStatus;
*/

    public void start(Stage primaryStage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("AWelcome.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("B.A.Distributors");
            primaryStage.show();
    }








    public static void main(String[] args) {
        launch(args);
    }

}
