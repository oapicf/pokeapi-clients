#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "growth_rate_description.h"



static growth_rate_description_t *growth_rate_description_create_internal(
    char *description,
    language_summary_t *language
    ) {
    growth_rate_description_t *growth_rate_description_local_var = malloc(sizeof(growth_rate_description_t));
    if (!growth_rate_description_local_var) {
        return NULL;
    }
    growth_rate_description_local_var->description = description;
    growth_rate_description_local_var->language = language;

    growth_rate_description_local_var->_library_owned = 1;
    return growth_rate_description_local_var;
}

__attribute__((deprecated)) growth_rate_description_t *growth_rate_description_create(
    char *description,
    language_summary_t *language
    ) {
    return growth_rate_description_create_internal (
        description,
        language
        );
}

void growth_rate_description_free(growth_rate_description_t *growth_rate_description) {
    if(NULL == growth_rate_description){
        return ;
    }
    if(growth_rate_description->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "growth_rate_description_free");
        return ;
    }
    listEntry_t *listEntry;
    if (growth_rate_description->description) {
        free(growth_rate_description->description);
        growth_rate_description->description = NULL;
    }
    if (growth_rate_description->language) {
        language_summary_free(growth_rate_description->language);
        growth_rate_description->language = NULL;
    }
    free(growth_rate_description);
}

cJSON *growth_rate_description_convertToJSON(growth_rate_description_t *growth_rate_description) {
    cJSON *item = cJSON_CreateObject();

    // growth_rate_description->description
    if(growth_rate_description->description) {
    if(cJSON_AddStringToObject(item, "description", growth_rate_description->description) == NULL) {
    goto fail; //String
    }
    }


    // growth_rate_description->language
    if (!growth_rate_description->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(growth_rate_description->language);
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

growth_rate_description_t *growth_rate_description_parseFromJSON(cJSON *growth_rate_descriptionJSON){

    growth_rate_description_t *growth_rate_description_local_var = NULL;

    // define the local variable for growth_rate_description->language
    language_summary_t *language_local_nonprim = NULL;

    // growth_rate_description->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(growth_rate_descriptionJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // growth_rate_description->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(growth_rate_descriptionJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    growth_rate_description_local_var = growth_rate_description_create_internal (
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        language_local_nonprim
        );

    return growth_rate_description_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
