#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include "Tcustomer.h"

customer *create_customer(char *cpf, char *nome, char *dataNascimento, char *cep) {
    customer *p_customer = NULL;

    p_customer = malloc(sizeof(customer));

    if (p_customer != NULL) {
        strcpy(p_customer -> nome, nome);
        strcpy(p_customer -> cpf, cpf);
        strcpy(p_customer -> dataNascimento, dataNascimento);
        strcpy(p_customer -> cep, cep);
    }

    return p_customer;
}

void free_customer(customer *p_customer) {
    free(p_customer);
}