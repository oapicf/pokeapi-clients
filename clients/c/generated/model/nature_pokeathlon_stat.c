#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "nature_pokeathlon_stat.h"



static nature_pokeathlon_stat_t *nature_pokeathlon_stat_create_internal(
    int *max_change,
    pokeathlon_stat_summary_t *pokeathlon_stat
    ) {
    nature_pokeathlon_stat_t *nature_pokeathlon_stat_local_var = malloc(sizeof(nature_pokeathlon_stat_t));
    if (!nature_pokeathlon_stat_local_var) {
        return NULL;
    }
    memset(nature_pokeathlon_stat_local_var, 0, sizeof(nature_pokeathlon_stat_t));
    nature_pokeathlon_stat_local_var->_library_owned = 1;
    nature_pokeathlon_stat_local_var->max_change = max_change;
    nature_pokeathlon_stat_local_var->pokeathlon_stat = pokeathlon_stat;
    return nature_pokeathlon_stat_local_var;
}

__attribute__((deprecated)) nature_pokeathlon_stat_t *nature_pokeathlon_stat_create(
    int *max_change,
    pokeathlon_stat_summary_t *pokeathlon_stat
    ) {
    int *max_change_copy = NULL;
    if (max_change) {
        max_change_copy = malloc(sizeof(int));
        if (max_change_copy) *max_change_copy = *max_change;
    }
    nature_pokeathlon_stat_t *result = nature_pokeathlon_stat_create_internal (
        max_change_copy,
        pokeathlon_stat
        );
    if (!result) {
        free(max_change_copy);
    }
    return result;
}

void nature_pokeathlon_stat_free(nature_pokeathlon_stat_t *nature_pokeathlon_stat) {
    if(NULL == nature_pokeathlon_stat){
        return ;
    }
    if(nature_pokeathlon_stat->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "nature_pokeathlon_stat_free");
        return ;
    }
    listEntry_t *listEntry;
    if (nature_pokeathlon_stat->max_change) {
        free(nature_pokeathlon_stat->max_change);
        nature_pokeathlon_stat->max_change = NULL;
    }
    if (nature_pokeathlon_stat->pokeathlon_stat) {
        pokeathlon_stat_summary_free(nature_pokeathlon_stat->pokeathlon_stat);
        nature_pokeathlon_stat->pokeathlon_stat = NULL;
    }
    free(nature_pokeathlon_stat);
}

cJSON *nature_pokeathlon_stat_convertToJSON(nature_pokeathlon_stat_t *nature_pokeathlon_stat) {
    cJSON *item = cJSON_CreateObject();

    // nature_pokeathlon_stat->max_change
    if (!nature_pokeathlon_stat->max_change) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_change", *nature_pokeathlon_stat->max_change) == NULL) {
    goto fail; //Numeric
    }


    // nature_pokeathlon_stat->pokeathlon_stat
    if (!nature_pokeathlon_stat->pokeathlon_stat) {
        goto fail;
    }
    cJSON *pokeathlon_stat_local_JSON = pokeathlon_stat_summary_convertToJSON(nature_pokeathlon_stat->pokeathlon_stat);
    if(pokeathlon_stat_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pokeathlon_stat", pokeathlon_stat_local_JSON);
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

nature_pokeathlon_stat_t *nature_pokeathlon_stat_parseFromJSON(cJSON *nature_pokeathlon_statJSON){

    nature_pokeathlon_stat_t *nature_pokeathlon_stat_local_var = NULL;

    // define the local variable for nature_pokeathlon_stat->max_change
    int *max_change_local_var = NULL;

    // define the local variable for nature_pokeathlon_stat->pokeathlon_stat
    pokeathlon_stat_summary_t *pokeathlon_stat_local_nonprim = NULL;

    // nature_pokeathlon_stat->max_change
    cJSON *max_change = cJSON_GetObjectItemCaseSensitive(nature_pokeathlon_statJSON, "max_change");
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

    // nature_pokeathlon_stat->pokeathlon_stat
    cJSON *pokeathlon_stat = cJSON_GetObjectItemCaseSensitive(nature_pokeathlon_statJSON, "pokeathlon_stat");
    if (cJSON_IsNull(pokeathlon_stat)) {
        pokeathlon_stat = NULL;
    }
    if (!pokeathlon_stat) {
        goto end;
    }

    
    pokeathlon_stat_local_nonprim = pokeathlon_stat_summary_parseFromJSON(pokeathlon_stat); //nonprimitive



    nature_pokeathlon_stat_local_var = nature_pokeathlon_stat_create_internal (
        max_change_local_var,
        pokeathlon_stat_local_nonprim
        );

    if (!nature_pokeathlon_stat_local_var) {
        goto end;
    }

    return nature_pokeathlon_stat_local_var;
end:
    if (max_change_local_var) {
        free(max_change_local_var);
        max_change_local_var = NULL;
    }
    if (pokeathlon_stat_local_nonprim) {
        pokeathlon_stat_summary_free(pokeathlon_stat_local_nonprim);
        pokeathlon_stat_local_nonprim = NULL;
    }
    return NULL;

}
