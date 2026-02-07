#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_form_detail_sprites.h"



static pokemon_form_detail_sprites_t *pokemon_form_detail_sprites_create_internal(
    char *_default
    ) {
    pokemon_form_detail_sprites_t *pokemon_form_detail_sprites_local_var = malloc(sizeof(pokemon_form_detail_sprites_t));
    if (!pokemon_form_detail_sprites_local_var) {
        return NULL;
    }
    pokemon_form_detail_sprites_local_var->_default = _default;

    pokemon_form_detail_sprites_local_var->_library_owned = 1;
    return pokemon_form_detail_sprites_local_var;
}

__attribute__((deprecated)) pokemon_form_detail_sprites_t *pokemon_form_detail_sprites_create(
    char *_default
    ) {
    return pokemon_form_detail_sprites_create_internal (
        _default
        );
}

void pokemon_form_detail_sprites_free(pokemon_form_detail_sprites_t *pokemon_form_detail_sprites) {
    if(NULL == pokemon_form_detail_sprites){
        return ;
    }
    if(pokemon_form_detail_sprites->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_form_detail_sprites_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_form_detail_sprites->_default) {
        free(pokemon_form_detail_sprites->_default);
        pokemon_form_detail_sprites->_default = NULL;
    }
    free(pokemon_form_detail_sprites);
}

cJSON *pokemon_form_detail_sprites_convertToJSON(pokemon_form_detail_sprites_t *pokemon_form_detail_sprites) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_form_detail_sprites->_default
    if(pokemon_form_detail_sprites->_default) {
    if(cJSON_AddStringToObject(item, "default", pokemon_form_detail_sprites->_default) == NULL) {
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

pokemon_form_detail_sprites_t *pokemon_form_detail_sprites_parseFromJSON(cJSON *pokemon_form_detail_spritesJSON){

    pokemon_form_detail_sprites_t *pokemon_form_detail_sprites_local_var = NULL;

    // pokemon_form_detail_sprites->_default
    cJSON *_default = cJSON_GetObjectItemCaseSensitive(pokemon_form_detail_spritesJSON, "default");
    if (cJSON_IsNull(_default)) {
        _default = NULL;
    }
    if (_default) { 
    if(!cJSON_IsString(_default) && !cJSON_IsNull(_default))
    {
    goto end; //String
    }
    }


    pokemon_form_detail_sprites_local_var = pokemon_form_detail_sprites_create_internal (
        _default && !cJSON_IsNull(_default) ? strdup(_default->valuestring) : NULL
        );

    return pokemon_form_detail_sprites_local_var;
end:
    return NULL;

}
