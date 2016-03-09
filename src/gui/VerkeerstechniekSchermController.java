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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author denni
 */
public class VerkeerstechniekSchermController implements Initializable {
    
    private ImageView imgAchtergrond,imgVerkeer,imgAanwijzers,imgOpenbareWeg,imgVoorrang,imgVerkeerstekens,imgSnelheid,imgRechtsaf,imgLinksaf,imgKruisen,imgInhalen,imgVolgafstand, imgNaamveld, imgTerug;
    @FXML
    private Circle clrAanwijzers,clrOpenbareWeg,clrVoorrang,clrVerkeerstekens,clrSnelheid,clrRechtsaf,clrLinksaf,clrKruisen,clrInhalen,clrVolgafstand;
    @FXML
    private Label lblNaam;
    
    @Override
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
