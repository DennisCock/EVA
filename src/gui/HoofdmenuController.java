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
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sana De Clippel
 */
public class HoofdmenuController implements Initializable {

    @FXML
    private TextArea txaOpmerking;
    @FXML
    private Label lblNaam, lblEvolutie;
    @FXML
    private Button btnStuur, btnVerkeer, btnAttitude, btnTerug, btnBanden, btnVloeistof, btnSchakelaars, btnTanken, btnStop, btnGps, btnMin, btnPlus, btnRotonde, btnRijstroken, btnStad, btnAutostrade;
    @FXML
    private Rectangle rctEva1, rctEva2, rctEva3, rctGrafiek1, rctGrafiek2, rctGrafiek3, rctGrafiek4, rctGrafiek5;
    @FXML
    private Circle clrBanden, clrVloeistof, clrSchakelaars, clrTanken, clrStop, clrGps, clrRotonde, clrRijstroken, clrStad, clrAutostrade;
    
    private int grafiekTeller = 0;
    
    @FXML
    private void btnTerugAction(ActionEvent event) throws Exception{
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/gui/LoginScherm.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }
    @FXML
    private void btnAttitudeAction(ActionEvent event) throws Exception{
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/gui/AttitudeScherm.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Attitude");
        stage.show();
    }
    @FXML
    private void btnStuurAction(ActionEvent event) throws Exception{
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/gui/Rijtechniek.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Rijtechniek");
        stage.show();
    }
    @FXML
    private void btnVerkeerAction(ActionEvent event) throws Exception{
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/gui/VerkeerstechniekScherm.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Verkeerstechniek");
        stage.show();
    }
    @FXML
    public void btnSchakelaarsAction(ActionEvent event) throws Exception{
        if (clrSchakelaars.getFill() == Color.WHITE)
                clrSchakelaars.setFill(Color.RED);
        else if (clrSchakelaars.getFill() == Color.RED)
            clrSchakelaars.setFill(Color.ORANGE);
        else if (clrSchakelaars.getFill() == Color.ORANGE)
            clrSchakelaars.setFill(Color.GREEN);
        else clrSchakelaars.setFill(Color.WHITE);
    }
    @FXML
    public void btnVloeistofAction(ActionEvent event) throws Exception{
        if (clrVloeistof.getFill() == Color.WHITE)
                clrVloeistof.setFill(Color.RED);
        else if (clrVloeistof.getFill() == Color.RED)
            clrVloeistof.setFill(Color.ORANGE);
        else if (clrVloeistof.getFill() == Color.ORANGE)
            clrVloeistof.setFill(Color.GREEN);
        else clrVloeistof.setFill(Color.WHITE);
    }
    @FXML
    public void btnBandenAction(ActionEvent event) throws Exception{
        if (clrBanden.getFill() == Color.WHITE)
                clrBanden.setFill(Color.RED);
        else if (clrBanden.getFill() == Color.RED)
            clrBanden.setFill(Color.ORANGE);
        else if (clrBanden.getFill() == Color.ORANGE)
            clrBanden.setFill(Color.GREEN);
        else clrBanden.setFill(Color.WHITE);
    }
    @FXML
    public void btnTankenAction(ActionEvent event) throws Exception{
        if (clrTanken.getFill() == Color.WHITE)
                clrTanken.setFill(Color.RED);
        else if (clrTanken.getFill() == Color.RED)
            clrTanken.setFill(Color.ORANGE);
        else if (clrTanken.getFill() == Color.ORANGE)
            clrTanken.setFill(Color.GREEN);
        else clrTanken.setFill(Color.WHITE);
    }
    @FXML
    public void btnGpsAction(ActionEvent event) throws Exception{
        if (clrGps.getFill() == Color.WHITE)
                clrGps.setFill(Color.RED);
        else if (clrGps.getFill() == Color.RED)
            clrGps.setFill(Color.ORANGE);
        else if (clrGps.getFill() == Color.ORANGE)
            clrGps.setFill(Color.GREEN);
        else clrGps.setFill(Color.WHITE);
    }
    @FXML
    public void btnStopAction(ActionEvent event) throws Exception{
        if (clrStop.getFill() == Color.WHITE)
                clrStop.setFill(Color.RED);
        else if (clrStop.getFill() == Color.RED)
            clrStop.setFill(Color.ORANGE);
        else if (clrStop.getFill() == Color.ORANGE)
            clrStop.setFill(Color.GREEN);
        else clrStop.setFill(Color.WHITE);
    }
    @FXML
    public void btnPlusAction(ActionEvent event) throws Exception{
        grafiekTeller++;
        if(grafiekTeller == 1)
            rctGrafiek1.setFill(Color.GREEN);
        else if(grafiekTeller == 2){
            rctGrafiek1.setFill(Color.GREEN);
            rctGrafiek2.setFill(Color.GREEN);
            lblEvolutie.setText("Klaar om met een begeleider te oefenen");
        }else if(grafiekTeller == 3){
            rctGrafiek1.setFill(Color.GREEN);
            rctGrafiek2.setFill(Color.GREEN);
            rctGrafiek3.setFill(Color.GREEN);
        }else if(grafiekTeller == 4){
            rctGrafiek1.setFill(Color.GREEN);
            rctGrafiek2.setFill(Color.GREEN);
            rctGrafiek3.setFill(Color.GREEN);
            rctGrafiek4.setFill(Color.GREEN);
            lblEvolutie.setText("Klaar om alleen te oefenen");
        }else{
            rctGrafiek1.setFill(Color.GREEN);
            rctGrafiek2.setFill(Color.GREEN);
            rctGrafiek3.setFill(Color.GREEN);
            rctGrafiek4.setFill(Color.GREEN);
            rctGrafiek5.setFill(Color.GREEN);
            lblEvolutie.setText("Klaar voor praktisch examen");
        }
        
    }
    @FXML
    public void btnMinAction(ActionEvent event) throws Exception{
       if(grafiekTeller>5)
           grafiekTeller = 5;
       if(grafiekTeller<1)
           grafiekTeller=1;
       grafiekTeller--;
       if(grafiekTeller == 1){
            rctGrafiek1.setFill(Color.GREEN);
            rctGrafiek2.setFill(Color.WHITE);
            rctGrafiek3.setFill(Color.WHITE);
            rctGrafiek4.setFill(Color.WHITE);
            rctGrafiek5.setFill(Color.WHITE);
       }else if(grafiekTeller == 2){
            rctGrafiek1.setFill(Color.GREEN);
            rctGrafiek2.setFill(Color.GREEN);
            rctGrafiek3.setFill(Color.WHITE);
            rctGrafiek4.setFill(Color.WHITE);
            rctGrafiek5.setFill(Color.WHITE);
            lblEvolutie.setText("Klaar om met een begeleider te oefenen");
        }else if(grafiekTeller == 3){
            rctGrafiek1.setFill(Color.GREEN);
            rctGrafiek2.setFill(Color.GREEN);
            rctGrafiek3.setFill(Color.GREEN);
            rctGrafiek4.setFill(Color.WHITE);
            rctGrafiek5.setFill(Color.WHITE);
        }else if(grafiekTeller == 4){
            rctGrafiek1.setFill(Color.GREEN);
            rctGrafiek2.setFill(Color.GREEN);
            rctGrafiek3.setFill(Color.GREEN);
            rctGrafiek4.setFill(Color.GREEN);
            rctGrafiek5.setFill(Color.WHITE);
            lblEvolutie.setText("Klaar om alleen te oefenen");
        }else if(grafiekTeller == 5){
            rctGrafiek1.setFill(Color.GREEN);
            rctGrafiek2.setFill(Color.GREEN);
            rctGrafiek3.setFill(Color.GREEN);
            rctGrafiek4.setFill(Color.GREEN);
            rctGrafiek5.setFill(Color.GREEN);
            lblEvolutie.setText("Klaar voor praktisch examen");
        }
    }
    @FXML
    public void btnRotondeAction(ActionEvent event) throws Exception{
        if (clrRotonde.getFill() == Color.WHITE)
                clrRotonde.setFill(Color.GREEN);
        else clrRotonde.setFill(Color.WHITE);
    }
    @FXML
    public void btnRijstrokenAction(ActionEvent event) throws Exception{
        if (clrRijstroken.getFill() == Color.WHITE)
                clrRijstroken.setFill(Color.GREEN);
        else clrRijstroken.setFill(Color.WHITE);
    }
    @FXML
    public void btnStadAction(ActionEvent event) throws Exception{
        if (clrStad.getFill() == Color.WHITE)
                clrStad.setFill(Color.GREEN);
        else clrStad.setFill(Color.WHITE);
    }
    @FXML
    public void btnAutostradeAction(ActionEvent event) throws Exception{
        if (clrAutostrade.getFill() == Color.WHITE)
                clrAutostrade.setFill(Color.GREEN);
        else clrAutostrade.setFill(Color.WHITE);
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
