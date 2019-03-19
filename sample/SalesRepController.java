package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SalesRepController {

    public void SalesRepClicked () throws Exception{
        Stage PrimaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("SalesRepStats.fxml"));
        Scene scene = new Scene(root);
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("B.A.Distributors");
        PrimaryStage.show();
    }
}
