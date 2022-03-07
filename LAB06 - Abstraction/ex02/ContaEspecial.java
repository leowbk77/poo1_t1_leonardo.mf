package ex02;

//correcao tbd
public class ContaEspecial extends ContaCorrente{
    private float limite;

    public ContaEspecial(float val, int num, int pwd, float lim){
        super.setSaldo(val);
        super.setSenha(pwd);
        super.setNumConta(num);
        super.setEstado(pwd, 1);
        limite = lim;
    }

    public void verificaLimite(ContaCorrente conta, int pwd){
        if(limite == 0 && isSenha(pwd)){
            conta = new ContaComum(super.getSaldo(pwd), super.getNumConta(pwd), pwd);
        }
    }


}
