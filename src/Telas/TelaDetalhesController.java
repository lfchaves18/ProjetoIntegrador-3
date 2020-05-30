/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Objetos.DetalheObj;
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
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lucas Filipe
 */
public class TelaDetalhesController implements Initializable {

    
    
    private Button btCancelar;
    @FXML
    private ImageView imagem;
    @FXML
    private Label txtTexto;
    
    String caminho;
    @FXML
    private Label Unidade1;
    @FXML
    private Label Unidade2;
    @FXML
    private Label Unidade3;
    @FXML
    private Label Unidade4;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
       //txtTexto.setText(caminho);
    }    
    
    
    public void PopularTela(DetalheObj detalhe){
        
    teste();
       
        
       
    }
    
  public void teste(){
               Unidade1.setText("aaaaaaaaaa");

  }
    
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
        
        Stage fecha = (Stage) btCancelar.getScene().getWindow();
        fecha.close();
    }

    @FXML
    private void voltar(MouseEvent event) {
    }
}
