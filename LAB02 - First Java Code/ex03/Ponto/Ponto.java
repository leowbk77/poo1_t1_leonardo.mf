package ex03.ponto;

public class Ponto {

    private float x;
    private float y;

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

    public void Ponto(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void Imprime_ponto(){
        System.out.print("(" + x + "," + y + ")");
    }

    public void Soma_ponto(Ponto pontoDois) {
        float somaDeX = x + pontoDois.getX();
        float somaDeY = y + pontoDois.getY();

        System.out.print("A soma de ");
        Imprime_ponto();
        System.out.print(" com ");
        pontoDois.Imprime_ponto();
        System.out.print(" é " + "(" + somaDeX + "," + somaDeY + ")\n");
    }

    public static void Soma_pontos(Ponto pontoUm, Ponto pontoDois, Ponto pontoTres){
        pontoTres.setX(pontoUm.getX() + pontoDois.getX());
        pontoTres.setY(pontoUm.getY() + pontoDois.getY());

        System.out.print("A soma de ");
        pontoUm.Imprime_ponto();
        System.out.print(" com ");
        pontoDois.Imprime_ponto();
        System.out.print(" é ");
        pontoTres.Imprime_ponto();
        System.out.print("\n");
    }

    public static void AreaDoRetangulo(Ponto pontoUm, Ponto pontoDois){
        float areaDoRetangulo = Math.abs(pontoUm.getX() - pontoDois.getX()) * Math.abs(pontoUm.getY() - pontoDois.getY());

        System.out.print("A área do retângulo definido por ");
        pontoUm.Imprime_ponto();
        System.out.print(" e ");
        pontoDois.Imprime_ponto();
        System.out.print(" é " + areaDoRetangulo);
    }

    public void MultPonto(float constante){
        x *= constante;
        y *= constante;
    }

    public void IncDir(char direcao){
        switch (direcao) {
            case 'n':
                y++;
                break;
            case 's':
                y--;
                break;
            case 'l':
                x++;
                break;
            case 'o':
                x--;
                break;
            default:
                break;
        }
    }

    public void IncDir(String direcao){
        if(direcao.equals("nordeste")){
            IncDir('n');
            IncDir('l');
        }else if(direcao.equals("sudeste")){
            IncDir('s');
            IncDir('l');
        }else if(direcao.equals("sudoeste")){
            IncDir('s');
            IncDir('o');
        }else if(direcao.equals("noroeste")){
            IncDir('n');
            IncDir('o');
        }
    }
}