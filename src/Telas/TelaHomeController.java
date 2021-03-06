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
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import projetointegrador3.ProjetoIntegrador3;


/**
 * FXML Controller class
 *
 * @author Lucas Filipe
 */
public class TelaHomeController implements Initializable {

    @FXML
    private TableView TBAlugueis;
    @FXML
    private Button btSair;
    @FXML
    private Button btCancelar;
    @FXML
    private Button btConfirmar;
    
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
        
        Stage fecha = (Stage) btConfirmar.getScene().getWindow();
        fecha.close();
    }
}
