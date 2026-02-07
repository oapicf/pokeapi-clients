#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_detail_types_inner.h"



static pokemon_detail_types_inner_t *pokemon_detail_types_inner_create_internal(
    int slot,
    ability_detail_pokemon_inner_pokemon_t *type
    ) {
    pokemon_detail_types_inner_t *pokemon_detail_types_inner_local_var = malloc(sizeof(pokemon_detail_types_inner_t));
    if (!pokemon_detail_types_inner_local_var) {
        return NULL;
    }
    pokemon_detail_types_inner_local_var->slot = slot;
    pokemon_detail_types_inner_local_var->type = type;

    pokemon_detail_types_inner_local_var->_library_owned = 1;
    return pokemon_detail_types_inner_local_var;
}

__attribute__((deprecated)) pokemon_detail_types_inner_t *pokemon_detail_types_inner_create(
    int slot,
    ability_detail_pokemon_inner_pokemon_t *type
    ) {
    return pokemon_detail_types_inner_create_internal (
        slot,
        type
        );
}

void pokemon_detail_types_inner_free(pokemon_detail_types_inner_t *pokemon_detail_types_inner) {
    if(NULL == pokemon_detail_types_inner){
        return ;
    }
    if(pokemon_detail_types_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_detail_types_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_detail_types_inner->type) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_detail_types_inner->type);
        pokemon_detail_types_inner->type = NULL;
    }
    free(pokemon_detail_types_inner);
}

cJSON *pokemon_detail_types_inner_convertToJSON(pokemon_detail_types_inner_t *pokemon_detail_types_inner) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_detail_types_inner->slot
    if (!pokemon_detail_types_inner->slot) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "slot", pokemon_detail_types_inner->slot) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_detail_types_inner->type
    if (!pokemon_detail_types_inner->type) {
        goto fail;
    }
    cJSON *type_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(pokemon_detail_types_inner->type);
    if(type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
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

pokemon_detail_types_inner_t *pokemon_detail_types_inner_parseFromJSON(cJSON *pokemon_detail_types_innerJSON){

    pokemon_detail_types_inner_t *pokemon_detail_types_inner_local_var = NULL;

    // define the local variable for pokemon_detail_types_inner->type
    ability_detail_pokemon_inner_pokemon_t *type_local_nonprim = NULL;

    // pokemon_detail_types_inner->slot
    cJSON *slot = cJSON_GetObjectItemCaseSensitive(pokemon_detail_types_innerJSON, "slot");
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

    // pokemon_detail_types_inner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(pokemon_detail_types_innerJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(type); //nonprimitive


    pokemon_detail_types_inner_local_var = pokemon_detail_types_inner_create_internal (
        slot->valuedouble,
        type_local_nonprim
        );

    return pokemon_detail_types_inner_local_var;
end:
    if (type_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
