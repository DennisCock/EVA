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
    private Button btnStuur, btnVerkeer, btnAttitude, btnTerug;
    @FXML
    private Rectangle rctEva1, rctEva2, rctEva3, rctGrafiek1, rctGrafiek2, rctGrafiek3, rctGrafiek4, rctGrafiek5;
    
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
