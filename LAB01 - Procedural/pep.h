#ifndef _pessoasEprodutosh_
#define _pessoasEprodutosh_

typedef struct Data data;

struct produto{
    int codigo;
    float valor;
    char nome[20];
    char fabricante[20];
};

struct cliente{
    int cliente_id;
    char cpf[14];
    char nome[20];
    char cep[9];
    data data_nascimento;
};

struct funcionario{
    int funcionario_id;
    char cpf[14];
    char nome[20];
    data data_nascimento;
    data data_ingresso;
};

struct Data{
    int dia;
    int mes;
    int ano;
};

#endif