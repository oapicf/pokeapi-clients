#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "berry_flavor_berry_map.h"



static berry_flavor_berry_map_t *berry_flavor_berry_map_create_internal(
    int *potency,
    berry_summary_t *berry
    ) {
    berry_flavor_berry_map_t *berry_flavor_berry_map_local_var = malloc(sizeof(berry_flavor_berry_map_t));
    if (!berry_flavor_berry_map_local_var) {
        return NULL;
    }
    memset(berry_flavor_berry_map_local_var, 0, sizeof(berry_flavor_berry_map_t));
    berry_flavor_berry_map_local_var->_library_owned = 1;
    berry_flavor_berry_map_local_var->potency = potency;
    berry_flavor_berry_map_local_var->berry = berry;
    return berry_flavor_berry_map_local_var;
}

__attribute__((deprecated)) berry_flavor_berry_map_t *berry_flavor_berry_map_create(
    int *potency,
    berry_summary_t *berry
    ) {
    int *potency_copy = NULL;
    if (potency) {
        potency_copy = malloc(sizeof(int));
        if (potency_copy) *potency_copy = *potency;
    }
    berry_flavor_berry_map_t *result = berry_flavor_berry_map_create_internal (
        potency_copy,
        berry
        );
    if (!result) {
        free(potency_copy);
    }
    return result;
}

void berry_flavor_berry_map_free(berry_flavor_berry_map_t *berry_flavor_berry_map) {
    if(NULL == berry_flavor_berry_map){
        return ;
    }
    if(berry_flavor_berry_map->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "berry_flavor_berry_map_free");
        return ;
    }
    listEntry_t *listEntry;
    if (berry_flavor_berry_map->potency) {
        free(berry_flavor_berry_map->potency);
        berry_flavor_berry_map->potency = NULL;
    }
    if (berry_flavor_berry_map->berry) {
        berry_summary_free(berry_flavor_berry_map->berry);
        berry_flavor_berry_map->berry = NULL;
    }
    free(berry_flavor_berry_map);
}

cJSON *berry_flavor_berry_map_convertToJSON(berry_flavor_berry_map_t *berry_flavor_berry_map) {
    cJSON *item = cJSON_CreateObject();

    // berry_flavor_berry_map->potency
    if (!berry_flavor_berry_map->potency) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "potency", *berry_flavor_berry_map->potency) == NULL) {
    goto fail; //Numeric
    }


    // berry_flavor_berry_map->berry
    if (!berry_flavor_berry_map->berry) {
        goto fail;
    }
    cJSON *berry_local_JSON = berry_summary_convertToJSON(berry_flavor_berry_map->berry);
    if(berry_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "berry", berry_local_JSON);
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

berry_flavor_berry_map_t *berry_flavor_berry_map_parseFromJSON(cJSON *berry_flavor_berry_mapJSON){

    berry_flavor_berry_map_t *berry_flavor_berry_map_local_var = NULL;

    // define the local variable for berry_flavor_berry_map->potency
    int *potency_local_var = NULL;

    // define the local variable for berry_flavor_berry_map->berry
    berry_summary_t *berry_local_nonprim = NULL;

    // berry_flavor_berry_map->potency
    cJSON *potency = cJSON_GetObjectItemCaseSensitive(berry_flavor_berry_mapJSON, "potency");
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

    // berry_flavor_berry_map->berry
    cJSON *berry = cJSON_GetObjectItemCaseSensitive(berry_flavor_berry_mapJSON, "berry");
    if (cJSON_IsNull(berry)) {
        berry = NULL;
    }
    if (!berry) {
        goto end;
    }

    
    berry_local_nonprim = berry_summary_parseFromJSON(berry); //nonprimitive



    berry_flavor_berry_map_local_var = berry_flavor_berry_map_create_internal (
        potency_local_var,
        berry_local_nonprim
        );

    if (!berry_flavor_berry_map_local_var) {
        goto end;
    }

    return berry_flavor_berry_map_local_var;
end:
    if (potency_local_var) {
        free(potency_local_var);
        potency_local_var = NULL;
    }
    if (berry_local_nonprim) {
        berry_summary_free(berry_local_nonprim);
        berry_local_nonprim = NULL;
    }
    return NULL;

}
