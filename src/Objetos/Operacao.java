
package Objetos;

import java.time.LocalDate;


public class Operacao {
    
    public Usuario usuario;
    public LocalDate data;
    public String unidade;

    public Operacao() {
    }

    public Operacao(Usuario usuario, LocalDate data, String unidade) {
        this.usuario = usuario;
        this.data = data;
        this.unidade = unidade;
    }
    
    
}
