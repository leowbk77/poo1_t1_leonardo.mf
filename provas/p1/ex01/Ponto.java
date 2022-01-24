public class Ponto {
    private float x;
    private float y;
    
    public Ponto(){
        x = 0;
        y = 0;
    }

    public Ponto(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public void setX(float x){
        this.x = x;
    }

    public void setY(float y){
        this.y = y;
    }

    public void Imprime_ponto(){
        System.out.print("(" + x + "," + y + ")");
    }

}
