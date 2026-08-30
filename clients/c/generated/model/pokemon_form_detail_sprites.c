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
    memset(pokemon_form_detail_sprites_local_var, 0, sizeof(pokemon_form_detail_sprites_t));
    pokemon_form_detail_sprites_local_var->_library_owned = 1;
    pokemon_form_detail_sprites_local_var->_default = _default;
    return pokemon_form_detail_sprites_local_var;
}

__attribute__((deprecated)) pokemon_form_detail_sprites_t *pokemon_form_detail_sprites_create(
    char *_default
    ) {
    pokemon_form_detail_sprites_t *result = pokemon_form_detail_sprites_create_internal (
        _default
        );
    if (!result) {
    }
    return result;
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

    char *_default_local_str = NULL;

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


    if (_default && !cJSON_IsNull(_default)) _default_local_str = strdup(_default->valuestring);

    pokemon_form_detail_sprites_local_var = pokemon_form_detail_sprites_create_internal (
        _default_local_str
        );

    if (!pokemon_form_detail_sprites_local_var) {
        goto end;
    }

    return pokemon_form_detail_sprites_local_var;
end:
    if (_default_local_str) {
        free(_default_local_str);
        _default_local_str = NULL;
    }
    return NULL;

}
