#include <stdlib.h>
#include <stdio.h>
#include "../Tcustomer/Tcustomer.h"
#include "../Tlist/Tcustomerlist.h"
#include "../Tproduct/Tproduct.h"
#include "../Tlist/Tproductlist.h"
#include "../Temployee/Temployee.h"
#include "../Tlist/Temployeelist.h"
#include "../Tsell/Tsell.h"
#include "../Tlist/Tsellinglist.h"


void cadastrarCliente(customerlist *customerList) {
    char nome[50] = "";
    char cpf[14] = "";
    char dataNascimento[20] = "";
    char cep[20] = "";

    printf("\nNome: ");
    scanf(" %[^\n]s", nome);
    printf("CPF (xxxxxxxxx-xx): ");
    scanf(" %[^\n]s", cpf);
    printf("Data de nascimento (dd/mm/aaaa): ");
    scanf(" %[^\n]s", dataNascimento);
    printf("CEP (xxxxx-xxx): ");
    scanf(" %[^\n]s", cep);

    printf("\nCliente cadastrado!\n");

    customer *customer = create_customer(cpf, nome, dataNascimento, cep);

    push(customerList, *customer);

    free_customer(customer);
}

void cadastrarFuncionario(employeelist *employeeList) {
    char nome[50] = "";
    char cpf[14] = "";
    char dataNascimento[20] = "";
    char dataIngresso[20] = "";

    printf("\nNome: ");
    scanf(" %[^\n]s", nome);
    printf("CPF (xxxxxxxxx-xx): ");
    scanf(" %[^\n]s", cpf);
    printf("Data de nascimento (dd/mm/aaaa): ");
    scanf(" %[^\n]s", dataNascimento);
    printf("Data de ingresso (dd/mm/aaaa):  ");
    scanf(" %[^\n]s", dataIngresso);

    printf("\nFuncionario cadastrado!\n");

    employee *employee = create_employee(cpf, nome, dataNascimento, dataIngresso);

    push_employee(employeeList, *employee);

    free_employee(employee);
}

void listarFuncionario(employeelist *employeeList) {
    if (employeeList != NULL) {
        list_print_employee(employeeList);
    } else {
        printf("\n[ERRO] Nao ha funcionarios cadastrados!\n");
    }
}

void cadastrarProduto(productlist *product_list){
    char nome[50] = "";
    char fabricante[20] = "";
    int cod = 0;
    float val = 0.0;

    printf("\nNome: ");
    scanf(" %[^\n]s", nome);
    printf("Fabricante: ");
    scanf(" %[^\n]s", fabricante);
    printf("Codigo: ");
    scanf("%d", &cod);
    printf("Valor: ");
    scanf("%f", &val);
    
    product *p_product = create_product(cod, val, nome, fabricante);
    push_product(product_list, *p_product);

    free_product(p_product);
    printf("\nProduto cadastrado!\n");
}

void comprarProduto(sellinglist *sellinglist){
    int cod;
    char cliente[50];
    char funcionario[50];

    printf("\nCodigo do produto: ");
    scanf("%d", &cod);
    printf("Nome do cliente: ");
    scanf(" %[^\n]s", cliente);
    printf("Nome do Funcionario: ");
    scanf(" %[^\n]s", funcionario);

    sell *p_sell = create_sell(cod, cliente, funcionario);
    push_sell(sellinglist, *p_sell);

    free_sell(p_sell);
    printf("\nCompra cadastrada!\n");
}

void menu(customerlist *customerList, productlist *productList, employeelist *employeeList, sellinglist *sellingList) {
    char op;

    printf("\nSeja bem-vindo(a)!\n");

    while(1) {
        printf("\n===============//===============//===============\n");
        printf("\nEscolha uma opcao:\n");
        printf("[1] - Cadastrar produto\n");
        printf("[2] - Cadastrar cliente\n");
        printf("[3] - Cadastrar funcionario\n");
        printf("[4] - Comprar um produto\n");
        printf("[5] - Produto mais vendido\n");
        printf("[6] - Cliente que mais gasta\n");
        printf("[0] - SAIR\n");

        printf("\nOpcao desejada: ");
        scanf(" %c", &op);

        switch (op) {
        case '0':
            printf("\nAte logo!\n\n");
            return;
        case '1':
            cadastrarProduto(productList);
            break;

        case '2':
            cadastrarCliente(customerList);
            break;

        case '3':
            cadastrarFuncionario(employeeList);
            break;

        case '4':
            comprarProduto(sellingList);
            break;

        case '5':
            printf("\n[INFO] Desculpe, a funcionalidade ainda está em desenvolvimento. Volte mais tarde!\n");
            break;

        case '6':
            printf("\n[INFO] Desculpe, a funcionalidade ainda está em desenvolvimento. Volte mais tarde!\n");
            break;
        
        default:
            printf("\n[ERRO] Opcao escolhida e invalida! Escolha novamente.\n");
            break;
        }
    }
}

int main() {
    customerlist *customerList = customerList_create();
    productlist *productList = productList_create();
    employeelist *employeeList = employeeList_create();
    sellinglist *sellingList = sellinglist_create();

    menu(customerList, productList, employeeList, sellingList);

    list_free(customerList);
    list_free_product(productList);
    list_print_employee(employeeList);
    list_free_sell(sellingList);

    return 0;
}