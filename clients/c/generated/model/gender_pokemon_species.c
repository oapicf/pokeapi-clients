#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "gender_pokemon_species.h"



static gender_pokemon_species_t *gender_pokemon_species_create_internal(
    int *rate,
    pokemon_species_summary_t *pokemon_species
    ) {
    gender_pokemon_species_t *gender_pokemon_species_local_var = malloc(sizeof(gender_pokemon_species_t));
    if (!gender_pokemon_species_local_var) {
        return NULL;
    }
    memset(gender_pokemon_species_local_var, 0, sizeof(gender_pokemon_species_t));
    gender_pokemon_species_local_var->_library_owned = 1;
    gender_pokemon_species_local_var->rate = rate;
    gender_pokemon_species_local_var->pokemon_species = pokemon_species;
    return gender_pokemon_species_local_var;
}

__attribute__((deprecated)) gender_pokemon_species_t *gender_pokemon_species_create(
    int *rate,
    pokemon_species_summary_t *pokemon_species
    ) {
    int *rate_copy = NULL;
    if (rate) {
        rate_copy = malloc(sizeof(int));
        if (rate_copy) *rate_copy = *rate;
    }
    gender_pokemon_species_t *result = gender_pokemon_species_create_internal (
        rate_copy,
        pokemon_species
        );
    if (!result) {
        free(rate_copy);
    }
    return result;
}

void gender_pokemon_species_free(gender_pokemon_species_t *gender_pokemon_species) {
    if(NULL == gender_pokemon_species){
        return ;
    }
    if(gender_pokemon_species->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "gender_pokemon_species_free");
        return ;
    }
    listEntry_t *listEntry;
    if (gender_pokemon_species->rate) {
        free(gender_pokemon_species->rate);
        gender_pokemon_species->rate = NULL;
    }
    if (gender_pokemon_species->pokemon_species) {
        pokemon_species_summary_free(gender_pokemon_species->pokemon_species);
        gender_pokemon_species->pokemon_species = NULL;
    }
    free(gender_pokemon_species);
}

cJSON *gender_pokemon_species_convertToJSON(gender_pokemon_species_t *gender_pokemon_species) {
    cJSON *item = cJSON_CreateObject();

    // gender_pokemon_species->rate
    if (!gender_pokemon_species->rate) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "rate", *gender_pokemon_species->rate) == NULL) {
    goto fail; //Numeric
    }


    // gender_pokemon_species->pokemon_species
    if (!gender_pokemon_species->pokemon_species) {
        goto fail;
    }
    cJSON *pokemon_species_local_JSON = pokemon_species_summary_convertToJSON(gender_pokemon_species->pokemon_species);
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

gender_pokemon_species_t *gender_pokemon_species_parseFromJSON(cJSON *gender_pokemon_speciesJSON){

    gender_pokemon_species_t *gender_pokemon_species_local_var = NULL;

    // define the local variable for gender_pokemon_species->rate
    int *rate_local_var = NULL;

    // define the local variable for gender_pokemon_species->pokemon_species
    pokemon_species_summary_t *pokemon_species_local_nonprim = NULL;

    // gender_pokemon_species->rate
    cJSON *rate = cJSON_GetObjectItemCaseSensitive(gender_pokemon_speciesJSON, "rate");
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
    rate_local_var = malloc(sizeof(int));
    if(!rate_local_var)
    {
        goto end;
    }
    *rate_local_var = rate->valuedouble;

    // gender_pokemon_species->pokemon_species
    cJSON *pokemon_species = cJSON_GetObjectItemCaseSensitive(gender_pokemon_speciesJSON, "pokemon_species");
    if (cJSON_IsNull(pokemon_species)) {
        pokemon_species = NULL;
    }
    if (!pokemon_species) {
        goto end;
    }

    
    pokemon_species_local_nonprim = pokemon_species_summary_parseFromJSON(pokemon_species); //nonprimitive



    gender_pokemon_species_local_var = gender_pokemon_species_create_internal (
        rate_local_var,
        pokemon_species_local_nonprim
        );

    if (!gender_pokemon_species_local_var) {
        goto end;
    }

    return gender_pokemon_species_local_var;
end:
    if (rate_local_var) {
        free(rate_local_var);
        rate_local_var = NULL;
    }
    if (pokemon_species_local_nonprim) {
        pokemon_species_summary_free(pokemon_species_local_nonprim);
        pokemon_species_local_nonprim = NULL;
    }
    return NULL;

}
