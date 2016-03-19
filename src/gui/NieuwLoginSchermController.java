/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domein.Leerling;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sana De Clippel
 */
public class NieuwLoginSchermController implements Initializable {

    @FXML
    private TextField txtNaam, txtVoornaam, txtNummer;
    @FXML
    private Label lblOpgeslagen;
    @FXML
    private Button btnOpslaan, btnAnnuleren, btnBladeren, btnDoorgaan;
    @FXML
    private void btnOpslaanAction(ActionEvent event) throws Exception{
        if(txtNaam.getText()=="" || txtNaam.getText()==null || txtNaam.getLength()==0){
            lblOpgeslagen.setText("Vul de naam correct in aub.");
        }else if(txtVoornaam.getText()=="" || txtVoornaam.getText()==null || txtVoornaam.getLength()==0){
            lblOpgeslagen.setText("Vul de voornaam correct in aub.");
        }else if(txtNummer.getText()=="" || txtNummer.getText()==null || txtNummer.getLength()==0){
            lblOpgeslagen.setText("Vul het inschrijvingnummer correct in aub.");
        }else {
            Leerling leerling = new Leerling(txtNaam.getText(), txtVoornaam.getText(), txtNummer.getText());
            btnDoorgaan.setVisible(true);
            lblOpgeslagen.setText("De leerling is correct opgeslagen!");
        }
    }
    @FXML
    private void btnAnnulerenAction(ActionEvent event) throws Exception{
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/gui/LoginScherm.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }
    @FXML
    private void btnBladerenAction(ActionEvent event){
    
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
