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
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author denni
 */
public class RijtechniekenController implements Initializable {

    @FXML
    private ImageView imgAchtergrond,imgStuur,imgAchteruitrijden,imgGarage,imgHelling,imgKeren,imgKijktechniek,imgKoppeling,imgParkeren,imgRemtechniek,imgSchakeltechniek,imgStuuroefeningen,imgStuurtechniek,imgZithouding, imgNaamveld, imgTerug;
    @FXML
    private Circle clrAchteruitrijden,clrGarage,clrHelling,clrKeren,clrKijktechniek,clrKoppeling,clrParkeren,clrRemtechniek,clrSchakeltechniek,clrStuuroefeningen,clrStuurtechniek,clrZithouding;
    @FXML
    private Label lblNaam;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }    
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
    @FXML
    public void setColorAction(ActionEvent event) throws Exception{
        if (clrAchteruitrijden.getFill() == Color.WHITE)
                clrAchteruitrijden.setFill(Color.RED);
        else if (clrAchteruitrijden.getFill() == Color.RED)
            clrAchteruitrijden.setFill(Color.ORANGE);
        else if (clrAchteruitrijden.getFill() == Color.ORANGE)
            clrAchteruitrijden.setFill(Color.LIME);
        else clrAchteruitrijden.setFill(Color.WHITE);
    }
            
}
