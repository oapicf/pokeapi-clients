#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokedex_detail_pokemon_entries_inner.h"



static pokedex_detail_pokemon_entries_inner_t *pokedex_detail_pokemon_entries_inner_create_internal(
    int entry_number,
    ability_detail_pokemon_inner_pokemon_t *pokemon_species
    ) {
    pokedex_detail_pokemon_entries_inner_t *pokedex_detail_pokemon_entries_inner_local_var = malloc(sizeof(pokedex_detail_pokemon_entries_inner_t));
    if (!pokedex_detail_pokemon_entries_inner_local_var) {
        return NULL;
    }
    pokedex_detail_pokemon_entries_inner_local_var->entry_number = entry_number;
    pokedex_detail_pokemon_entries_inner_local_var->pokemon_species = pokemon_species;

    pokedex_detail_pokemon_entries_inner_local_var->_library_owned = 1;
    return pokedex_detail_pokemon_entries_inner_local_var;
}

__attribute__((deprecated)) pokedex_detail_pokemon_entries_inner_t *pokedex_detail_pokemon_entries_inner_create(
    int entry_number,
    ability_detail_pokemon_inner_pokemon_t *pokemon_species
    ) {
    return pokedex_detail_pokemon_entries_inner_create_internal (
        entry_number,
        pokemon_species
        );
}

void pokedex_detail_pokemon_entries_inner_free(pokedex_detail_pokemon_entries_inner_t *pokedex_detail_pokemon_entries_inner) {
    if(NULL == pokedex_detail_pokemon_entries_inner){
        return ;
    }
    if(pokedex_detail_pokemon_entries_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokedex_detail_pokemon_entries_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokedex_detail_pokemon_entries_inner->pokemon_species) {
        ability_detail_pokemon_inner_pokemon_free(pokedex_detail_pokemon_entries_inner->pokemon_species);
        pokedex_detail_pokemon_entries_inner->pokemon_species = NULL;
    }
    free(pokedex_detail_pokemon_entries_inner);
}

cJSON *pokedex_detail_pokemon_entries_inner_convertToJSON(pokedex_detail_pokemon_entries_inner_t *pokedex_detail_pokemon_entries_inner) {
    cJSON *item = cJSON_CreateObject();

    // pokedex_detail_pokemon_entries_inner->entry_number
    if (!pokedex_detail_pokemon_entries_inner->entry_number) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "entry_number", pokedex_detail_pokemon_entries_inner->entry_number) == NULL) {
    goto fail; //Numeric
    }


    // pokedex_detail_pokemon_entries_inner->pokemon_species
    if (!pokedex_detail_pokemon_entries_inner->pokemon_species) {
        goto fail;
    }
    cJSON *pokemon_species_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(pokedex_detail_pokemon_entries_inner->pokemon_species);
    if(pokemon_species_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pokemon_species", pokemon_species_local_JSON);
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

pokedex_detail_pokemon_entries_inner_t *pokedex_detail_pokemon_entries_inner_parseFromJSON(cJSON *pokedex_detail_pokemon_entries_innerJSON){

    pokedex_detail_pokemon_entries_inner_t *pokedex_detail_pokemon_entries_inner_local_var = NULL;

    // define the local variable for pokedex_detail_pokemon_entries_inner->pokemon_species
    ability_detail_pokemon_inner_pokemon_t *pokemon_species_local_nonprim = NULL;

    // pokedex_detail_pokemon_entries_inner->entry_number
    cJSON *entry_number = cJSON_GetObjectItemCaseSensitive(pokedex_detail_pokemon_entries_innerJSON, "entry_number");
    if (cJSON_IsNull(entry_number)) {
        entry_number = NULL;
    }
    if (!entry_number) {
        goto end;
    }

    
    if(!cJSON_IsNumber(entry_number))
    {
    goto end; //Numeric
    }

    // pokedex_detail_pokemon_entries_inner->pokemon_species
    cJSON *pokemon_species = cJSON_GetObjectItemCaseSensitive(pokedex_detail_pokemon_entries_innerJSON, "pokemon_species");
    if (cJSON_IsNull(pokemon_species)) {
        pokemon_species = NULL;
    }
    if (!pokemon_species) {
        goto end;
    }

    
    pokemon_species_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(pokemon_species); //nonprimitive


    pokedex_detail_pokemon_entries_inner_local_var = pokedex_detail_pokemon_entries_inner_create_internal (
        entry_number->valuedouble,
        pokemon_species_local_nonprim
        );

    return pokedex_detail_pokemon_entries_inner_local_var;
end:
    if (pokemon_species_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_species_local_nonprim);
        pokemon_species_local_nonprim = NULL;
    }
    return NULL;

}
