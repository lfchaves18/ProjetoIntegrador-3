/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerenciamento;

import Objetos.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Lucas Filipe
 */
public class GerenciamentoUsuario {
     List<Usuario> listUsuario = new ArrayList<Usuario>();
    
    public void inserirUsuario (Usuario usuario) {
        
        listUsuario.add(usuario);
        
  
    }
    
    public static void inserir(Usuario usuario) throws Exception {
    //Monta a string de inserção de um cliente no BD,
        //utilizando os dados do clientes passados como parâmetro
        String sql = "INSERT INTO cadastro_de_usuarios (NOME,SOBRENOME, EMAIL, SENHA, SEXO, CIDADE_NASC , "
                + "UF_NASC, DATA_NASC, CPF, NOME_MAE, ESPORTE_FAVORITO, UNIDADE_FAVORITA, CEP, ENDERECO, COMPLEMENTO,"
                + "NUMERO_ENDE, BAIRRO, CIDADE, SITUACAO_CADASTRO) "
                + " VALUES (?, ?, ?, ?, ?, ?,?,?,?,?, ?, ?, ?, ?, ?,?,?,?, ?)";

        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão e execução de
        //comandos SQL
        PreparedStatement preparedStatement = null;
        //Abre uma conexão com o banco de dados
        connection = ConnectionUtils.getConnection();
        //Cria um statement para execução de instruções SQL
        preparedStatement = connection.prepareStatement(sql);
        //Configura os parâmetros do "PreparedStatement"
       
        
        preparedStatement.setString(1, usuario.propNome);
        preparedStatement.setString(2, usuario.propSobrenome);
        preparedStatement.setString(3, usuario.propEmail);
        preparedStatement.setString(4, usuario.propSenha);
        preparedStatement.setString(5, usuario.Sexo);
        preparedStatement.setString(6, usuario.propCidadeRes);
        preparedStatement.setString(7, usuario.propPais);
        
        System.out.println(usuario.dtNascimento);
        
        String data = (usuario.dtNascimento).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        preparedStatement.setString(8, data);
        preparedStatement.setString(9,usuario.propCpf);
        preparedStatement.setString(10,usuario.propNomeMae);
        preparedStatement.setString(11,usuario.esportePref);
        preparedStatement.setString(12, usuario.unidadePref);
        preparedStatement.setString(13,usuario.propCep);
        preparedStatement.setString(14,usuario.propEndereco);
        preparedStatement.setString(15,usuario.propComplemento);
        preparedStatement.setString(16,usuario.propNumero);
        preparedStatement.setString(17,usuario.propBairro);
        preparedStatement.setString(18,usuario.propCidade);
        preparedStatement.setString(19,"1");
        
        //Executa   preparedStatement.setString(18,usuario.propCidade);o comando no banco de dados
        preparedStatement.execute();

        //Fecha o statement
        preparedStatement.close();

        //Fecha a conexão
        connection.close();
    }

    
    
    
}
