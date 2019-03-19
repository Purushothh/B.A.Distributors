package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewInventoryController {

    public void reloadclicked() throws Exception {
        Stage PrimaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Reload.fxml"));
        Scene scene = new Scene(root);
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("B.A.Distributors");
        PrimaryStage.show();
    }

}
