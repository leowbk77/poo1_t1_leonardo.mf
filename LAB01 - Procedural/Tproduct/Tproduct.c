#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include "Tproduct.h"

product *create_product(int cod, float val, char *nome, char *fab){
    product *p_product = malloc(sizeof(product));

    if(p_product != NULL){
        p_product->codigo = cod;
        p_product->valor = val;
        strcpy(p_product->nome, nome);
        strcpy(p_product->fabricante, fab);
    }

    return p_product;
}

void free_product(product *p_product){
    free(p_product);
}

void print_product(product *p_product){
    printf("Codigo: %d\n", p_product->codigo);
    printf("Nome: %s\n", p_product->nome);
    printf("fabricante: %s\n", p_product->fabricante);
    printf("preco: %f\n\n", p_product->valor);
}