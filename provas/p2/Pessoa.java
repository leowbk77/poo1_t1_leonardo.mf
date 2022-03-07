public abstract class Pessoa {
    protected boolean vacinado;

    public void setVax(boolean isVax){
        vacinado = isVax;
    }

    public abstract void gerarCertificado();
}
