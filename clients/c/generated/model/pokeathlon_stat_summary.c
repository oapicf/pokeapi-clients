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
    memset(pokeathlon_stat_summary_local_var, 0, sizeof(pokeathlon_stat_summary_t));
    pokeathlon_stat_summary_local_var->_library_owned = 1;
    pokeathlon_stat_summary_local_var->name = name;
    pokeathlon_stat_summary_local_var->url = url;
    return pokeathlon_stat_summary_local_var;
}

__attribute__((deprecated)) pokeathlon_stat_summary_t *pokeathlon_stat_summary_create(
    char *name,
    char *url
    ) {
    pokeathlon_stat_summary_t *result = pokeathlon_stat_summary_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
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

    char *name_local_str = NULL;

    char *url_local_str = NULL;

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


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);

    pokeathlon_stat_summary_local_var = pokeathlon_stat_summary_create_internal (
        name_local_str,
        url_local_str
        );

    if (!pokeathlon_stat_summary_local_var) {
        goto end;
    }

    return pokeathlon_stat_summary_local_var;
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
