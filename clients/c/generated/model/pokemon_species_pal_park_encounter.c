#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_species_pal_park_encounter.h"



static pokemon_species_pal_park_encounter_t *pokemon_species_pal_park_encounter_create_internal(
    int *base_score,
    int *rate,
    pal_park_area_summary_t *area
    ) {
    pokemon_species_pal_park_encounter_t *pokemon_species_pal_park_encounter_local_var = malloc(sizeof(pokemon_species_pal_park_encounter_t));
    if (!pokemon_species_pal_park_encounter_local_var) {
        return NULL;
    }
    memset(pokemon_species_pal_park_encounter_local_var, 0, sizeof(pokemon_species_pal_park_encounter_t));
    pokemon_species_pal_park_encounter_local_var->_library_owned = 1;
    pokemon_species_pal_park_encounter_local_var->base_score = base_score;
    pokemon_species_pal_park_encounter_local_var->rate = rate;
    pokemon_species_pal_park_encounter_local_var->area = area;
    return pokemon_species_pal_park_encounter_local_var;
}

__attribute__((deprecated)) pokemon_species_pal_park_encounter_t *pokemon_species_pal_park_encounter_create(
    int *base_score,
    int *rate,
    pal_park_area_summary_t *area
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
    pokemon_species_pal_park_encounter_t *result = pokemon_species_pal_park_encounter_create_internal (
        base_score_copy,
        rate_copy,
        area
        );
    if (!result) {
        free(base_score_copy);
        free(rate_copy);
    }
    return result;
}

void pokemon_species_pal_park_encounter_free(pokemon_species_pal_park_encounter_t *pokemon_species_pal_park_encounter) {
    if(NULL == pokemon_species_pal_park_encounter){
        return ;
    }
    if(pokemon_species_pal_park_encounter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_species_pal_park_encounter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_species_pal_park_encounter->base_score) {
        free(pokemon_species_pal_park_encounter->base_score);
        pokemon_species_pal_park_encounter->base_score = NULL;
    }
    if (pokemon_species_pal_park_encounter->rate) {
        free(pokemon_species_pal_park_encounter->rate);
        pokemon_species_pal_park_encounter->rate = NULL;
    }
    if (pokemon_species_pal_park_encounter->area) {
        pal_park_area_summary_free(pokemon_species_pal_park_encounter->area);
        pokemon_species_pal_park_encounter->area = NULL;
    }
    free(pokemon_species_pal_park_encounter);
}

cJSON *pokemon_species_pal_park_encounter_convertToJSON(pokemon_species_pal_park_encounter_t *pokemon_species_pal_park_encounter) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_species_pal_park_encounter->base_score
    if(pokemon_species_pal_park_encounter->base_score) {
    if(cJSON_AddNumberToObject(item, "base_score", *pokemon_species_pal_park_encounter->base_score) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_species_pal_park_encounter->rate
    if (!pokemon_species_pal_park_encounter->rate) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "rate", *pokemon_species_pal_park_encounter->rate) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_species_pal_park_encounter->area
    if (!pokemon_species_pal_park_encounter->area) {
        goto fail;
    }
    cJSON *area_local_JSON = pal_park_area_summary_convertToJSON(pokemon_species_pal_park_encounter->area);
    if(area_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "area", area_local_JSON);
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

pokemon_species_pal_park_encounter_t *pokemon_species_pal_park_encounter_parseFromJSON(cJSON *pokemon_species_pal_park_encounterJSON){

    pokemon_species_pal_park_encounter_t *pokemon_species_pal_park_encounter_local_var = NULL;

    // define the local variable for pokemon_species_pal_park_encounter->base_score
    int *base_score_local_var = NULL;

    // define the local variable for pokemon_species_pal_park_encounter->rate
    int *rate_local_var = NULL;

    // define the local variable for pokemon_species_pal_park_encounter->area
    pal_park_area_summary_t *area_local_nonprim = NULL;

    // pokemon_species_pal_park_encounter->base_score
    cJSON *base_score = cJSON_GetObjectItemCaseSensitive(pokemon_species_pal_park_encounterJSON, "base_score");
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

    // pokemon_species_pal_park_encounter->rate
    cJSON *rate = cJSON_GetObjectItemCaseSensitive(pokemon_species_pal_park_encounterJSON, "rate");
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

    // pokemon_species_pal_park_encounter->area
    cJSON *area = cJSON_GetObjectItemCaseSensitive(pokemon_species_pal_park_encounterJSON, "area");
    if (cJSON_IsNull(area)) {
        area = NULL;
    }
    if (!area) {
        goto end;
    }

    
    area_local_nonprim = pal_park_area_summary_parseFromJSON(area); //nonprimitive



    pokemon_species_pal_park_encounter_local_var = pokemon_species_pal_park_encounter_create_internal (
        base_score_local_var,
        rate_local_var,
        area_local_nonprim
        );

    if (!pokemon_species_pal_park_encounter_local_var) {
        goto end;
    }

    return pokemon_species_pal_park_encounter_local_var;
end:
    if (base_score_local_var) {
        free(base_score_local_var);
        base_score_local_var = NULL;
    }
    if (rate_local_var) {
        free(rate_local_var);
        rate_local_var = NULL;
    }
    if (area_local_nonprim) {
        pal_park_area_summary_free(area_local_nonprim);
        area_local_nonprim = NULL;
    }
    return NULL;

}
