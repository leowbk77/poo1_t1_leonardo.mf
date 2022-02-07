package Forma;

import Forma.FormaTridimensional;

public class Esfera extends FormaTridimensional{
    private float raio;

    public Esfera(float raio){
        super(raio * 2, raio * 2, raio * 2);
        this.raio = raio;
        setArea(4 * (3.1415f * (raio * raio)));
        setVolume((4/3) * (3.1415f * (raio * raio *raio)));
    }

    public void setRaio(float raio){
        super.x = raio * 2;
        super.y = raio * 2;
        super.z = raio * 2;
        setArea(4 * (3.1415f * (raio * raio)));
        setVolume((4/3) * (3.1415f * (raio * raio *raio)));
    }

    public float obterArea(){
        return getArea();
    }

    public float obterVolume(){
        return getVolume();
    }
}
