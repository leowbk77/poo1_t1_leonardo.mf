package Forma;

public class FormaBidimensional extends Forma{
    protected float x;
    protected float y;

    public FormaBidimensional(float x, float y){
        super();
        this.x = x;
        this.y = y;
    }

    // ??
    protected void setX(float x){
        this.x = x;
    }

    // ??
    protected void setY(float y){
        this.y = y;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

}
