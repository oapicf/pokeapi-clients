#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "type_pokemon.h"



static type_pokemon_t *type_pokemon_create_internal(
    int *slot,
    pokemon_summary_t *pokemon
    ) {
    type_pokemon_t *type_pokemon_local_var = malloc(sizeof(type_pokemon_t));
    if (!type_pokemon_local_var) {
        return NULL;
    }
    memset(type_pokemon_local_var, 0, sizeof(type_pokemon_t));
    type_pokemon_local_var->_library_owned = 1;
    type_pokemon_local_var->slot = slot;
    type_pokemon_local_var->pokemon = pokemon;
    return type_pokemon_local_var;
}

__attribute__((deprecated)) type_pokemon_t *type_pokemon_create(
    int *slot,
    pokemon_summary_t *pokemon
    ) {
    int *slot_copy = NULL;
    if (slot) {
        slot_copy = malloc(sizeof(int));
        if (slot_copy) *slot_copy = *slot;
    }
    type_pokemon_t *result = type_pokemon_create_internal (
        slot_copy,
        pokemon
        );
    if (!result) {
        free(slot_copy);
    }
    return result;
}

void type_pokemon_free(type_pokemon_t *type_pokemon) {
    if(NULL == type_pokemon){
        return ;
    }
    if(type_pokemon->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "type_pokemon_free");
        return ;
    }
    listEntry_t *listEntry;
    if (type_pokemon->slot) {
        free(type_pokemon->slot);
        type_pokemon->slot = NULL;
    }
    if (type_pokemon->pokemon) {
        pokemon_summary_free(type_pokemon->pokemon);
        type_pokemon->pokemon = NULL;
    }
    free(type_pokemon);
}

cJSON *type_pokemon_convertToJSON(type_pokemon_t *type_pokemon) {
    cJSON *item = cJSON_CreateObject();

    // type_pokemon->slot
    if (!type_pokemon->slot) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "slot", *type_pokemon->slot) == NULL) {
    goto fail; //Numeric
    }


    // type_pokemon->pokemon
    if (!type_pokemon->pokemon) {
        goto fail;
    }
    cJSON *pokemon_local_JSON = pokemon_summary_convertToJSON(type_pokemon->pokemon);
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

type_pokemon_t *type_pokemon_parseFromJSON(cJSON *type_pokemonJSON){

    type_pokemon_t *type_pokemon_local_var = NULL;

    // define the local variable for type_pokemon->slot
    int *slot_local_var = NULL;

    // define the local variable for type_pokemon->pokemon
    pokemon_summary_t *pokemon_local_nonprim = NULL;

    // type_pokemon->slot
    cJSON *slot = cJSON_GetObjectItemCaseSensitive(type_pokemonJSON, "slot");
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

    // type_pokemon->pokemon
    cJSON *pokemon = cJSON_GetObjectItemCaseSensitive(type_pokemonJSON, "pokemon");
    if (cJSON_IsNull(pokemon)) {
        pokemon = NULL;
    }
    if (!pokemon) {
        goto end;
    }

    
    pokemon_local_nonprim = pokemon_summary_parseFromJSON(pokemon); //nonprimitive



    type_pokemon_local_var = type_pokemon_create_internal (
        slot_local_var,
        pokemon_local_nonprim
        );

    if (!type_pokemon_local_var) {
        goto end;
    }

    return type_pokemon_local_var;
end:
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
