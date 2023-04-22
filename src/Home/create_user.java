package Home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class database {
    private static final String DATABASEURL = "jdbc:mysql://localhost:3306/SON?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Phamquan2003";

    public static void CREATE(){
        try(Connection connection = DriverManager.getConnection(DATABASEURL, USERNAME, PASSWORD)){
            String query = "INSERT INTO user(username, password) value(?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "UserName");
            preparedStatement.setString(2, "Password");
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}