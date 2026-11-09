#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_past_type.h"



static pokemon_past_type_t *pokemon_past_type_create_internal(
    generation_summary_t *generation,
    list_t *types
    ) {
    pokemon_past_type_t *pokemon_past_type_local_var = malloc(sizeof(pokemon_past_type_t));
    if (!pokemon_past_type_local_var) {
        return NULL;
    }
    memset(pokemon_past_type_local_var, 0, sizeof(pokemon_past_type_t));
    pokemon_past_type_local_var->_library_owned = 1;
    pokemon_past_type_local_var->generation = generation;
    pokemon_past_type_local_var->types = types;
    return pokemon_past_type_local_var;
}

__attribute__((deprecated)) pokemon_past_type_t *pokemon_past_type_create(
    generation_summary_t *generation,
    list_t *types
    ) {
    pokemon_past_type_t *result = pokemon_past_type_create_internal (
        generation,
        types
        );
    if (!result) {
    }
    return result;
}

void pokemon_past_type_free(pokemon_past_type_t *pokemon_past_type) {
    if(NULL == pokemon_past_type){
        return ;
    }
    if(pokemon_past_type->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_past_type_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_past_type->generation) {
        generation_summary_free(pokemon_past_type->generation);
        pokemon_past_type->generation = NULL;
    }
    if (pokemon_past_type->types) {
        list_ForEach(listEntry, pokemon_past_type->types) {
            pokemon_type_free(listEntry->data);
        }
        list_freeList(pokemon_past_type->types);
        pokemon_past_type->types = NULL;
    }
    free(pokemon_past_type);
}

cJSON *pokemon_past_type_convertToJSON(pokemon_past_type_t *pokemon_past_type) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_past_type->generation
    if (!pokemon_past_type->generation) {
        goto fail;
    }
    cJSON *generation_local_JSON = generation_summary_convertToJSON(pokemon_past_type->generation);
    if(generation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "generation", generation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_past_type->types
    if (!pokemon_past_type->types) {
        goto fail;
    }
    cJSON *types = cJSON_AddArrayToObject(item, "types");
    if(types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *typesListEntry;
    if (pokemon_past_type->types) {
    list_ForEach(typesListEntry, pokemon_past_type->types) {
    cJSON *itemLocal = pokemon_type_convertToJSON(typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(types, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_past_type_t *pokemon_past_type_parseFromJSON(cJSON *pokemon_past_typeJSON){

    pokemon_past_type_t *pokemon_past_type_local_var = NULL;

    // define the local variable for pokemon_past_type->generation
    generation_summary_t *generation_local_nonprim = NULL;

    // define the local list for pokemon_past_type->types
    list_t *typesList = NULL;

    // pokemon_past_type->generation
    cJSON *generation = cJSON_GetObjectItemCaseSensitive(pokemon_past_typeJSON, "generation");
    if (cJSON_IsNull(generation)) {
        generation = NULL;
    }
    if (!generation) {
        goto end;
    }

    
    generation_local_nonprim = generation_summary_parseFromJSON(generation); //nonprimitive

    // pokemon_past_type->types
    cJSON *types = cJSON_GetObjectItemCaseSensitive(pokemon_past_typeJSON, "types");
    if (cJSON_IsNull(types)) {
        types = NULL;
    }
    if (!types) {
        goto end;
    }

    
    cJSON *types_local_nonprimitive = NULL;
    if(!cJSON_IsArray(types)){
        goto end; //nonprimitive container
    }

    typesList = list_createList();

    cJSON_ArrayForEach(types_local_nonprimitive,types )
    {
        if(!cJSON_IsObject(types_local_nonprimitive)){
            goto end;
        }
        pokemon_type_t *typesItem = pokemon_type_parseFromJSON(types_local_nonprimitive);

        list_addElement(typesList, typesItem);
    }



    pokemon_past_type_local_var = pokemon_past_type_create_internal (
        generation_local_nonprim,
        typesList
        );

    if (!pokemon_past_type_local_var) {
        goto end;
    }

    return pokemon_past_type_local_var;
end:
    if (generation_local_nonprim) {
        generation_summary_free(generation_local_nonprim);
        generation_local_nonprim = NULL;
    }
    if (typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, typesList) {
            pokemon_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(typesList);
        typesList = NULL;
    }
    return NULL;

}
