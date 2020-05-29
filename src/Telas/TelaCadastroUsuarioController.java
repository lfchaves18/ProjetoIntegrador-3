/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Gerenciamento.GerenciamentoUsuario;
import Objetos.Usuario;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lucas Filipe
 */
public class TelaCadastroUsuarioController implements Initializable {

    @FXML
    private Button btEntrar;
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtSobrenome;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtCidade;
    @FXML
    private TextField txtPais;
    @FXML
    private TextField txtCpf;
    @FXML
    private TextField txtNomeMae;
    @FXML
    private TextField txtCep;
    @FXML
    private TextField txtEndereco;
    @FXML
    private TextField txtNumero;
    @FXML
    private TextField txtComplemento;
    @FXML
    private TextField txtBairro;
    @FXML
    private TextField txtCidadeRes;
    @FXML
    private TextField txtUf;
    @FXML
    private PasswordField senha;
    @FXML
    private PasswordField confirmarSenha;
    @FXML
    private ComboBox cbEsportePref;
    @FXML
    private ComboBox cbUnidadePref;
    @FXML
    private DatePicker dtNascimento;
    
    GerenciamentoUsuario gerUsuario = new GerenciamentoUsuario();

    public void confirmarCadastro() {
        Usuario usuario = new Usuario();
        
        usuario.propNome = txtNome.getText();
        usuario.propSobrenome = txtSobrenome.getText();
        usuario.propEmail = txtEmail.getText();
        usuario.propCidade = txtCidade.getText();
        usuario.propPais = txtPais.getText();
        usuario.propCpf = txtCpf.getText();
        usuario.propNomeMae = txtNomeMae.getText();
        usuario.propCep = txtCep.getText();
        usuario.propEndereco = txtEndereco.getText();
        usuario.propNumero = txtNumero.getText();
        usuario.propComplemento = txtComplemento.getText();
        usuario.propBairro = txtBairro.getText();
        usuario.propCidadeRes = txtCidadeRes.getText();
        usuario.propUf = txtUf.getText();
        usuario.propSenha = senha.getText();
        usuario.propConfirmarSenha = confirmarSenha.getText();
        usuario.dtNascimento = dtNascimento.getValue();
        gerUsuario.inserirUsuario(usuario);
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
