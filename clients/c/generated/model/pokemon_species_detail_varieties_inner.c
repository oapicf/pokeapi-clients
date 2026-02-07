#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_species_detail_varieties_inner.h"



static pokemon_species_detail_varieties_inner_t *pokemon_species_detail_varieties_inner_create_internal(
    int is_default,
    ability_detail_pokemon_inner_pokemon_t *pokemon
    ) {
    pokemon_species_detail_varieties_inner_t *pokemon_species_detail_varieties_inner_local_var = malloc(sizeof(pokemon_species_detail_varieties_inner_t));
    if (!pokemon_species_detail_varieties_inner_local_var) {
        return NULL;
    }
    pokemon_species_detail_varieties_inner_local_var->is_default = is_default;
    pokemon_species_detail_varieties_inner_local_var->pokemon = pokemon;

    pokemon_species_detail_varieties_inner_local_var->_library_owned = 1;
    return pokemon_species_detail_varieties_inner_local_var;
}

__attribute__((deprecated)) pokemon_species_detail_varieties_inner_t *pokemon_species_detail_varieties_inner_create(
    int is_default,
    ability_detail_pokemon_inner_pokemon_t *pokemon
    ) {
    return pokemon_species_detail_varieties_inner_create_internal (
        is_default,
        pokemon
        );
}

void pokemon_species_detail_varieties_inner_free(pokemon_species_detail_varieties_inner_t *pokemon_species_detail_varieties_inner) {
    if(NULL == pokemon_species_detail_varieties_inner){
        return ;
    }
    if(pokemon_species_detail_varieties_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_species_detail_varieties_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_species_detail_varieties_inner->pokemon) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_species_detail_varieties_inner->pokemon);
        pokemon_species_detail_varieties_inner->pokemon = NULL;
    }
    free(pokemon_species_detail_varieties_inner);
}

cJSON *pokemon_species_detail_varieties_inner_convertToJSON(pokemon_species_detail_varieties_inner_t *pokemon_species_detail_varieties_inner) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_species_detail_varieties_inner->is_default
    if (!pokemon_species_detail_varieties_inner->is_default) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "is_default", pokemon_species_detail_varieties_inner->is_default) == NULL) {
    goto fail; //Bool
    }


    // pokemon_species_detail_varieties_inner->pokemon
    if (!pokemon_species_detail_varieties_inner->pokemon) {
        goto fail;
    }
    cJSON *pokemon_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(pokemon_species_detail_varieties_inner->pokemon);
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

pokemon_species_detail_varieties_inner_t *pokemon_species_detail_varieties_inner_parseFromJSON(cJSON *pokemon_species_detail_varieties_innerJSON){

    pokemon_species_detail_varieties_inner_t *pokemon_species_detail_varieties_inner_local_var = NULL;

    // define the local variable for pokemon_species_detail_varieties_inner->pokemon
    ability_detail_pokemon_inner_pokemon_t *pokemon_local_nonprim = NULL;

    // pokemon_species_detail_varieties_inner->is_default
    cJSON *is_default = cJSON_GetObjectItemCaseSensitive(pokemon_species_detail_varieties_innerJSON, "is_default");
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

    // pokemon_species_detail_varieties_inner->pokemon
    cJSON *pokemon = cJSON_GetObjectItemCaseSensitive(pokemon_species_detail_varieties_innerJSON, "pokemon");
    if (cJSON_IsNull(pokemon)) {
        pokemon = NULL;
    }
    if (!pokemon) {
        goto end;
    }

    
    pokemon_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(pokemon); //nonprimitive


    pokemon_species_detail_varieties_inner_local_var = pokemon_species_detail_varieties_inner_create_internal (
        is_default->valueint,
        pokemon_local_nonprim
        );

    return pokemon_species_detail_varieties_inner_local_var;
end:
    if (pokemon_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_local_nonprim);
        pokemon_local_nonprim = NULL;
    }
    return NULL;

}
