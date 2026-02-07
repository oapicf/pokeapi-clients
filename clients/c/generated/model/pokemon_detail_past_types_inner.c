#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_detail_past_types_inner.h"



static pokemon_detail_past_types_inner_t *pokemon_detail_past_types_inner_create_internal(
    ability_detail_pokemon_inner_pokemon_t *generation,
    list_t *types
    ) {
    pokemon_detail_past_types_inner_t *pokemon_detail_past_types_inner_local_var = malloc(sizeof(pokemon_detail_past_types_inner_t));
    if (!pokemon_detail_past_types_inner_local_var) {
        return NULL;
    }
    pokemon_detail_past_types_inner_local_var->generation = generation;
    pokemon_detail_past_types_inner_local_var->types = types;

    pokemon_detail_past_types_inner_local_var->_library_owned = 1;
    return pokemon_detail_past_types_inner_local_var;
}

__attribute__((deprecated)) pokemon_detail_past_types_inner_t *pokemon_detail_past_types_inner_create(
    ability_detail_pokemon_inner_pokemon_t *generation,
    list_t *types
    ) {
    return pokemon_detail_past_types_inner_create_internal (
        generation,
        types
        );
}

void pokemon_detail_past_types_inner_free(pokemon_detail_past_types_inner_t *pokemon_detail_past_types_inner) {
    if(NULL == pokemon_detail_past_types_inner){
        return ;
    }
    if(pokemon_detail_past_types_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_detail_past_types_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_detail_past_types_inner->generation) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_detail_past_types_inner->generation);
        pokemon_detail_past_types_inner->generation = NULL;
    }
    if (pokemon_detail_past_types_inner->types) {
        list_ForEach(listEntry, pokemon_detail_past_types_inner->types) {
            pokemon_detail_types_inner_free(listEntry->data);
        }
        list_freeList(pokemon_detail_past_types_inner->types);
        pokemon_detail_past_types_inner->types = NULL;
    }
    free(pokemon_detail_past_types_inner);
}

cJSON *pokemon_detail_past_types_inner_convertToJSON(pokemon_detail_past_types_inner_t *pokemon_detail_past_types_inner) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_detail_past_types_inner->generation
    if (!pokemon_detail_past_types_inner->generation) {
        goto fail;
    }
    cJSON *generation_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(pokemon_detail_past_types_inner->generation);
    if(generation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "generation", generation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_detail_past_types_inner->types
    if (!pokemon_detail_past_types_inner->types) {
        goto fail;
    }
    cJSON *types = cJSON_AddArrayToObject(item, "types");
    if(types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *typesListEntry;
    if (pokemon_detail_past_types_inner->types) {
    list_ForEach(typesListEntry, pokemon_detail_past_types_inner->types) {
    cJSON *itemLocal = pokemon_detail_types_inner_convertToJSON(typesListEntry->data);
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

pokemon_detail_past_types_inner_t *pokemon_detail_past_types_inner_parseFromJSON(cJSON *pokemon_detail_past_types_innerJSON){

    pokemon_detail_past_types_inner_t *pokemon_detail_past_types_inner_local_var = NULL;

    // define the local variable for pokemon_detail_past_types_inner->generation
    ability_detail_pokemon_inner_pokemon_t *generation_local_nonprim = NULL;

    // define the local list for pokemon_detail_past_types_inner->types
    list_t *typesList = NULL;

    // pokemon_detail_past_types_inner->generation
    cJSON *generation = cJSON_GetObjectItemCaseSensitive(pokemon_detail_past_types_innerJSON, "generation");
    if (cJSON_IsNull(generation)) {
        generation = NULL;
    }
    if (!generation) {
        goto end;
    }

    
    generation_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(generation); //nonprimitive

    // pokemon_detail_past_types_inner->types
    cJSON *types = cJSON_GetObjectItemCaseSensitive(pokemon_detail_past_types_innerJSON, "types");
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
        pokemon_detail_types_inner_t *typesItem = pokemon_detail_types_inner_parseFromJSON(types_local_nonprimitive);

        list_addElement(typesList, typesItem);
    }


    pokemon_detail_past_types_inner_local_var = pokemon_detail_past_types_inner_create_internal (
        generation_local_nonprim,
        typesList
        );

    return pokemon_detail_past_types_inner_local_var;
end:
    if (generation_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(generation_local_nonprim);
        generation_local_nonprim = NULL;
    }
    if (typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, typesList) {
            pokemon_detail_types_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(typesList);
        typesList = NULL;
    }
    return NULL;

}
