package Home;

import Home.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;

public class controller implements Initializable {

    @FXML
    private Button Login;

    @FXML
    private TextField Password;

    @FXML
    private TextField UserName;

    @FXML
    private Label errorMessageLabel;

    @FXML
    private Button CreateAcc;

    private String errorMessage = "";

    private Stage primaryStage;

    @FXML
    private JFXButton buttonBooks;

    @FXML
    private JFXButton buttonDashboard;

    @FXML
    private JFXButton buttonProfile;

    @FXML
    private JFXButton buttonSearch;

    @FXML
    private JFXButton buttonSetting;

    @FXML
    private Label displaylabel;

    @FXML
    private Pane displaypane;

    @FXML
    private AnchorPane side_anchorpane;

    private boolean isFieldFilled()
    {
        boolean isField = true;
        if (UserName.getText().isEmpty()){
            isField = false;
            errorMessage = "Username is Empty!";
        }

        if (Password.getText().isEmpty()){
            isField = false;
            if (errorMessage.isEmpty())
            {
                errorMessage = "Password is Empty!";
            }else {
                errorMessage += "\nPassword is Empty!";
            }
        }

        errorMessageLabel.setText(errorMessage);
        return isField;
    }

    private boolean isValid(){
        boolean isValid = true;
        if (!UserName.getText().equals(Main.USERNAME)){
            isValid = false;
            errorMessage = "Invalid Username!";
        }

        if (!Password.getText().equals(Main.PASSWORD)){
            isValid = false;
            if (errorMessage.isEmpty())
            {
                errorMessage = "Invalid Password!";
            }else {
                errorMessage += "\nInvalid Password";
            }
        }

        errorMessageLabel.setText(errorMessage);
        return isValid;
    }


    private void starHomeWindow(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Interface.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.setMaximized(false);
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void startCreate(){
        try{
            Parent root = FXMLLoader.load((getClass().getResource("Create.fxml")));
            Stage stage = new Stage();
            stage.setMaximized(true);
            stage.setScene(new Scene(root));
            stage.setMaximized(false);
            stage.setResizable(false);
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void handleCloseButton(ActionEvent event){
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
        startCreate();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /*Login.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                errorMessage = "";
                if (isFieldFilled() && isValid()){
                    starHomeWindow();
                }
            }
        });*/


    }
    @FXML
    private void ClickLogin(ActionEvent event){
        if (isFieldFilled() && isValid()){
            starHomeWindow();
        }
    }

    @FXML
    private void handeClick(ActionEvent event){
        if (event.getSource() == buttonDashboard){
            displaylabel.setText("Dashboard");
            displaypane.setBackground(new Background(new BackgroundFill(Color.rgb(63, 43, 99), CornerRadii.EMPTY, Insets.EMPTY)));

        }else if (event.getSource() == buttonBooks){
            displaylabel.setText("Books");
            displaypane.setBackground(new Background(new BackgroundFill(Color.rgb(168, 249, 0), CornerRadii.EMPTY, Insets.EMPTY)));

        }else if (event.getSource() == buttonSearch){
            displaylabel.setText("Search");
            displaypane.setBackground(new Background(new BackgroundFill(Color.rgb(250, 43, 99), CornerRadii.EMPTY, Insets.EMPTY)));

        }else if (event.getSource() == buttonProfile){
            displaylabel.setText("Profile");
            displaypane.setBackground(new Background(new BackgroundFill(Color.rgb(250, 255, 6), CornerRadii.EMPTY, Insets.EMPTY)));

        }else
        if (event.getSource() == buttonSetting){
            displaylabel.setText("Setting");
            displaypane.setBackground(new Background(new BackgroundFill(Color.rgb(240, 130, 172), CornerRadii.EMPTY, Insets.EMPTY)));

        }
    }

}
