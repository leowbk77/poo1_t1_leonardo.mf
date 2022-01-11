package com.bancov1.main;

import com.bancov1.account;

public class Banco_v1 {
    public static void main(String[] argv){
        Conta_v1 acc = new Conta_v1();

        acc.setLimite(500);
        acc.Depositar(300);

        acc.Sacar(200);

        System.out.println("O saldo eh " + acc.getSaldo() + "");
    }
}
