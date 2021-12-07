#include "Tsellinglist.h"
#include <stdlib.h>
#include <stdio.h>

typedef struct list_node node;

struct sellinglist{
    node *head;
    node *end;
}

struct list_node {
    sell sell;
    node *next;
};

sellinglist *sellinglist_create(){
    sellinglist *venda = NULL;

    venda = malloc(sizeof(sellinglist));

    if(venda != NULL){
        venda->head = NULL;
        venda->end = NULL;
    }
    return venda;
}

int list_free_sell(sellinglist *list){
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

int push_sell(sellinglist *list, sell p_sell){
    if(list == NULL) return INVALID_NULL_POINTER;

    node *selling_node = malloc(sizeof(node));
    if(selling_node == NULL) return OUT_OF_MEMORY;

    selling_node->sell = p_sell;
    selling_node->next = NULL;

    if(list->head == NULL){
        list->head = selling_node;
        list->end = selling_node;
        return SUCCESS;
    }

    list->end->next = selling_node;
    list->end = selling_node;
    return SUCCESS;
}

int pop_sell(sellinglist *list, sell *p_sell){
    if(list == NULL) return INVALID_NULL_POINTER;
    if(list->head == NULL) return ELEM_NOT_FOUND;

    *p_sell = list->end->sell;

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