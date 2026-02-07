#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "characteristic_description.h"



static characteristic_description_t *characteristic_description_create_internal(
    char *description,
    language_summary_t *language
    ) {
    characteristic_description_t *characteristic_description_local_var = malloc(sizeof(characteristic_description_t));
    if (!characteristic_description_local_var) {
        return NULL;
    }
    characteristic_description_local_var->description = description;
    characteristic_description_local_var->language = language;

    characteristic_description_local_var->_library_owned = 1;
    return characteristic_description_local_var;
}

__attribute__((deprecated)) characteristic_description_t *characteristic_description_create(
    char *description,
    language_summary_t *language
    ) {
    return characteristic_description_create_internal (
        description,
        language
        );
}

void characteristic_description_free(characteristic_description_t *characteristic_description) {
    if(NULL == characteristic_description){
        return ;
    }
    if(characteristic_description->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "characteristic_description_free");
        return ;
    }
    listEntry_t *listEntry;
    if (characteristic_description->description) {
        free(characteristic_description->description);
        characteristic_description->description = NULL;
    }
    if (characteristic_description->language) {
        language_summary_free(characteristic_description->language);
        characteristic_description->language = NULL;
    }
    free(characteristic_description);
}

cJSON *characteristic_description_convertToJSON(characteristic_description_t *characteristic_description) {
    cJSON *item = cJSON_CreateObject();

    // characteristic_description->description
    if(characteristic_description->description) {
    if(cJSON_AddStringToObject(item, "description", characteristic_description->description) == NULL) {
    goto fail; //String
    }
    }


    // characteristic_description->language
    if (!characteristic_description->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(characteristic_description->language);
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

characteristic_description_t *characteristic_description_parseFromJSON(cJSON *characteristic_descriptionJSON){

    characteristic_description_t *characteristic_description_local_var = NULL;

    // define the local variable for characteristic_description->language
    language_summary_t *language_local_nonprim = NULL;

    // characteristic_description->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(characteristic_descriptionJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // characteristic_description->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(characteristic_descriptionJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    characteristic_description_local_var = characteristic_description_create_internal (
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        language_local_nonprim
        );

    return characteristic_description_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
