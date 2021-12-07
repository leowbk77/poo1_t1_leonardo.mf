#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include "Temployee.h"

employee *create_employee(char *cpf, char *nome, char *dataNascimento, char *dataIngresso) {
    employee *p_employee = NULL;

    p_employee = malloc(sizeof(employee));

    if (p_employee != NULL) {
        strcpy(p_employee -> nome, nome);
        strcpy(p_employee -> cpf, cpf);
        strcpy(p_employee -> dataNascimento, dataNascimento);
        strcpy(p_employee -> dataIngresso, dataIngresso);
    }

    return p_employee;
}

void print_employee(employee *p_employee) {
    printf("\nNome: %s\n", p_employee -> nome);
    printf("\nCPF: %s\n", p_employee -> cpf);
    printf("\nData de nascimento: %s\n", p_employee -> dataNascimento);
    printf("\nData de ingresso: %s\n\n", p_employee -> dataIngresso);
}

void free_employee(employee *p_employee) {
    free(p_employee);
}