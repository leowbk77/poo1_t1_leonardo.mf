package Forma;

import Forma.FormaBidimensional;

public class Quadrado extends FormaBidimensional{
    public Quadrado(float lado){
        super(lado,lado);
        setArea(lado * lado);
    }

    public void setLado(float lado){
        super.x = lado;
        super.y = lado;

        super.setArea(lado * lado);
    }

    public float obterArea(){
        return getArea();
    }
}
