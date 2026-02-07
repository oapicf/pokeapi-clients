#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "evolution_chain_detail.h"



static evolution_chain_detail_t *evolution_chain_detail_create_internal(
    int id,
    item_summary_t *baby_trigger_item,
    evolution_chain_detail_chain_t *chain
    ) {
    evolution_chain_detail_t *evolution_chain_detail_local_var = malloc(sizeof(evolution_chain_detail_t));
    if (!evolution_chain_detail_local_var) {
        return NULL;
    }
    evolution_chain_detail_local_var->id = id;
    evolution_chain_detail_local_var->baby_trigger_item = baby_trigger_item;
    evolution_chain_detail_local_var->chain = chain;

    evolution_chain_detail_local_var->_library_owned = 1;
    return evolution_chain_detail_local_var;
}

__attribute__((deprecated)) evolution_chain_detail_t *evolution_chain_detail_create(
    int id,
    item_summary_t *baby_trigger_item,
    evolution_chain_detail_chain_t *chain
    ) {
    return evolution_chain_detail_create_internal (
        id,
        baby_trigger_item,
        chain
        );
}

void evolution_chain_detail_free(evolution_chain_detail_t *evolution_chain_detail) {
    if(NULL == evolution_chain_detail){
        return ;
    }
    if(evolution_chain_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "evolution_chain_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (evolution_chain_detail->baby_trigger_item) {
        item_summary_free(evolution_chain_detail->baby_trigger_item);
        evolution_chain_detail->baby_trigger_item = NULL;
    }
    if (evolution_chain_detail->chain) {
        evolution_chain_detail_chain_free(evolution_chain_detail->chain);
        evolution_chain_detail->chain = NULL;
    }
    free(evolution_chain_detail);
}

cJSON *evolution_chain_detail_convertToJSON(evolution_chain_detail_t *evolution_chain_detail) {
    cJSON *item = cJSON_CreateObject();

    // evolution_chain_detail->id
    if (!evolution_chain_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", evolution_chain_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // evolution_chain_detail->baby_trigger_item
    if (!evolution_chain_detail->baby_trigger_item) {
        goto fail;
    }
    cJSON *baby_trigger_item_local_JSON = item_summary_convertToJSON(evolution_chain_detail->baby_trigger_item);
    if(baby_trigger_item_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "baby_trigger_item", baby_trigger_item_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // evolution_chain_detail->chain
    if (!evolution_chain_detail->chain) {
        goto fail;
    }
    cJSON *chain_local_JSON = evolution_chain_detail_chain_convertToJSON(evolution_chain_detail->chain);
    if(chain_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "chain", chain_local_JSON);
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

evolution_chain_detail_t *evolution_chain_detail_parseFromJSON(cJSON *evolution_chain_detailJSON){

    evolution_chain_detail_t *evolution_chain_detail_local_var = NULL;

    // define the local variable for evolution_chain_detail->baby_trigger_item
    item_summary_t *baby_trigger_item_local_nonprim = NULL;

    // define the local variable for evolution_chain_detail->chain
    evolution_chain_detail_chain_t *chain_local_nonprim = NULL;

    // evolution_chain_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(evolution_chain_detailJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // evolution_chain_detail->baby_trigger_item
    cJSON *baby_trigger_item = cJSON_GetObjectItemCaseSensitive(evolution_chain_detailJSON, "baby_trigger_item");
    if (cJSON_IsNull(baby_trigger_item)) {
        baby_trigger_item = NULL;
    }
    if (!baby_trigger_item) {
        goto end;
    }

    
    baby_trigger_item_local_nonprim = item_summary_parseFromJSON(baby_trigger_item); //nonprimitive

    // evolution_chain_detail->chain
    cJSON *chain = cJSON_GetObjectItemCaseSensitive(evolution_chain_detailJSON, "chain");
    if (cJSON_IsNull(chain)) {
        chain = NULL;
    }
    if (!chain) {
        goto end;
    }

    
    chain_local_nonprim = evolution_chain_detail_chain_parseFromJSON(chain); //nonprimitive


    evolution_chain_detail_local_var = evolution_chain_detail_create_internal (
        id->valuedouble,
        baby_trigger_item_local_nonprim,
        chain_local_nonprim
        );

    return evolution_chain_detail_local_var;
end:
    if (baby_trigger_item_local_nonprim) {
        item_summary_free(baby_trigger_item_local_nonprim);
        baby_trigger_item_local_nonprim = NULL;
    }
    if (chain_local_nonprim) {
        evolution_chain_detail_chain_free(chain_local_nonprim);
        chain_local_nonprim = NULL;
    }
    return NULL;

}
