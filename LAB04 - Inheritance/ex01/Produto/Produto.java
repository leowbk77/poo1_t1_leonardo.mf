package Produto;

public class Produto{
    protected String codigo;
    protected String descricao;
    protected int quantidade;

    public Produto(String codigo, String descricao, int quantidade){
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getDescricao(){
        return descricao;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public int retiraEstoque(int remove){
        if(quantidade >= remove){
            quantidade = quantidade - remove;
            return remove;
        }
        else{
            int valorInicial = quantidade;
            quantidade = 0;
            return valorInicial;
        }
    }

    public void acresceEstoque(int adiciona){
        quantidade = quantidade + adiciona;
    }

}