package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import service.FourClickButtonService;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuStageController implements Initializable, FourClickButtonService {

    @FXML
    private Button buttonBuy;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void changeScreenButtonPushed(ActionEvent event) throws IOException {
        Parent buyMilkStageParent = FXMLLoader.load(getClass().getResource("/BuyMilkStage.fxml"));
        Scene buyMilkStageScene = new Scene(buyMilkStageParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(buyMilkStageScene);
        window.show();
    }

    @Override
    public void changeScreenButtonPushed2(ActionEvent event) throws IOException {
        Parent homeStageParent = FXMLLoader.load(getClass().getResource("/HomeStage.fxml"));
        Scene homeStageScene = new Scene(homeStageParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(homeStageScene);
        window.show();
    }

    @Override
    public void changeScreenButtonPushed3(ActionEvent event) throws IOException {
        Parent orderStageParent = FXMLLoader.load(getClass().getResource("/OrderStage.fxml"));
        Scene orderStageScene = new Scene(orderStageParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(orderStageScene);
        window.show();
    }

    @Override
    public void changeScreenButtonPushed4(ActionEvent event) throws IOException {

    }
}
