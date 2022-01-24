public class Agencia {
    private String nomeDaAgencia;
    private String cidade;
    private String estado;

    public Agencia(String nome, String cidade, String estado){
        nomeDaAgencia = nome;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome(){
        return nomeDaAgencia;
    }

    public String getCidade(){
        return cidade;
    }

    public String getEstado(){
        return estado;
    }

    public void setNome(String nome){
        nomeDaAgencia = nome;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }
}
