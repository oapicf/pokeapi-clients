#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "nature_detail_pokeathlon_stat_changes_inner.h"



static nature_detail_pokeathlon_stat_changes_inner_t *nature_detail_pokeathlon_stat_changes_inner_create_internal(
    int max_change,
    ability_detail_pokemon_inner_pokemon_t *pokeathlon_stat
    ) {
    nature_detail_pokeathlon_stat_changes_inner_t *nature_detail_pokeathlon_stat_changes_inner_local_var = malloc(sizeof(nature_detail_pokeathlon_stat_changes_inner_t));
    if (!nature_detail_pokeathlon_stat_changes_inner_local_var) {
        return NULL;
    }
    nature_detail_pokeathlon_stat_changes_inner_local_var->max_change = max_change;
    nature_detail_pokeathlon_stat_changes_inner_local_var->pokeathlon_stat = pokeathlon_stat;

    nature_detail_pokeathlon_stat_changes_inner_local_var->_library_owned = 1;
    return nature_detail_pokeathlon_stat_changes_inner_local_var;
}

__attribute__((deprecated)) nature_detail_pokeathlon_stat_changes_inner_t *nature_detail_pokeathlon_stat_changes_inner_create(
    int max_change,
    ability_detail_pokemon_inner_pokemon_t *pokeathlon_stat
    ) {
    return nature_detail_pokeathlon_stat_changes_inner_create_internal (
        max_change,
        pokeathlon_stat
        );
}

void nature_detail_pokeathlon_stat_changes_inner_free(nature_detail_pokeathlon_stat_changes_inner_t *nature_detail_pokeathlon_stat_changes_inner) {
    if(NULL == nature_detail_pokeathlon_stat_changes_inner){
        return ;
    }
    if(nature_detail_pokeathlon_stat_changes_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "nature_detail_pokeathlon_stat_changes_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (nature_detail_pokeathlon_stat_changes_inner->pokeathlon_stat) {
        ability_detail_pokemon_inner_pokemon_free(nature_detail_pokeathlon_stat_changes_inner->pokeathlon_stat);
        nature_detail_pokeathlon_stat_changes_inner->pokeathlon_stat = NULL;
    }
    free(nature_detail_pokeathlon_stat_changes_inner);
}

cJSON *nature_detail_pokeathlon_stat_changes_inner_convertToJSON(nature_detail_pokeathlon_stat_changes_inner_t *nature_detail_pokeathlon_stat_changes_inner) {
    cJSON *item = cJSON_CreateObject();

    // nature_detail_pokeathlon_stat_changes_inner->max_change
    if (!nature_detail_pokeathlon_stat_changes_inner->max_change) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_change", nature_detail_pokeathlon_stat_changes_inner->max_change) == NULL) {
    goto fail; //Numeric
    }


    // nature_detail_pokeathlon_stat_changes_inner->pokeathlon_stat
    if (!nature_detail_pokeathlon_stat_changes_inner->pokeathlon_stat) {
        goto fail;
    }
    cJSON *pokeathlon_stat_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(nature_detail_pokeathlon_stat_changes_inner->pokeathlon_stat);
    if(pokeathlon_stat_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pokeathlon_stat", pokeathlon_stat_local_JSON);
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

nature_detail_pokeathlon_stat_changes_inner_t *nature_detail_pokeathlon_stat_changes_inner_parseFromJSON(cJSON *nature_detail_pokeathlon_stat_changes_innerJSON){

    nature_detail_pokeathlon_stat_changes_inner_t *nature_detail_pokeathlon_stat_changes_inner_local_var = NULL;

    // define the local variable for nature_detail_pokeathlon_stat_changes_inner->pokeathlon_stat
    ability_detail_pokemon_inner_pokemon_t *pokeathlon_stat_local_nonprim = NULL;

    // nature_detail_pokeathlon_stat_changes_inner->max_change
    cJSON *max_change = cJSON_GetObjectItemCaseSensitive(nature_detail_pokeathlon_stat_changes_innerJSON, "max_change");
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

    // nature_detail_pokeathlon_stat_changes_inner->pokeathlon_stat
    cJSON *pokeathlon_stat = cJSON_GetObjectItemCaseSensitive(nature_detail_pokeathlon_stat_changes_innerJSON, "pokeathlon_stat");
    if (cJSON_IsNull(pokeathlon_stat)) {
        pokeathlon_stat = NULL;
    }
    if (!pokeathlon_stat) {
        goto end;
    }

    
    pokeathlon_stat_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(pokeathlon_stat); //nonprimitive


    nature_detail_pokeathlon_stat_changes_inner_local_var = nature_detail_pokeathlon_stat_changes_inner_create_internal (
        max_change->valuedouble,
        pokeathlon_stat_local_nonprim
        );

    return nature_detail_pokeathlon_stat_changes_inner_local_var;
end:
    if (pokeathlon_stat_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(pokeathlon_stat_local_nonprim);
        pokeathlon_stat_local_nonprim = NULL;
    }
    return NULL;

}
