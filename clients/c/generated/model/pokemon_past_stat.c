#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_past_stat.h"



static pokemon_past_stat_t *pokemon_past_stat_create_internal(
    generation_summary_t *generation,
    list_t *stats
    ) {
    pokemon_past_stat_t *pokemon_past_stat_local_var = malloc(sizeof(pokemon_past_stat_t));
    if (!pokemon_past_stat_local_var) {
        return NULL;
    }
    memset(pokemon_past_stat_local_var, 0, sizeof(pokemon_past_stat_t));
    pokemon_past_stat_local_var->_library_owned = 1;
    pokemon_past_stat_local_var->generation = generation;
    pokemon_past_stat_local_var->stats = stats;
    return pokemon_past_stat_local_var;
}

__attribute__((deprecated)) pokemon_past_stat_t *pokemon_past_stat_create(
    generation_summary_t *generation,
    list_t *stats
    ) {
    pokemon_past_stat_t *result = pokemon_past_stat_create_internal (
        generation,
        stats
        );
    if (!result) {
    }
    return result;
}

void pokemon_past_stat_free(pokemon_past_stat_t *pokemon_past_stat) {
    if(NULL == pokemon_past_stat){
        return ;
    }
    if(pokemon_past_stat->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_past_stat_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_past_stat->generation) {
        generation_summary_free(pokemon_past_stat->generation);
        pokemon_past_stat->generation = NULL;
    }
    if (pokemon_past_stat->stats) {
        list_ForEach(listEntry, pokemon_past_stat->stats) {
            pokemon_stat_free(listEntry->data);
        }
        list_freeList(pokemon_past_stat->stats);
        pokemon_past_stat->stats = NULL;
    }
    free(pokemon_past_stat);
}

cJSON *pokemon_past_stat_convertToJSON(pokemon_past_stat_t *pokemon_past_stat) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_past_stat->generation
    if (!pokemon_past_stat->generation) {
        goto fail;
    }
    cJSON *generation_local_JSON = generation_summary_convertToJSON(pokemon_past_stat->generation);
    if(generation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "generation", generation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_past_stat->stats
    if (!pokemon_past_stat->stats) {
        goto fail;
    }
    cJSON *stats = cJSON_AddArrayToObject(item, "stats");
    if(stats == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *statsListEntry;
    if (pokemon_past_stat->stats) {
    list_ForEach(statsListEntry, pokemon_past_stat->stats) {
    cJSON *itemLocal = pokemon_stat_convertToJSON(statsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(stats, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_past_stat_t *pokemon_past_stat_parseFromJSON(cJSON *pokemon_past_statJSON){

    pokemon_past_stat_t *pokemon_past_stat_local_var = NULL;

    // define the local variable for pokemon_past_stat->generation
    generation_summary_t *generation_local_nonprim = NULL;

    // define the local list for pokemon_past_stat->stats
    list_t *statsList = NULL;

    // pokemon_past_stat->generation
    cJSON *generation = cJSON_GetObjectItemCaseSensitive(pokemon_past_statJSON, "generation");
    if (cJSON_IsNull(generation)) {
        generation = NULL;
    }
    if (!generation) {
        goto end;
    }

    
    generation_local_nonprim = generation_summary_parseFromJSON(generation); //nonprimitive

    // pokemon_past_stat->stats
    cJSON *stats = cJSON_GetObjectItemCaseSensitive(pokemon_past_statJSON, "stats");
    if (cJSON_IsNull(stats)) {
        stats = NULL;
    }
    if (!stats) {
        goto end;
    }

    
    cJSON *stats_local_nonprimitive = NULL;
    if(!cJSON_IsArray(stats)){
        goto end; //nonprimitive container
    }

    statsList = list_createList();

    cJSON_ArrayForEach(stats_local_nonprimitive,stats )
    {
        if(!cJSON_IsObject(stats_local_nonprimitive)){
            goto end;
        }
        pokemon_stat_t *statsItem = pokemon_stat_parseFromJSON(stats_local_nonprimitive);

        list_addElement(statsList, statsItem);
    }



    pokemon_past_stat_local_var = pokemon_past_stat_create_internal (
        generation_local_nonprim,
        statsList
        );

    if (!pokemon_past_stat_local_var) {
        goto end;
    }

    return pokemon_past_stat_local_var;
end:
    if (generation_local_nonprim) {
        generation_summary_free(generation_local_nonprim);
        generation_local_nonprim = NULL;
    }
    if (statsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, statsList) {
            pokemon_stat_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(statsList);
        statsList = NULL;
    }
    return NULL;

}
