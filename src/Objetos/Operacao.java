
package Objetos;

import java.util.Date;

public class Operacao {
    
    public Integer id;
    public Usuario usuario;
    public Date dataInicial;
    public String unidade;

    public Operacao() {
    }

    public Operacao(Integer id, Usuario usuario, Date dataInicial, String unidade) {
        this.id = id;
        this.usuario = usuario;
        this.dataInicial = dataInicial;
        this.unidade = unidade;
    }
    
    
}
