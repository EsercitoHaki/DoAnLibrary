package Home.Interface;

import com.jfoenix.controls.JFXButton;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import javafx.animation.ScaleTransition;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Menu implements Initializable {

    @FXML
    private JFXButton buttonDashboard;

    @FXML
    private JFXButton buttonDashboard1;

    @FXML
    private JFXButton buttonDashboard2;

    @FXML
    private JFXButton buttonDashboard3;

    @FXML
    private JFXButton buttonDashboard4;

    @FXML
    private JFXButton buttonDash;

    @FXML
    private Label displaylabel;

    @FXML
    private Pane displaypane;

    @FXML
    private AnchorPane side_anchorpane;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void handeClick(ActionEvent event){
        ScaleTransition transition = new ScaleTransition(Duration.seconds(0.1), buttonDash);
        transition.setByX(2);
        transition.setByY(2);
        transition.play();
    }

}

