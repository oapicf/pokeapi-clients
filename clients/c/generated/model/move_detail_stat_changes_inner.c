#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_detail_stat_changes_inner.h"



static move_detail_stat_changes_inner_t *move_detail_stat_changes_inner_create_internal(
    int change,
    ability_detail_pokemon_inner_pokemon_t *stat
    ) {
    move_detail_stat_changes_inner_t *move_detail_stat_changes_inner_local_var = malloc(sizeof(move_detail_stat_changes_inner_t));
    if (!move_detail_stat_changes_inner_local_var) {
        return NULL;
    }
    move_detail_stat_changes_inner_local_var->change = change;
    move_detail_stat_changes_inner_local_var->stat = stat;

    move_detail_stat_changes_inner_local_var->_library_owned = 1;
    return move_detail_stat_changes_inner_local_var;
}

__attribute__((deprecated)) move_detail_stat_changes_inner_t *move_detail_stat_changes_inner_create(
    int change,
    ability_detail_pokemon_inner_pokemon_t *stat
    ) {
    return move_detail_stat_changes_inner_create_internal (
        change,
        stat
        );
}

void move_detail_stat_changes_inner_free(move_detail_stat_changes_inner_t *move_detail_stat_changes_inner) {
    if(NULL == move_detail_stat_changes_inner){
        return ;
    }
    if(move_detail_stat_changes_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_detail_stat_changes_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_detail_stat_changes_inner->stat) {
        ability_detail_pokemon_inner_pokemon_free(move_detail_stat_changes_inner->stat);
        move_detail_stat_changes_inner->stat = NULL;
    }
    free(move_detail_stat_changes_inner);
}

cJSON *move_detail_stat_changes_inner_convertToJSON(move_detail_stat_changes_inner_t *move_detail_stat_changes_inner) {
    cJSON *item = cJSON_CreateObject();

    // move_detail_stat_changes_inner->change
    if (!move_detail_stat_changes_inner->change) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "change", move_detail_stat_changes_inner->change) == NULL) {
    goto fail; //Numeric
    }


    // move_detail_stat_changes_inner->stat
    if (!move_detail_stat_changes_inner->stat) {
        goto fail;
    }
    cJSON *stat_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(move_detail_stat_changes_inner->stat);
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

move_detail_stat_changes_inner_t *move_detail_stat_changes_inner_parseFromJSON(cJSON *move_detail_stat_changes_innerJSON){

    move_detail_stat_changes_inner_t *move_detail_stat_changes_inner_local_var = NULL;

    // define the local variable for move_detail_stat_changes_inner->stat
    ability_detail_pokemon_inner_pokemon_t *stat_local_nonprim = NULL;

    // move_detail_stat_changes_inner->change
    cJSON *change = cJSON_GetObjectItemCaseSensitive(move_detail_stat_changes_innerJSON, "change");
    if (cJSON_IsNull(change)) {
        change = NULL;
    }
    if (!change) {
        goto end;
    }

    
    if(!cJSON_IsNumber(change))
    {
    goto end; //Numeric
    }

    // move_detail_stat_changes_inner->stat
    cJSON *stat = cJSON_GetObjectItemCaseSensitive(move_detail_stat_changes_innerJSON, "stat");
    if (cJSON_IsNull(stat)) {
        stat = NULL;
    }
    if (!stat) {
        goto end;
    }

    
    stat_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(stat); //nonprimitive


    move_detail_stat_changes_inner_local_var = move_detail_stat_changes_inner_create_internal (
        change->valuedouble,
        stat_local_nonprim
        );

    return move_detail_stat_changes_inner_local_var;
end:
    if (stat_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(stat_local_nonprim);
        stat_local_nonprim = NULL;
    }
    return NULL;

}
