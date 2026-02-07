#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "location_game_index.h"



static location_game_index_t *location_game_index_create_internal(
    int game_index,
    generation_summary_t *generation
    ) {
    location_game_index_t *location_game_index_local_var = malloc(sizeof(location_game_index_t));
    if (!location_game_index_local_var) {
        return NULL;
    }
    location_game_index_local_var->game_index = game_index;
    location_game_index_local_var->generation = generation;

    location_game_index_local_var->_library_owned = 1;
    return location_game_index_local_var;
}

__attribute__((deprecated)) location_game_index_t *location_game_index_create(
    int game_index,
    generation_summary_t *generation
    ) {
    return location_game_index_create_internal (
        game_index,
        generation
        );
}

void location_game_index_free(location_game_index_t *location_game_index) {
    if(NULL == location_game_index){
        return ;
    }
    if(location_game_index->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "location_game_index_free");
        return ;
    }
    listEntry_t *listEntry;
    if (location_game_index->generation) {
        generation_summary_free(location_game_index->generation);
        location_game_index->generation = NULL;
    }
    free(location_game_index);
}

cJSON *location_game_index_convertToJSON(location_game_index_t *location_game_index) {
    cJSON *item = cJSON_CreateObject();

    // location_game_index->game_index
    if (!location_game_index->game_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "game_index", location_game_index->game_index) == NULL) {
    goto fail; //Numeric
    }


    // location_game_index->generation
    if (!location_game_index->generation) {
        goto fail;
    }
    cJSON *generation_local_JSON = generation_summary_convertToJSON(location_game_index->generation);
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

location_game_index_t *location_game_index_parseFromJSON(cJSON *location_game_indexJSON){

    location_game_index_t *location_game_index_local_var = NULL;

    // define the local variable for location_game_index->generation
    generation_summary_t *generation_local_nonprim = NULL;

    // location_game_index->game_index
    cJSON *game_index = cJSON_GetObjectItemCaseSensitive(location_game_indexJSON, "game_index");
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

    // location_game_index->generation
    cJSON *generation = cJSON_GetObjectItemCaseSensitive(location_game_indexJSON, "generation");
    if (cJSON_IsNull(generation)) {
        generation = NULL;
    }
    if (!generation) {
        goto end;
    }

    
    generation_local_nonprim = generation_summary_parseFromJSON(generation); //nonprimitive


    location_game_index_local_var = location_game_index_create_internal (
        game_index->valuedouble,
        generation_local_nonprim
        );

    return location_game_index_local_var;
end:
    if (generation_local_nonprim) {
        generation_summary_free(generation_local_nonprim);
        generation_local_nonprim = NULL;
    }
    return NULL;

}
