#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "region_name.h"



static region_name_t *region_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    region_name_t *region_name_local_var = malloc(sizeof(region_name_t));
    if (!region_name_local_var) {
        return NULL;
    }
    memset(region_name_local_var, 0, sizeof(region_name_t));
    region_name_local_var->_library_owned = 1;
    region_name_local_var->name = name;
    region_name_local_var->language = language;
    return region_name_local_var;
}

__attribute__((deprecated)) region_name_t *region_name_create(
    char *name,
    language_summary_t *language
    ) {
    region_name_t *result = region_name_create_internal (
        name,
        language
        );
    if (!result) {
    }
    return result;
}

void region_name_free(region_name_t *region_name) {
    if(NULL == region_name){
        return ;
    }
    if(region_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "region_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (region_name->name) {
        free(region_name->name);
        region_name->name = NULL;
    }
    if (region_name->language) {
        language_summary_free(region_name->language);
        region_name->language = NULL;
    }
    free(region_name);
}

cJSON *region_name_convertToJSON(region_name_t *region_name) {
    cJSON *item = cJSON_CreateObject();

    // region_name->name
    if (!region_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", region_name->name) == NULL) {
    goto fail; //String
    }


    // region_name->language
    if (!region_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(region_name->language);
    if(language_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

region_name_t *region_name_parseFromJSON(cJSON *region_nameJSON){

    region_name_t *region_name_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for region_name->language
    language_summary_t *language_local_nonprim = NULL;

    // region_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(region_nameJSON, "name");
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

    // region_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(region_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    region_name_local_var = region_name_create_internal (
        name_local_str,
        language_local_nonprim
        );

    if (!region_name_local_var) {
        goto end;
    }

    return region_name_local_var;
end:
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
