package com.veiculo.vehicle;

public class Veiculo {
    private String marca;
    private String placa;
    private int kilometragem;

    public void Veiculo(String m, String p, int km){
        marca = m;
        placa = p;
        kilometragem = km;
    }

    public String getMarca(){
        return marca;
    }

    public String getPlaca(){
        return placa;
    }

    public int getKM(){
        return kilometragem;
    }

    public void setKM(int km){
        kilometragem = km;
    }
}
