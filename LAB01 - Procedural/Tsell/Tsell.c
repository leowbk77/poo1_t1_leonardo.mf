#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include "Tsell.h"

sell *create_sell(int cod_produto, char *cliente, char *funcionario){
    sell *p_sell = malloc(sizeof(sell));

    if(p_sell != NULL){
        p_sell->codigo_produto = cod_produto;
        strcpy(p_sell->cliente, cliente);
        strcpy(p_sell->funcionario, funcionario);
    }

    return p_sell;
}

void free_sell(sell *p_sell){
    free(p_sell);
}

void print_sell(sell *p_sell){
    printf("Codigo: %d\n", p_sell->codigo_produto);
    printf("Cliente: %s\n", p_sell->cliente);
    printf("fabricante: %s\n", p_sell->funcionario);
}