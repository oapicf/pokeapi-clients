#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokedex_summary.h"



static pokedex_summary_t *pokedex_summary_create_internal(
    char *name,
    char *url
    ) {
    pokedex_summary_t *pokedex_summary_local_var = malloc(sizeof(pokedex_summary_t));
    if (!pokedex_summary_local_var) {
        return NULL;
    }
    pokedex_summary_local_var->name = name;
    pokedex_summary_local_var->url = url;

    pokedex_summary_local_var->_library_owned = 1;
    return pokedex_summary_local_var;
}

__attribute__((deprecated)) pokedex_summary_t *pokedex_summary_create(
    char *name,
    char *url
    ) {
    return pokedex_summary_create_internal (
        name,
        url
        );
}

void pokedex_summary_free(pokedex_summary_t *pokedex_summary) {
    if(NULL == pokedex_summary){
        return ;
    }
    if(pokedex_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokedex_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokedex_summary->name) {
        free(pokedex_summary->name);
        pokedex_summary->name = NULL;
    }
    if (pokedex_summary->url) {
        free(pokedex_summary->url);
        pokedex_summary->url = NULL;
    }
    free(pokedex_summary);
}

cJSON *pokedex_summary_convertToJSON(pokedex_summary_t *pokedex_summary) {
    cJSON *item = cJSON_CreateObject();

    // pokedex_summary->name
    if (!pokedex_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokedex_summary->name) == NULL) {
    goto fail; //String
    }


    // pokedex_summary->url
    if (!pokedex_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", pokedex_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokedex_summary_t *pokedex_summary_parseFromJSON(cJSON *pokedex_summaryJSON){

    pokedex_summary_t *pokedex_summary_local_var = NULL;

    // pokedex_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokedex_summaryJSON, "name");
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

    // pokedex_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(pokedex_summaryJSON, "url");
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


    pokedex_summary_local_var = pokedex_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return pokedex_summary_local_var;
end:
    return NULL;

}
