package com.pcf;

public class PessoasEProdutos {
    public static void main(String[] argv){
        Cliente c1 = new Cliente("123.456.789-12", "Lorem Ipsum", "01/01/1999", "38308-308");
        Funcionario f1 = new Funcionario("321.654.987-21", "Dolor Sit", "02/01/1999", "83803-803");
        Produto p1 = new Produto(1, "produto1", "fabricante1", 12.5);

        System.out.println(p1.getNome() + " comprado por " + c1.getNome() + ", vendido por " + f1.getNome() + "");
    }
}
