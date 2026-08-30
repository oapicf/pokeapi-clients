#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ability_detail_pokemon_inner.h"



static ability_detail_pokemon_inner_t *ability_detail_pokemon_inner_create_internal(
    int *is_hidden,
    int *slot,
    ability_detail_pokemon_inner_pokemon_t *pokemon
    ) {
    ability_detail_pokemon_inner_t *ability_detail_pokemon_inner_local_var = malloc(sizeof(ability_detail_pokemon_inner_t));
    if (!ability_detail_pokemon_inner_local_var) {
        return NULL;
    }
    memset(ability_detail_pokemon_inner_local_var, 0, sizeof(ability_detail_pokemon_inner_t));
    ability_detail_pokemon_inner_local_var->_library_owned = 1;
    ability_detail_pokemon_inner_local_var->is_hidden = is_hidden;
    ability_detail_pokemon_inner_local_var->slot = slot;
    ability_detail_pokemon_inner_local_var->pokemon = pokemon;
    return ability_detail_pokemon_inner_local_var;
}

__attribute__((deprecated)) ability_detail_pokemon_inner_t *ability_detail_pokemon_inner_create(
    int *is_hidden,
    int *slot,
    ability_detail_pokemon_inner_pokemon_t *pokemon
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
    ability_detail_pokemon_inner_t *result = ability_detail_pokemon_inner_create_internal (
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

void ability_detail_pokemon_inner_free(ability_detail_pokemon_inner_t *ability_detail_pokemon_inner) {
    if(NULL == ability_detail_pokemon_inner){
        return ;
    }
    if(ability_detail_pokemon_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ability_detail_pokemon_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ability_detail_pokemon_inner->is_hidden) {
        free(ability_detail_pokemon_inner->is_hidden);
        ability_detail_pokemon_inner->is_hidden = NULL;
    }
    if (ability_detail_pokemon_inner->slot) {
        free(ability_detail_pokemon_inner->slot);
        ability_detail_pokemon_inner->slot = NULL;
    }
    if (ability_detail_pokemon_inner->pokemon) {
        ability_detail_pokemon_inner_pokemon_free(ability_detail_pokemon_inner->pokemon);
        ability_detail_pokemon_inner->pokemon = NULL;
    }
    free(ability_detail_pokemon_inner);
}

cJSON *ability_detail_pokemon_inner_convertToJSON(ability_detail_pokemon_inner_t *ability_detail_pokemon_inner) {
    cJSON *item = cJSON_CreateObject();

    // ability_detail_pokemon_inner->is_hidden
    if (!ability_detail_pokemon_inner->is_hidden) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "is_hidden", *ability_detail_pokemon_inner->is_hidden) == NULL) {
    goto fail; //Bool
    }


    // ability_detail_pokemon_inner->slot
    if (!ability_detail_pokemon_inner->slot) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "slot", *ability_detail_pokemon_inner->slot) == NULL) {
    goto fail; //Numeric
    }


    // ability_detail_pokemon_inner->pokemon
    if (!ability_detail_pokemon_inner->pokemon) {
        goto fail;
    }
    cJSON *pokemon_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(ability_detail_pokemon_inner->pokemon);
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

ability_detail_pokemon_inner_t *ability_detail_pokemon_inner_parseFromJSON(cJSON *ability_detail_pokemon_innerJSON){

    ability_detail_pokemon_inner_t *ability_detail_pokemon_inner_local_var = NULL;

    // define the local variable for ability_detail_pokemon_inner->is_hidden
    int *is_hidden_local_var = NULL;

    // define the local variable for ability_detail_pokemon_inner->slot
    int *slot_local_var = NULL;

    // define the local variable for ability_detail_pokemon_inner->pokemon
    ability_detail_pokemon_inner_pokemon_t *pokemon_local_nonprim = NULL;

    // ability_detail_pokemon_inner->is_hidden
    cJSON *is_hidden = cJSON_GetObjectItemCaseSensitive(ability_detail_pokemon_innerJSON, "is_hidden");
    if (cJSON_IsNull(is_hidden)) {
        is_hidden = NULL;
    }
    if (!is_hidden) {
        goto end;
    }

    
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

    // ability_detail_pokemon_inner->slot
    cJSON *slot = cJSON_GetObjectItemCaseSensitive(ability_detail_pokemon_innerJSON, "slot");
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

    // ability_detail_pokemon_inner->pokemon
    cJSON *pokemon = cJSON_GetObjectItemCaseSensitive(ability_detail_pokemon_innerJSON, "pokemon");
    if (cJSON_IsNull(pokemon)) {
        pokemon = NULL;
    }
    if (!pokemon) {
        goto end;
    }

    
    pokemon_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(pokemon); //nonprimitive



    ability_detail_pokemon_inner_local_var = ability_detail_pokemon_inner_create_internal (
        is_hidden_local_var,
        slot_local_var,
        pokemon_local_nonprim
        );

    if (!ability_detail_pokemon_inner_local_var) {
        goto end;
    }

    return ability_detail_pokemon_inner_local_var;
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
        ability_detail_pokemon_inner_pokemon_free(pokemon_local_nonprim);
        pokemon_local_nonprim = NULL;
    }
    return NULL;

}
