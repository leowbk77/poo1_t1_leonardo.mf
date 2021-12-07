#ifndef _temployeelisth_
#define _temployeelisth_
#include "../Temployee/Temployee.h"

/*
*   DEFINES
*/

#define SUCCESS 0
#define INVALID_NULL_POINTER -1
#define OUT_OF_MEMORY -2
#define OUT_OF_RANGE -3
#define ELEM_NOT_FOUND -4

typedef struct employeelist employeelist;

/*
*   FUNCOES
*/

employeelist *employeeList_create();

int list_free_employee(employeelist *list);

int push_employee(employeelist *list, employee p_customer);

int pop_employee(employeelist *list, employee *p_customer);

int list_print_employee(employeelist *list);

#endif