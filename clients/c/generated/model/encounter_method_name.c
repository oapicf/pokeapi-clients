#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "encounter_method_name.h"



static encounter_method_name_t *encounter_method_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    encounter_method_name_t *encounter_method_name_local_var = malloc(sizeof(encounter_method_name_t));
    if (!encounter_method_name_local_var) {
        return NULL;
    }
    memset(encounter_method_name_local_var, 0, sizeof(encounter_method_name_t));
    encounter_method_name_local_var->_library_owned = 1;
    encounter_method_name_local_var->name = name;
    encounter_method_name_local_var->language = language;
    return encounter_method_name_local_var;
}

__attribute__((deprecated)) encounter_method_name_t *encounter_method_name_create(
    char *name,
    language_summary_t *language
    ) {
    encounter_method_name_t *result = encounter_method_name_create_internal (
        name,
        language
        );
    if (!result) {
    }
    return result;
}

void encounter_method_name_free(encounter_method_name_t *encounter_method_name) {
    if(NULL == encounter_method_name){
        return ;
    }
    if(encounter_method_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "encounter_method_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (encounter_method_name->name) {
        free(encounter_method_name->name);
        encounter_method_name->name = NULL;
    }
    if (encounter_method_name->language) {
        language_summary_free(encounter_method_name->language);
        encounter_method_name->language = NULL;
    }
    free(encounter_method_name);
}

cJSON *encounter_method_name_convertToJSON(encounter_method_name_t *encounter_method_name) {
    cJSON *item = cJSON_CreateObject();

    // encounter_method_name->name
    if (!encounter_method_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", encounter_method_name->name) == NULL) {
    goto fail; //String
    }


    // encounter_method_name->language
    if (!encounter_method_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(encounter_method_name->language);
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

encounter_method_name_t *encounter_method_name_parseFromJSON(cJSON *encounter_method_nameJSON){

    encounter_method_name_t *encounter_method_name_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for encounter_method_name->language
    language_summary_t *language_local_nonprim = NULL;

    // encounter_method_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(encounter_method_nameJSON, "name");
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

    // encounter_method_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(encounter_method_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    encounter_method_name_local_var = encounter_method_name_create_internal (
        name_local_str,
        language_local_nonprim
        );

    if (!encounter_method_name_local_var) {
        goto end;
    }

    return encounter_method_name_local_var;
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
