#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokeapi_meta_response.h"



static pokeapi_meta_response_t *pokeapi_meta_response_create_internal(
    char *deploy_date,
    char *hash,
    char *tag
    ) {
    pokeapi_meta_response_t *pokeapi_meta_response_local_var = malloc(sizeof(pokeapi_meta_response_t));
    if (!pokeapi_meta_response_local_var) {
        return NULL;
    }
    memset(pokeapi_meta_response_local_var, 0, sizeof(pokeapi_meta_response_t));
    pokeapi_meta_response_local_var->_library_owned = 1;
    pokeapi_meta_response_local_var->deploy_date = deploy_date;
    pokeapi_meta_response_local_var->hash = hash;
    pokeapi_meta_response_local_var->tag = tag;
    return pokeapi_meta_response_local_var;
}

__attribute__((deprecated)) pokeapi_meta_response_t *pokeapi_meta_response_create(
    char *deploy_date,
    char *hash,
    char *tag
    ) {
    pokeapi_meta_response_t *result = pokeapi_meta_response_create_internal (
        deploy_date,
        hash,
        tag
        );
    if (!result) {
    }
    return result;
}

void pokeapi_meta_response_free(pokeapi_meta_response_t *pokeapi_meta_response) {
    if(NULL == pokeapi_meta_response){
        return ;
    }
    if(pokeapi_meta_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokeapi_meta_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokeapi_meta_response->deploy_date) {
        free(pokeapi_meta_response->deploy_date);
        pokeapi_meta_response->deploy_date = NULL;
    }
    if (pokeapi_meta_response->hash) {
        free(pokeapi_meta_response->hash);
        pokeapi_meta_response->hash = NULL;
    }
    if (pokeapi_meta_response->tag) {
        free(pokeapi_meta_response->tag);
        pokeapi_meta_response->tag = NULL;
    }
    free(pokeapi_meta_response);
}

cJSON *pokeapi_meta_response_convertToJSON(pokeapi_meta_response_t *pokeapi_meta_response) {
    cJSON *item = cJSON_CreateObject();

    // pokeapi_meta_response->deploy_date
    if (!pokeapi_meta_response->deploy_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "deploy_date", pokeapi_meta_response->deploy_date) == NULL) {
    goto fail; //String
    }


    // pokeapi_meta_response->hash
    if (!pokeapi_meta_response->hash) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "hash", pokeapi_meta_response->hash) == NULL) {
    goto fail; //String
    }


    // pokeapi_meta_response->tag
    if (!pokeapi_meta_response->tag) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "tag", pokeapi_meta_response->tag) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokeapi_meta_response_t *pokeapi_meta_response_parseFromJSON(cJSON *pokeapi_meta_responseJSON){

    pokeapi_meta_response_t *pokeapi_meta_response_local_var = NULL;

    char *deploy_date_local_str = NULL;

    char *hash_local_str = NULL;

    char *tag_local_str = NULL;

    // pokeapi_meta_response->deploy_date
    cJSON *deploy_date = cJSON_GetObjectItemCaseSensitive(pokeapi_meta_responseJSON, "deploy_date");
    if (cJSON_IsNull(deploy_date)) {
        deploy_date = NULL;
    }
    if (!deploy_date) {
        goto end;
    }

    
    if(!cJSON_IsString(deploy_date))
    {
    goto end; //String
    }

    // pokeapi_meta_response->hash
    cJSON *hash = cJSON_GetObjectItemCaseSensitive(pokeapi_meta_responseJSON, "hash");
    if (cJSON_IsNull(hash)) {
        hash = NULL;
    }
    if (!hash) {
        goto end;
    }

    
    if(!cJSON_IsString(hash))
    {
    goto end; //String
    }

    // pokeapi_meta_response->tag
    cJSON *tag = cJSON_GetObjectItemCaseSensitive(pokeapi_meta_responseJSON, "tag");
    if (cJSON_IsNull(tag)) {
        tag = NULL;
    }
    if (!tag) {
        goto end;
    }

    
    if(!cJSON_IsString(tag))
    {
    goto end; //String
    }


    if (deploy_date && !cJSON_IsNull(deploy_date)) deploy_date_local_str = strdup(deploy_date->valuestring);
    if (hash && !cJSON_IsNull(hash)) hash_local_str = strdup(hash->valuestring);
    if (tag && !cJSON_IsNull(tag)) tag_local_str = strdup(tag->valuestring);

    pokeapi_meta_response_local_var = pokeapi_meta_response_create_internal (
        deploy_date_local_str,
        hash_local_str,
        tag_local_str
        );

    if (!pokeapi_meta_response_local_var) {
        goto end;
    }

    return pokeapi_meta_response_local_var;
end:
    if (deploy_date_local_str) {
        free(deploy_date_local_str);
        deploy_date_local_str = NULL;
    }
    if (hash_local_str) {
        free(hash_local_str);
        hash_local_str = NULL;
    }
    if (tag_local_str) {
        free(tag_local_str);
        tag_local_str = NULL;
    }
    return NULL;

}
