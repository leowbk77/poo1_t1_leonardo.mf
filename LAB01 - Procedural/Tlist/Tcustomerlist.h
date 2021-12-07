#ifndef _tcustomerlisth_
#define _tcustomerlisth_
#include "../Tcustomer/Tcustomer.h"

/*
*   DEFINES
*/

#define SUCCESS 0
#define INVALID_NULL_POINTER -1
#define OUT_OF_MEMORY -2
#define OUT_OF_RANGE -3
#define ELEM_NOT_FOUND -4

typedef struct customerlist customerlist;

/*
*   FUNCOES
*/

customerlist *customerList_create();

int list_free(customerlist *list);

int push(customerlist *list, customer p_customer);

#endif