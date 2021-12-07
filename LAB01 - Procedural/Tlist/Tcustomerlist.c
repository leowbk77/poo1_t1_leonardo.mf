#include "Tcustomerlist.h"
#include <stdlib.h>
#include <stdio.h>

typedef struct list_node node;

struct customerlist {
    node *head;
    node *end;
};

struct list_node {
    customer customer;
    node *next;
};

customerlist *customerList_create() {
    customerlist *list; 
    
    list = malloc(sizeof(customerlist));
    if (list != NULL) {
        list -> head = NULL;
        list -> end = NULL;
    }

    return list;
}

int list_free(customerlist *list) {
    if (list == NULL) {
        return INVALID_NULL_POINTER;
    }

    node *aux;
    aux = list -> head;

    while (aux != NULL) {
        aux = aux -> next;

        free(list -> head);

        list -> head = aux;
    }

    free(list);
    return SUCCESS;
}

int push(customerlist *list, customer p_customer) {
    if (list == NULL) {
        return INVALID_NULL_POINTER;
    }

    node *node_data;
    node_data = malloc(sizeof(node));
    if (node_data == NULL) {
        return OUT_OF_MEMORY;
    }

    node_data -> customer = p_customer; 
    
    if (list -> head == NULL) {
        list -> head = node_data;
        list -> end = node_data;
        node_data -> next = NULL;

        return SUCCESS;
    }

    (list -> end) -> next = node_data;
    list -> end = node_data;
    node_data -> next = NULL;

    return SUCCESS;
}