#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "encounter_condition_name.h"



static encounter_condition_name_t *encounter_condition_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    encounter_condition_name_t *encounter_condition_name_local_var = malloc(sizeof(encounter_condition_name_t));
    if (!encounter_condition_name_local_var) {
        return NULL;
    }
    encounter_condition_name_local_var->name = name;
    encounter_condition_name_local_var->language = language;

    encounter_condition_name_local_var->_library_owned = 1;
    return encounter_condition_name_local_var;
}

__attribute__((deprecated)) encounter_condition_name_t *encounter_condition_name_create(
    char *name,
    language_summary_t *language
    ) {
    return encounter_condition_name_create_internal (
        name,
        language
        );
}

void encounter_condition_name_free(encounter_condition_name_t *encounter_condition_name) {
    if(NULL == encounter_condition_name){
        return ;
    }
    if(encounter_condition_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "encounter_condition_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (encounter_condition_name->name) {
        free(encounter_condition_name->name);
        encounter_condition_name->name = NULL;
    }
    if (encounter_condition_name->language) {
        language_summary_free(encounter_condition_name->language);
        encounter_condition_name->language = NULL;
    }
    free(encounter_condition_name);
}

cJSON *encounter_condition_name_convertToJSON(encounter_condition_name_t *encounter_condition_name) {
    cJSON *item = cJSON_CreateObject();

    // encounter_condition_name->name
    if (!encounter_condition_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", encounter_condition_name->name) == NULL) {
    goto fail; //String
    }


    // encounter_condition_name->language
    if (!encounter_condition_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(encounter_condition_name->language);
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

encounter_condition_name_t *encounter_condition_name_parseFromJSON(cJSON *encounter_condition_nameJSON){

    encounter_condition_name_t *encounter_condition_name_local_var = NULL;

    // define the local variable for encounter_condition_name->language
    language_summary_t *language_local_nonprim = NULL;

    // encounter_condition_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(encounter_condition_nameJSON, "name");
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

    // encounter_condition_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(encounter_condition_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    encounter_condition_name_local_var = encounter_condition_name_create_internal (
        strdup(name->valuestring),
        language_local_nonprim
        );

    return encounter_condition_name_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
