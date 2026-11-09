#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokeathlon_stat_affecting_nature.h"



static pokeathlon_stat_affecting_nature_t *pokeathlon_stat_affecting_nature_create_internal(
    int *max_change,
    nature_summary_t *nature
    ) {
    pokeathlon_stat_affecting_nature_t *pokeathlon_stat_affecting_nature_local_var = malloc(sizeof(pokeathlon_stat_affecting_nature_t));
    if (!pokeathlon_stat_affecting_nature_local_var) {
        return NULL;
    }
    memset(pokeathlon_stat_affecting_nature_local_var, 0, sizeof(pokeathlon_stat_affecting_nature_t));
    pokeathlon_stat_affecting_nature_local_var->_library_owned = 1;
    pokeathlon_stat_affecting_nature_local_var->max_change = max_change;
    pokeathlon_stat_affecting_nature_local_var->nature = nature;
    return pokeathlon_stat_affecting_nature_local_var;
}

__attribute__((deprecated)) pokeathlon_stat_affecting_nature_t *pokeathlon_stat_affecting_nature_create(
    int *max_change,
    nature_summary_t *nature
    ) {
    int *max_change_copy = NULL;
    if (max_change) {
        max_change_copy = malloc(sizeof(int));
        if (max_change_copy) *max_change_copy = *max_change;
    }
    pokeathlon_stat_affecting_nature_t *result = pokeathlon_stat_affecting_nature_create_internal (
        max_change_copy,
        nature
        );
    if (!result) {
        free(max_change_copy);
    }
    return result;
}

void pokeathlon_stat_affecting_nature_free(pokeathlon_stat_affecting_nature_t *pokeathlon_stat_affecting_nature) {
    if(NULL == pokeathlon_stat_affecting_nature){
        return ;
    }
    if(pokeathlon_stat_affecting_nature->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokeathlon_stat_affecting_nature_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokeathlon_stat_affecting_nature->max_change) {
        free(pokeathlon_stat_affecting_nature->max_change);
        pokeathlon_stat_affecting_nature->max_change = NULL;
    }
    if (pokeathlon_stat_affecting_nature->nature) {
        nature_summary_free(pokeathlon_stat_affecting_nature->nature);
        pokeathlon_stat_affecting_nature->nature = NULL;
    }
    free(pokeathlon_stat_affecting_nature);
}

cJSON *pokeathlon_stat_affecting_nature_convertToJSON(pokeathlon_stat_affecting_nature_t *pokeathlon_stat_affecting_nature) {
    cJSON *item = cJSON_CreateObject();

    // pokeathlon_stat_affecting_nature->max_change
    if (!pokeathlon_stat_affecting_nature->max_change) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_change", *pokeathlon_stat_affecting_nature->max_change) == NULL) {
    goto fail; //Numeric
    }


    // pokeathlon_stat_affecting_nature->nature
    if (!pokeathlon_stat_affecting_nature->nature) {
        goto fail;
    }
    cJSON *nature_local_JSON = nature_summary_convertToJSON(pokeathlon_stat_affecting_nature->nature);
    if(nature_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "nature", nature_local_JSON);
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

pokeathlon_stat_affecting_nature_t *pokeathlon_stat_affecting_nature_parseFromJSON(cJSON *pokeathlon_stat_affecting_natureJSON){

    pokeathlon_stat_affecting_nature_t *pokeathlon_stat_affecting_nature_local_var = NULL;

    // define the local variable for pokeathlon_stat_affecting_nature->max_change
    int *max_change_local_var = NULL;

    // define the local variable for pokeathlon_stat_affecting_nature->nature
    nature_summary_t *nature_local_nonprim = NULL;

    // pokeathlon_stat_affecting_nature->max_change
    cJSON *max_change = cJSON_GetObjectItemCaseSensitive(pokeathlon_stat_affecting_natureJSON, "max_change");
    if (cJSON_IsNull(max_change)) {
        max_change = NULL;
    }
    if (!max_change) {
        goto end;
    }

    
    if(!cJSON_IsNumber(max_change))
    {
    goto end; //Numeric
    }
    max_change_local_var = malloc(sizeof(int));
    if(!max_change_local_var)
    {
        goto end;
    }
    *max_change_local_var = max_change->valuedouble;

    // pokeathlon_stat_affecting_nature->nature
    cJSON *nature = cJSON_GetObjectItemCaseSensitive(pokeathlon_stat_affecting_natureJSON, "nature");
    if (cJSON_IsNull(nature)) {
        nature = NULL;
    }
    if (!nature) {
        goto end;
    }

    
    nature_local_nonprim = nature_summary_parseFromJSON(nature); //nonprimitive



    pokeathlon_stat_affecting_nature_local_var = pokeathlon_stat_affecting_nature_create_internal (
        max_change_local_var,
        nature_local_nonprim
        );

    if (!pokeathlon_stat_affecting_nature_local_var) {
        goto end;
    }

    return pokeathlon_stat_affecting_nature_local_var;
end:
    if (max_change_local_var) {
        free(max_change_local_var);
        max_change_local_var = NULL;
    }
    if (nature_local_nonprim) {
        nature_summary_free(nature_local_nonprim);
        nature_local_nonprim = NULL;
    }
    return NULL;

}
