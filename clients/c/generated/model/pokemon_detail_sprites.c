#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_detail_sprites.h"



static pokemon_detail_sprites_t *pokemon_detail_sprites_create_internal(
    char *front_default
    ) {
    pokemon_detail_sprites_t *pokemon_detail_sprites_local_var = malloc(sizeof(pokemon_detail_sprites_t));
    if (!pokemon_detail_sprites_local_var) {
        return NULL;
    }
    pokemon_detail_sprites_local_var->front_default = front_default;

    pokemon_detail_sprites_local_var->_library_owned = 1;
    return pokemon_detail_sprites_local_var;
}

__attribute__((deprecated)) pokemon_detail_sprites_t *pokemon_detail_sprites_create(
    char *front_default
    ) {
    return pokemon_detail_sprites_create_internal (
        front_default
        );
}

void pokemon_detail_sprites_free(pokemon_detail_sprites_t *pokemon_detail_sprites) {
    if(NULL == pokemon_detail_sprites){
        return ;
    }
    if(pokemon_detail_sprites->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_detail_sprites_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_detail_sprites->front_default) {
        free(pokemon_detail_sprites->front_default);
        pokemon_detail_sprites->front_default = NULL;
    }
    free(pokemon_detail_sprites);
}

cJSON *pokemon_detail_sprites_convertToJSON(pokemon_detail_sprites_t *pokemon_detail_sprites) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_detail_sprites->front_default
    if(pokemon_detail_sprites->front_default) {
    if(cJSON_AddStringToObject(item, "front_default", pokemon_detail_sprites->front_default) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_detail_sprites_t *pokemon_detail_sprites_parseFromJSON(cJSON *pokemon_detail_spritesJSON){

    pokemon_detail_sprites_t *pokemon_detail_sprites_local_var = NULL;

    // pokemon_detail_sprites->front_default
    cJSON *front_default = cJSON_GetObjectItemCaseSensitive(pokemon_detail_spritesJSON, "front_default");
    if (cJSON_IsNull(front_default)) {
        front_default = NULL;
    }
    if (front_default) { 
    if(!cJSON_IsString(front_default) && !cJSON_IsNull(front_default))
    {
    goto end; //String
    }
    }


    pokemon_detail_sprites_local_var = pokemon_detail_sprites_create_internal (
        front_default && !cJSON_IsNull(front_default) ? strdup(front_default->valuestring) : NULL
        );

    return pokemon_detail_sprites_local_var;
end:
    return NULL;

}
