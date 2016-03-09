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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

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
    
    @FXML
    private void btnHoofdmenuAction(ActionEvent event) throws Exception{
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/gui/Hoofdmenu.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Hoofdmenu");
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
