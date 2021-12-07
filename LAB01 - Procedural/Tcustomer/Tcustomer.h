#ifndef _tcustomerh_
#define _tcustomerh_

typedef struct customer customer;

struct customer {
    char cpf[14];
    char nome[50];
    char dataNascimento[20];
    char cep[20];
};

customer *create_customer(char *cpf, char *nome, char *dataNascimento, char *cep);

// printa o customer para debugs
void print_customer(customer *p_customer);

// libera espaco alocado para o customer
void free_customer(customer *p_customer);

#endif