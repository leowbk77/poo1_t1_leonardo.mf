public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String nascimento;
    private String endereco;
    private String cidade;
    private String estado;
    private boolean c_corrente;
    private Gerente gerente;

    public Cliente(int id, String nome, String cpf, String nascimento, String endereco, String cidade, String estado, boolean c_corrente, Gerente gerente){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.c_corrente = c_corrente;
        this.gerente = gerente;
    }

    public int getID(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getCPF(){
        return cpf;
    }

    public String getNascimento(){
        return nascimento;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getCidade(){
        return cidade;
    }

    public String getEstado(){
        return estado;
    }

    public Gerente getGerente(){
        return gerente;
    }

    public boolean isCC(){
        return c_corrente;
    }

    public void setID(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public void setNascimento(String nascimento){
        this.nascimento = nascimento;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public void setCC(boolean is_cc){
        c_corrente = is_cc;
    }

    public void setGerente(Gerente gerente){
        this.gerente = gerente;
    }

}
