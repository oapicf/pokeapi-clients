#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "nature_name.h"



static nature_name_t *nature_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    nature_name_t *nature_name_local_var = malloc(sizeof(nature_name_t));
    if (!nature_name_local_var) {
        return NULL;
    }
    memset(nature_name_local_var, 0, sizeof(nature_name_t));
    nature_name_local_var->_library_owned = 1;
    nature_name_local_var->name = name;
    nature_name_local_var->language = language;
    return nature_name_local_var;
}

__attribute__((deprecated)) nature_name_t *nature_name_create(
    char *name,
    language_summary_t *language
    ) {
    nature_name_t *result = nature_name_create_internal (
        name,
        language
        );
    if (!result) {
    }
    return result;
}

void nature_name_free(nature_name_t *nature_name) {
    if(NULL == nature_name){
        return ;
    }
    if(nature_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "nature_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (nature_name->name) {
        free(nature_name->name);
        nature_name->name = NULL;
    }
    if (nature_name->language) {
        language_summary_free(nature_name->language);
        nature_name->language = NULL;
    }
    free(nature_name);
}

cJSON *nature_name_convertToJSON(nature_name_t *nature_name) {
    cJSON *item = cJSON_CreateObject();

    // nature_name->name
    if (!nature_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", nature_name->name) == NULL) {
    goto fail; //String
    }


    // nature_name->language
    if (!nature_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(nature_name->language);
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

nature_name_t *nature_name_parseFromJSON(cJSON *nature_nameJSON){

    nature_name_t *nature_name_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for nature_name->language
    language_summary_t *language_local_nonprim = NULL;

    // nature_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(nature_nameJSON, "name");
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

    // nature_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(nature_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    nature_name_local_var = nature_name_create_internal (
        name_local_str,
        language_local_nonprim
        );

    if (!nature_name_local_var) {
        goto end;
    }

    return nature_name_local_var;
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
