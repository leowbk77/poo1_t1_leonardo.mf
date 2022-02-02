package Funcionario;

import java.util.Calendar;

public class Vendedor extends Funcionario{
    private float comissao; /* %%%  0.1 -> 10% das vendas */
    private float salarioFinal;

    public Vendedor(String nome, Calendar dataNascimento, float salarioBase, float comissao){
        super(nome, dataNascimento, salarioBase);
        this.comissao = comissao;
    }

    public void setComissao(float comissao){
        this.comissao = comissao;
    }

    public void Venda(float valorDaVenda){
        salarioFinal = super.salario + (comissao * valorDaVenda);
    }

    public float getSalario(){
        return salarioFinal;
    }
}
