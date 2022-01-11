package com.banco.account;

public class Conta {
    private double saldo;
    private double limite;

    public void Conta(){
        saldo = 0;
        limite = 0;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getLimite(){
        return limite;
    }

}
