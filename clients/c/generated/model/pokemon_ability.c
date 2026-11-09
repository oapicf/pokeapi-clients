#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_ability.h"



static pokemon_ability_t *pokemon_ability_create_internal(
    int *is_hidden,
    int *slot,
    ability_summary_t *ability
    ) {
    pokemon_ability_t *pokemon_ability_local_var = malloc(sizeof(pokemon_ability_t));
    if (!pokemon_ability_local_var) {
        return NULL;
    }
    memset(pokemon_ability_local_var, 0, sizeof(pokemon_ability_t));
    pokemon_ability_local_var->_library_owned = 1;
    pokemon_ability_local_var->is_hidden = is_hidden;
    pokemon_ability_local_var->slot = slot;
    pokemon_ability_local_var->ability = ability;
    return pokemon_ability_local_var;
}

__attribute__((deprecated)) pokemon_ability_t *pokemon_ability_create(
    int *is_hidden,
    int *slot,
    ability_summary_t *ability
    ) {
    int *is_hidden_copy = NULL;
    if (is_hidden) {
        is_hidden_copy = malloc(sizeof(int));
        if (is_hidden_copy) *is_hidden_copy = *is_hidden;
    }
    int *slot_copy = NULL;
    if (slot) {
        slot_copy = malloc(sizeof(int));
        if (slot_copy) *slot_copy = *slot;
    }
    pokemon_ability_t *result = pokemon_ability_create_internal (
        is_hidden_copy,
        slot_copy,
        ability
        );
    if (!result) {
        free(is_hidden_copy);
        free(slot_copy);
    }
    return result;
}

void pokemon_ability_free(pokemon_ability_t *pokemon_ability) {
    if(NULL == pokemon_ability){
        return ;
    }
    if(pokemon_ability->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_ability_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_ability->is_hidden) {
        free(pokemon_ability->is_hidden);
        pokemon_ability->is_hidden = NULL;
    }
    if (pokemon_ability->slot) {
        free(pokemon_ability->slot);
        pokemon_ability->slot = NULL;
    }
    if (pokemon_ability->ability) {
        ability_summary_free(pokemon_ability->ability);
        pokemon_ability->ability = NULL;
    }
    free(pokemon_ability);
}

cJSON *pokemon_ability_convertToJSON(pokemon_ability_t *pokemon_ability) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_ability->is_hidden
    if(pokemon_ability->is_hidden) {
    if(cJSON_AddBoolToObject(item, "is_hidden", *pokemon_ability->is_hidden) == NULL) {
    goto fail; //Bool
    }
    }


    // pokemon_ability->slot
    if (!pokemon_ability->slot) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "slot", *pokemon_ability->slot) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_ability->ability
    if (!pokemon_ability->ability) {
        goto fail;
    }
    cJSON *ability_local_JSON = ability_summary_convertToJSON(pokemon_ability->ability);
    if(ability_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ability", ability_local_JSON);
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

pokemon_ability_t *pokemon_ability_parseFromJSON(cJSON *pokemon_abilityJSON){

    pokemon_ability_t *pokemon_ability_local_var = NULL;

    // define the local variable for pokemon_ability->is_hidden
    int *is_hidden_local_var = NULL;

    // define the local variable for pokemon_ability->slot
    int *slot_local_var = NULL;

    // define the local variable for pokemon_ability->ability
    ability_summary_t *ability_local_nonprim = NULL;

    // pokemon_ability->is_hidden
    cJSON *is_hidden = cJSON_GetObjectItemCaseSensitive(pokemon_abilityJSON, "is_hidden");
    if (cJSON_IsNull(is_hidden)) {
        is_hidden = NULL;
    }
    if (is_hidden) { 
    if(!cJSON_IsBool(is_hidden))
    {
    goto end; //Bool
    }
    is_hidden_local_var = malloc(sizeof(int));
    if(!is_hidden_local_var)
    {
        goto end;
    }
    *is_hidden_local_var = is_hidden->valueint;
    }

    // pokemon_ability->slot
    cJSON *slot = cJSON_GetObjectItemCaseSensitive(pokemon_abilityJSON, "slot");
    if (cJSON_IsNull(slot)) {
        slot = NULL;
    }
    if (!slot) {
        goto end;
    }

    
    if(!cJSON_IsNumber(slot))
    {
    goto end; //Numeric
    }
    slot_local_var = malloc(sizeof(int));
    if(!slot_local_var)
    {
        goto end;
    }
    *slot_local_var = slot->valuedouble;

    // pokemon_ability->ability
    cJSON *ability = cJSON_GetObjectItemCaseSensitive(pokemon_abilityJSON, "ability");
    if (cJSON_IsNull(ability)) {
        ability = NULL;
    }
    if (!ability) {
        goto end;
    }

    
    ability_local_nonprim = ability_summary_parseFromJSON(ability); //nonprimitive



    pokemon_ability_local_var = pokemon_ability_create_internal (
        is_hidden_local_var,
        slot_local_var,
        ability_local_nonprim
        );

    if (!pokemon_ability_local_var) {
        goto end;
    }

    return pokemon_ability_local_var;
end:
    if (is_hidden_local_var) {
        free(is_hidden_local_var);
        is_hidden_local_var = NULL;
    }
    if (slot_local_var) {
        free(slot_local_var);
        slot_local_var = NULL;
    }
    if (ability_local_nonprim) {
        ability_summary_free(ability_local_nonprim);
        ability_local_nonprim = NULL;
    }
    return NULL;

}
