package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CustomerController {

    public void viewCustomerClicked () throws Exception{
        Stage PrimaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("CustomerStats.fxml"));
        Scene scene = new Scene(root);
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("B.A.Distributors");
        PrimaryStage.show();
    }

    public void newCustomerClicked () throws Exception{
        Stage PrimaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("NewCustomer.fxml"));
        Scene scene = new Scene(root);
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("B.A.Distributors");
        PrimaryStage.show();
    }
}
