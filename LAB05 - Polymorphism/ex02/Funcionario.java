package ex02;

public class Funcionario extends Pessoa{
    protected int matricula;
    protected float salarioBase;

    public Funcionario(String n, String CPF, String RG, int idade, int mat) {
        super(n, CPF, RG, idade);
        matricula = mat;
        salarioBase = 1000;
    }

    public float calculaSalario(){
        return salarioBase;
    }
}
