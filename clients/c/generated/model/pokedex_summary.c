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
    memset(pokedex_summary_local_var, 0, sizeof(pokedex_summary_t));
    pokedex_summary_local_var->_library_owned = 1;
    pokedex_summary_local_var->name = name;
    pokedex_summary_local_var->url = url;
    return pokedex_summary_local_var;
}

__attribute__((deprecated)) pokedex_summary_t *pokedex_summary_create(
    char *name,
    char *url
    ) {
    pokedex_summary_t *result = pokedex_summary_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
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

    char *name_local_str = NULL;

    char *url_local_str = NULL;

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


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);

    pokedex_summary_local_var = pokedex_summary_create_internal (
        name_local_str,
        url_local_str
        );

    if (!pokedex_summary_local_var) {
        goto end;
    }

    return pokedex_summary_local_var;
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
