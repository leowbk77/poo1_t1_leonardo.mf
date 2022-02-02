package Produto;

public class ProdutoComPreco extends Produto{
    protected float preco;

    public ProdutoComPreco(String codigo, String descricao, int quantidade, float preco){
        super(codigo, descricao, quantidade);
        this.preco = preco;
    }

    public void setPreco(float preco){
        this.preco = Math.abs(preco);
    }

    public float getPreco(){
        return preco;
    }
}
