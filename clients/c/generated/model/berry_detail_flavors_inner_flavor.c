#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "berry_detail_flavors_inner_flavor.h"



static berry_detail_flavors_inner_flavor_t *berry_detail_flavors_inner_flavor_create_internal(
    char *name,
    char *url
    ) {
    berry_detail_flavors_inner_flavor_t *berry_detail_flavors_inner_flavor_local_var = malloc(sizeof(berry_detail_flavors_inner_flavor_t));
    if (!berry_detail_flavors_inner_flavor_local_var) {
        return NULL;
    }
    berry_detail_flavors_inner_flavor_local_var->name = name;
    berry_detail_flavors_inner_flavor_local_var->url = url;

    berry_detail_flavors_inner_flavor_local_var->_library_owned = 1;
    return berry_detail_flavors_inner_flavor_local_var;
}

__attribute__((deprecated)) berry_detail_flavors_inner_flavor_t *berry_detail_flavors_inner_flavor_create(
    char *name,
    char *url
    ) {
    return berry_detail_flavors_inner_flavor_create_internal (
        name,
        url
        );
}

void berry_detail_flavors_inner_flavor_free(berry_detail_flavors_inner_flavor_t *berry_detail_flavors_inner_flavor) {
    if(NULL == berry_detail_flavors_inner_flavor){
        return ;
    }
    if(berry_detail_flavors_inner_flavor->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "berry_detail_flavors_inner_flavor_free");
        return ;
    }
    listEntry_t *listEntry;
    if (berry_detail_flavors_inner_flavor->name) {
        free(berry_detail_flavors_inner_flavor->name);
        berry_detail_flavors_inner_flavor->name = NULL;
    }
    if (berry_detail_flavors_inner_flavor->url) {
        free(berry_detail_flavors_inner_flavor->url);
        berry_detail_flavors_inner_flavor->url = NULL;
    }
    free(berry_detail_flavors_inner_flavor);
}

cJSON *berry_detail_flavors_inner_flavor_convertToJSON(berry_detail_flavors_inner_flavor_t *berry_detail_flavors_inner_flavor) {
    cJSON *item = cJSON_CreateObject();

    // berry_detail_flavors_inner_flavor->name
    if(berry_detail_flavors_inner_flavor->name) {
    if(cJSON_AddStringToObject(item, "name", berry_detail_flavors_inner_flavor->name) == NULL) {
    goto fail; //String
    }
    }


    // berry_detail_flavors_inner_flavor->url
    if(berry_detail_flavors_inner_flavor->url) {
    if(cJSON_AddStringToObject(item, "url", berry_detail_flavors_inner_flavor->url) == NULL) {
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

berry_detail_flavors_inner_flavor_t *berry_detail_flavors_inner_flavor_parseFromJSON(cJSON *berry_detail_flavors_inner_flavorJSON){

    berry_detail_flavors_inner_flavor_t *berry_detail_flavors_inner_flavor_local_var = NULL;

    // berry_detail_flavors_inner_flavor->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(berry_detail_flavors_inner_flavorJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // berry_detail_flavors_inner_flavor->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(berry_detail_flavors_inner_flavorJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }


    berry_detail_flavors_inner_flavor_local_var = berry_detail_flavors_inner_flavor_create_internal (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        url && !cJSON_IsNull(url) ? strdup(url->valuestring) : NULL
        );

    return berry_detail_flavors_inner_flavor_local_var;
end:
    return NULL;

}
