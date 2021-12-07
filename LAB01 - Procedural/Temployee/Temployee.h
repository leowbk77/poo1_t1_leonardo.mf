#ifndef _temployeeh_
#define _temployeeh_

typedef struct employee employee;

struct employee {
    char cpf[14];
    char nome[50];
    char dataNascimento[20];
    char dataIngresso[20];
};

employee *create_employee(char *cpf, char *nome, char *dataNascimento, char *dataIngresso);

// printa o customer para debugs
void print_employee(employee *p_employee);

// libera espaco alocado para o customer
void free_employee(employee *p_employee);

#endif