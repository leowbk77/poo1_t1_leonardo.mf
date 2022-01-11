package com.veiculo.main;

import com.veiculo.vehicle;

public class AcessaCarro {
    public static void main(String[] argv){
        Veiculo carro = new Veiculo("Volkswagen", "EOQ-1234", 200000);
        System.out.println(carro.getMarca() + " " + carro.getPlaca() + " " + carro.getKM + "");
    }
}
