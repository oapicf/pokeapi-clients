#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_species_detail_pal_park_encounters_inner.h"



static pokemon_species_detail_pal_park_encounters_inner_t *pokemon_species_detail_pal_park_encounters_inner_create_internal(
    ability_detail_pokemon_inner_pokemon_t *area,
    int base_score,
    int rate
    ) {
    pokemon_species_detail_pal_park_encounters_inner_t *pokemon_species_detail_pal_park_encounters_inner_local_var = malloc(sizeof(pokemon_species_detail_pal_park_encounters_inner_t));
    if (!pokemon_species_detail_pal_park_encounters_inner_local_var) {
        return NULL;
    }
    pokemon_species_detail_pal_park_encounters_inner_local_var->area = area;
    pokemon_species_detail_pal_park_encounters_inner_local_var->base_score = base_score;
    pokemon_species_detail_pal_park_encounters_inner_local_var->rate = rate;

    pokemon_species_detail_pal_park_encounters_inner_local_var->_library_owned = 1;
    return pokemon_species_detail_pal_park_encounters_inner_local_var;
}

__attribute__((deprecated)) pokemon_species_detail_pal_park_encounters_inner_t *pokemon_species_detail_pal_park_encounters_inner_create(
    ability_detail_pokemon_inner_pokemon_t *area,
    int base_score,
    int rate
    ) {
    return pokemon_species_detail_pal_park_encounters_inner_create_internal (
        area,
        base_score,
        rate
        );
}

void pokemon_species_detail_pal_park_encounters_inner_free(pokemon_species_detail_pal_park_encounters_inner_t *pokemon_species_detail_pal_park_encounters_inner) {
    if(NULL == pokemon_species_detail_pal_park_encounters_inner){
        return ;
    }
    if(pokemon_species_detail_pal_park_encounters_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_species_detail_pal_park_encounters_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_species_detail_pal_park_encounters_inner->area) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_species_detail_pal_park_encounters_inner->area);
        pokemon_species_detail_pal_park_encounters_inner->area = NULL;
    }
    free(pokemon_species_detail_pal_park_encounters_inner);
}

cJSON *pokemon_species_detail_pal_park_encounters_inner_convertToJSON(pokemon_species_detail_pal_park_encounters_inner_t *pokemon_species_detail_pal_park_encounters_inner) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_species_detail_pal_park_encounters_inner->area
    if (!pokemon_species_detail_pal_park_encounters_inner->area) {
        goto fail;
    }
    cJSON *area_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(pokemon_species_detail_pal_park_encounters_inner->area);
    if(area_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "area", area_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_species_detail_pal_park_encounters_inner->base_score
    if (!pokemon_species_detail_pal_park_encounters_inner->base_score) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "base_score", pokemon_species_detail_pal_park_encounters_inner->base_score) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_species_detail_pal_park_encounters_inner->rate
    if (!pokemon_species_detail_pal_park_encounters_inner->rate) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "rate", pokemon_species_detail_pal_park_encounters_inner->rate) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_species_detail_pal_park_encounters_inner_t *pokemon_species_detail_pal_park_encounters_inner_parseFromJSON(cJSON *pokemon_species_detail_pal_park_encounters_innerJSON){

    pokemon_species_detail_pal_park_encounters_inner_t *pokemon_species_detail_pal_park_encounters_inner_local_var = NULL;

    // define the local variable for pokemon_species_detail_pal_park_encounters_inner->area
    ability_detail_pokemon_inner_pokemon_t *area_local_nonprim = NULL;

    // pokemon_species_detail_pal_park_encounters_inner->area
    cJSON *area = cJSON_GetObjectItemCaseSensitive(pokemon_species_detail_pal_park_encounters_innerJSON, "area");
    if (cJSON_IsNull(area)) {
        area = NULL;
    }
    if (!area) {
        goto end;
    }

    
    area_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(area); //nonprimitive

    // pokemon_species_detail_pal_park_encounters_inner->base_score
    cJSON *base_score = cJSON_GetObjectItemCaseSensitive(pokemon_species_detail_pal_park_encounters_innerJSON, "base_score");
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

    // pokemon_species_detail_pal_park_encounters_inner->rate
    cJSON *rate = cJSON_GetObjectItemCaseSensitive(pokemon_species_detail_pal_park_encounters_innerJSON, "rate");
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


    pokemon_species_detail_pal_park_encounters_inner_local_var = pokemon_species_detail_pal_park_encounters_inner_create_internal (
        area_local_nonprim,
        base_score->valuedouble,
        rate->valuedouble
        );

    return pokemon_species_detail_pal_park_encounters_inner_local_var;
end:
    if (area_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(area_local_nonprim);
        area_local_nonprim = NULL;
    }
    return NULL;

}
