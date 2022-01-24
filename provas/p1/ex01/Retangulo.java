import java.util.Scanner;
import java.lang.Math;

public class Retangulo {
    private Ponto p1;
    private Ponto p2;

    public Retangulo(){
        p1 = new Ponto();
        p2 = new Ponto();
    }

    public Retangulo(float x1, float y1, float x2, float y2){
        p1 = new Ponto(x1, y1);
        p2 = new Ponto(x2, y2);
    }

    public void setP1(float x, float y){
        p1.setX(x);
        p1.setY(y);
    }

    public void setP2(float x, float y){
        p2.setX(x);
        p2.setY(y);
    }

    public void AreaDoRetangulo(){
        float areaDoRetangulo = Math.abs(p1.getX() - p1.getX()) * Math.abs(p2.getY() - p2.getY());

        System.out.print("A área do retângulo definido por ");
        p1.Imprime_ponto();
        System.out.print(" e ");
        p2.Imprime_ponto();
        System.out.print(" é " + areaDoRetangulo);
    }

    public float AreaDoRetanguloB(){
        float areaDoRetangulo = Math.abs(p1.getX() - p1.getX()) * Math.abs(p2.getY() - p2.getY());
        return areaDoRetangulo;
    }

    public static void main(String[] argv) {
        // A

        Scanner scanf = new Scanner(System.in);
        Retangulo a = new Retangulo();
        float x1, y1, x2, y2;

        System.out.println("Informe os pontos que definem o retangulo:\nx1 y1:");
        x1 = scanf.nextFloat();
        y1 = scanf.nextFloat();
        System.out.println("Informe os pontos que definem o retangulo:\nx2 y2:");
        x2 = scanf.nextFloat();
        y2 = scanf.nextFloat();

        a.AreaDoRetangulo();

        // B
        System.out.println("Quantos retangulos deseja criar? ");
        int retQnt = scanf.nextInt();
        Retangulo[] ret = new Retangulo[retQnt];

        for(int i = 0; i < retQnt; i++){
            System.out.println("Informe os pontos que definem o retangulo " + (i+1) + ":\nx1 y1:");
            x1 = scanf.nextFloat();
            y1 = scanf.nextFloat();
            System.out.println("Informe os pontos que definem o retangulo" + (i+1) + ":\nx2 y2:");
            x2 = scanf.nextFloat();
            y2 = scanf.nextFloat();
            ret[i].setP1(x1, y1);
            ret[i].setP2(x2, y2);
        }

        float maior = ret[0].AreaDoRetanguloB();
        for(int i = 1; i < retQnt; i++){
            float atual = ret[i].AreaDoRetanguloB();
            if(maior < atual){
                maior = atual;
            }
        }

        System.out.println("O retangulo de maior area possui area: " + maior);
    }
}
