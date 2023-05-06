package Home;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class create_user {
    @FXML
    private Label MessageSignUp;

    @FXML
    private TextField PasswordSignUp;

    @FXML
    private Button SignUp;

    @FXML
    private TextField UserNameSignUp;

    private static final String DATABASEURL = "jdbc:mysql://localhost:3306/LIBRARY?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Phamquan2003";


    public void CREATE(){
        try(Connection connection = DriverManager.getConnection(DATABASEURL, USERNAME, PASSWORD)){
//            String query = "INSERT INTO user(username, password) value(?, ?)";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1, "UserName");
//            preparedStatement.setString(2, "Password");
//            System.out.println(preparedStatement);
//            preparedStatement.executeUpdate();

            String username = UserNameSignUp.getText();
            String password = PasswordSignUp.getText();

            String sql = "INSERT INTO user(username, password) value(?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                MessageSignUp.setText("Successful account registration");
            } else {
                MessageSignUp.setText("Account registration failed");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void strartLogin(){
        try{
            Parent root = FXMLLoader.load((getClass().getResource("DangNhap.fxml")));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setMaximized(false);
            stage.setResizable(false);
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void ClickSignUp(ActionEvent event){
        if (event.getSource() == SignUp){
            CREATE();
        }
    }

    public void ClickSignIn(ActionEvent event){
        try{
            Stage stagePast = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stagePast.close();
            Parent root = FXMLLoader.load((getClass().getResource("DangNhap.fxml")));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setMaximized(false);
            stage.setResizable(false);
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}