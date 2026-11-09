#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_type.h"



static pokemon_type_t *pokemon_type_create_internal(
    int *slot,
    type_summary_t *type
    ) {
    pokemon_type_t *pokemon_type_local_var = malloc(sizeof(pokemon_type_t));
    if (!pokemon_type_local_var) {
        return NULL;
    }
    memset(pokemon_type_local_var, 0, sizeof(pokemon_type_t));
    pokemon_type_local_var->_library_owned = 1;
    pokemon_type_local_var->slot = slot;
    pokemon_type_local_var->type = type;
    return pokemon_type_local_var;
}

__attribute__((deprecated)) pokemon_type_t *pokemon_type_create(
    int *slot,
    type_summary_t *type
    ) {
    int *slot_copy = NULL;
    if (slot) {
        slot_copy = malloc(sizeof(int));
        if (slot_copy) *slot_copy = *slot;
    }
    pokemon_type_t *result = pokemon_type_create_internal (
        slot_copy,
        type
        );
    if (!result) {
        free(slot_copy);
    }
    return result;
}

void pokemon_type_free(pokemon_type_t *pokemon_type) {
    if(NULL == pokemon_type){
        return ;
    }
    if(pokemon_type->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_type_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_type->slot) {
        free(pokemon_type->slot);
        pokemon_type->slot = NULL;
    }
    if (pokemon_type->type) {
        type_summary_free(pokemon_type->type);
        pokemon_type->type = NULL;
    }
    free(pokemon_type);
}

cJSON *pokemon_type_convertToJSON(pokemon_type_t *pokemon_type) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_type->slot
    if (!pokemon_type->slot) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "slot", *pokemon_type->slot) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_type->type
    if (!pokemon_type->type) {
        goto fail;
    }
    cJSON *type_local_JSON = type_summary_convertToJSON(pokemon_type->type);
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

pokemon_type_t *pokemon_type_parseFromJSON(cJSON *pokemon_typeJSON){

    pokemon_type_t *pokemon_type_local_var = NULL;

    // define the local variable for pokemon_type->slot
    int *slot_local_var = NULL;

    // define the local variable for pokemon_type->type
    type_summary_t *type_local_nonprim = NULL;

    // pokemon_type->slot
    cJSON *slot = cJSON_GetObjectItemCaseSensitive(pokemon_typeJSON, "slot");
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

    // pokemon_type->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(pokemon_typeJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = type_summary_parseFromJSON(type); //nonprimitive



    pokemon_type_local_var = pokemon_type_create_internal (
        slot_local_var,
        type_local_nonprim
        );

    if (!pokemon_type_local_var) {
        goto end;
    }

    return pokemon_type_local_var;
end:
    if (slot_local_var) {
        free(slot_local_var);
        slot_local_var = NULL;
    }
    if (type_local_nonprim) {
        type_summary_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
