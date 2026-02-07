#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_species_summary.h"



static pokemon_species_summary_t *pokemon_species_summary_create_internal(
    char *name,
    char *url
    ) {
    pokemon_species_summary_t *pokemon_species_summary_local_var = malloc(sizeof(pokemon_species_summary_t));
    if (!pokemon_species_summary_local_var) {
        return NULL;
    }
    pokemon_species_summary_local_var->name = name;
    pokemon_species_summary_local_var->url = url;

    pokemon_species_summary_local_var->_library_owned = 1;
    return pokemon_species_summary_local_var;
}

__attribute__((deprecated)) pokemon_species_summary_t *pokemon_species_summary_create(
    char *name,
    char *url
    ) {
    return pokemon_species_summary_create_internal (
        name,
        url
        );
}

void pokemon_species_summary_free(pokemon_species_summary_t *pokemon_species_summary) {
    if(NULL == pokemon_species_summary){
        return ;
    }
    if(pokemon_species_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_species_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_species_summary->name) {
        free(pokemon_species_summary->name);
        pokemon_species_summary->name = NULL;
    }
    if (pokemon_species_summary->url) {
        free(pokemon_species_summary->url);
        pokemon_species_summary->url = NULL;
    }
    free(pokemon_species_summary);
}

cJSON *pokemon_species_summary_convertToJSON(pokemon_species_summary_t *pokemon_species_summary) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_species_summary->name
    if (!pokemon_species_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokemon_species_summary->name) == NULL) {
    goto fail; //String
    }


    // pokemon_species_summary->url
    if (!pokemon_species_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", pokemon_species_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_species_summary_t *pokemon_species_summary_parseFromJSON(cJSON *pokemon_species_summaryJSON){

    pokemon_species_summary_t *pokemon_species_summary_local_var = NULL;

    // pokemon_species_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokemon_species_summaryJSON, "name");
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

    // pokemon_species_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(pokemon_species_summaryJSON, "url");
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


    pokemon_species_summary_local_var = pokemon_species_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return pokemon_species_summary_local_var;
end:
    return NULL;

}
