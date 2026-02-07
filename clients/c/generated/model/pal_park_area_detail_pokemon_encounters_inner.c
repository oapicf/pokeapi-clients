#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pal_park_area_detail_pokemon_encounters_inner.h"



static pal_park_area_detail_pokemon_encounters_inner_t *pal_park_area_detail_pokemon_encounters_inner_create_internal(
    int base_score,
    ability_detail_pokemon_inner_pokemon_t *pokemon_species,
    int rate
    ) {
    pal_park_area_detail_pokemon_encounters_inner_t *pal_park_area_detail_pokemon_encounters_inner_local_var = malloc(sizeof(pal_park_area_detail_pokemon_encounters_inner_t));
    if (!pal_park_area_detail_pokemon_encounters_inner_local_var) {
        return NULL;
    }
    pal_park_area_detail_pokemon_encounters_inner_local_var->base_score = base_score;
    pal_park_area_detail_pokemon_encounters_inner_local_var->pokemon_species = pokemon_species;
    pal_park_area_detail_pokemon_encounters_inner_local_var->rate = rate;

    pal_park_area_detail_pokemon_encounters_inner_local_var->_library_owned = 1;
    return pal_park_area_detail_pokemon_encounters_inner_local_var;
}

__attribute__((deprecated)) pal_park_area_detail_pokemon_encounters_inner_t *pal_park_area_detail_pokemon_encounters_inner_create(
    int base_score,
    ability_detail_pokemon_inner_pokemon_t *pokemon_species,
    int rate
    ) {
    return pal_park_area_detail_pokemon_encounters_inner_create_internal (
        base_score,
        pokemon_species,
        rate
        );
}

void pal_park_area_detail_pokemon_encounters_inner_free(pal_park_area_detail_pokemon_encounters_inner_t *pal_park_area_detail_pokemon_encounters_inner) {
    if(NULL == pal_park_area_detail_pokemon_encounters_inner){
        return ;
    }
    if(pal_park_area_detail_pokemon_encounters_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pal_park_area_detail_pokemon_encounters_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pal_park_area_detail_pokemon_encounters_inner->pokemon_species) {
        ability_detail_pokemon_inner_pokemon_free(pal_park_area_detail_pokemon_encounters_inner->pokemon_species);
        pal_park_area_detail_pokemon_encounters_inner->pokemon_species = NULL;
    }
    free(pal_park_area_detail_pokemon_encounters_inner);
}

cJSON *pal_park_area_detail_pokemon_encounters_inner_convertToJSON(pal_park_area_detail_pokemon_encounters_inner_t *pal_park_area_detail_pokemon_encounters_inner) {
    cJSON *item = cJSON_CreateObject();

    // pal_park_area_detail_pokemon_encounters_inner->base_score
    if (!pal_park_area_detail_pokemon_encounters_inner->base_score) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "base_score", pal_park_area_detail_pokemon_encounters_inner->base_score) == NULL) {
    goto fail; //Numeric
    }


    // pal_park_area_detail_pokemon_encounters_inner->pokemon_species
    if (!pal_park_area_detail_pokemon_encounters_inner->pokemon_species) {
        goto fail;
    }
    cJSON *pokemon_species_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(pal_park_area_detail_pokemon_encounters_inner->pokemon_species);
    if(pokemon_species_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pokemon-species", pokemon_species_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pal_park_area_detail_pokemon_encounters_inner->rate
    if (!pal_park_area_detail_pokemon_encounters_inner->rate) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "rate", pal_park_area_detail_pokemon_encounters_inner->rate) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pal_park_area_detail_pokemon_encounters_inner_t *pal_park_area_detail_pokemon_encounters_inner_parseFromJSON(cJSON *pal_park_area_detail_pokemon_encounters_innerJSON){

    pal_park_area_detail_pokemon_encounters_inner_t *pal_park_area_detail_pokemon_encounters_inner_local_var = NULL;

    // define the local variable for pal_park_area_detail_pokemon_encounters_inner->pokemon_species
    ability_detail_pokemon_inner_pokemon_t *pokemon_species_local_nonprim = NULL;

    // pal_park_area_detail_pokemon_encounters_inner->base_score
    cJSON *base_score = cJSON_GetObjectItemCaseSensitive(pal_park_area_detail_pokemon_encounters_innerJSON, "base_score");
    if (cJSON_IsNull(base_score)) {
        base_score = NULL;
    }
    if (!base_score) {
        goto end;
    }

    
    if(!cJSON_IsNumber(base_score))
    {
    goto end; //Numeric
    }

    // pal_park_area_detail_pokemon_encounters_inner->pokemon_species
    cJSON *pokemon_species = cJSON_GetObjectItemCaseSensitive(pal_park_area_detail_pokemon_encounters_innerJSON, "pokemon-species");
    if (cJSON_IsNull(pokemon_species)) {
        pokemon_species = NULL;
    }
    if (!pokemon_species) {
        goto end;
    }

    
    pokemon_species_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(pokemon_species); //nonprimitive

    // pal_park_area_detail_pokemon_encounters_inner->rate
    cJSON *rate = cJSON_GetObjectItemCaseSensitive(pal_park_area_detail_pokemon_encounters_innerJSON, "rate");
    if (cJSON_IsNull(rate)) {
        rate = NULL;
    }
    if (!rate) {
        goto end;
    }

    
    if(!cJSON_IsNumber(rate))
    {
    goto end; //Numeric
    }


    pal_park_area_detail_pokemon_encounters_inner_local_var = pal_park_area_detail_pokemon_encounters_inner_create_internal (
        base_score->valuedouble,
        pokemon_species_local_nonprim,
        rate->valuedouble
        );

    return pal_park_area_detail_pokemon_encounters_inner_local_var;
end:
    if (pokemon_species_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_species_local_nonprim);
        pokemon_species_local_nonprim = NULL;
    }
    return NULL;

}
