#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_stat.h"



static pokemon_stat_t *pokemon_stat_create_internal(
    int base_stat,
    int effort,
    stat_summary_t *stat
    ) {
    pokemon_stat_t *pokemon_stat_local_var = malloc(sizeof(pokemon_stat_t));
    if (!pokemon_stat_local_var) {
        return NULL;
    }
    pokemon_stat_local_var->base_stat = base_stat;
    pokemon_stat_local_var->effort = effort;
    pokemon_stat_local_var->stat = stat;

    pokemon_stat_local_var->_library_owned = 1;
    return pokemon_stat_local_var;
}

__attribute__((deprecated)) pokemon_stat_t *pokemon_stat_create(
    int base_stat,
    int effort,
    stat_summary_t *stat
    ) {
    return pokemon_stat_create_internal (
        base_stat,
        effort,
        stat
        );
}

void pokemon_stat_free(pokemon_stat_t *pokemon_stat) {
    if(NULL == pokemon_stat){
        return ;
    }
    if(pokemon_stat->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_stat_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_stat->stat) {
        stat_summary_free(pokemon_stat->stat);
        pokemon_stat->stat = NULL;
    }
    free(pokemon_stat);
}

cJSON *pokemon_stat_convertToJSON(pokemon_stat_t *pokemon_stat) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_stat->base_stat
    if (!pokemon_stat->base_stat) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "base_stat", pokemon_stat->base_stat) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_stat->effort
    if (!pokemon_stat->effort) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "effort", pokemon_stat->effort) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_stat->stat
    if (!pokemon_stat->stat) {
        goto fail;
    }
    cJSON *stat_local_JSON = stat_summary_convertToJSON(pokemon_stat->stat);
    if(stat_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "stat", stat_local_JSON);
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

pokemon_stat_t *pokemon_stat_parseFromJSON(cJSON *pokemon_statJSON){

    pokemon_stat_t *pokemon_stat_local_var = NULL;

    // define the local variable for pokemon_stat->stat
    stat_summary_t *stat_local_nonprim = NULL;

    // pokemon_stat->base_stat
    cJSON *base_stat = cJSON_GetObjectItemCaseSensitive(pokemon_statJSON, "base_stat");
    if (cJSON_IsNull(base_stat)) {
        base_stat = NULL;
    }
    if (!base_stat) {
        goto end;
    }

    
    if(!cJSON_IsNumber(base_stat))
    {
    goto end; //Numeric
    }

    // pokemon_stat->effort
    cJSON *effort = cJSON_GetObjectItemCaseSensitive(pokemon_statJSON, "effort");
    if (cJSON_IsNull(effort)) {
        effort = NULL;
    }
    if (!effort) {
        goto end;
    }

    
    if(!cJSON_IsNumber(effort))
    {
    goto end; //Numeric
    }

    // pokemon_stat->stat
    cJSON *stat = cJSON_GetObjectItemCaseSensitive(pokemon_statJSON, "stat");
    if (cJSON_IsNull(stat)) {
        stat = NULL;
    }
    if (!stat) {
        goto end;
    }

    
    stat_local_nonprim = stat_summary_parseFromJSON(stat); //nonprimitive


    pokemon_stat_local_var = pokemon_stat_create_internal (
        base_stat->valuedouble,
        effort->valuedouble,
        stat_local_nonprim
        );

    return pokemon_stat_local_var;
end:
    if (stat_local_nonprim) {
        stat_summary_free(stat_local_nonprim);
        stat_local_nonprim = NULL;
    }
    return NULL;

}
