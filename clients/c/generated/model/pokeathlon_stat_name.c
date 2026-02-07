#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokeathlon_stat_name.h"



static pokeathlon_stat_name_t *pokeathlon_stat_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    pokeathlon_stat_name_t *pokeathlon_stat_name_local_var = malloc(sizeof(pokeathlon_stat_name_t));
    if (!pokeathlon_stat_name_local_var) {
        return NULL;
    }
    pokeathlon_stat_name_local_var->name = name;
    pokeathlon_stat_name_local_var->language = language;

    pokeathlon_stat_name_local_var->_library_owned = 1;
    return pokeathlon_stat_name_local_var;
}

__attribute__((deprecated)) pokeathlon_stat_name_t *pokeathlon_stat_name_create(
    char *name,
    language_summary_t *language
    ) {
    return pokeathlon_stat_name_create_internal (
        name,
        language
        );
}

void pokeathlon_stat_name_free(pokeathlon_stat_name_t *pokeathlon_stat_name) {
    if(NULL == pokeathlon_stat_name){
        return ;
    }
    if(pokeathlon_stat_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokeathlon_stat_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokeathlon_stat_name->name) {
        free(pokeathlon_stat_name->name);
        pokeathlon_stat_name->name = NULL;
    }
    if (pokeathlon_stat_name->language) {
        language_summary_free(pokeathlon_stat_name->language);
        pokeathlon_stat_name->language = NULL;
    }
    free(pokeathlon_stat_name);
}

cJSON *pokeathlon_stat_name_convertToJSON(pokeathlon_stat_name_t *pokeathlon_stat_name) {
    cJSON *item = cJSON_CreateObject();

    // pokeathlon_stat_name->name
    if (!pokeathlon_stat_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokeathlon_stat_name->name) == NULL) {
    goto fail; //String
    }


    // pokeathlon_stat_name->language
    if (!pokeathlon_stat_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(pokeathlon_stat_name->language);
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

pokeathlon_stat_name_t *pokeathlon_stat_name_parseFromJSON(cJSON *pokeathlon_stat_nameJSON){

    pokeathlon_stat_name_t *pokeathlon_stat_name_local_var = NULL;

    // define the local variable for pokeathlon_stat_name->language
    language_summary_t *language_local_nonprim = NULL;

    // pokeathlon_stat_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokeathlon_stat_nameJSON, "name");
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

    // pokeathlon_stat_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(pokeathlon_stat_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    pokeathlon_stat_name_local_var = pokeathlon_stat_name_create_internal (
        strdup(name->valuestring),
        language_local_nonprim
        );

    return pokeathlon_stat_name_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
