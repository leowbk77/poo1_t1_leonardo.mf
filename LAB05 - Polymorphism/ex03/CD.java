package ex03;

public class CD extends Item{
    private String artista;

    public CD(String titulo, int tempo, String comentarios, String artista){
        super(titulo, tempo, comentarios);
        this.artista = artista;
    }

    public void print(){
        System.out.println("Artista: " + artista);
        super.print();
    }
}
