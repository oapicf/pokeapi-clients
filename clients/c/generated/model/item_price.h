/*
 * item_price.h
 *
 * 
 */

#ifndef _item_price_H_
#define _item_price_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_price_t item_price_t;

#include "currency_summary.h"
#include "version_group_summary.h"



typedef struct item_price_t {
    int *purchase_price; //numeric
    int *sell_price; //numeric
    struct currency_summary_t *currency; //model
    struct version_group_summary_t *version_group; //model

    int _library_owned; // Is the library responsible for freeing this object?
} item_price_t;

__attribute__((deprecated)) item_price_t *item_price_create(
    int *purchase_price,
    int *sell_price,
    currency_summary_t *currency,
    version_group_summary_t *version_group
);

void item_price_free(item_price_t *item_price);

item_price_t *item_price_parseFromJSON(cJSON *item_priceJSON);

cJSON *item_price_convertToJSON(item_price_t *item_price);

#endif /* _item_price_H_ */

