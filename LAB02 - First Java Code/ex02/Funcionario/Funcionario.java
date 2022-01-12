package ex02.funcionario;

public class Funcionario {
    private String cpf;
    private String nome;
    private String nascimento;
    private String ingresso;

    public void Funcionario(String cpf, String nome, String nascimento, String ingresso){
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.ingresso = ingresso;
    }

    public String getCpf(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getNascimento(){
        return nascimento;
    }

    public String getIngresso(){
        return ingresso;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNascimento(String nascimento){
        this.nascimento = nascimento;
    }

    public void setIngresso(String ingresso){
        this.ingresso = ingresso;
    }
}
