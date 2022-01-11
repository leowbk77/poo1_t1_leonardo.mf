package com.pcf.clientes;

public class Cliente {
    private String cpf;
    private String nome;
    private String nascimento;
    private String cep;

    public void Cliente(String cpf, String nome, String nascimento, String cep){
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.cep = cep;
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

    public String getCep(){
        return cep;
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

    public void setCep(String cep){
        this.cep = cep;
    }
    
}
