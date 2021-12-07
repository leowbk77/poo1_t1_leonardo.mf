#ifndef _tsellinglisth_
#define _tsellinglisth_
#include "../Tsell/Tsell.h"

/*
*   DEFINES
*/

#define SUCCESS 0
#define INVALID_NULL_POINTER -1
#define OUT_OF_MEMORY -2
#define OUT_OF_RANGE -3
#define ELEM_NOT_FOUND -4

typedef struct sellinglist sellinglist;

/*
*   FUNCOES
*/

sellinglist *sellinglist_create();

int list_free_sell(sellinglist *list);

int push_sell(sellinglist *list, sell p_sell);

int pop_sell(sellinglist *list, sell *p_sell);

int list_print_sell(sellinglist *list);

#endif