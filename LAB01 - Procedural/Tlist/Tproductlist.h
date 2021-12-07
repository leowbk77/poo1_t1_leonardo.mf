#ifndef _tproductlisth_
#define _tproductlisth_
#include "../Tproduct/Tproduct.h"

/*
*   DEFINES
*/

#define SUCCESS 0
#define INVALID_NULL_POINTER -1
#define OUT_OF_MEMORY -2
#define OUT_OF_RANGE -3
#define ELEM_NOT_FOUND -4

typedef struct productlist productlist;

/*
*   FUNCOES
*/

productlist *productList_create();

int list_free_product(productlist *list);

int push_product(productlist *list, product p_product);

int pop_product(productlist *list, product *p_product);

int list_print_product(productlist *list);

#endif