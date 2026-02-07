#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "type_game_index.h"



static type_game_index_t *type_game_index_create_internal(
    int game_index,
    generation_summary_t *generation
    ) {
    type_game_index_t *type_game_index_local_var = malloc(sizeof(type_game_index_t));
    if (!type_game_index_local_var) {
        return NULL;
    }
    type_game_index_local_var->game_index = game_index;
    type_game_index_local_var->generation = generation;

    type_game_index_local_var->_library_owned = 1;
    return type_game_index_local_var;
}

__attribute__((deprecated)) type_game_index_t *type_game_index_create(
    int game_index,
    generation_summary_t *generation
    ) {
    return type_game_index_create_internal (
        game_index,
        generation
        );
}

void type_game_index_free(type_game_index_t *type_game_index) {
    if(NULL == type_game_index){
        return ;
    }
    if(type_game_index->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "type_game_index_free");
        return ;
    }
    listEntry_t *listEntry;
    if (type_game_index->generation) {
        generation_summary_free(type_game_index->generation);
        type_game_index->generation = NULL;
    }
    free(type_game_index);
}

cJSON *type_game_index_convertToJSON(type_game_index_t *type_game_index) {
    cJSON *item = cJSON_CreateObject();

    // type_game_index->game_index
    if (!type_game_index->game_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "game_index", type_game_index->game_index) == NULL) {
    goto fail; //Numeric
    }


    // type_game_index->generation
    if (!type_game_index->generation) {
        goto fail;
    }
    cJSON *generation_local_JSON = generation_summary_convertToJSON(type_game_index->generation);
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

type_game_index_t *type_game_index_parseFromJSON(cJSON *type_game_indexJSON){

    type_game_index_t *type_game_index_local_var = NULL;

    // define the local variable for type_game_index->generation
    generation_summary_t *generation_local_nonprim = NULL;

    // type_game_index->game_index
    cJSON *game_index = cJSON_GetObjectItemCaseSensitive(type_game_indexJSON, "game_index");
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

    // type_game_index->generation
    cJSON *generation = cJSON_GetObjectItemCaseSensitive(type_game_indexJSON, "generation");
    if (cJSON_IsNull(generation)) {
        generation = NULL;
    }
    if (!generation) {
        goto end;
    }

    
    generation_local_nonprim = generation_summary_parseFromJSON(generation); //nonprimitive


    type_game_index_local_var = type_game_index_create_internal (
        game_index->valuedouble,
        generation_local_nonprim
        );

    return type_game_index_local_var;
end:
    if (generation_local_nonprim) {
        generation_summary_free(generation_local_nonprim);
        generation_local_nonprim = NULL;
    }
    return NULL;

}
