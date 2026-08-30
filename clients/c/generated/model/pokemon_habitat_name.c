#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_habitat_name.h"



static pokemon_habitat_name_t *pokemon_habitat_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    pokemon_habitat_name_t *pokemon_habitat_name_local_var = malloc(sizeof(pokemon_habitat_name_t));
    if (!pokemon_habitat_name_local_var) {
        return NULL;
    }
    memset(pokemon_habitat_name_local_var, 0, sizeof(pokemon_habitat_name_t));
    pokemon_habitat_name_local_var->_library_owned = 1;
    pokemon_habitat_name_local_var->name = name;
    pokemon_habitat_name_local_var->language = language;
    return pokemon_habitat_name_local_var;
}

__attribute__((deprecated)) pokemon_habitat_name_t *pokemon_habitat_name_create(
    char *name,
    language_summary_t *language
    ) {
    pokemon_habitat_name_t *result = pokemon_habitat_name_create_internal (
        name,
        language
        );
    if (!result) {
    }
    return result;
}

void pokemon_habitat_name_free(pokemon_habitat_name_t *pokemon_habitat_name) {
    if(NULL == pokemon_habitat_name){
        return ;
    }
    if(pokemon_habitat_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_habitat_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_habitat_name->name) {
        free(pokemon_habitat_name->name);
        pokemon_habitat_name->name = NULL;
    }
    if (pokemon_habitat_name->language) {
        language_summary_free(pokemon_habitat_name->language);
        pokemon_habitat_name->language = NULL;
    }
    free(pokemon_habitat_name);
}

cJSON *pokemon_habitat_name_convertToJSON(pokemon_habitat_name_t *pokemon_habitat_name) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_habitat_name->name
    if (!pokemon_habitat_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokemon_habitat_name->name) == NULL) {
    goto fail; //String
    }


    // pokemon_habitat_name->language
    if (!pokemon_habitat_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(pokemon_habitat_name->language);
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

pokemon_habitat_name_t *pokemon_habitat_name_parseFromJSON(cJSON *pokemon_habitat_nameJSON){

    pokemon_habitat_name_t *pokemon_habitat_name_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for pokemon_habitat_name->language
    language_summary_t *language_local_nonprim = NULL;

    // pokemon_habitat_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokemon_habitat_nameJSON, "name");
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

    // pokemon_habitat_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(pokemon_habitat_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    pokemon_habitat_name_local_var = pokemon_habitat_name_create_internal (
        name_local_str,
        language_local_nonprim
        );

    if (!pokemon_habitat_name_local_var) {
        goto end;
    }

    return pokemon_habitat_name_local_var;
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
