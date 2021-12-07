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

void print_customer(customer *p_customer) {
    printf("\nNome: %s\n", p_customer -> nome);
    printf("\nCPF: %s\n", p_customer -> cpf);
    printf("\nData de nascimento: %s\n", p_customer -> dataNascimento);
    printf("\nCEP: %s\n\n", p_customer -> cep);
}

void free_customer(customer *p_customer) {
    free(p_customer);
}