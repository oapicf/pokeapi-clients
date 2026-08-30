#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "language_name.h"



static language_name_t *language_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    language_name_t *language_name_local_var = malloc(sizeof(language_name_t));
    if (!language_name_local_var) {
        return NULL;
    }
    memset(language_name_local_var, 0, sizeof(language_name_t));
    language_name_local_var->_library_owned = 1;
    language_name_local_var->name = name;
    language_name_local_var->language = language;
    return language_name_local_var;
}

__attribute__((deprecated)) language_name_t *language_name_create(
    char *name,
    language_summary_t *language
    ) {
    language_name_t *result = language_name_create_internal (
        name,
        language
        );
    if (!result) {
    }
    return result;
}

void language_name_free(language_name_t *language_name) {
    if(NULL == language_name){
        return ;
    }
    if(language_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "language_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (language_name->name) {
        free(language_name->name);
        language_name->name = NULL;
    }
    if (language_name->language) {
        language_summary_free(language_name->language);
        language_name->language = NULL;
    }
    free(language_name);
}

cJSON *language_name_convertToJSON(language_name_t *language_name) {
    cJSON *item = cJSON_CreateObject();

    // language_name->name
    if (!language_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", language_name->name) == NULL) {
    goto fail; //String
    }


    // language_name->language
    if (!language_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(language_name->language);
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

language_name_t *language_name_parseFromJSON(cJSON *language_nameJSON){

    language_name_t *language_name_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for language_name->language
    language_summary_t *language_local_nonprim = NULL;

    // language_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(language_nameJSON, "name");
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

    // language_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(language_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    language_name_local_var = language_name_create_internal (
        name_local_str,
        language_local_nonprim
        );

    if (!language_name_local_var) {
        goto end;
    }

    return language_name_local_var;
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
