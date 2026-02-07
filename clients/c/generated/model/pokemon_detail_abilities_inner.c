#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_detail_abilities_inner.h"



static pokemon_detail_abilities_inner_t *pokemon_detail_abilities_inner_create_internal(
    ability_detail_pokemon_inner_pokemon_t *ability,
    int is_hidden,
    int slot
    ) {
    pokemon_detail_abilities_inner_t *pokemon_detail_abilities_inner_local_var = malloc(sizeof(pokemon_detail_abilities_inner_t));
    if (!pokemon_detail_abilities_inner_local_var) {
        return NULL;
    }
    pokemon_detail_abilities_inner_local_var->ability = ability;
    pokemon_detail_abilities_inner_local_var->is_hidden = is_hidden;
    pokemon_detail_abilities_inner_local_var->slot = slot;

    pokemon_detail_abilities_inner_local_var->_library_owned = 1;
    return pokemon_detail_abilities_inner_local_var;
}

__attribute__((deprecated)) pokemon_detail_abilities_inner_t *pokemon_detail_abilities_inner_create(
    ability_detail_pokemon_inner_pokemon_t *ability,
    int is_hidden,
    int slot
    ) {
    return pokemon_detail_abilities_inner_create_internal (
        ability,
        is_hidden,
        slot
        );
}

void pokemon_detail_abilities_inner_free(pokemon_detail_abilities_inner_t *pokemon_detail_abilities_inner) {
    if(NULL == pokemon_detail_abilities_inner){
        return ;
    }
    if(pokemon_detail_abilities_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_detail_abilities_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_detail_abilities_inner->ability) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_detail_abilities_inner->ability);
        pokemon_detail_abilities_inner->ability = NULL;
    }
    free(pokemon_detail_abilities_inner);
}

cJSON *pokemon_detail_abilities_inner_convertToJSON(pokemon_detail_abilities_inner_t *pokemon_detail_abilities_inner) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_detail_abilities_inner->ability
    if (!pokemon_detail_abilities_inner->ability) {
        goto fail;
    }
    cJSON *ability_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(pokemon_detail_abilities_inner->ability);
    if(ability_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ability", ability_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_detail_abilities_inner->is_hidden
    if (!pokemon_detail_abilities_inner->is_hidden) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "is_hidden", pokemon_detail_abilities_inner->is_hidden) == NULL) {
    goto fail; //Bool
    }


    // pokemon_detail_abilities_inner->slot
    if (!pokemon_detail_abilities_inner->slot) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "slot", pokemon_detail_abilities_inner->slot) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_detail_abilities_inner_t *pokemon_detail_abilities_inner_parseFromJSON(cJSON *pokemon_detail_abilities_innerJSON){

    pokemon_detail_abilities_inner_t *pokemon_detail_abilities_inner_local_var = NULL;

    // define the local variable for pokemon_detail_abilities_inner->ability
    ability_detail_pokemon_inner_pokemon_t *ability_local_nonprim = NULL;

    // pokemon_detail_abilities_inner->ability
    cJSON *ability = cJSON_GetObjectItemCaseSensitive(pokemon_detail_abilities_innerJSON, "ability");
    if (cJSON_IsNull(ability)) {
        ability = NULL;
    }
    if (!ability) {
        goto end;
    }

    
    ability_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(ability); //nonprimitive

    // pokemon_detail_abilities_inner->is_hidden
    cJSON *is_hidden = cJSON_GetObjectItemCaseSensitive(pokemon_detail_abilities_innerJSON, "is_hidden");
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

    // pokemon_detail_abilities_inner->slot
    cJSON *slot = cJSON_GetObjectItemCaseSensitive(pokemon_detail_abilities_innerJSON, "slot");
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


    pokemon_detail_abilities_inner_local_var = pokemon_detail_abilities_inner_create_internal (
        ability_local_nonprim,
        is_hidden->valueint,
        slot->valuedouble
        );

    return pokemon_detail_abilities_inner_local_var;
end:
    if (ability_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(ability_local_nonprim);
        ability_local_nonprim = NULL;
    }
    return NULL;

}
