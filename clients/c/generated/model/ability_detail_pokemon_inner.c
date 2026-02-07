#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ability_detail_pokemon_inner.h"



static ability_detail_pokemon_inner_t *ability_detail_pokemon_inner_create_internal(
    int is_hidden,
    int slot,
    ability_detail_pokemon_inner_pokemon_t *pokemon
    ) {
    ability_detail_pokemon_inner_t *ability_detail_pokemon_inner_local_var = malloc(sizeof(ability_detail_pokemon_inner_t));
    if (!ability_detail_pokemon_inner_local_var) {
        return NULL;
    }
    ability_detail_pokemon_inner_local_var->is_hidden = is_hidden;
    ability_detail_pokemon_inner_local_var->slot = slot;
    ability_detail_pokemon_inner_local_var->pokemon = pokemon;

    ability_detail_pokemon_inner_local_var->_library_owned = 1;
    return ability_detail_pokemon_inner_local_var;
}

__attribute__((deprecated)) ability_detail_pokemon_inner_t *ability_detail_pokemon_inner_create(
    int is_hidden,
    int slot,
    ability_detail_pokemon_inner_pokemon_t *pokemon
    ) {
    return ability_detail_pokemon_inner_create_internal (
        is_hidden,
        slot,
        pokemon
        );
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
    if(cJSON_AddBoolToObject(item, "is_hidden", ability_detail_pokemon_inner->is_hidden) == NULL) {
    goto fail; //Bool
    }


    // ability_detail_pokemon_inner->slot
    if (!ability_detail_pokemon_inner->slot) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "slot", ability_detail_pokemon_inner->slot) == NULL) {
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
        is_hidden->valueint,
        slot->valuedouble,
        pokemon_local_nonprim
        );

    return ability_detail_pokemon_inner_local_var;
end:
    if (pokemon_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_local_nonprim);
        pokemon_local_nonprim = NULL;
    }
    return NULL;

}
