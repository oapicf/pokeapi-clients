#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "location_name.h"



static location_name_t *location_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    location_name_t *location_name_local_var = malloc(sizeof(location_name_t));
    if (!location_name_local_var) {
        return NULL;
    }
    location_name_local_var->name = name;
    location_name_local_var->language = language;

    location_name_local_var->_library_owned = 1;
    return location_name_local_var;
}

__attribute__((deprecated)) location_name_t *location_name_create(
    char *name,
    language_summary_t *language
    ) {
    return location_name_create_internal (
        name,
        language
        );
}

void location_name_free(location_name_t *location_name) {
    if(NULL == location_name){
        return ;
    }
    if(location_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "location_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (location_name->name) {
        free(location_name->name);
        location_name->name = NULL;
    }
    if (location_name->language) {
        language_summary_free(location_name->language);
        location_name->language = NULL;
    }
    free(location_name);
}

cJSON *location_name_convertToJSON(location_name_t *location_name) {
    cJSON *item = cJSON_CreateObject();

    // location_name->name
    if (!location_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", location_name->name) == NULL) {
    goto fail; //String
    }


    // location_name->language
    if (!location_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(location_name->language);
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

location_name_t *location_name_parseFromJSON(cJSON *location_nameJSON){

    location_name_t *location_name_local_var = NULL;

    // define the local variable for location_name->language
    language_summary_t *language_local_nonprim = NULL;

    // location_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(location_nameJSON, "name");
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

    // location_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(location_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    location_name_local_var = location_name_create_internal (
        strdup(name->valuestring),
        language_local_nonprim
        );

    return location_name_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
