package com.banco.main;

import com.banco.account;

public class Banco_v0 {
    public static void main(String[] argv){
        Conta acc = new Conta();

        acc.setSaldo(1000);
        acc.setLimite(1000);

        System.out.println("O limite da conta eh " + acc.getLimite() + "");
        System.out.println("O saldo da conta eh " + acc.getSaldo() + "");
    }
}
