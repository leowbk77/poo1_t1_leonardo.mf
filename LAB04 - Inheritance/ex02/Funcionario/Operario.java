package Funcionario;

import java.util.Calendar;

// needs more work
public class Operario extends Funcionario{
    private float valorPorProducao;
    private int quantidadeProduzida;

    public Operario(String nome, Calendar dataNascimento, float valorPorProducao){
        super(nome, dataNascimento, 0);
        this.valorPorProducao = valorPorProducao;
        this.quantidadeProduzida = 0;
    }

    public void setQntProduzida(int quantidadeProduzida){
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public float getSalario(){
        return quantidadeProduzida * valorPorProducao;
    }

}
