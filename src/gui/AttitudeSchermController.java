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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sana De Clippel
 */
public class AttitudeSchermController implements Initializable {

    @FXML
    private ListView lstKenmerken, lstOpmerkingen;
    @FXML
    private Button btnTerug, btnRechts, btnLinks, btnPlus;
    @FXML
    private TextField txtKenmerk;
    @FXML
    private Label lblBeveiliging;
    
    ObservableList<String> opmerkingen = FXCollections.observableArrayList();
    
    @FXML
    private void btnTerugAction(ActionEvent event) throws Exception{
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/gui/Hoofdmenu.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("EVA");
        stage.show();
    }
    @FXML
    private void btnRechtsAction(ActionEvent event) throws Exception{
        lblBeveiliging.setText("");
        if(opmerkingen.contains(lstKenmerken.getSelectionModel().getSelectedItem().toString()))
            lblBeveiliging.setText("Dit kenmerk is al toegevoegd aan de opmerkingen!");
        else opmerkingen.add(lstKenmerken.getSelectionModel().getSelectedItem().toString());
        lstOpmerkingen.setItems(opmerkingen);
    }
    @FXML
    private void btnLinksAction(ActionEvent event) throws Exception{
        lblBeveiliging.setText("");
        opmerkingen.remove(lstOpmerkingen.getSelectionModel().getSelectedItem().toString());
        lstOpmerkingen.setItems(opmerkingen);
    }
    @FXML
    private void btnPlusAction(ActionEvent event) throws Exception{
        lblBeveiliging.setText("");
        opmerkingen.add(txtKenmerk.getText());
        lstOpmerkingen.setItems(opmerkingen);
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> kenmerken = FXCollections.observableArrayList("Zenuwachtig", "Concentratie","Schrik", "Asociaal", "Verkeersgevaarlijk", "Ongeduldig", "Aggressief rijgedrag", "Inzet", "Verstrooid", "Eigenwijs", "Ecologisch");
        lstKenmerken.setItems(kenmerken);
    }    
    
}