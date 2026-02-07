#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "evolution_trigger_name.h"



static evolution_trigger_name_t *evolution_trigger_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    evolution_trigger_name_t *evolution_trigger_name_local_var = malloc(sizeof(evolution_trigger_name_t));
    if (!evolution_trigger_name_local_var) {
        return NULL;
    }
    evolution_trigger_name_local_var->name = name;
    evolution_trigger_name_local_var->language = language;

    evolution_trigger_name_local_var->_library_owned = 1;
    return evolution_trigger_name_local_var;
}

__attribute__((deprecated)) evolution_trigger_name_t *evolution_trigger_name_create(
    char *name,
    language_summary_t *language
    ) {
    return evolution_trigger_name_create_internal (
        name,
        language
        );
}

void evolution_trigger_name_free(evolution_trigger_name_t *evolution_trigger_name) {
    if(NULL == evolution_trigger_name){
        return ;
    }
    if(evolution_trigger_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "evolution_trigger_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (evolution_trigger_name->name) {
        free(evolution_trigger_name->name);
        evolution_trigger_name->name = NULL;
    }
    if (evolution_trigger_name->language) {
        language_summary_free(evolution_trigger_name->language);
        evolution_trigger_name->language = NULL;
    }
    free(evolution_trigger_name);
}

cJSON *evolution_trigger_name_convertToJSON(evolution_trigger_name_t *evolution_trigger_name) {
    cJSON *item = cJSON_CreateObject();

    // evolution_trigger_name->name
    if (!evolution_trigger_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", evolution_trigger_name->name) == NULL) {
    goto fail; //String
    }


    // evolution_trigger_name->language
    if (!evolution_trigger_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(evolution_trigger_name->language);
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

evolution_trigger_name_t *evolution_trigger_name_parseFromJSON(cJSON *evolution_trigger_nameJSON){

    evolution_trigger_name_t *evolution_trigger_name_local_var = NULL;

    // define the local variable for evolution_trigger_name->language
    language_summary_t *language_local_nonprim = NULL;

    // evolution_trigger_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(evolution_trigger_nameJSON, "name");
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

    // evolution_trigger_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(evolution_trigger_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    evolution_trigger_name_local_var = evolution_trigger_name_create_internal (
        strdup(name->valuestring),
        language_local_nonprim
        );

    return evolution_trigger_name_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
