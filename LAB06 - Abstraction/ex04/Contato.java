package ex04;

import java.util.Calendar;

public abstract class Contato {
    protected String apelido;
    protected String nome;
    protected String email;
    protected Calendar aniversario;
    
    public String imprimirBasico(){
        return (nome + " \"" + apelido + "\"");
    }

    public abstract void imprimirContato();

}
