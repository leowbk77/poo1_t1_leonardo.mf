#ifndef _vendas_
#define _vendas_

typedef struct Venda venda;

struct Venda{
    int numeroDeProdutos;
    int *produto_codigos;
    int funcionario_id;
    int cliente_id;
    float valor_total;
};

#endif