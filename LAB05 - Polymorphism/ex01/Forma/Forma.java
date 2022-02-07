package Forma;

public class Forma {
    private float area;
    private float volume;

    public Forma(){
        area = 0.0f;
        volume = 0.0f;
    }

    protected void setArea(float area){
        this.area = area;
    }

    protected void setVolume(float volume){
        this.volume = volume;
    }

    protected float getArea(){
        return area;
    }

    protected float getVolume(){
        return volume;
    }
}
