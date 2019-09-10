package com.marcel.controller;

import com.marcel.entity.Category;
import com.marcel.entity.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements initializable{
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtPrice;
    @FXML
    private Button btnSave;
    @FXML
    private Button btnReset;
    @FXML
    private Button btnUpdate;
    @FXML
    private TextField txtCategory;
    @FXML
    private Button btnCategory;
    @FXML
    private ComboBox comboBox;
    @FXML
    private TableColumn<Item,String> col01;
    @FXML
    private TableColumn<Item,String> col02;
    @FXML
    private TableColumn <Category,String>col03;
    @FXML
    private ObservableList<Category> Category;
    @FXML
    private ObservableList<Item> Item;
    @FXML
    private TableView tableView;

    @FXML
    private void tableCllicked(MouseEvent mouseEvent) {

    }

    @FXML
    private void SaveCat(ActionEvent actionEvent) {
    }

    @FXML
    private void ResetCat(ActionEvent actionEvent) {
    }

    @FXML
    private void UpdateCat(ActionEvent actionEvent) {
    }
    @Override
    public void initializable(URL location, ResourceBundle resources){
        Category= FXCollections.observableArrayList();
        Item = FXCollections.observableArrayList();
        comboBox.setItems(Category);
        tableView.setItems(Item);
        col01.setCellValueFactory(data -> {
            Item i=data.getVallue();

        });

    }

}
