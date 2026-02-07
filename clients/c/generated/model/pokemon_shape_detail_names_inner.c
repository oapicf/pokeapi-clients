#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_shape_detail_names_inner.h"



static pokemon_shape_detail_names_inner_t *pokemon_shape_detail_names_inner_create_internal(
    char *url,
    char *name
    ) {
    pokemon_shape_detail_names_inner_t *pokemon_shape_detail_names_inner_local_var = malloc(sizeof(pokemon_shape_detail_names_inner_t));
    if (!pokemon_shape_detail_names_inner_local_var) {
        return NULL;
    }
    pokemon_shape_detail_names_inner_local_var->url = url;
    pokemon_shape_detail_names_inner_local_var->name = name;

    pokemon_shape_detail_names_inner_local_var->_library_owned = 1;
    return pokemon_shape_detail_names_inner_local_var;
}

__attribute__((deprecated)) pokemon_shape_detail_names_inner_t *pokemon_shape_detail_names_inner_create(
    char *url,
    char *name
    ) {
    return pokemon_shape_detail_names_inner_create_internal (
        url,
        name
        );
}

void pokemon_shape_detail_names_inner_free(pokemon_shape_detail_names_inner_t *pokemon_shape_detail_names_inner) {
    if(NULL == pokemon_shape_detail_names_inner){
        return ;
    }
    if(pokemon_shape_detail_names_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_shape_detail_names_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_shape_detail_names_inner->url) {
        free(pokemon_shape_detail_names_inner->url);
        pokemon_shape_detail_names_inner->url = NULL;
    }
    if (pokemon_shape_detail_names_inner->name) {
        free(pokemon_shape_detail_names_inner->name);
        pokemon_shape_detail_names_inner->name = NULL;
    }
    free(pokemon_shape_detail_names_inner);
}

cJSON *pokemon_shape_detail_names_inner_convertToJSON(pokemon_shape_detail_names_inner_t *pokemon_shape_detail_names_inner) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_shape_detail_names_inner->url
    if (!pokemon_shape_detail_names_inner->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", pokemon_shape_detail_names_inner->url) == NULL) {
    goto fail; //String
    }


    // pokemon_shape_detail_names_inner->name
    if (!pokemon_shape_detail_names_inner->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokemon_shape_detail_names_inner->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_shape_detail_names_inner_t *pokemon_shape_detail_names_inner_parseFromJSON(cJSON *pokemon_shape_detail_names_innerJSON){

    pokemon_shape_detail_names_inner_t *pokemon_shape_detail_names_inner_local_var = NULL;

    // pokemon_shape_detail_names_inner->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(pokemon_shape_detail_names_innerJSON, "url");
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

    // pokemon_shape_detail_names_inner->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokemon_shape_detail_names_innerJSON, "name");
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


    pokemon_shape_detail_names_inner_local_var = pokemon_shape_detail_names_inner_create_internal (
        strdup(url->valuestring),
        strdup(name->valuestring)
        );

    return pokemon_shape_detail_names_inner_local_var;
end:
    return NULL;

}
