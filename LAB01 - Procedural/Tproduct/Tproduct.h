#ifndef _tproducth_
#define _tproducth_

typedef struct product product;

struct product{
    int codigo;
    float valor;
    char nome[20];
    char fabricante[20];
};

product *create_product(int cod, float val, char *nome, char *fab);

void free_product(product *p_product);

void print_product(product *p_product);

#endif