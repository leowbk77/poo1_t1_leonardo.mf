#include "Tproductlist.h"
#include <stdlib.h>
#include <stdio.h>

typedef struct list_node node;

struct productlist{
    node *head;
    node *end;
};

struct list_node {
    product product;
    node *next;
};

productlist *productList_create(){
    productlist *lista = NULL;

    lista = malloc(sizeof(productlist));

    if(lista != NULL){
        lista->head = NULL;
        lista->end = NULL;
    }
    return lista;
}

int list_free_product(productlist *list){
    if(list == NULL) return INVALID_NULL_POINTER;

    node *aux = list->head;

    while(aux != NULL){
        aux = aux->next;
        free(list->head);
        list->head = aux;
    }

    free(list);
    return SUCCESS;
}

int push_product(productlist *list, product p_product){
    if(list == NULL) return INVALID_NULL_POINTER;

    node *product_node = malloc(sizeof(node));
    if(product_node == NULL) return OUT_OF_MEMORY;

    product_node->product = p_product;
    product_node->next = NULL;

    if(list->head == NULL){
        list->head = product_node;
        list->end = product_node;
        return SUCCESS;
    }

    list->end->next = product_node;
    list->end = product_node;
    return SUCCESS;
}

int pop_product(productlist *list, product *p_product){
    if(list == NULL) return INVALID_NULL_POINTER;
    if(list->head == NULL) return ELEM_NOT_FOUND;

    *p_product = list->end->product;

    node *aux = NULL;
    aux = list->head;

    if(aux->next == NULL){
        free(aux);
        list->head = NULL;
        list->end = NULL;
        return SUCCESS;
    }

    while(aux->next != list->end){
        aux = aux->next;
    }

    aux->next = NULL;
    free(list->end);
    list->end = aux;
    return SUCCESS;
}

int list_print_product(productlist *list){
    if(list == NULL) return INVALID_NULL_POINTER;

    node *aux = list->head;

    while(aux != NULL){
        printf("Codigo: %d\n", aux->product.codigo);
        printf("Nome: %s\n", aux->product.nome);
        printf("fabricante: %s\n", aux->product.fabricante);
        printf("preco: %f\n\n", aux->product.valor);
        aux = aux -> next;
    }

    return SUCCESS;
}