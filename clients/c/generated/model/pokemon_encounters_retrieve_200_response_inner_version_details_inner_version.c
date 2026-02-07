#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_encounters_retrieve_200_response_inner_version_details_inner_version.h"



static pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_create_internal(
    char *name,
    char *url
    ) {
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_local_var = malloc(sizeof(pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t));
    if (!pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_local_var) {
        return NULL;
    }
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_local_var->name = name;
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_local_var->url = url;

    pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_local_var->_library_owned = 1;
    return pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_local_var;
}

__attribute__((deprecated)) pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_create(
    char *name,
    char *url
    ) {
    return pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_create_internal (
        name,
        url
        );
}

void pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_free(pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_version) {
    if(NULL == pokemon_encounters_retrieve_200_response_inner_version_details_inner_version){
        return ;
    }
    if(pokemon_encounters_retrieve_200_response_inner_version_details_inner_version->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_encounters_retrieve_200_response_inner_version_details_inner_version->name) {
        free(pokemon_encounters_retrieve_200_response_inner_version_details_inner_version->name);
        pokemon_encounters_retrieve_200_response_inner_version_details_inner_version->name = NULL;
    }
    if (pokemon_encounters_retrieve_200_response_inner_version_details_inner_version->url) {
        free(pokemon_encounters_retrieve_200_response_inner_version_details_inner_version->url);
        pokemon_encounters_retrieve_200_response_inner_version_details_inner_version->url = NULL;
    }
    free(pokemon_encounters_retrieve_200_response_inner_version_details_inner_version);
}

cJSON *pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_convertToJSON(pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_version) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_version->name
    if (!pokemon_encounters_retrieve_200_response_inner_version_details_inner_version->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokemon_encounters_retrieve_200_response_inner_version_details_inner_version->name) == NULL) {
    goto fail; //String
    }


    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_version->url
    if (!pokemon_encounters_retrieve_200_response_inner_version_details_inner_version->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", pokemon_encounters_retrieve_200_response_inner_version_details_inner_version->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_parseFromJSON(cJSON *pokemon_encounters_retrieve_200_response_inner_version_details_inner_versionJSON){

    pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_local_var = NULL;

    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_version->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokemon_encounters_retrieve_200_response_inner_version_details_inner_versionJSON, "name");
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

    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_version->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(pokemon_encounters_retrieve_200_response_inner_version_details_inner_versionJSON, "url");
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


    pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_local_var = pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_local_var;
end:
    return NULL;

}
