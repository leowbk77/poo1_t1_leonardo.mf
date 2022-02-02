package Funcionario;

import java.util.Calendar;

public class Funcionario {
    private String nome;
    private Calendar dataNascimento;
    protected float salario;

    public Funcionario(String nome, Calendar dataNascimento, float salario){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public float getSalario(){
        return salario;
    }

    public Calendar getNascimento(){
        return dataNascimento;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }

    public void setSalario(float novoSalario){
        salario = novoSalario;
    }

    public void setNascimento(Calendar data){
        dataNascimento = data;
    }

}
