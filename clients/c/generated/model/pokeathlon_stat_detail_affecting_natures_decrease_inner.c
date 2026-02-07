#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokeathlon_stat_detail_affecting_natures_decrease_inner.h"



static pokeathlon_stat_detail_affecting_natures_decrease_inner_t *pokeathlon_stat_detail_affecting_natures_decrease_inner_create_internal(
    int max_change,
    ability_detail_pokemon_inner_pokemon_t *nature
    ) {
    pokeathlon_stat_detail_affecting_natures_decrease_inner_t *pokeathlon_stat_detail_affecting_natures_decrease_inner_local_var = malloc(sizeof(pokeathlon_stat_detail_affecting_natures_decrease_inner_t));
    if (!pokeathlon_stat_detail_affecting_natures_decrease_inner_local_var) {
        return NULL;
    }
    pokeathlon_stat_detail_affecting_natures_decrease_inner_local_var->max_change = max_change;
    pokeathlon_stat_detail_affecting_natures_decrease_inner_local_var->nature = nature;

    pokeathlon_stat_detail_affecting_natures_decrease_inner_local_var->_library_owned = 1;
    return pokeathlon_stat_detail_affecting_natures_decrease_inner_local_var;
}

__attribute__((deprecated)) pokeathlon_stat_detail_affecting_natures_decrease_inner_t *pokeathlon_stat_detail_affecting_natures_decrease_inner_create(
    int max_change,
    ability_detail_pokemon_inner_pokemon_t *nature
    ) {
    return pokeathlon_stat_detail_affecting_natures_decrease_inner_create_internal (
        max_change,
        nature
        );
}

void pokeathlon_stat_detail_affecting_natures_decrease_inner_free(pokeathlon_stat_detail_affecting_natures_decrease_inner_t *pokeathlon_stat_detail_affecting_natures_decrease_inner) {
    if(NULL == pokeathlon_stat_detail_affecting_natures_decrease_inner){
        return ;
    }
    if(pokeathlon_stat_detail_affecting_natures_decrease_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokeathlon_stat_detail_affecting_natures_decrease_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokeathlon_stat_detail_affecting_natures_decrease_inner->nature) {
        ability_detail_pokemon_inner_pokemon_free(pokeathlon_stat_detail_affecting_natures_decrease_inner->nature);
        pokeathlon_stat_detail_affecting_natures_decrease_inner->nature = NULL;
    }
    free(pokeathlon_stat_detail_affecting_natures_decrease_inner);
}

cJSON *pokeathlon_stat_detail_affecting_natures_decrease_inner_convertToJSON(pokeathlon_stat_detail_affecting_natures_decrease_inner_t *pokeathlon_stat_detail_affecting_natures_decrease_inner) {
    cJSON *item = cJSON_CreateObject();

    // pokeathlon_stat_detail_affecting_natures_decrease_inner->max_change
    if (!pokeathlon_stat_detail_affecting_natures_decrease_inner->max_change) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_change", pokeathlon_stat_detail_affecting_natures_decrease_inner->max_change) == NULL) {
    goto fail; //Numeric
    }


    // pokeathlon_stat_detail_affecting_natures_decrease_inner->nature
    if (!pokeathlon_stat_detail_affecting_natures_decrease_inner->nature) {
        goto fail;
    }
    cJSON *nature_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(pokeathlon_stat_detail_affecting_natures_decrease_inner->nature);
    if(nature_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "nature", nature_local_JSON);
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

pokeathlon_stat_detail_affecting_natures_decrease_inner_t *pokeathlon_stat_detail_affecting_natures_decrease_inner_parseFromJSON(cJSON *pokeathlon_stat_detail_affecting_natures_decrease_innerJSON){

    pokeathlon_stat_detail_affecting_natures_decrease_inner_t *pokeathlon_stat_detail_affecting_natures_decrease_inner_local_var = NULL;

    // define the local variable for pokeathlon_stat_detail_affecting_natures_decrease_inner->nature
    ability_detail_pokemon_inner_pokemon_t *nature_local_nonprim = NULL;

    // pokeathlon_stat_detail_affecting_natures_decrease_inner->max_change
    cJSON *max_change = cJSON_GetObjectItemCaseSensitive(pokeathlon_stat_detail_affecting_natures_decrease_innerJSON, "max_change");
    if (cJSON_IsNull(max_change)) {
        max_change = NULL;
    }
    if (!max_change) {
        goto end;
    }

    
    if(!cJSON_IsNumber(max_change))
    {
    goto end; //Numeric
    }

    // pokeathlon_stat_detail_affecting_natures_decrease_inner->nature
    cJSON *nature = cJSON_GetObjectItemCaseSensitive(pokeathlon_stat_detail_affecting_natures_decrease_innerJSON, "nature");
    if (cJSON_IsNull(nature)) {
        nature = NULL;
    }
    if (!nature) {
        goto end;
    }

    
    nature_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(nature); //nonprimitive


    pokeathlon_stat_detail_affecting_natures_decrease_inner_local_var = pokeathlon_stat_detail_affecting_natures_decrease_inner_create_internal (
        max_change->valuedouble,
        nature_local_nonprim
        );

    return pokeathlon_stat_detail_affecting_natures_decrease_inner_local_var;
end:
    if (nature_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(nature_local_nonprim);
        nature_local_nonprim = NULL;
    }
    return NULL;

}
