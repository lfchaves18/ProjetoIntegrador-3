/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Telas.util.Alertas;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author Lucas Filipe
 */
public class TelaFeedbackController implements Initializable {

    @FXML
    private Label labelUnidade;
    @FXML
    private Button btMtRuim;
    @FXML
    private Button btRuim;
    @FXML
    private Button btNormal;
    @FXML
    private Button btBom;
    @FXML
    private Button btMtBom;
     @FXML
    private Button btEntrar;
    
    @FXML
    public void salvarFeedbackRuim() {
        Alertas.mostrarAlertas("Feedback salvo", "Pedimos desculpa, estamos buscando melhorar nossos serviços!",
                 "Agradecemos e volte sempre!", Alert.AlertType.CONFIRMATION);
    }
    
    @FXML
    public void salvarFeedbackNormal() {
        Alertas.mostrarAlertas("Feedback salvo", "Estamos buscando melhorar nossos serviços!",
                 "Agradecemos e volte sempre!", Alert.AlertType.CONFIRMATION);
          
    }
    
    @FXML
    public void salvarFeedbackBom() {
        Alertas.mostrarAlertas("Feedback salvo", "Ficamos felizes que gostou!",
                 "Agradecemos e volte sempre!", Alert.AlertType.CONFIRMATION);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

     @FXML
    private void entrar(ActionEvent event) throws IOException {
        
         Stage stage = new Stage();
        
        Parent telaAluguel = FXMLLoader.load(
                getClass().getResource(
                        "/Telas/TelaAluguel.fxml"
                )
        );
        
        Scene scene = new Scene(telaAluguel);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        
        Stage fecha = (Stage) btEntrar.getScene().getWindow();
        fecha.close();
    }
}
