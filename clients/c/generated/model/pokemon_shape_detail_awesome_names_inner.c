#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_shape_detail_awesome_names_inner.h"



static pokemon_shape_detail_awesome_names_inner_t *pokemon_shape_detail_awesome_names_inner_create_internal(
    char *awesome_name,
    ability_detail_pokemon_inner_pokemon_t *language
    ) {
    pokemon_shape_detail_awesome_names_inner_t *pokemon_shape_detail_awesome_names_inner_local_var = malloc(sizeof(pokemon_shape_detail_awesome_names_inner_t));
    if (!pokemon_shape_detail_awesome_names_inner_local_var) {
        return NULL;
    }
    memset(pokemon_shape_detail_awesome_names_inner_local_var, 0, sizeof(pokemon_shape_detail_awesome_names_inner_t));
    pokemon_shape_detail_awesome_names_inner_local_var->_library_owned = 1;
    pokemon_shape_detail_awesome_names_inner_local_var->awesome_name = awesome_name;
    pokemon_shape_detail_awesome_names_inner_local_var->language = language;
    return pokemon_shape_detail_awesome_names_inner_local_var;
}

__attribute__((deprecated)) pokemon_shape_detail_awesome_names_inner_t *pokemon_shape_detail_awesome_names_inner_create(
    char *awesome_name,
    ability_detail_pokemon_inner_pokemon_t *language
    ) {
    pokemon_shape_detail_awesome_names_inner_t *result = pokemon_shape_detail_awesome_names_inner_create_internal (
        awesome_name,
        language
        );
    if (!result) {
    }
    return result;
}

void pokemon_shape_detail_awesome_names_inner_free(pokemon_shape_detail_awesome_names_inner_t *pokemon_shape_detail_awesome_names_inner) {
    if(NULL == pokemon_shape_detail_awesome_names_inner){
        return ;
    }
    if(pokemon_shape_detail_awesome_names_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_shape_detail_awesome_names_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_shape_detail_awesome_names_inner->awesome_name) {
        free(pokemon_shape_detail_awesome_names_inner->awesome_name);
        pokemon_shape_detail_awesome_names_inner->awesome_name = NULL;
    }
    if (pokemon_shape_detail_awesome_names_inner->language) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_shape_detail_awesome_names_inner->language);
        pokemon_shape_detail_awesome_names_inner->language = NULL;
    }
    free(pokemon_shape_detail_awesome_names_inner);
}

cJSON *pokemon_shape_detail_awesome_names_inner_convertToJSON(pokemon_shape_detail_awesome_names_inner_t *pokemon_shape_detail_awesome_names_inner) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_shape_detail_awesome_names_inner->awesome_name
    if (!pokemon_shape_detail_awesome_names_inner->awesome_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "awesome_name", pokemon_shape_detail_awesome_names_inner->awesome_name) == NULL) {
    goto fail; //String
    }


    // pokemon_shape_detail_awesome_names_inner->language
    if (!pokemon_shape_detail_awesome_names_inner->language) {
        goto fail;
    }
    cJSON *language_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(pokemon_shape_detail_awesome_names_inner->language);
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

pokemon_shape_detail_awesome_names_inner_t *pokemon_shape_detail_awesome_names_inner_parseFromJSON(cJSON *pokemon_shape_detail_awesome_names_innerJSON){

    pokemon_shape_detail_awesome_names_inner_t *pokemon_shape_detail_awesome_names_inner_local_var = NULL;

    char *awesome_name_local_str = NULL;

    // define the local variable for pokemon_shape_detail_awesome_names_inner->language
    ability_detail_pokemon_inner_pokemon_t *language_local_nonprim = NULL;

    // pokemon_shape_detail_awesome_names_inner->awesome_name
    cJSON *awesome_name = cJSON_GetObjectItemCaseSensitive(pokemon_shape_detail_awesome_names_innerJSON, "awesome_name");
    if (cJSON_IsNull(awesome_name)) {
        awesome_name = NULL;
    }
    if (!awesome_name) {
        goto end;
    }

    
    if(!cJSON_IsString(awesome_name))
    {
    goto end; //String
    }

    // pokemon_shape_detail_awesome_names_inner->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(pokemon_shape_detail_awesome_names_innerJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(language); //nonprimitive


    if (awesome_name && !cJSON_IsNull(awesome_name)) awesome_name_local_str = strdup(awesome_name->valuestring);

    pokemon_shape_detail_awesome_names_inner_local_var = pokemon_shape_detail_awesome_names_inner_create_internal (
        awesome_name_local_str,
        language_local_nonprim
        );

    if (!pokemon_shape_detail_awesome_names_inner_local_var) {
        goto end;
    }

    return pokemon_shape_detail_awesome_names_inner_local_var;
end:
    if (awesome_name_local_str) {
        free(awesome_name_local_str);
        awesome_name_local_str = NULL;
    }
    if (language_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
