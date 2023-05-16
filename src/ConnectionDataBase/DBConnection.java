package Home.ConnectionDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    public static Connection ConnectDB(){
        Connection conn = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;database=quanlyThuVien;user=sa;password=Phamquan2003;encrypt=true;trustServerCertificate=true";
            conn = DriverManager.getConnection(url);
        }catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;

    }

    public static void main(String[] args) {
        try {
            ConnectDB();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
