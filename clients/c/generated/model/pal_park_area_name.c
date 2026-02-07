#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pal_park_area_name.h"



static pal_park_area_name_t *pal_park_area_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    pal_park_area_name_t *pal_park_area_name_local_var = malloc(sizeof(pal_park_area_name_t));
    if (!pal_park_area_name_local_var) {
        return NULL;
    }
    pal_park_area_name_local_var->name = name;
    pal_park_area_name_local_var->language = language;

    pal_park_area_name_local_var->_library_owned = 1;
    return pal_park_area_name_local_var;
}

__attribute__((deprecated)) pal_park_area_name_t *pal_park_area_name_create(
    char *name,
    language_summary_t *language
    ) {
    return pal_park_area_name_create_internal (
        name,
        language
        );
}

void pal_park_area_name_free(pal_park_area_name_t *pal_park_area_name) {
    if(NULL == pal_park_area_name){
        return ;
    }
    if(pal_park_area_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pal_park_area_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pal_park_area_name->name) {
        free(pal_park_area_name->name);
        pal_park_area_name->name = NULL;
    }
    if (pal_park_area_name->language) {
        language_summary_free(pal_park_area_name->language);
        pal_park_area_name->language = NULL;
    }
    free(pal_park_area_name);
}

cJSON *pal_park_area_name_convertToJSON(pal_park_area_name_t *pal_park_area_name) {
    cJSON *item = cJSON_CreateObject();

    // pal_park_area_name->name
    if (!pal_park_area_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pal_park_area_name->name) == NULL) {
    goto fail; //String
    }


    // pal_park_area_name->language
    if (!pal_park_area_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(pal_park_area_name->language);
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

pal_park_area_name_t *pal_park_area_name_parseFromJSON(cJSON *pal_park_area_nameJSON){

    pal_park_area_name_t *pal_park_area_name_local_var = NULL;

    // define the local variable for pal_park_area_name->language
    language_summary_t *language_local_nonprim = NULL;

    // pal_park_area_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pal_park_area_nameJSON, "name");
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

    // pal_park_area_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(pal_park_area_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    pal_park_area_name_local_var = pal_park_area_name_create_internal (
        strdup(name->valuestring),
        language_local_nonprim
        );

    return pal_park_area_name_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
