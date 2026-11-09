#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_price.h"



static item_price_t *item_price_create_internal(
    int *purchase_price,
    int *sell_price,
    currency_summary_t *currency,
    version_group_summary_t *version_group
    ) {
    item_price_t *item_price_local_var = malloc(sizeof(item_price_t));
    if (!item_price_local_var) {
        return NULL;
    }
    memset(item_price_local_var, 0, sizeof(item_price_t));
    item_price_local_var->_library_owned = 1;
    item_price_local_var->purchase_price = purchase_price;
    item_price_local_var->sell_price = sell_price;
    item_price_local_var->currency = currency;
    item_price_local_var->version_group = version_group;
    return item_price_local_var;
}

__attribute__((deprecated)) item_price_t *item_price_create(
    int *purchase_price,
    int *sell_price,
    currency_summary_t *currency,
    version_group_summary_t *version_group
    ) {
    int *purchase_price_copy = NULL;
    if (purchase_price) {
        purchase_price_copy = malloc(sizeof(int));
        if (purchase_price_copy) *purchase_price_copy = *purchase_price;
    }
    int *sell_price_copy = NULL;
    if (sell_price) {
        sell_price_copy = malloc(sizeof(int));
        if (sell_price_copy) *sell_price_copy = *sell_price;
    }
    item_price_t *result = item_price_create_internal (
        purchase_price_copy,
        sell_price_copy,
        currency,
        version_group
        );
    if (!result) {
        free(purchase_price_copy);
        free(sell_price_copy);
    }
    return result;
}

void item_price_free(item_price_t *item_price) {
    if(NULL == item_price){
        return ;
    }
    if(item_price->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_price_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_price->purchase_price) {
        free(item_price->purchase_price);
        item_price->purchase_price = NULL;
    }
    if (item_price->sell_price) {
        free(item_price->sell_price);
        item_price->sell_price = NULL;
    }
    if (item_price->currency) {
        currency_summary_free(item_price->currency);
        item_price->currency = NULL;
    }
    if (item_price->version_group) {
        version_group_summary_free(item_price->version_group);
        item_price->version_group = NULL;
    }
    free(item_price);
}

cJSON *item_price_convertToJSON(item_price_t *item_price) {
    cJSON *item = cJSON_CreateObject();

    // item_price->purchase_price
    if(item_price->purchase_price) {
    if(cJSON_AddNumberToObject(item, "purchase_price", *item_price->purchase_price) == NULL) {
    goto fail; //Numeric
    }
    }


    // item_price->sell_price
    if(item_price->sell_price) {
    if(cJSON_AddNumberToObject(item, "sell_price", *item_price->sell_price) == NULL) {
    goto fail; //Numeric
    }
    }


    // item_price->currency
    if (!item_price->currency) {
        goto fail;
    }
    cJSON *currency_local_JSON = currency_summary_convertToJSON(item_price->currency);
    if(currency_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // item_price->version_group
    if (!item_price->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = version_group_summary_convertToJSON(item_price->version_group);
    if(version_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version_group", version_group_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

item_price_t *item_price_parseFromJSON(cJSON *item_priceJSON){

    item_price_t *item_price_local_var = NULL;

    // define the local variable for item_price->purchase_price
    int *purchase_price_local_var = NULL;

    // define the local variable for item_price->sell_price
    int *sell_price_local_var = NULL;

    // define the local variable for item_price->currency
    currency_summary_t *currency_local_nonprim = NULL;

    // define the local variable for item_price->version_group
    version_group_summary_t *version_group_local_nonprim = NULL;

    // item_price->purchase_price
    cJSON *purchase_price = cJSON_GetObjectItemCaseSensitive(item_priceJSON, "purchase_price");
    if (cJSON_IsNull(purchase_price)) {
        purchase_price = NULL;
    }
    if (purchase_price) { 
    if(!cJSON_IsNumber(purchase_price))
    {
    goto end; //Numeric
    }
    purchase_price_local_var = malloc(sizeof(int));
    if(!purchase_price_local_var)
    {
        goto end;
    }
    *purchase_price_local_var = purchase_price->valuedouble;
    }

    // item_price->sell_price
    cJSON *sell_price = cJSON_GetObjectItemCaseSensitive(item_priceJSON, "sell_price");
    if (cJSON_IsNull(sell_price)) {
        sell_price = NULL;
    }
    if (sell_price) { 
    if(!cJSON_IsNumber(sell_price))
    {
    goto end; //Numeric
    }
    sell_price_local_var = malloc(sizeof(int));
    if(!sell_price_local_var)
    {
        goto end;
    }
    *sell_price_local_var = sell_price->valuedouble;
    }

    // item_price->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(item_priceJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (!currency) {
        goto end;
    }

    
    currency_local_nonprim = currency_summary_parseFromJSON(currency); //nonprimitive

    // item_price->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(item_priceJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = version_group_summary_parseFromJSON(version_group); //nonprimitive



    item_price_local_var = item_price_create_internal (
        purchase_price_local_var,
        sell_price_local_var,
        currency_local_nonprim,
        version_group_local_nonprim
        );

    if (!item_price_local_var) {
        goto end;
    }

    return item_price_local_var;
end:
    if (purchase_price_local_var) {
        free(purchase_price_local_var);
        purchase_price_local_var = NULL;
    }
    if (sell_price_local_var) {
        free(sell_price_local_var);
        sell_price_local_var = NULL;
    }
    if (currency_local_nonprim) {
        currency_summary_free(currency_local_nonprim);
        currency_local_nonprim = NULL;
    }
    if (version_group_local_nonprim) {
        version_group_summary_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    return NULL;

}
