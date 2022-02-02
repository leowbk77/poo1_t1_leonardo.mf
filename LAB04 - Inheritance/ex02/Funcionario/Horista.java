package Funcionario;

import java.util.Calendar;

public class Horista extends Funcionario{
    private float valorDaHora;
    private float horasTrabalhadas;

    public Horista(String nome, Calendar dataNascimento, float valorDaHora){
        super(nome, dataNascimento, 0);
        this.valorDaHora = valorDaHora;
    }

    public void setValorHora(float valorDaHora){
        this.valorDaHora = valorDaHora;
    }

    public void setHorasTrabalhadas(float tempoDeTrabalho){
        horasTrabalhadas = tempoDeTrabalho;
    }

    public float getSalario(){
        return valorDaHora * horasTrabalhadas;
    }
}
