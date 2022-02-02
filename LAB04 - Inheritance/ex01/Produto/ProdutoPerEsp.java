package Produto;

import java.util.Calendar;

public class ProdutoPerEsp extends ProdutoPerecivel {
    public ProdutoPerEsp(String _codigo, String _descricao, int _quantidade, Calendar _validade){
        super(_codigo, _descricao, _quantidade, _validade);
    }

    public void impressao(){
        System.out.println("Codigo: " + super.codigo + "\nDescricao: " + super.descricao);
        printValidade();
    }
}
