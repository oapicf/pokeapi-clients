#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ability_pokemon_detail.h"



static ability_pokemon_detail_t *ability_pokemon_detail_create_internal(
    int *is_hidden,
    int *slot,
    pokemon_summary_t *pokemon
    ) {
    ability_pokemon_detail_t *ability_pokemon_detail_local_var = malloc(sizeof(ability_pokemon_detail_t));
    if (!ability_pokemon_detail_local_var) {
        return NULL;
    }
    memset(ability_pokemon_detail_local_var, 0, sizeof(ability_pokemon_detail_t));
    ability_pokemon_detail_local_var->_library_owned = 1;
    ability_pokemon_detail_local_var->is_hidden = is_hidden;
    ability_pokemon_detail_local_var->slot = slot;
    ability_pokemon_detail_local_var->pokemon = pokemon;
    return ability_pokemon_detail_local_var;
}

__attribute__((deprecated)) ability_pokemon_detail_t *ability_pokemon_detail_create(
    int *is_hidden,
    int *slot,
    pokemon_summary_t *pokemon
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
    ability_pokemon_detail_t *result = ability_pokemon_detail_create_internal (
        is_hidden_copy,
        slot_copy,
        pokemon
        );
    if (!result) {
        free(is_hidden_copy);
        free(slot_copy);
    }
    return result;
}

void ability_pokemon_detail_free(ability_pokemon_detail_t *ability_pokemon_detail) {
    if(NULL == ability_pokemon_detail){
        return ;
    }
    if(ability_pokemon_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ability_pokemon_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ability_pokemon_detail->is_hidden) {
        free(ability_pokemon_detail->is_hidden);
        ability_pokemon_detail->is_hidden = NULL;
    }
    if (ability_pokemon_detail->slot) {
        free(ability_pokemon_detail->slot);
        ability_pokemon_detail->slot = NULL;
    }
    if (ability_pokemon_detail->pokemon) {
        pokemon_summary_free(ability_pokemon_detail->pokemon);
        ability_pokemon_detail->pokemon = NULL;
    }
    free(ability_pokemon_detail);
}

cJSON *ability_pokemon_detail_convertToJSON(ability_pokemon_detail_t *ability_pokemon_detail) {
    cJSON *item = cJSON_CreateObject();

    // ability_pokemon_detail->is_hidden
    if(ability_pokemon_detail->is_hidden) {
    if(cJSON_AddBoolToObject(item, "is_hidden", *ability_pokemon_detail->is_hidden) == NULL) {
    goto fail; //Bool
    }
    }


    // ability_pokemon_detail->slot
    if (!ability_pokemon_detail->slot) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "slot", *ability_pokemon_detail->slot) == NULL) {
    goto fail; //Numeric
    }


    // ability_pokemon_detail->pokemon
    if (!ability_pokemon_detail->pokemon) {
        goto fail;
    }
    cJSON *pokemon_local_JSON = pokemon_summary_convertToJSON(ability_pokemon_detail->pokemon);
    if(pokemon_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pokemon", pokemon_local_JSON);
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

ability_pokemon_detail_t *ability_pokemon_detail_parseFromJSON(cJSON *ability_pokemon_detailJSON){

    ability_pokemon_detail_t *ability_pokemon_detail_local_var = NULL;

    // define the local variable for ability_pokemon_detail->is_hidden
    int *is_hidden_local_var = NULL;

    // define the local variable for ability_pokemon_detail->slot
    int *slot_local_var = NULL;

    // define the local variable for ability_pokemon_detail->pokemon
    pokemon_summary_t *pokemon_local_nonprim = NULL;

    // ability_pokemon_detail->is_hidden
    cJSON *is_hidden = cJSON_GetObjectItemCaseSensitive(ability_pokemon_detailJSON, "is_hidden");
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

    // ability_pokemon_detail->slot
    cJSON *slot = cJSON_GetObjectItemCaseSensitive(ability_pokemon_detailJSON, "slot");
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

    // ability_pokemon_detail->pokemon
    cJSON *pokemon = cJSON_GetObjectItemCaseSensitive(ability_pokemon_detailJSON, "pokemon");
    if (cJSON_IsNull(pokemon)) {
        pokemon = NULL;
    }
    if (!pokemon) {
        goto end;
    }

    
    pokemon_local_nonprim = pokemon_summary_parseFromJSON(pokemon); //nonprimitive



    ability_pokemon_detail_local_var = ability_pokemon_detail_create_internal (
        is_hidden_local_var,
        slot_local_var,
        pokemon_local_nonprim
        );

    if (!ability_pokemon_detail_local_var) {
        goto end;
    }

    return ability_pokemon_detail_local_var;
end:
    if (is_hidden_local_var) {
        free(is_hidden_local_var);
        is_hidden_local_var = NULL;
    }
    if (slot_local_var) {
        free(slot_local_var);
        slot_local_var = NULL;
    }
    if (pokemon_local_nonprim) {
        pokemon_summary_free(pokemon_local_nonprim);
        pokemon_local_nonprim = NULL;
    }
    return NULL;

}
