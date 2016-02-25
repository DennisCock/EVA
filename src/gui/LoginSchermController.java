/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Sana De Clippel
 */
public class LoginSchermController implements Initializable {
    
    @FXML
    private TextField txtNaam; 
    @FXML
    private TextField txtNummer;
    @FXML
    private Button btnZoek;
    @FXML
    private Button btnNieuw;
    @FXML
    private void btnZoekAction(ActionEvent event){
    
    }
    @FXML
    private void btnNieuwAction(ActionEvent event){
    
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
