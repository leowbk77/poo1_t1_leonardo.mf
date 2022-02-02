package Ingresso;

public class CamaroteSuperior extends Vip{
    private String localizacao;

    public CamaroteSuperior(float valorDoIngresso, float valorAdicional, String localizacao){
        super(valorDoIngresso, valorAdicional);
        this.localizacao = localizacao;
    }

    public void localiza(){
        System.out.println(localizacao);
    }

    public void setAdicional(float adicional){
        super.valAdicional = adicional;
    }
}
