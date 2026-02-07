#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "version_name.h"



static version_name_t *version_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    version_name_t *version_name_local_var = malloc(sizeof(version_name_t));
    if (!version_name_local_var) {
        return NULL;
    }
    version_name_local_var->name = name;
    version_name_local_var->language = language;

    version_name_local_var->_library_owned = 1;
    return version_name_local_var;
}

__attribute__((deprecated)) version_name_t *version_name_create(
    char *name,
    language_summary_t *language
    ) {
    return version_name_create_internal (
        name,
        language
        );
}

void version_name_free(version_name_t *version_name) {
    if(NULL == version_name){
        return ;
    }
    if(version_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "version_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (version_name->name) {
        free(version_name->name);
        version_name->name = NULL;
    }
    if (version_name->language) {
        language_summary_free(version_name->language);
        version_name->language = NULL;
    }
    free(version_name);
}

cJSON *version_name_convertToJSON(version_name_t *version_name) {
    cJSON *item = cJSON_CreateObject();

    // version_name->name
    if (!version_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", version_name->name) == NULL) {
    goto fail; //String
    }


    // version_name->language
    if (!version_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(version_name->language);
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

version_name_t *version_name_parseFromJSON(cJSON *version_nameJSON){

    version_name_t *version_name_local_var = NULL;

    // define the local variable for version_name->language
    language_summary_t *language_local_nonprim = NULL;

    // version_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(version_nameJSON, "name");
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

    // version_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(version_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    version_name_local_var = version_name_create_internal (
        strdup(name->valuestring),
        language_local_nonprim
        );

    return version_name_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
