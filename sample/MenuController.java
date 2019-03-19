package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuController {


    public void viewInventoryClicked () throws Exception{
        Stage PrimaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("ViewInventory.fxml"));
        Scene scene = new Scene(root);
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("B.A.Distributors");
        PrimaryStage.show();
    }

    public void deliveryClicked () throws Exception{
        Stage PrimaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Delivery.fxml"));
        Scene scene = new Scene(root);
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("B.A.Distributors");
        PrimaryStage.show();
    }

    public void makeOrderClicked () throws Exception{
        Stage PrimaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("ViewInventory.fxml"));
        Scene scene = new Scene(root);
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("B.A.Distributors");
        PrimaryStage.show();
    }

    public void invoiceClicked () throws Exception{
        Stage PrimaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("ViewInventory.fxml"));
        Scene scene = new Scene(root);
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("B.A.Distributors");
        PrimaryStage.show();
    }

    public void salesRepClicked () throws Exception{
        Stage PrimaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("SalesRep .fxml"));
        Scene scene = new Scene(root);
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("B.A.Distributors");
        PrimaryStage.show();
    }

    public void CustomersClicked () throws Exception{
        Stage PrimaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Customers.fxml"));
        Scene scene = new Scene(root);
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("B.A.Distributors");
        PrimaryStage.show();
    }

    public void employeeClicked () throws Exception{
        Stage PrimaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Employee.fxml"));
        Scene scene = new Scene(root);
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("B.A.Distributors");
        PrimaryStage.show();
    }


}
