package Objetos;

import java.time.LocalDate;

public class Usuario {

    public String propNome;
    public String propSobrenome;
    public String propEmail;
    public String propCidade;
    public String propPais;
    public String propCpf;
    public String propNomeMae;
    public String propCep;
    public String propEndereco;
    public String propNumero;
    public String propComplemento;
    public String propBairro;
    public String propCidadeRes;
    public String propUf;
    public String propSenha;
    public String propConfirmarSenha;
    public String esportePref;
    public String unidadePref;
    public LocalDate dtNascimento;
    public String Sexo;

    public Usuario() {
    }

    public Usuario(String propNome, String propSobrenome, String propEmail, String propCidade, String propPais, String propCpf, String propNomeMae, String propCep, String propEndereco, String propNumero, String propComplemento, String propBairro, String propCidadeRes, String propUf, String propSenha, String propConfirmarSenha, String esportePref, String unidadePref, LocalDate dtNascimento) {
        this.propNome = propNome;
        this.propSobrenome = propSobrenome;
        this.propEmail = propEmail;
        this.propCidade = propCidade;
        this.propPais = propPais;
        this.propCpf = propCpf;
        this.propNomeMae = propNomeMae;
        this.propCep = propCep;
        this.propEndereco = propEndereco;
        this.propNumero = propNumero;
        this.propComplemento = propComplemento;
        this.propBairro = propBairro;
        this.propCidadeRes = propCidadeRes;
        this.propUf = propUf;
        this.propSenha = propSenha;
        this.propConfirmarSenha = propConfirmarSenha;
        this.esportePref = esportePref;
        this.unidadePref = unidadePref;
        this.dtNascimento = dtNascimento;
    }

}
