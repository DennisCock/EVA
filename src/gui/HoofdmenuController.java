package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.shape.Rectangle;

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
    private Button btnStuur, btnVerkeer, btnAttitude;
    @FXML
    private Rectangle rctEva1, rctEva2, rctEva3, rctGrafiek1, rctGrafiek2, rctGrafiek3, rctGrafiek4, rctGrafiek5;
    
    @FXML
    private void rctGrafiek1Click(ActionEvent event) throws Exception{
        
    }
    @FXML
    private void rctGrafiek2Click(ActionEvent event) throws Exception{
        lblEvolutie.setText("klaar om met begeleider te oefenen in stageperiode");
    }
    @FXML
    private void rctGrafiek3Click(ActionEvent event) throws Exception{
        
    }
    @FXML
    private void rctGrafiek4Click(ActionEvent event) throws Exception{
        lblEvolutie.setText("klaar om alleen te oefenen in stageperiode");
    }
    @FXML
    private void rctGrafiek5Click(ActionEvent event) throws Exception{
        lblEvolutie.setText("klaar voor praktisch examen");
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}