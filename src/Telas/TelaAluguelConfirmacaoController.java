/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Gerenciamento.GerenciamentoOperacao;
import Objetos.Operacao;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lucas Filipe
 */
public class TelaAluguelConfirmacaoController implements Initializable {

    @FXML
    private ComboBox<String> cbUnidade;
    private ObservableList<String> obsListUnidade;
    @FXML
    private DatePicker dtData;
    @FXML
    private Button btConfirmar;

    GerenciamentoOperacao gerenOperacao = new GerenciamentoOperacao();

    public void confirmacao() {
        Operacao operacao = new Operacao();
        
        operacao.unidade = cbUnidade.getValue();
        operacao.data = dtData.getValue();
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        List<String> listUnidade = new ArrayList<String>();
        listUnidade.add("BALNEARIO CARLOS JOEL NELLI");
        listUnidade.add("BALNEARIO GERALDO ALONSO");
        listUnidade.add("BALNEARIO JALISCO");
        listUnidade.add("BALNEARIO MARIO MORAES");
        listUnidade.add("BALNEARIO PRINCESA ISABEL");
        listUnidade.add("CEE ALFREDO IGNACIO TRINDADE");
        listUnidade.add("CEE AURELIO DE CAMPOS");
        listUnidade.add("CEE EDSON ARANTES DO NASCIMENTO");
        listUnidade.add("CEE FLAVIO CALABRESI CONTE");
        listUnidade.add("CEE GERALDO JOSE DE ALMEIDA");
        listUnidade.add("CEE JOERG BRUDER");
        listUnidade.add("CEE JOSE ERMIRIO DE MORAES");
        listUnidade.add("CEE LUIZ MARTINEZ");
        listUnidade.add("CEE MANE GARRINCHA");
        listUnidade.add("CEE OSWALDO BRANDAO");
        listUnidade.add("CEE RAUL TABAJARA");
        listUnidade.add("CEE RIYUSO OGAWA");
        listUnidade.add("CEE RUBENS PECCE LORDELLO");
        listUnidade.add("CEE SALIM FARAH MALUF");
        listUnidade.add("CEE SOLANGE NUNES BIBAS");
        listUnidade.add("CEE THOMAZ MAZZONI");
        listUnidade.add("CEE VICENTE ITALO FEOLA");
        listUnidade.add("CEL ANDRE VITAL RIBEIRO SOARES");
        listUnidade.add("CEL BRIGADEIRO EDUARDO GOMES");
        listUnidade.add("CEL BRIGADEIRO EDUARDO GOMES");
        listUnidade.add("CEL JOSE BONIFACIO");
        listUnidade.add("CEL JUSCELINO KUBITSCHEK");
        listUnidade.add("CEL MODELODROMO DO IBIRAPUERA");
        listUnidade.add("CEL PADRE  JOSE DE ANCHIETA");
        listUnidade.add("CEL PERUS");
        listUnidade.add("CEL TEOTONIO VILELA");
        listUnidade.add("CENTRO DE ESPORTES RADICAIS");
        listUnidade.add("CENTRO ESPORTIVO NAUTICO GUARAPIRANGA");
        listUnidade.add("CENTRO ESPORTIVO, RECREATIVO E EDUCATIVO DO TRABALHADOR");
        listUnidade.add("CENTRO ESPORTIVO TIETE");
        listUnidade.add("CENTRO OLIMPICO DE TREINAMENTO E PESQUISA");
        listUnidade.add("ESTADIO MUNICIPAL JACK MARIN");
        listUnidade.add("ESTADIO MUNICIPAL MIE NISHI");
        listUnidade.add("ESTADIO MUNICIPAL PAULO MACHADO DE CARVALHO");
        listUnidade.add("GINASIO ESPORTIVO DARCY REIS");
        listUnidade.add("MINI BALNEARIO IRMAOS PAOLILLO	");
        listUnidade.add("MINI BALNEARIO  MARECHAL ESPIRIDIAO ROSA");
        listUnidade.add("MINI BALNEARIO ANTONIO CARLOS DE ABREU SODRE");
        listUnidade.add("MINI BALNEARIO COMANDANTE GARCIA DAVILA");
        listUnidade.add("MINI BALNEARIO COMANDANTE GASTAO MOUTINHO");
        listUnidade.add("MINI BALNEARIO JOSE MARIA WHITAKER");
        listUnidade.add("MINI BALNEARIO MINISTRO SINESIO ROCHA");
        obsListUnidade = FXCollections.observableArrayList(listUnidade);
        cbUnidade.setItems(obsListUnidade);
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
