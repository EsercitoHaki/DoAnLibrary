package Home.Trung;

import Home.ConnectSQL;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerDataBase {
    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet re = null;
    @FXML
    private TableColumn<ProductList, String> CLMaSach;

    @FXML
    private TableColumn<ProductList, String> CLNamXuatBan;

    @FXML
    private TableColumn<ProductList, String> CLNhaXuatBan;

    @FXML
    private TableColumn<ProductList, String> CLTacGia;

    @FXML
    private TableColumn<ProductList, String> CLTenSach;

    @FXML
    private TableColumn<ProductList, String> CLTheLoai;

    @FXML
    private TableView<ProductList> TableView;

    private ObservableList<ProductList> ProductListOB;

    @FXML
    private void handleAddProduct

}
