#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "type_detail_pokemon_inner_pokemon.h"



static type_detail_pokemon_inner_pokemon_t *type_detail_pokemon_inner_pokemon_create_internal(
    char *name,
    char *url
    ) {
    type_detail_pokemon_inner_pokemon_t *type_detail_pokemon_inner_pokemon_local_var = malloc(sizeof(type_detail_pokemon_inner_pokemon_t));
    if (!type_detail_pokemon_inner_pokemon_local_var) {
        return NULL;
    }
    type_detail_pokemon_inner_pokemon_local_var->name = name;
    type_detail_pokemon_inner_pokemon_local_var->url = url;

    type_detail_pokemon_inner_pokemon_local_var->_library_owned = 1;
    return type_detail_pokemon_inner_pokemon_local_var;
}

__attribute__((deprecated)) type_detail_pokemon_inner_pokemon_t *type_detail_pokemon_inner_pokemon_create(
    char *name,
    char *url
    ) {
    return type_detail_pokemon_inner_pokemon_create_internal (
        name,
        url
        );
}

void type_detail_pokemon_inner_pokemon_free(type_detail_pokemon_inner_pokemon_t *type_detail_pokemon_inner_pokemon) {
    if(NULL == type_detail_pokemon_inner_pokemon){
        return ;
    }
    if(type_detail_pokemon_inner_pokemon->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "type_detail_pokemon_inner_pokemon_free");
        return ;
    }
    listEntry_t *listEntry;
    if (type_detail_pokemon_inner_pokemon->name) {
        free(type_detail_pokemon_inner_pokemon->name);
        type_detail_pokemon_inner_pokemon->name = NULL;
    }
    if (type_detail_pokemon_inner_pokemon->url) {
        free(type_detail_pokemon_inner_pokemon->url);
        type_detail_pokemon_inner_pokemon->url = NULL;
    }
    free(type_detail_pokemon_inner_pokemon);
}

cJSON *type_detail_pokemon_inner_pokemon_convertToJSON(type_detail_pokemon_inner_pokemon_t *type_detail_pokemon_inner_pokemon) {
    cJSON *item = cJSON_CreateObject();

    // type_detail_pokemon_inner_pokemon->name
    if(type_detail_pokemon_inner_pokemon->name) {
    if(cJSON_AddStringToObject(item, "name", type_detail_pokemon_inner_pokemon->name) == NULL) {
    goto fail; //String
    }
    }


    // type_detail_pokemon_inner_pokemon->url
    if(type_detail_pokemon_inner_pokemon->url) {
    if(cJSON_AddStringToObject(item, "url", type_detail_pokemon_inner_pokemon->url) == NULL) {
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

type_detail_pokemon_inner_pokemon_t *type_detail_pokemon_inner_pokemon_parseFromJSON(cJSON *type_detail_pokemon_inner_pokemonJSON){

    type_detail_pokemon_inner_pokemon_t *type_detail_pokemon_inner_pokemon_local_var = NULL;

    // type_detail_pokemon_inner_pokemon->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(type_detail_pokemon_inner_pokemonJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // type_detail_pokemon_inner_pokemon->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(type_detail_pokemon_inner_pokemonJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }


    type_detail_pokemon_inner_pokemon_local_var = type_detail_pokemon_inner_pokemon_create_internal (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        url && !cJSON_IsNull(url) ? strdup(url->valuestring) : NULL
        );

    return type_detail_pokemon_inner_pokemon_local_var;
end:
    return NULL;

}
