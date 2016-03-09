/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Sana De Clippel
 */
public class AttitudeSchermController implements Initializable {

    @FXML
    private TextArea txaOpmerking;
    
    @FXML
    private CheckBox cbxZenuwachtig, cbxConcentratie, cbxSchrik, cbxAsociaal, cbxVerkeersgevaarlijk,
            cbxOngeduldig, cbxAgressiefRijgedrag, cbxInzet, cbxVerstrooid, cbxEigenwijs;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
