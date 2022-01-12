package ex02.produto;

public class Produto {
    private int codigo;
    private String nome;
    private String fabricante;
    private float preco;

    public void Produto(int codigo, String nome, String fabricante, float preco){
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public int getCode(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public String getFab(){
        return fabricante;
    }

    public float preco(){
        return preco;
    }

    public void setCode(int cod){
        codigo = cod;
    }

    public void setNome(String name){
        nome = name;
    }

    public void setFab(String manft){
        fabricante = manft;
    }

    public void setPreco(float price){
        preco = price;
    }
}
