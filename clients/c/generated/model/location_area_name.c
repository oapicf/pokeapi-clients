#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "location_area_name.h"



static location_area_name_t *location_area_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    location_area_name_t *location_area_name_local_var = malloc(sizeof(location_area_name_t));
    if (!location_area_name_local_var) {
        return NULL;
    }
    memset(location_area_name_local_var, 0, sizeof(location_area_name_t));
    location_area_name_local_var->_library_owned = 1;
    location_area_name_local_var->name = name;
    location_area_name_local_var->language = language;
    return location_area_name_local_var;
}

__attribute__((deprecated)) location_area_name_t *location_area_name_create(
    char *name,
    language_summary_t *language
    ) {
    location_area_name_t *result = location_area_name_create_internal (
        name,
        language
        );
    if (!result) {
    }
    return result;
}

void location_area_name_free(location_area_name_t *location_area_name) {
    if(NULL == location_area_name){
        return ;
    }
    if(location_area_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "location_area_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (location_area_name->name) {
        free(location_area_name->name);
        location_area_name->name = NULL;
    }
    if (location_area_name->language) {
        language_summary_free(location_area_name->language);
        location_area_name->language = NULL;
    }
    free(location_area_name);
}

cJSON *location_area_name_convertToJSON(location_area_name_t *location_area_name) {
    cJSON *item = cJSON_CreateObject();

    // location_area_name->name
    if (!location_area_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", location_area_name->name) == NULL) {
    goto fail; //String
    }


    // location_area_name->language
    if (!location_area_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(location_area_name->language);
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

location_area_name_t *location_area_name_parseFromJSON(cJSON *location_area_nameJSON){

    location_area_name_t *location_area_name_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for location_area_name->language
    language_summary_t *language_local_nonprim = NULL;

    // location_area_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(location_area_nameJSON, "name");
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

    // location_area_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(location_area_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    location_area_name_local_var = location_area_name_create_internal (
        name_local_str,
        language_local_nonprim
        );

    if (!location_area_name_local_var) {
        goto end;
    }

    return location_area_name_local_var;
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
