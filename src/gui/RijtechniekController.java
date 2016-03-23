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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author denni
 */
public class RijtechniekController implements Initializable {
    
    @FXML 
    private AnchorPane pnLeft, pnMiddle, pnRight;
    @FXML
    private ImageView imgAchtergrond,imgStuur,imgAchteruitrijden,imgGarage,imgHelling,imgKeren,imgKijktechniek,imgKoppeling,imgParkeren,imgRemtechniek,imgSchakeltechniek,imgStuuroefeningen,imgStuurtechniek,imgZithouding, imgNaamveld, imgTerug;
    @FXML
    private Circle clrBottomAchteruitrijden,clrBottomGarage,clrTopHelling,clrBottomKeren,clrTopKijktechniek,clrTopKoppeling,clrBottomParkeren,clrTopRemtechniek,clrTopSchakeltechniek,clrBottomStuuroefeningen,clrTopStuurtechniek,clrTopZithouding, clrTemp;
    @FXML
    private Label lblNaam;
    @FXML
    private Button btnBottomAchteruitrijden,btnBottomGarage,btnTopHelling,btnBottomKeren,btnTopKijktechniek,btnTopKoppeling,btnBottomParkeren,btnTopRemtechniek,btnTopSchakeltechniek,btnBottomStuuroefeningen,btnTopStuurtechniek,btnTopZithouding, btnNaamveld, btnTerug;
    @FXML
    private HBox colorBox;
    @FXML
    private ToggleGroup grpColor;   
    @FXML
    private RadioButton btnWit, btnGroen, btnOranje, btnRood;
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
    public void iconClickedAction(ActionEvent event) throws Exception{
        
    String buttonName = ((Button)event.getSource()).getId();
    buttonName = buttonName.replace("btn", "#clr");
    
    if(buttonName.contains("Bottom"))
        btnRood.setVisible(false);
    else if (buttonName.contains("Top"))
        btnRood.setVisible(true);
    clrTemp = (Circle) pnMiddle.lookup(buttonName);
    
    if (clrTemp.getFill() == Color.WHITE)
    btnWit.setSelected(true);
    else if(clrTemp.getFill() == Color.RED) btnRood.setSelected(true);
    else if(clrTemp.getFill() == Color.ORANGE) btnOranje.setSelected(true);
    else if(clrTemp.getFill() == Color.GREEN) btnGroen.setSelected(true);
    
    colorBox.setLayoutX(((Button)event.getSource()).getLayoutX() - 40);
    colorBox.setLayoutY(((Button)event.getSource()).getLayoutY() + 70);
    colorBox.setVisible(true);
    }
    
     @FXML
    public void closeAction(ActionEvent event) throws Exception{
    }
    
    @FXML
    public void setColorWhiteAction(ActionEvent event) throws Exception{
        clrTemp.setFill(Color.WHITE);
        colorBox.setVisible(false);
    }
    
    @FXML
    public void setColorRedAction(ActionEvent event) throws Exception{
        clrTemp.setFill(Color.RED);
        colorBox.setVisible(false);
    }
    
    @FXML
    public void setColorOrangeAction(ActionEvent event) throws Exception{
        clrTemp.setFill(Color.ORANGE);
        colorBox.setVisible(false);
    }
    
    @FXML
    public void setColorGreenAction(ActionEvent event) throws Exception{
        clrTemp.setFill(Color.GREEN);
        colorBox.setVisible(false);
    }
            
}
