#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokeathlon_stat_summary.h"



static pokeathlon_stat_summary_t *pokeathlon_stat_summary_create_internal(
    char *name,
    char *url
    ) {
    pokeathlon_stat_summary_t *pokeathlon_stat_summary_local_var = malloc(sizeof(pokeathlon_stat_summary_t));
    if (!pokeathlon_stat_summary_local_var) {
        return NULL;
    }
    pokeathlon_stat_summary_local_var->name = name;
    pokeathlon_stat_summary_local_var->url = url;

    pokeathlon_stat_summary_local_var->_library_owned = 1;
    return pokeathlon_stat_summary_local_var;
}

__attribute__((deprecated)) pokeathlon_stat_summary_t *pokeathlon_stat_summary_create(
    char *name,
    char *url
    ) {
    return pokeathlon_stat_summary_create_internal (
        name,
        url
        );
}

void pokeathlon_stat_summary_free(pokeathlon_stat_summary_t *pokeathlon_stat_summary) {
    if(NULL == pokeathlon_stat_summary){
        return ;
    }
    if(pokeathlon_stat_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokeathlon_stat_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokeathlon_stat_summary->name) {
        free(pokeathlon_stat_summary->name);
        pokeathlon_stat_summary->name = NULL;
    }
    if (pokeathlon_stat_summary->url) {
        free(pokeathlon_stat_summary->url);
        pokeathlon_stat_summary->url = NULL;
    }
    free(pokeathlon_stat_summary);
}

cJSON *pokeathlon_stat_summary_convertToJSON(pokeathlon_stat_summary_t *pokeathlon_stat_summary) {
    cJSON *item = cJSON_CreateObject();

    // pokeathlon_stat_summary->name
    if (!pokeathlon_stat_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokeathlon_stat_summary->name) == NULL) {
    goto fail; //String
    }


    // pokeathlon_stat_summary->url
    if (!pokeathlon_stat_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", pokeathlon_stat_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokeathlon_stat_summary_t *pokeathlon_stat_summary_parseFromJSON(cJSON *pokeathlon_stat_summaryJSON){

    pokeathlon_stat_summary_t *pokeathlon_stat_summary_local_var = NULL;

    // pokeathlon_stat_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokeathlon_stat_summaryJSON, "name");
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

    // pokeathlon_stat_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(pokeathlon_stat_summaryJSON, "url");
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


    pokeathlon_stat_summary_local_var = pokeathlon_stat_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return pokeathlon_stat_summary_local_var;
end:
    return NULL;

}
