#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "evolution_variable_description.h"



static evolution_variable_description_t *evolution_variable_description_create_internal(
    char *description,
    language_summary_t *language
    ) {
    evolution_variable_description_t *evolution_variable_description_local_var = malloc(sizeof(evolution_variable_description_t));
    if (!evolution_variable_description_local_var) {
        return NULL;
    }
    memset(evolution_variable_description_local_var, 0, sizeof(evolution_variable_description_t));
    evolution_variable_description_local_var->_library_owned = 1;
    evolution_variable_description_local_var->description = description;
    evolution_variable_description_local_var->language = language;
    return evolution_variable_description_local_var;
}

__attribute__((deprecated)) evolution_variable_description_t *evolution_variable_description_create(
    char *description,
    language_summary_t *language
    ) {
    evolution_variable_description_t *result = evolution_variable_description_create_internal (
        description,
        language
        );
    if (!result) {
    }
    return result;
}

void evolution_variable_description_free(evolution_variable_description_t *evolution_variable_description) {
    if(NULL == evolution_variable_description){
        return ;
    }
    if(evolution_variable_description->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "evolution_variable_description_free");
        return ;
    }
    listEntry_t *listEntry;
    if (evolution_variable_description->description) {
        free(evolution_variable_description->description);
        evolution_variable_description->description = NULL;
    }
    if (evolution_variable_description->language) {
        language_summary_free(evolution_variable_description->language);
        evolution_variable_description->language = NULL;
    }
    free(evolution_variable_description);
}

cJSON *evolution_variable_description_convertToJSON(evolution_variable_description_t *evolution_variable_description) {
    cJSON *item = cJSON_CreateObject();

    // evolution_variable_description->description
    if(evolution_variable_description->description) {
    if(cJSON_AddStringToObject(item, "description", evolution_variable_description->description) == NULL) {
    goto fail; //String
    }
    }


    // evolution_variable_description->language
    if (!evolution_variable_description->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(evolution_variable_description->language);
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

evolution_variable_description_t *evolution_variable_description_parseFromJSON(cJSON *evolution_variable_descriptionJSON){

    evolution_variable_description_t *evolution_variable_description_local_var = NULL;

    char *description_local_str = NULL;

    // define the local variable for evolution_variable_description->language
    language_summary_t *language_local_nonprim = NULL;

    // evolution_variable_description->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(evolution_variable_descriptionJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // evolution_variable_description->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(evolution_variable_descriptionJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);

    evolution_variable_description_local_var = evolution_variable_description_create_internal (
        description_local_str,
        language_local_nonprim
        );

    if (!evolution_variable_description_local_var) {
        goto end;
    }

    return evolution_variable_description_local_var;
end:
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
