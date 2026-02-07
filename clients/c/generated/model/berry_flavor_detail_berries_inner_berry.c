#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "berry_flavor_detail_berries_inner_berry.h"



static berry_flavor_detail_berries_inner_berry_t *berry_flavor_detail_berries_inner_berry_create_internal(
    char *name,
    char *url
    ) {
    berry_flavor_detail_berries_inner_berry_t *berry_flavor_detail_berries_inner_berry_local_var = malloc(sizeof(berry_flavor_detail_berries_inner_berry_t));
    if (!berry_flavor_detail_berries_inner_berry_local_var) {
        return NULL;
    }
    berry_flavor_detail_berries_inner_berry_local_var->name = name;
    berry_flavor_detail_berries_inner_berry_local_var->url = url;

    berry_flavor_detail_berries_inner_berry_local_var->_library_owned = 1;
    return berry_flavor_detail_berries_inner_berry_local_var;
}

__attribute__((deprecated)) berry_flavor_detail_berries_inner_berry_t *berry_flavor_detail_berries_inner_berry_create(
    char *name,
    char *url
    ) {
    return berry_flavor_detail_berries_inner_berry_create_internal (
        name,
        url
        );
}

void berry_flavor_detail_berries_inner_berry_free(berry_flavor_detail_berries_inner_berry_t *berry_flavor_detail_berries_inner_berry) {
    if(NULL == berry_flavor_detail_berries_inner_berry){
        return ;
    }
    if(berry_flavor_detail_berries_inner_berry->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "berry_flavor_detail_berries_inner_berry_free");
        return ;
    }
    listEntry_t *listEntry;
    if (berry_flavor_detail_berries_inner_berry->name) {
        free(berry_flavor_detail_berries_inner_berry->name);
        berry_flavor_detail_berries_inner_berry->name = NULL;
    }
    if (berry_flavor_detail_berries_inner_berry->url) {
        free(berry_flavor_detail_berries_inner_berry->url);
        berry_flavor_detail_berries_inner_berry->url = NULL;
    }
    free(berry_flavor_detail_berries_inner_berry);
}

cJSON *berry_flavor_detail_berries_inner_berry_convertToJSON(berry_flavor_detail_berries_inner_berry_t *berry_flavor_detail_berries_inner_berry) {
    cJSON *item = cJSON_CreateObject();

    // berry_flavor_detail_berries_inner_berry->name
    if(berry_flavor_detail_berries_inner_berry->name) {
    if(cJSON_AddStringToObject(item, "name", berry_flavor_detail_berries_inner_berry->name) == NULL) {
    goto fail; //String
    }
    }


    // berry_flavor_detail_berries_inner_berry->url
    if(berry_flavor_detail_berries_inner_berry->url) {
    if(cJSON_AddStringToObject(item, "url", berry_flavor_detail_berries_inner_berry->url) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

berry_flavor_detail_berries_inner_berry_t *berry_flavor_detail_berries_inner_berry_parseFromJSON(cJSON *berry_flavor_detail_berries_inner_berryJSON){

    berry_flavor_detail_berries_inner_berry_t *berry_flavor_detail_berries_inner_berry_local_var = NULL;

    // berry_flavor_detail_berries_inner_berry->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(berry_flavor_detail_berries_inner_berryJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // berry_flavor_detail_berries_inner_berry->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(berry_flavor_detail_berries_inner_berryJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }


    berry_flavor_detail_berries_inner_berry_local_var = berry_flavor_detail_berries_inner_berry_create_internal (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        url && !cJSON_IsNull(url) ? strdup(url->valuestring) : NULL
        );

    return berry_flavor_detail_berries_inner_berry_local_var;
end:
    return NULL;

}
