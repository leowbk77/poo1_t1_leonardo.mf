package Forma;

import Forma.FormaBidimensional;

public class Triangulo extends FormaBidimensional{
    public Triangulo(float base, float altura){
        super(base, altura); // x - base, y - altura
        setArea(base * altura);
    }

    public void setBase(float base){
        super.x = base;
        setArea(base * super.y);
    }

    public void setAltura(float altura){
        super.y = altura;
        setArea(altura * super.x);
    }

    public float obterArea(){
        return getArea();
    }
}
