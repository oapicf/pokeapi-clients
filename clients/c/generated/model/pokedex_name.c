#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokedex_name.h"



static pokedex_name_t *pokedex_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    pokedex_name_t *pokedex_name_local_var = malloc(sizeof(pokedex_name_t));
    if (!pokedex_name_local_var) {
        return NULL;
    }
    pokedex_name_local_var->name = name;
    pokedex_name_local_var->language = language;

    pokedex_name_local_var->_library_owned = 1;
    return pokedex_name_local_var;
}

__attribute__((deprecated)) pokedex_name_t *pokedex_name_create(
    char *name,
    language_summary_t *language
    ) {
    return pokedex_name_create_internal (
        name,
        language
        );
}

void pokedex_name_free(pokedex_name_t *pokedex_name) {
    if(NULL == pokedex_name){
        return ;
    }
    if(pokedex_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokedex_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokedex_name->name) {
        free(pokedex_name->name);
        pokedex_name->name = NULL;
    }
    if (pokedex_name->language) {
        language_summary_free(pokedex_name->language);
        pokedex_name->language = NULL;
    }
    free(pokedex_name);
}

cJSON *pokedex_name_convertToJSON(pokedex_name_t *pokedex_name) {
    cJSON *item = cJSON_CreateObject();

    // pokedex_name->name
    if (!pokedex_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokedex_name->name) == NULL) {
    goto fail; //String
    }


    // pokedex_name->language
    if (!pokedex_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(pokedex_name->language);
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

pokedex_name_t *pokedex_name_parseFromJSON(cJSON *pokedex_nameJSON){

    pokedex_name_t *pokedex_name_local_var = NULL;

    // define the local variable for pokedex_name->language
    language_summary_t *language_local_nonprim = NULL;

    // pokedex_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokedex_nameJSON, "name");
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

    // pokedex_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(pokedex_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    pokedex_name_local_var = pokedex_name_create_internal (
        strdup(name->valuestring),
        language_local_nonprim
        );

    return pokedex_name_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
