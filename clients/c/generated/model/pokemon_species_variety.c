#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_species_variety.h"



static pokemon_species_variety_t *pokemon_species_variety_create_internal(
    int *is_default,
    pokemon_summary_t *pokemon
    ) {
    pokemon_species_variety_t *pokemon_species_variety_local_var = malloc(sizeof(pokemon_species_variety_t));
    if (!pokemon_species_variety_local_var) {
        return NULL;
    }
    memset(pokemon_species_variety_local_var, 0, sizeof(pokemon_species_variety_t));
    pokemon_species_variety_local_var->_library_owned = 1;
    pokemon_species_variety_local_var->is_default = is_default;
    pokemon_species_variety_local_var->pokemon = pokemon;
    return pokemon_species_variety_local_var;
}

__attribute__((deprecated)) pokemon_species_variety_t *pokemon_species_variety_create(
    int *is_default,
    pokemon_summary_t *pokemon
    ) {
    int *is_default_copy = NULL;
    if (is_default) {
        is_default_copy = malloc(sizeof(int));
        if (is_default_copy) *is_default_copy = *is_default;
    }
    pokemon_species_variety_t *result = pokemon_species_variety_create_internal (
        is_default_copy,
        pokemon
        );
    if (!result) {
        free(is_default_copy);
    }
    return result;
}

void pokemon_species_variety_free(pokemon_species_variety_t *pokemon_species_variety) {
    if(NULL == pokemon_species_variety){
        return ;
    }
    if(pokemon_species_variety->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_species_variety_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_species_variety->is_default) {
        free(pokemon_species_variety->is_default);
        pokemon_species_variety->is_default = NULL;
    }
    if (pokemon_species_variety->pokemon) {
        pokemon_summary_free(pokemon_species_variety->pokemon);
        pokemon_species_variety->pokemon = NULL;
    }
    free(pokemon_species_variety);
}

cJSON *pokemon_species_variety_convertToJSON(pokemon_species_variety_t *pokemon_species_variety) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_species_variety->is_default
    if (!pokemon_species_variety->is_default) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "is_default", *pokemon_species_variety->is_default) == NULL) {
    goto fail; //Bool
    }


    // pokemon_species_variety->pokemon
    if (!pokemon_species_variety->pokemon) {
        goto fail;
    }
    cJSON *pokemon_local_JSON = pokemon_summary_convertToJSON(pokemon_species_variety->pokemon);
    if(pokemon_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pokemon", pokemon_local_JSON);
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

pokemon_species_variety_t *pokemon_species_variety_parseFromJSON(cJSON *pokemon_species_varietyJSON){

    pokemon_species_variety_t *pokemon_species_variety_local_var = NULL;

    // define the local variable for pokemon_species_variety->is_default
    int *is_default_local_var = NULL;

    // define the local variable for pokemon_species_variety->pokemon
    pokemon_summary_t *pokemon_local_nonprim = NULL;

    // pokemon_species_variety->is_default
    cJSON *is_default = cJSON_GetObjectItemCaseSensitive(pokemon_species_varietyJSON, "is_default");
    if (cJSON_IsNull(is_default)) {
        is_default = NULL;
    }
    if (!is_default) {
        goto end;
    }

    
    if(!cJSON_IsBool(is_default))
    {
    goto end; //Bool
    }
    is_default_local_var = malloc(sizeof(int));
    if(!is_default_local_var)
    {
        goto end;
    }
    *is_default_local_var = is_default->valueint;

    // pokemon_species_variety->pokemon
    cJSON *pokemon = cJSON_GetObjectItemCaseSensitive(pokemon_species_varietyJSON, "pokemon");
    if (cJSON_IsNull(pokemon)) {
        pokemon = NULL;
    }
    if (!pokemon) {
        goto end;
    }

    
    pokemon_local_nonprim = pokemon_summary_parseFromJSON(pokemon); //nonprimitive



    pokemon_species_variety_local_var = pokemon_species_variety_create_internal (
        is_default_local_var,
        pokemon_local_nonprim
        );

    if (!pokemon_species_variety_local_var) {
        goto end;
    }

    return pokemon_species_variety_local_var;
end:
    if (is_default_local_var) {
        free(is_default_local_var);
        is_default_local_var = NULL;
    }
    if (pokemon_local_nonprim) {
        pokemon_summary_free(pokemon_local_nonprim);
        pokemon_local_nonprim = NULL;
    }
    return NULL;

}
