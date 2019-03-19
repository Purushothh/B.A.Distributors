package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EmployeeController {
    public void employeeStats () throws Exception{
        Stage PrimaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("EmpStats.fxml"));
        Scene scene = new Scene(root);
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("B.A.Distributors");
        PrimaryStage.show();
    }

    public void addemployeeClicked () throws Exception{
        Stage PrimaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("AddEmployee.fxml"));
        Scene scene = new Scene(root);
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("B.A.Distributors");
        PrimaryStage.show();
    }
}
