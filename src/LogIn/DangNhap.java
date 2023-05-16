package Home.LogIn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;


public class DangNhap implements Initializable {

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

    @FXML
    private JFXButton LogOut;

    @FXML
    private Button SignUp;


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

//    private boolean isValid(){
//        boolean isValid = true;
//        if (!UserName.getText().equals(Main.USERNAMETEST)){
//            isValid = false;
//            errorMessage = "Invalid Username!";
//        }
//
//        if (!Password.getText().equals(Main.PASSWORDTEST)){
//            isValid = false;
//            if (errorMessage.isEmpty())
//            {
//                errorMessage = "Invalid Password!";
//            }else {
//                errorMessage += "\nInvalid Password";
//            }
//        }
//
//        errorMessageLabel.setText(errorMessage);
//        return isValid;
//    }

//    public void ClickLogin(ActionEvent event){
//        try(Connection connection = DriverManager.getConnection(DATABASEURL, USERNAME, PASSWORD)){
//            String username = UserName.getText();
//            String password = Password.getText();
//
//            String query = "SELECT * FROM user WHERE username = ? AND password = ?";
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.setString(1, username);
//            statement.setString(2, password);
//            ResultSet resultSet = statement.executeQuery();
//
//            if(resultSet.next()){
//                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//                stage.close();
//                starHomeWindow();
//            }else {
//
//            }
//
//        }catch (SQLException e){
//            throw new RuntimeException(e);
//        }
//    }


    public void starHomeWindow(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.setMaximized(false);
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void startCreate(){
        try{
            Parent root = FXMLLoader.load((getClass().getResource("DangNhap/TaoTK.fxml")));
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

    public void startSetting(){
        try {
            Parent root = FXMLLoader.load((getClass().getResource("CaiDat.fxml")));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setMaximized(false);
            stage.setResizable(false);
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void strartLogin(){
        try{
            Parent root = FXMLLoader.load((getClass().getResource("DangNhap/DangNhap.fxml")));
            Stage stage = new Stage();
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
//    @FXML
//    public void ClickLogin(ActionEvent event){
//        if (isFieldFilled() && isValid()){
//            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//            stage.close();
//            starHomeWindow();
//        }
//    }

    @FXML
    public void handeClick(ActionEvent event){
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
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.close();
            startSetting();
        }
    }



    @FXML
    public void ClickLogOut(ActionEvent event){
        if(event.getSource() == LogOut){
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.close();
            strartLogin();
        }
    }


}
