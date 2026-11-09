#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "berry_flavor_map.h"



static berry_flavor_map_t *berry_flavor_map_create_internal(
    int *potency,
    berry_flavor_summary_t *flavor
    ) {
    berry_flavor_map_t *berry_flavor_map_local_var = malloc(sizeof(berry_flavor_map_t));
    if (!berry_flavor_map_local_var) {
        return NULL;
    }
    memset(berry_flavor_map_local_var, 0, sizeof(berry_flavor_map_t));
    berry_flavor_map_local_var->_library_owned = 1;
    berry_flavor_map_local_var->potency = potency;
    berry_flavor_map_local_var->flavor = flavor;
    return berry_flavor_map_local_var;
}

__attribute__((deprecated)) berry_flavor_map_t *berry_flavor_map_create(
    int *potency,
    berry_flavor_summary_t *flavor
    ) {
    int *potency_copy = NULL;
    if (potency) {
        potency_copy = malloc(sizeof(int));
        if (potency_copy) *potency_copy = *potency;
    }
    berry_flavor_map_t *result = berry_flavor_map_create_internal (
        potency_copy,
        flavor
        );
    if (!result) {
        free(potency_copy);
    }
    return result;
}

void berry_flavor_map_free(berry_flavor_map_t *berry_flavor_map) {
    if(NULL == berry_flavor_map){
        return ;
    }
    if(berry_flavor_map->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "berry_flavor_map_free");
        return ;
    }
    listEntry_t *listEntry;
    if (berry_flavor_map->potency) {
        free(berry_flavor_map->potency);
        berry_flavor_map->potency = NULL;
    }
    if (berry_flavor_map->flavor) {
        berry_flavor_summary_free(berry_flavor_map->flavor);
        berry_flavor_map->flavor = NULL;
    }
    free(berry_flavor_map);
}

cJSON *berry_flavor_map_convertToJSON(berry_flavor_map_t *berry_flavor_map) {
    cJSON *item = cJSON_CreateObject();

    // berry_flavor_map->potency
    if (!berry_flavor_map->potency) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "potency", *berry_flavor_map->potency) == NULL) {
    goto fail; //Numeric
    }


    // berry_flavor_map->flavor
    if (!berry_flavor_map->flavor) {
        goto fail;
    }
    cJSON *flavor_local_JSON = berry_flavor_summary_convertToJSON(berry_flavor_map->flavor);
    if(flavor_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "flavor", flavor_local_JSON);
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

berry_flavor_map_t *berry_flavor_map_parseFromJSON(cJSON *berry_flavor_mapJSON){

    berry_flavor_map_t *berry_flavor_map_local_var = NULL;

    // define the local variable for berry_flavor_map->potency
    int *potency_local_var = NULL;

    // define the local variable for berry_flavor_map->flavor
    berry_flavor_summary_t *flavor_local_nonprim = NULL;

    // berry_flavor_map->potency
    cJSON *potency = cJSON_GetObjectItemCaseSensitive(berry_flavor_mapJSON, "potency");
    if (cJSON_IsNull(potency)) {
        potency = NULL;
    }
    if (!potency) {
        goto end;
    }

    
    if(!cJSON_IsNumber(potency))
    {
    goto end; //Numeric
    }
    potency_local_var = malloc(sizeof(int));
    if(!potency_local_var)
    {
        goto end;
    }
    *potency_local_var = potency->valuedouble;

    // berry_flavor_map->flavor
    cJSON *flavor = cJSON_GetObjectItemCaseSensitive(berry_flavor_mapJSON, "flavor");
    if (cJSON_IsNull(flavor)) {
        flavor = NULL;
    }
    if (!flavor) {
        goto end;
    }

    
    flavor_local_nonprim = berry_flavor_summary_parseFromJSON(flavor); //nonprimitive



    berry_flavor_map_local_var = berry_flavor_map_create_internal (
        potency_local_var,
        flavor_local_nonprim
        );

    if (!berry_flavor_map_local_var) {
        goto end;
    }

    return berry_flavor_map_local_var;
end:
    if (potency_local_var) {
        free(potency_local_var);
        potency_local_var = NULL;
    }
    if (flavor_local_nonprim) {
        berry_flavor_summary_free(flavor_local_nonprim);
        flavor_local_nonprim = NULL;
    }
    return NULL;

}
