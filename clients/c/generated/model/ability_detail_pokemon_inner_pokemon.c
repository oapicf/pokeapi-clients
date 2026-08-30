#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ability_detail_pokemon_inner_pokemon.h"



static ability_detail_pokemon_inner_pokemon_t *ability_detail_pokemon_inner_pokemon_create_internal(
    char *name,
    char *url
    ) {
    ability_detail_pokemon_inner_pokemon_t *ability_detail_pokemon_inner_pokemon_local_var = malloc(sizeof(ability_detail_pokemon_inner_pokemon_t));
    if (!ability_detail_pokemon_inner_pokemon_local_var) {
        return NULL;
    }
    memset(ability_detail_pokemon_inner_pokemon_local_var, 0, sizeof(ability_detail_pokemon_inner_pokemon_t));
    ability_detail_pokemon_inner_pokemon_local_var->_library_owned = 1;
    ability_detail_pokemon_inner_pokemon_local_var->name = name;
    ability_detail_pokemon_inner_pokemon_local_var->url = url;
    return ability_detail_pokemon_inner_pokemon_local_var;
}

__attribute__((deprecated)) ability_detail_pokemon_inner_pokemon_t *ability_detail_pokemon_inner_pokemon_create(
    char *name,
    char *url
    ) {
    ability_detail_pokemon_inner_pokemon_t *result = ability_detail_pokemon_inner_pokemon_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
}

void ability_detail_pokemon_inner_pokemon_free(ability_detail_pokemon_inner_pokemon_t *ability_detail_pokemon_inner_pokemon) {
    if(NULL == ability_detail_pokemon_inner_pokemon){
        return ;
    }
    if(ability_detail_pokemon_inner_pokemon->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ability_detail_pokemon_inner_pokemon_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ability_detail_pokemon_inner_pokemon->name) {
        free(ability_detail_pokemon_inner_pokemon->name);
        ability_detail_pokemon_inner_pokemon->name = NULL;
    }
    if (ability_detail_pokemon_inner_pokemon->url) {
        free(ability_detail_pokemon_inner_pokemon->url);
        ability_detail_pokemon_inner_pokemon->url = NULL;
    }
    free(ability_detail_pokemon_inner_pokemon);
}

cJSON *ability_detail_pokemon_inner_pokemon_convertToJSON(ability_detail_pokemon_inner_pokemon_t *ability_detail_pokemon_inner_pokemon) {
    cJSON *item = cJSON_CreateObject();

    // ability_detail_pokemon_inner_pokemon->name
    if (!ability_detail_pokemon_inner_pokemon->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", ability_detail_pokemon_inner_pokemon->name) == NULL) {
    goto fail; //String
    }


    // ability_detail_pokemon_inner_pokemon->url
    if (!ability_detail_pokemon_inner_pokemon->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", ability_detail_pokemon_inner_pokemon->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ability_detail_pokemon_inner_pokemon_t *ability_detail_pokemon_inner_pokemon_parseFromJSON(cJSON *ability_detail_pokemon_inner_pokemonJSON){

    ability_detail_pokemon_inner_pokemon_t *ability_detail_pokemon_inner_pokemon_local_var = NULL;

    char *name_local_str = NULL;

    char *url_local_str = NULL;

    // ability_detail_pokemon_inner_pokemon->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ability_detail_pokemon_inner_pokemonJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // ability_detail_pokemon_inner_pokemon->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(ability_detail_pokemon_inner_pokemonJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);

    ability_detail_pokemon_inner_pokemon_local_var = ability_detail_pokemon_inner_pokemon_create_internal (
        name_local_str,
        url_local_str
        );

    if (!ability_detail_pokemon_inner_pokemon_local_var) {
        goto end;
    }

    return ability_detail_pokemon_inner_pokemon_local_var;
end:
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (url_local_str) {
        free(url_local_str);
        url_local_str = NULL;
    }
    return NULL;

}
