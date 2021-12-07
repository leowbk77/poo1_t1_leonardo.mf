#include "Temployeelist.h"
#include <stdlib.h>
#include <stdio.h>

typedef struct list_node node;

struct employeelist {
    node *head;
    node *end;
};

struct list_node {
    employee employee;
    node *next;
};

employeelist *employeeList_create() {
    employeelist *list; 
    
    list = malloc(sizeof(employeelist));
    if (list != NULL) {
        list -> head = NULL;
        list -> end = NULL;
    }

    return list;
}

int list_free_employee(employeelist *list) {
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

int push_employee(employeelist *list, employee p_employee) {
    if (list == NULL) {
        return INVALID_NULL_POINTER;
    }

    node *node_data;
    node_data = malloc(sizeof(node));
    if (node_data == NULL) {
        return OUT_OF_MEMORY;
    }

    node_data -> employee = p_employee; 
    
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

int pop_employee(employeelist *list, employee *p_employee) {
    if (list == NULL) {
        return INVALID_NULL_POINTER;
    }

    if (list -> head == NULL) {
        return ELEM_NOT_FOUND;
    }

    *p_employee = (list -> end) -> employee;

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

int list_print_employee(employeelist *list) {
    if (list == NULL) return INVALID_NULL_POINTER;

    node *aux;
    aux = list -> head;

    while (aux != NULL) {
        printf("Nome: %s\n", aux -> employee.nome);
        printf("CPF: %s\n", aux -> employee.cpf);
        printf("Data de nascimento: %s\n", aux -> employee.dataNascimento);
        printf("Data de ingresso: %s\n\n", aux -> employee.dataIngresso);
        aux = aux -> next;
    }

    return SUCCESS;
}