#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "gender_detail_pokemon_species_details_inner.h"



static gender_detail_pokemon_species_details_inner_t *gender_detail_pokemon_species_details_inner_create_internal(
    int rate,
    ability_detail_pokemon_inner_pokemon_t *pokemon_species
    ) {
    gender_detail_pokemon_species_details_inner_t *gender_detail_pokemon_species_details_inner_local_var = malloc(sizeof(gender_detail_pokemon_species_details_inner_t));
    if (!gender_detail_pokemon_species_details_inner_local_var) {
        return NULL;
    }
    gender_detail_pokemon_species_details_inner_local_var->rate = rate;
    gender_detail_pokemon_species_details_inner_local_var->pokemon_species = pokemon_species;

    gender_detail_pokemon_species_details_inner_local_var->_library_owned = 1;
    return gender_detail_pokemon_species_details_inner_local_var;
}

__attribute__((deprecated)) gender_detail_pokemon_species_details_inner_t *gender_detail_pokemon_species_details_inner_create(
    int rate,
    ability_detail_pokemon_inner_pokemon_t *pokemon_species
    ) {
    return gender_detail_pokemon_species_details_inner_create_internal (
        rate,
        pokemon_species
        );
}

void gender_detail_pokemon_species_details_inner_free(gender_detail_pokemon_species_details_inner_t *gender_detail_pokemon_species_details_inner) {
    if(NULL == gender_detail_pokemon_species_details_inner){
        return ;
    }
    if(gender_detail_pokemon_species_details_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "gender_detail_pokemon_species_details_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (gender_detail_pokemon_species_details_inner->pokemon_species) {
        ability_detail_pokemon_inner_pokemon_free(gender_detail_pokemon_species_details_inner->pokemon_species);
        gender_detail_pokemon_species_details_inner->pokemon_species = NULL;
    }
    free(gender_detail_pokemon_species_details_inner);
}

cJSON *gender_detail_pokemon_species_details_inner_convertToJSON(gender_detail_pokemon_species_details_inner_t *gender_detail_pokemon_species_details_inner) {
    cJSON *item = cJSON_CreateObject();

    // gender_detail_pokemon_species_details_inner->rate
    if (!gender_detail_pokemon_species_details_inner->rate) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "rate", gender_detail_pokemon_species_details_inner->rate) == NULL) {
    goto fail; //Numeric
    }


    // gender_detail_pokemon_species_details_inner->pokemon_species
    if (!gender_detail_pokemon_species_details_inner->pokemon_species) {
        goto fail;
    }
    cJSON *pokemon_species_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(gender_detail_pokemon_species_details_inner->pokemon_species);
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

gender_detail_pokemon_species_details_inner_t *gender_detail_pokemon_species_details_inner_parseFromJSON(cJSON *gender_detail_pokemon_species_details_innerJSON){

    gender_detail_pokemon_species_details_inner_t *gender_detail_pokemon_species_details_inner_local_var = NULL;

    // define the local variable for gender_detail_pokemon_species_details_inner->pokemon_species
    ability_detail_pokemon_inner_pokemon_t *pokemon_species_local_nonprim = NULL;

    // gender_detail_pokemon_species_details_inner->rate
    cJSON *rate = cJSON_GetObjectItemCaseSensitive(gender_detail_pokemon_species_details_innerJSON, "rate");
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

    // gender_detail_pokemon_species_details_inner->pokemon_species
    cJSON *pokemon_species = cJSON_GetObjectItemCaseSensitive(gender_detail_pokemon_species_details_innerJSON, "pokemon_species");
    if (cJSON_IsNull(pokemon_species)) {
        pokemon_species = NULL;
    }
    if (!pokemon_species) {
        goto end;
    }

    
    pokemon_species_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(pokemon_species); //nonprimitive


    gender_detail_pokemon_species_details_inner_local_var = gender_detail_pokemon_species_details_inner_create_internal (
        rate->valuedouble,
        pokemon_species_local_nonprim
        );

    return gender_detail_pokemon_species_details_inner_local_var;
end:
    if (pokemon_species_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_species_local_nonprim);
        pokemon_species_local_nonprim = NULL;
    }
    return NULL;

}
