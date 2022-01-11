package com.bancov1.account;

public class Conta_v1 {
    private double saldo;
    private double limite;

    public void Conta_v1(){}

    public void Sacar(double saque){
        if(saldo + limite >= saque){
            saldo -= saque;
        }
    }

    public void Depositar(double deposito){
        saldo += deposito;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getLimite(){
        return limite;
    }

    public void setLimtie(double novoLimite){
        limite = novoLimite;
    }
}
