package ex02;

// IMPLEMENTACAO A SER CORRIGIDA
public class ContaComum extends ContaCorrente{
    public ContaComum(float val, int num, int pwd){
        super.setSaldo(val);
        super.setSenha(pwd);
        super.setNumConta(num);
        super.setEstado(pwd, 1);
    }

    public boolean debitaValor(float val, int pwd) {
        float saldoAtual = getSaldo(pwd);

        if(!(isSenha(pwd)))
            return (false); // senha deve ser válida
        if(getEstado(pwd) != 1)
            return (false); // conta deve ser ativa
        if(val <= 0)
            return (false); // val > 0
        if(val > saldoAtual)
            return (false);

        saldoAtual -= val;
        setSaldo(saldoAtual);

        if(saldoAtual == 0) setEstado(pwd, 2);// torna conta inativa
        return (true);
    }

    //correcao tbd
    public void debitaValor(float val) {
        saldo -= val;
    }

    //correcao tbd
    public void creditaValor(int pwd, float val) {
        if (senha == pwd)
            saldo += val;
    }

}
