#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokedex_description.h"



static pokedex_description_t *pokedex_description_create_internal(
    char *description,
    language_summary_t *language
    ) {
    pokedex_description_t *pokedex_description_local_var = malloc(sizeof(pokedex_description_t));
    if (!pokedex_description_local_var) {
        return NULL;
    }
    pokedex_description_local_var->description = description;
    pokedex_description_local_var->language = language;

    pokedex_description_local_var->_library_owned = 1;
    return pokedex_description_local_var;
}

__attribute__((deprecated)) pokedex_description_t *pokedex_description_create(
    char *description,
    language_summary_t *language
    ) {
    return pokedex_description_create_internal (
        description,
        language
        );
}

void pokedex_description_free(pokedex_description_t *pokedex_description) {
    if(NULL == pokedex_description){
        return ;
    }
    if(pokedex_description->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokedex_description_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokedex_description->description) {
        free(pokedex_description->description);
        pokedex_description->description = NULL;
    }
    if (pokedex_description->language) {
        language_summary_free(pokedex_description->language);
        pokedex_description->language = NULL;
    }
    free(pokedex_description);
}

cJSON *pokedex_description_convertToJSON(pokedex_description_t *pokedex_description) {
    cJSON *item = cJSON_CreateObject();

    // pokedex_description->description
    if(pokedex_description->description) {
    if(cJSON_AddStringToObject(item, "description", pokedex_description->description) == NULL) {
    goto fail; //String
    }
    }


    // pokedex_description->language
    if (!pokedex_description->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(pokedex_description->language);
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

pokedex_description_t *pokedex_description_parseFromJSON(cJSON *pokedex_descriptionJSON){

    pokedex_description_t *pokedex_description_local_var = NULL;

    // define the local variable for pokedex_description->language
    language_summary_t *language_local_nonprim = NULL;

    // pokedex_description->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(pokedex_descriptionJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // pokedex_description->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(pokedex_descriptionJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    pokedex_description_local_var = pokedex_description_create_internal (
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        language_local_nonprim
        );

    return pokedex_description_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
