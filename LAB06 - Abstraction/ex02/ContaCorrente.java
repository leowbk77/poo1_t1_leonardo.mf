package ex02;

public abstract class ContaCorrente {
    private float saldo;
    private int estado; // 1= conta ativa 2= conta inativa
    private int numConta;
    private int senha;

    protected void setSaldo(float saldo){
        this.saldo = saldo;
    }

    protected void setEstado(int pwd, int e){
        if (senha == pwd)
            estado = e;
    }

    protected void setNumConta(int numConta){
        this.numConta = numConta;
    }

    protected void setSenha(int senha){
        this.senha = senha;
    }

    protected boolean isSenha(int pwd){
        if(senha == pwd)
            return true;
        else
            return false;
    }

    public float getSaldo(int pwd){
        if (senha == pwd)
            return saldo;
        else
            return -1; // erro na senha
    }
    
    protected int getEstado(int pwd) {
        if (senha == pwd)
            return estado;
        else
            return -1; // erro na senha
    }

    public abstract boolean debitaValor(float val, int pwd);
    public abstract void debitaValor(float val);
    public abstract void creditaValor(int pwd, float val);
}