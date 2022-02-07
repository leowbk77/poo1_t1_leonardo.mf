package Forma;

public class Cubo extends FormaTridimensional{
    public Cubo(float lado){
        super(lado, lado, lado);
        setArea(6 * (lado * lado));
        setVolume(lado * lado * lado);
    }

    public void setLado(float lado){    
        super.x = lado;
        super.y = lado;
        super.z = lado;

        setArea(6 * (lado * lado));
        setVolume(lado * lado * lado);
    }
    
    public float obterArea(){
        return getArea();
    }

    public float obterVolume(){
        return getVolume();
    }
}
