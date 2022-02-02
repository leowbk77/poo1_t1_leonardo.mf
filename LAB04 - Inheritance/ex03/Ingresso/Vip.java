package Ingresso;

public class Vip extends Ingresso{
    protected float valAdicional;

    public Vip(float valorBase, float valAdicional){
        super(valorBase);
        this.valAdicional = valAdicional;
    }

    public void setAdicional(float adicional){
        valAdicional = adicional;
    }

    public float getValor(){
        return super.valor + valAdicional;
    }

}
