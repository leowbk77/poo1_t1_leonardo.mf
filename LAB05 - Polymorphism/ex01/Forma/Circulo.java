package Forma;

import Forma.FormaBidimensional;

public class Circulo extends FormaBidimensional{
    private float raio;

    public Circulo(float raio){
        super(raio * 2, raio * 2);
        this.raio = raio;
        setArea(3.1415f * (raio * raio));
    }

    public void setRaio(float raio){
        super.x = raio * 2;
        super.y = raio * 2;
        this.raio = raio;
        setArea(3.1415f * (raio * raio));
    }

    public float obterArea(){
        return getArea();
    }
}
