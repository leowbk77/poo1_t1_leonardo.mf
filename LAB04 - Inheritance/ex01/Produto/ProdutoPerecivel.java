package Produto;

import java.util.Calendar;

public class ProdutoPerecivel extends Produto{
    private Calendar validade;

    public ProdutoPerecivel(String codigo, String descricao, int quantidade, Calendar validade){
        super(codigo, descricao, quantidade);
        this.validade = validade;
    }

    public int retiraEstoque(int remove, Calendar dia_corrente){
        if(/* validade.get(Calendar.MONTH) > (dia_corrente.get(Calendar.MONTH) + 2) */){ // se a data corrente > 2 meses da validade, zerar o estoque (?)
            quantidade = 0;
            return quantidade;
        }else if(quantidade >= remove){
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
        if(quantidade == 0){
            quantidade = adiciona;
        }
    }

    public void printValidade(){
        System.out.println("Validade: " + validade.get(Calendar.DAY_OF_WEEK) + "/" + validade.get(Calendar.MONTH) + "/" + validade.get(Calendar.YEAR));
    }

}
