#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_form_summary.h"



static pokemon_form_summary_t *pokemon_form_summary_create_internal(
    char *name,
    char *url
    ) {
    pokemon_form_summary_t *pokemon_form_summary_local_var = malloc(sizeof(pokemon_form_summary_t));
    if (!pokemon_form_summary_local_var) {
        return NULL;
    }
    pokemon_form_summary_local_var->name = name;
    pokemon_form_summary_local_var->url = url;

    pokemon_form_summary_local_var->_library_owned = 1;
    return pokemon_form_summary_local_var;
}

__attribute__((deprecated)) pokemon_form_summary_t *pokemon_form_summary_create(
    char *name,
    char *url
    ) {
    return pokemon_form_summary_create_internal (
        name,
        url
        );
}

void pokemon_form_summary_free(pokemon_form_summary_t *pokemon_form_summary) {
    if(NULL == pokemon_form_summary){
        return ;
    }
    if(pokemon_form_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_form_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_form_summary->name) {
        free(pokemon_form_summary->name);
        pokemon_form_summary->name = NULL;
    }
    if (pokemon_form_summary->url) {
        free(pokemon_form_summary->url);
        pokemon_form_summary->url = NULL;
    }
    free(pokemon_form_summary);
}

cJSON *pokemon_form_summary_convertToJSON(pokemon_form_summary_t *pokemon_form_summary) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_form_summary->name
    if (!pokemon_form_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokemon_form_summary->name) == NULL) {
    goto fail; //String
    }


    // pokemon_form_summary->url
    if (!pokemon_form_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", pokemon_form_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_form_summary_t *pokemon_form_summary_parseFromJSON(cJSON *pokemon_form_summaryJSON){

    pokemon_form_summary_t *pokemon_form_summary_local_var = NULL;

    // pokemon_form_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokemon_form_summaryJSON, "name");
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

    // pokemon_form_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(pokemon_form_summaryJSON, "url");
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


    pokemon_form_summary_local_var = pokemon_form_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return pokemon_form_summary_local_var;
end:
    return NULL;

}
