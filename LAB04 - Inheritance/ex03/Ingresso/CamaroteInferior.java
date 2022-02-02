package Ingresso;

public class CamaroteInferior extends Vip{
    private String localizacao;

    public CamaroteInferior(float valorDoIngresso , String localizacao){
        super(valorDoIngresso, 0);
        this.localizacao = localizacao;
    }

    public void localiza(){
        System.out.println(localizacao);
    }

}
