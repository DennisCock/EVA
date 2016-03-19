/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sana De Clippel
 */
public class LoginSchermController implements Initializable {
    
    @FXML
    private TextField txtNaam, txtNummer;
    @FXML
    private Button btnZoek, btnNieuw, btnDoorgaan;
    @FXML
    private ListView lstLeerlingen;
    
    ObservableList<String> leerlingen = FXCollections.observableArrayList("Sana De Clippel", "Dennis Cock", "Lotte Van Steenberge");
    
    @FXML
    private void btnZoekAction(ActionEvent event){
        lstLeerlingen.setVisible(true);
        btnDoorgaan.setVisible(true);
        if(leerlingen.contains(txtNaam.getText().toString())){
            leerlingen.clear();
            leerlingen.add(txtNaam.getText().toString());
            lstLeerlingen.setItems(leerlingen);
        }else lstLeerlingen.setItems(leerlingen);
    }
    @FXML
    private void btnNieuwAction(ActionEvent event) throws Exception{
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/gui/NieuwLoginScherm.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Nieuwe login");
        stage.show();
    }
    @FXML
    private void btnDoorgaanAction(ActionEvent event) throws Exception{
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/gui/Hoofdmenu.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("EVA");
        stage.show();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
