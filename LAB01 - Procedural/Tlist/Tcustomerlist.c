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

int pop(customerlist *list, customer *p_customer) {
    if (list == NULL) {
        return INVALID_NULL_POINTER;
    }

    if (list -> head == NULL) {
        return ELEM_NOT_FOUND;
    }

    *p_customer = (list -> end) -> customer;

    node *aux;
    aux = list -> head;

    if (aux -> next == NULL) {
        free(aux);
        list -> head = NULL;
        list -> end = NULL;

        return SUCCESS;
    }

    while (aux -> next != list -> end) {
        aux = aux -> next;
    }

    aux -> next = NULL;
    free(list -> end);
    list -> end = aux;

    return SUCCESS;
}

int list_print(customerlist *list) {
    if (list == NULL) return INVALID_NULL_POINTER;

    node *aux;
    aux = list -> head;

    while (aux != NULL) {
        printf("Nome: %s\n", aux -> customer.nome);
        printf("CPF: %s\n", aux -> customer.cpf);
        printf("Data de nascimento: %s\n", aux -> customer.dataNascimento);
        printf("CEP: %s\n\n", aux -> customer.cep);
        aux = aux -> next;
    }

    return SUCCESS;
}