#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_shape_summary.h"



static pokemon_shape_summary_t *pokemon_shape_summary_create_internal(
    char *name,
    char *url
    ) {
    pokemon_shape_summary_t *pokemon_shape_summary_local_var = malloc(sizeof(pokemon_shape_summary_t));
    if (!pokemon_shape_summary_local_var) {
        return NULL;
    }
    pokemon_shape_summary_local_var->name = name;
    pokemon_shape_summary_local_var->url = url;

    pokemon_shape_summary_local_var->_library_owned = 1;
    return pokemon_shape_summary_local_var;
}

__attribute__((deprecated)) pokemon_shape_summary_t *pokemon_shape_summary_create(
    char *name,
    char *url
    ) {
    return pokemon_shape_summary_create_internal (
        name,
        url
        );
}

void pokemon_shape_summary_free(pokemon_shape_summary_t *pokemon_shape_summary) {
    if(NULL == pokemon_shape_summary){
        return ;
    }
    if(pokemon_shape_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_shape_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_shape_summary->name) {
        free(pokemon_shape_summary->name);
        pokemon_shape_summary->name = NULL;
    }
    if (pokemon_shape_summary->url) {
        free(pokemon_shape_summary->url);
        pokemon_shape_summary->url = NULL;
    }
    free(pokemon_shape_summary);
}

cJSON *pokemon_shape_summary_convertToJSON(pokemon_shape_summary_t *pokemon_shape_summary) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_shape_summary->name
    if (!pokemon_shape_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokemon_shape_summary->name) == NULL) {
    goto fail; //String
    }


    // pokemon_shape_summary->url
    if (!pokemon_shape_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", pokemon_shape_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_shape_summary_t *pokemon_shape_summary_parseFromJSON(cJSON *pokemon_shape_summaryJSON){

    pokemon_shape_summary_t *pokemon_shape_summary_local_var = NULL;

    // pokemon_shape_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokemon_shape_summaryJSON, "name");
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

    // pokemon_shape_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(pokemon_shape_summaryJSON, "url");
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


    pokemon_shape_summary_local_var = pokemon_shape_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return pokemon_shape_summary_local_var;
end:
    return NULL;

}
