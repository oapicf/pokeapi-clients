#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_attribute_description.h"



static item_attribute_description_t *item_attribute_description_create_internal(
    char *description,
    language_summary_t *language
    ) {
    item_attribute_description_t *item_attribute_description_local_var = malloc(sizeof(item_attribute_description_t));
    if (!item_attribute_description_local_var) {
        return NULL;
    }
    item_attribute_description_local_var->description = description;
    item_attribute_description_local_var->language = language;

    item_attribute_description_local_var->_library_owned = 1;
    return item_attribute_description_local_var;
}

__attribute__((deprecated)) item_attribute_description_t *item_attribute_description_create(
    char *description,
    language_summary_t *language
    ) {
    return item_attribute_description_create_internal (
        description,
        language
        );
}

void item_attribute_description_free(item_attribute_description_t *item_attribute_description) {
    if(NULL == item_attribute_description){
        return ;
    }
    if(item_attribute_description->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_attribute_description_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_attribute_description->description) {
        free(item_attribute_description->description);
        item_attribute_description->description = NULL;
    }
    if (item_attribute_description->language) {
        language_summary_free(item_attribute_description->language);
        item_attribute_description->language = NULL;
    }
    free(item_attribute_description);
}

cJSON *item_attribute_description_convertToJSON(item_attribute_description_t *item_attribute_description) {
    cJSON *item = cJSON_CreateObject();

    // item_attribute_description->description
    if(item_attribute_description->description) {
    if(cJSON_AddStringToObject(item, "description", item_attribute_description->description) == NULL) {
    goto fail; //String
    }
    }


    // item_attribute_description->language
    if (!item_attribute_description->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(item_attribute_description->language);
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

item_attribute_description_t *item_attribute_description_parseFromJSON(cJSON *item_attribute_descriptionJSON){

    item_attribute_description_t *item_attribute_description_local_var = NULL;

    // define the local variable for item_attribute_description->language
    language_summary_t *language_local_nonprim = NULL;

    // item_attribute_description->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(item_attribute_descriptionJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // item_attribute_description->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(item_attribute_descriptionJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    item_attribute_description_local_var = item_attribute_description_create_internal (
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        language_local_nonprim
        );

    return item_attribute_description_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
