package ex03;

public class Item {
    private String titulo;
    private int tempoDuracao;
    private String comentarios;

    public Item(String titulo, int tempo, String comentarios){
        this.titulo = titulo;
        tempoDuracao = tempo;
        this.comentarios = comentarios;
    }

    public void print(){
        System.out.println(titulo + " duracao: " + tempoDuracao);
        System.out.println(comentarios);
    }
}
