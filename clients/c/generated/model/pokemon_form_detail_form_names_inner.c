#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_form_detail_form_names_inner.h"



static pokemon_form_detail_form_names_inner_t *pokemon_form_detail_form_names_inner_create_internal(
    ability_detail_pokemon_inner_pokemon_t *language,
    char *name
    ) {
    pokemon_form_detail_form_names_inner_t *pokemon_form_detail_form_names_inner_local_var = malloc(sizeof(pokemon_form_detail_form_names_inner_t));
    if (!pokemon_form_detail_form_names_inner_local_var) {
        return NULL;
    }
    pokemon_form_detail_form_names_inner_local_var->language = language;
    pokemon_form_detail_form_names_inner_local_var->name = name;

    pokemon_form_detail_form_names_inner_local_var->_library_owned = 1;
    return pokemon_form_detail_form_names_inner_local_var;
}

__attribute__((deprecated)) pokemon_form_detail_form_names_inner_t *pokemon_form_detail_form_names_inner_create(
    ability_detail_pokemon_inner_pokemon_t *language,
    char *name
    ) {
    return pokemon_form_detail_form_names_inner_create_internal (
        language,
        name
        );
}

void pokemon_form_detail_form_names_inner_free(pokemon_form_detail_form_names_inner_t *pokemon_form_detail_form_names_inner) {
    if(NULL == pokemon_form_detail_form_names_inner){
        return ;
    }
    if(pokemon_form_detail_form_names_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_form_detail_form_names_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_form_detail_form_names_inner->language) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_form_detail_form_names_inner->language);
        pokemon_form_detail_form_names_inner->language = NULL;
    }
    if (pokemon_form_detail_form_names_inner->name) {
        free(pokemon_form_detail_form_names_inner->name);
        pokemon_form_detail_form_names_inner->name = NULL;
    }
    free(pokemon_form_detail_form_names_inner);
}

cJSON *pokemon_form_detail_form_names_inner_convertToJSON(pokemon_form_detail_form_names_inner_t *pokemon_form_detail_form_names_inner) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_form_detail_form_names_inner->language
    if (!pokemon_form_detail_form_names_inner->language) {
        goto fail;
    }
    cJSON *language_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(pokemon_form_detail_form_names_inner->language);
    if(language_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_form_detail_form_names_inner->name
    if (!pokemon_form_detail_form_names_inner->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokemon_form_detail_form_names_inner->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_form_detail_form_names_inner_t *pokemon_form_detail_form_names_inner_parseFromJSON(cJSON *pokemon_form_detail_form_names_innerJSON){

    pokemon_form_detail_form_names_inner_t *pokemon_form_detail_form_names_inner_local_var = NULL;

    // define the local variable for pokemon_form_detail_form_names_inner->language
    ability_detail_pokemon_inner_pokemon_t *language_local_nonprim = NULL;

    // pokemon_form_detail_form_names_inner->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(pokemon_form_detail_form_names_innerJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(language); //nonprimitive

    // pokemon_form_detail_form_names_inner->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokemon_form_detail_form_names_innerJSON, "name");
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


    pokemon_form_detail_form_names_inner_local_var = pokemon_form_detail_form_names_inner_create_internal (
        language_local_nonprim,
        strdup(name->valuestring)
        );

    return pokemon_form_detail_form_names_inner_local_var;
end:
    if (language_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
