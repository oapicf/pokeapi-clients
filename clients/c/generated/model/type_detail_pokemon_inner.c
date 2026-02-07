#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "type_detail_pokemon_inner.h"



static type_detail_pokemon_inner_t *type_detail_pokemon_inner_create_internal(
    int slot,
    type_detail_pokemon_inner_pokemon_t *pokemon
    ) {
    type_detail_pokemon_inner_t *type_detail_pokemon_inner_local_var = malloc(sizeof(type_detail_pokemon_inner_t));
    if (!type_detail_pokemon_inner_local_var) {
        return NULL;
    }
    type_detail_pokemon_inner_local_var->slot = slot;
    type_detail_pokemon_inner_local_var->pokemon = pokemon;

    type_detail_pokemon_inner_local_var->_library_owned = 1;
    return type_detail_pokemon_inner_local_var;
}

__attribute__((deprecated)) type_detail_pokemon_inner_t *type_detail_pokemon_inner_create(
    int slot,
    type_detail_pokemon_inner_pokemon_t *pokemon
    ) {
    return type_detail_pokemon_inner_create_internal (
        slot,
        pokemon
        );
}

void type_detail_pokemon_inner_free(type_detail_pokemon_inner_t *type_detail_pokemon_inner) {
    if(NULL == type_detail_pokemon_inner){
        return ;
    }
    if(type_detail_pokemon_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "type_detail_pokemon_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (type_detail_pokemon_inner->pokemon) {
        type_detail_pokemon_inner_pokemon_free(type_detail_pokemon_inner->pokemon);
        type_detail_pokemon_inner->pokemon = NULL;
    }
    free(type_detail_pokemon_inner);
}

cJSON *type_detail_pokemon_inner_convertToJSON(type_detail_pokemon_inner_t *type_detail_pokemon_inner) {
    cJSON *item = cJSON_CreateObject();

    // type_detail_pokemon_inner->slot
    if(type_detail_pokemon_inner->slot) {
    if(cJSON_AddNumberToObject(item, "slot", type_detail_pokemon_inner->slot) == NULL) {
    goto fail; //Numeric
    }
    }


    // type_detail_pokemon_inner->pokemon
    if(type_detail_pokemon_inner->pokemon) {
    cJSON *pokemon_local_JSON = type_detail_pokemon_inner_pokemon_convertToJSON(type_detail_pokemon_inner->pokemon);
    if(pokemon_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pokemon", pokemon_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

type_detail_pokemon_inner_t *type_detail_pokemon_inner_parseFromJSON(cJSON *type_detail_pokemon_innerJSON){

    type_detail_pokemon_inner_t *type_detail_pokemon_inner_local_var = NULL;

    // define the local variable for type_detail_pokemon_inner->pokemon
    type_detail_pokemon_inner_pokemon_t *pokemon_local_nonprim = NULL;

    // type_detail_pokemon_inner->slot
    cJSON *slot = cJSON_GetObjectItemCaseSensitive(type_detail_pokemon_innerJSON, "slot");
    if (cJSON_IsNull(slot)) {
        slot = NULL;
    }
    if (slot) { 
    if(!cJSON_IsNumber(slot))
    {
    goto end; //Numeric
    }
    }

    // type_detail_pokemon_inner->pokemon
    cJSON *pokemon = cJSON_GetObjectItemCaseSensitive(type_detail_pokemon_innerJSON, "pokemon");
    if (cJSON_IsNull(pokemon)) {
        pokemon = NULL;
    }
    if (pokemon) { 
    pokemon_local_nonprim = type_detail_pokemon_inner_pokemon_parseFromJSON(pokemon); //nonprimitive
    }


    type_detail_pokemon_inner_local_var = type_detail_pokemon_inner_create_internal (
        slot ? slot->valuedouble : 0,
        pokemon ? pokemon_local_nonprim : NULL
        );

    return type_detail_pokemon_inner_local_var;
end:
    if (pokemon_local_nonprim) {
        type_detail_pokemon_inner_pokemon_free(pokemon_local_nonprim);
        pokemon_local_nonprim = NULL;
    }
    return NULL;

}
