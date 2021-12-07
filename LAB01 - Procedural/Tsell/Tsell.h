#ifndef _tsellh_
#define _tsellh_

typedef struct sell sell;

struct sell{
    int codigo_produto;
    char cliente[50];
    char funcionario[50];
};

sell *create_sell(int cod_produto, char *cliente, char *funcionario);

void free_sell(sell *p_sell);

void print_sell(sell *p_sell);

#endif