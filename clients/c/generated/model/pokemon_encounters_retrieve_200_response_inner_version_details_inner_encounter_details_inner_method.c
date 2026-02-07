#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method.h"



static pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_create_internal(
    char *name,
    char *url
    ) {
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_local_var = malloc(sizeof(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_t));
    if (!pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_local_var) {
        return NULL;
    }
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_local_var->name = name;
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_local_var->url = url;

    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_local_var->_library_owned = 1;
    return pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_local_var;
}

__attribute__((deprecated)) pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_create(
    char *name,
    char *url
    ) {
    return pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_create_internal (
        name,
        url
        );
}

void pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_free(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method) {
    if(NULL == pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method){
        return ;
    }
    if(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method->name) {
        free(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method->name);
        pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method->name = NULL;
    }
    if (pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method->url) {
        free(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method->url);
        pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method->url = NULL;
    }
    free(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method);
}

cJSON *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_convertToJSON(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method->name
    if (!pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method->name) == NULL) {
    goto fail; //String
    }


    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method->url
    if (!pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_parseFromJSON(cJSON *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_methodJSON){

    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_local_var = NULL;

    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_methodJSON, "name");
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

    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_methodJSON, "url");
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


    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_local_var = pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_local_var;
end:
    return NULL;

}
