#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_game_index.h"



static pokemon_game_index_t *pokemon_game_index_create_internal(
    int game_index,
    version_summary_t *version
    ) {
    pokemon_game_index_t *pokemon_game_index_local_var = malloc(sizeof(pokemon_game_index_t));
    if (!pokemon_game_index_local_var) {
        return NULL;
    }
    pokemon_game_index_local_var->game_index = game_index;
    pokemon_game_index_local_var->version = version;

    pokemon_game_index_local_var->_library_owned = 1;
    return pokemon_game_index_local_var;
}

__attribute__((deprecated)) pokemon_game_index_t *pokemon_game_index_create(
    int game_index,
    version_summary_t *version
    ) {
    return pokemon_game_index_create_internal (
        game_index,
        version
        );
}

void pokemon_game_index_free(pokemon_game_index_t *pokemon_game_index) {
    if(NULL == pokemon_game_index){
        return ;
    }
    if(pokemon_game_index->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_game_index_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_game_index->version) {
        version_summary_free(pokemon_game_index->version);
        pokemon_game_index->version = NULL;
    }
    free(pokemon_game_index);
}

cJSON *pokemon_game_index_convertToJSON(pokemon_game_index_t *pokemon_game_index) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_game_index->game_index
    if (!pokemon_game_index->game_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "game_index", pokemon_game_index->game_index) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_game_index->version
    if (!pokemon_game_index->version) {
        goto fail;
    }
    cJSON *version_local_JSON = version_summary_convertToJSON(pokemon_game_index->version);
    if(version_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version", version_local_JSON);
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

pokemon_game_index_t *pokemon_game_index_parseFromJSON(cJSON *pokemon_game_indexJSON){

    pokemon_game_index_t *pokemon_game_index_local_var = NULL;

    // define the local variable for pokemon_game_index->version
    version_summary_t *version_local_nonprim = NULL;

    // pokemon_game_index->game_index
    cJSON *game_index = cJSON_GetObjectItemCaseSensitive(pokemon_game_indexJSON, "game_index");
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

    // pokemon_game_index->version
    cJSON *version = cJSON_GetObjectItemCaseSensitive(pokemon_game_indexJSON, "version");
    if (cJSON_IsNull(version)) {
        version = NULL;
    }
    if (!version) {
        goto end;
    }

    
    version_local_nonprim = version_summary_parseFromJSON(version); //nonprimitive


    pokemon_game_index_local_var = pokemon_game_index_create_internal (
        game_index->valuedouble,
        version_local_nonprim
        );

    return pokemon_game_index_local_var;
end:
    if (version_local_nonprim) {
        version_summary_free(version_local_nonprim);
        version_local_nonprim = NULL;
    }
    return NULL;

}
