#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "stat_detail_affecting_moves_increase_inner.h"



static stat_detail_affecting_moves_increase_inner_t *stat_detail_affecting_moves_increase_inner_create_internal(
    int change,
    ability_detail_pokemon_inner_pokemon_t *move
    ) {
    stat_detail_affecting_moves_increase_inner_t *stat_detail_affecting_moves_increase_inner_local_var = malloc(sizeof(stat_detail_affecting_moves_increase_inner_t));
    if (!stat_detail_affecting_moves_increase_inner_local_var) {
        return NULL;
    }
    stat_detail_affecting_moves_increase_inner_local_var->change = change;
    stat_detail_affecting_moves_increase_inner_local_var->move = move;

    stat_detail_affecting_moves_increase_inner_local_var->_library_owned = 1;
    return stat_detail_affecting_moves_increase_inner_local_var;
}

__attribute__((deprecated)) stat_detail_affecting_moves_increase_inner_t *stat_detail_affecting_moves_increase_inner_create(
    int change,
    ability_detail_pokemon_inner_pokemon_t *move
    ) {
    return stat_detail_affecting_moves_increase_inner_create_internal (
        change,
        move
        );
}

void stat_detail_affecting_moves_increase_inner_free(stat_detail_affecting_moves_increase_inner_t *stat_detail_affecting_moves_increase_inner) {
    if(NULL == stat_detail_affecting_moves_increase_inner){
        return ;
    }
    if(stat_detail_affecting_moves_increase_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "stat_detail_affecting_moves_increase_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (stat_detail_affecting_moves_increase_inner->move) {
        ability_detail_pokemon_inner_pokemon_free(stat_detail_affecting_moves_increase_inner->move);
        stat_detail_affecting_moves_increase_inner->move = NULL;
    }
    free(stat_detail_affecting_moves_increase_inner);
}

cJSON *stat_detail_affecting_moves_increase_inner_convertToJSON(stat_detail_affecting_moves_increase_inner_t *stat_detail_affecting_moves_increase_inner) {
    cJSON *item = cJSON_CreateObject();

    // stat_detail_affecting_moves_increase_inner->change
    if (!stat_detail_affecting_moves_increase_inner->change) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "change", stat_detail_affecting_moves_increase_inner->change) == NULL) {
    goto fail; //Numeric
    }


    // stat_detail_affecting_moves_increase_inner->move
    if (!stat_detail_affecting_moves_increase_inner->move) {
        goto fail;
    }
    cJSON *move_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(stat_detail_affecting_moves_increase_inner->move);
    if(move_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "move", move_local_JSON);
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

stat_detail_affecting_moves_increase_inner_t *stat_detail_affecting_moves_increase_inner_parseFromJSON(cJSON *stat_detail_affecting_moves_increase_innerJSON){

    stat_detail_affecting_moves_increase_inner_t *stat_detail_affecting_moves_increase_inner_local_var = NULL;

    // define the local variable for stat_detail_affecting_moves_increase_inner->move
    ability_detail_pokemon_inner_pokemon_t *move_local_nonprim = NULL;

    // stat_detail_affecting_moves_increase_inner->change
    cJSON *change = cJSON_GetObjectItemCaseSensitive(stat_detail_affecting_moves_increase_innerJSON, "change");
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

    // stat_detail_affecting_moves_increase_inner->move
    cJSON *move = cJSON_GetObjectItemCaseSensitive(stat_detail_affecting_moves_increase_innerJSON, "move");
    if (cJSON_IsNull(move)) {
        move = NULL;
    }
    if (!move) {
        goto end;
    }

    
    move_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(move); //nonprimitive


    stat_detail_affecting_moves_increase_inner_local_var = stat_detail_affecting_moves_increase_inner_create_internal (
        change->valuedouble,
        move_local_nonprim
        );

    return stat_detail_affecting_moves_increase_inner_local_var;
end:
    if (move_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(move_local_nonprim);
        move_local_nonprim = NULL;
    }
    return NULL;

}
