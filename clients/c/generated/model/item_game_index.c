#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_game_index.h"



static item_game_index_t *item_game_index_create_internal(
    int *game_index,
    generation_summary_t *generation
    ) {
    item_game_index_t *item_game_index_local_var = malloc(sizeof(item_game_index_t));
    if (!item_game_index_local_var) {
        return NULL;
    }
    memset(item_game_index_local_var, 0, sizeof(item_game_index_t));
    item_game_index_local_var->_library_owned = 1;
    item_game_index_local_var->game_index = game_index;
    item_game_index_local_var->generation = generation;
    return item_game_index_local_var;
}

__attribute__((deprecated)) item_game_index_t *item_game_index_create(
    int *game_index,
    generation_summary_t *generation
    ) {
    int *game_index_copy = NULL;
    if (game_index) {
        game_index_copy = malloc(sizeof(int));
        if (game_index_copy) *game_index_copy = *game_index;
    }
    item_game_index_t *result = item_game_index_create_internal (
        game_index_copy,
        generation
        );
    if (!result) {
        free(game_index_copy);
    }
    return result;
}

void item_game_index_free(item_game_index_t *item_game_index) {
    if(NULL == item_game_index){
        return ;
    }
    if(item_game_index->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_game_index_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_game_index->game_index) {
        free(item_game_index->game_index);
        item_game_index->game_index = NULL;
    }
    if (item_game_index->generation) {
        generation_summary_free(item_game_index->generation);
        item_game_index->generation = NULL;
    }
    free(item_game_index);
}

cJSON *item_game_index_convertToJSON(item_game_index_t *item_game_index) {
    cJSON *item = cJSON_CreateObject();

    // item_game_index->game_index
    if (!item_game_index->game_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "game_index", *item_game_index->game_index) == NULL) {
    goto fail; //Numeric
    }


    // item_game_index->generation
    if (!item_game_index->generation) {
        goto fail;
    }
    cJSON *generation_local_JSON = generation_summary_convertToJSON(item_game_index->generation);
    if(generation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "generation", generation_local_JSON);
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

item_game_index_t *item_game_index_parseFromJSON(cJSON *item_game_indexJSON){

    item_game_index_t *item_game_index_local_var = NULL;

    // define the local variable for item_game_index->game_index
    int *game_index_local_var = NULL;

    // define the local variable for item_game_index->generation
    generation_summary_t *generation_local_nonprim = NULL;

    // item_game_index->game_index
    cJSON *game_index = cJSON_GetObjectItemCaseSensitive(item_game_indexJSON, "game_index");
    if (cJSON_IsNull(game_index)) {
        game_index = NULL;
    }
    if (!game_index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(game_index))
    {
    goto end; //Numeric
    }
    game_index_local_var = malloc(sizeof(int));
    if(!game_index_local_var)
    {
        goto end;
    }
    *game_index_local_var = game_index->valuedouble;

    // item_game_index->generation
    cJSON *generation = cJSON_GetObjectItemCaseSensitive(item_game_indexJSON, "generation");
    if (cJSON_IsNull(generation)) {
        generation = NULL;
    }
    if (!generation) {
        goto end;
    }

    
    generation_local_nonprim = generation_summary_parseFromJSON(generation); //nonprimitive



    item_game_index_local_var = item_game_index_create_internal (
        game_index_local_var,
        generation_local_nonprim
        );

    if (!item_game_index_local_var) {
        goto end;
    }

    return item_game_index_local_var;
end:
    if (game_index_local_var) {
        free(game_index_local_var);
        game_index_local_var = NULL;
    }
    if (generation_local_nonprim) {
        generation_summary_free(generation_local_nonprim);
        generation_local_nonprim = NULL;
    }
    return NULL;

}
