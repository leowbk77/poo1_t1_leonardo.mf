package Forma;

public class FormaTridimensional extends Forma{
    protected float x;
    protected float y;
    protected float z;

    public FormaTridimensional(float x, float y, float z){
        super();
        this.x = x; 
        this.y = y;
        this.z = z;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public float getZ(){
        return z;
    }

}
