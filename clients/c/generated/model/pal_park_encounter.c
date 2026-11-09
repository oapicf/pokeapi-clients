#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pal_park_encounter.h"



static pal_park_encounter_t *pal_park_encounter_create_internal(
    int *base_score,
    int *rate,
    pokemon_species_summary_t *pokemon_species
    ) {
    pal_park_encounter_t *pal_park_encounter_local_var = malloc(sizeof(pal_park_encounter_t));
    if (!pal_park_encounter_local_var) {
        return NULL;
    }
    memset(pal_park_encounter_local_var, 0, sizeof(pal_park_encounter_t));
    pal_park_encounter_local_var->_library_owned = 1;
    pal_park_encounter_local_var->base_score = base_score;
    pal_park_encounter_local_var->rate = rate;
    pal_park_encounter_local_var->pokemon_species = pokemon_species;
    return pal_park_encounter_local_var;
}

__attribute__((deprecated)) pal_park_encounter_t *pal_park_encounter_create(
    int *base_score,
    int *rate,
    pokemon_species_summary_t *pokemon_species
    ) {
    int *base_score_copy = NULL;
    if (base_score) {
        base_score_copy = malloc(sizeof(int));
        if (base_score_copy) *base_score_copy = *base_score;
    }
    int *rate_copy = NULL;
    if (rate) {
        rate_copy = malloc(sizeof(int));
        if (rate_copy) *rate_copy = *rate;
    }
    pal_park_encounter_t *result = pal_park_encounter_create_internal (
        base_score_copy,
        rate_copy,
        pokemon_species
        );
    if (!result) {
        free(base_score_copy);
        free(rate_copy);
    }
    return result;
}

void pal_park_encounter_free(pal_park_encounter_t *pal_park_encounter) {
    if(NULL == pal_park_encounter){
        return ;
    }
    if(pal_park_encounter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pal_park_encounter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pal_park_encounter->base_score) {
        free(pal_park_encounter->base_score);
        pal_park_encounter->base_score = NULL;
    }
    if (pal_park_encounter->rate) {
        free(pal_park_encounter->rate);
        pal_park_encounter->rate = NULL;
    }
    if (pal_park_encounter->pokemon_species) {
        pokemon_species_summary_free(pal_park_encounter->pokemon_species);
        pal_park_encounter->pokemon_species = NULL;
    }
    free(pal_park_encounter);
}

cJSON *pal_park_encounter_convertToJSON(pal_park_encounter_t *pal_park_encounter) {
    cJSON *item = cJSON_CreateObject();

    // pal_park_encounter->base_score
    if(pal_park_encounter->base_score) {
    if(cJSON_AddNumberToObject(item, "base_score", *pal_park_encounter->base_score) == NULL) {
    goto fail; //Numeric
    }
    }


    // pal_park_encounter->rate
    if (!pal_park_encounter->rate) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "rate", *pal_park_encounter->rate) == NULL) {
    goto fail; //Numeric
    }


    // pal_park_encounter->pokemon_species
    if (!pal_park_encounter->pokemon_species) {
        goto fail;
    }
    cJSON *pokemon_species_local_JSON = pokemon_species_summary_convertToJSON(pal_park_encounter->pokemon_species);
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

pal_park_encounter_t *pal_park_encounter_parseFromJSON(cJSON *pal_park_encounterJSON){

    pal_park_encounter_t *pal_park_encounter_local_var = NULL;

    // define the local variable for pal_park_encounter->base_score
    int *base_score_local_var = NULL;

    // define the local variable for pal_park_encounter->rate
    int *rate_local_var = NULL;

    // define the local variable for pal_park_encounter->pokemon_species
    pokemon_species_summary_t *pokemon_species_local_nonprim = NULL;

    // pal_park_encounter->base_score
    cJSON *base_score = cJSON_GetObjectItemCaseSensitive(pal_park_encounterJSON, "base_score");
    if (cJSON_IsNull(base_score)) {
        base_score = NULL;
    }
    if (base_score) { 
    if(!cJSON_IsNumber(base_score))
    {
    goto end; //Numeric
    }
    base_score_local_var = malloc(sizeof(int));
    if(!base_score_local_var)
    {
        goto end;
    }
    *base_score_local_var = base_score->valuedouble;
    }

    // pal_park_encounter->rate
    cJSON *rate = cJSON_GetObjectItemCaseSensitive(pal_park_encounterJSON, "rate");
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

    // pal_park_encounter->pokemon_species
    cJSON *pokemon_species = cJSON_GetObjectItemCaseSensitive(pal_park_encounterJSON, "pokemon_species");
    if (cJSON_IsNull(pokemon_species)) {
        pokemon_species = NULL;
    }
    if (!pokemon_species) {
        goto end;
    }

    
    pokemon_species_local_nonprim = pokemon_species_summary_parseFromJSON(pokemon_species); //nonprimitive



    pal_park_encounter_local_var = pal_park_encounter_create_internal (
        base_score_local_var,
        rate_local_var,
        pokemon_species_local_nonprim
        );

    if (!pal_park_encounter_local_var) {
        goto end;
    }

    return pal_park_encounter_local_var;
end:
    if (base_score_local_var) {
        free(base_score_local_var);
        base_score_local_var = NULL;
    }
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
