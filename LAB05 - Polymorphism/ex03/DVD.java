package ex03;

public class DVD extends Item{
    private String diretor;

    public DVD(String titulo, int tempo, String comentarios, String diretor){
        super(titulo, tempo, comentarios);
        this.diretor = diretor;
    }

    public void print(){
        System.out.println("Diretor: " + diretor);
        super.print();
    }
}
