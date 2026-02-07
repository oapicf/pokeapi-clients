#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_detail_past_abilities_inner.h"



static pokemon_detail_past_abilities_inner_t *pokemon_detail_past_abilities_inner_create_internal(
    list_t *abilities,
    ability_detail_pokemon_inner_pokemon_t *generation
    ) {
    pokemon_detail_past_abilities_inner_t *pokemon_detail_past_abilities_inner_local_var = malloc(sizeof(pokemon_detail_past_abilities_inner_t));
    if (!pokemon_detail_past_abilities_inner_local_var) {
        return NULL;
    }
    pokemon_detail_past_abilities_inner_local_var->abilities = abilities;
    pokemon_detail_past_abilities_inner_local_var->generation = generation;

    pokemon_detail_past_abilities_inner_local_var->_library_owned = 1;
    return pokemon_detail_past_abilities_inner_local_var;
}

__attribute__((deprecated)) pokemon_detail_past_abilities_inner_t *pokemon_detail_past_abilities_inner_create(
    list_t *abilities,
    ability_detail_pokemon_inner_pokemon_t *generation
    ) {
    return pokemon_detail_past_abilities_inner_create_internal (
        abilities,
        generation
        );
}

void pokemon_detail_past_abilities_inner_free(pokemon_detail_past_abilities_inner_t *pokemon_detail_past_abilities_inner) {
    if(NULL == pokemon_detail_past_abilities_inner){
        return ;
    }
    if(pokemon_detail_past_abilities_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_detail_past_abilities_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_detail_past_abilities_inner->abilities) {
        list_ForEach(listEntry, pokemon_detail_past_abilities_inner->abilities) {
            pokemon_detail_abilities_inner_free(listEntry->data);
        }
        list_freeList(pokemon_detail_past_abilities_inner->abilities);
        pokemon_detail_past_abilities_inner->abilities = NULL;
    }
    if (pokemon_detail_past_abilities_inner->generation) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_detail_past_abilities_inner->generation);
        pokemon_detail_past_abilities_inner->generation = NULL;
    }
    free(pokemon_detail_past_abilities_inner);
}

cJSON *pokemon_detail_past_abilities_inner_convertToJSON(pokemon_detail_past_abilities_inner_t *pokemon_detail_past_abilities_inner) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_detail_past_abilities_inner->abilities
    if (!pokemon_detail_past_abilities_inner->abilities) {
        goto fail;
    }
    cJSON *abilities = cJSON_AddArrayToObject(item, "abilities");
    if(abilities == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *abilitiesListEntry;
    if (pokemon_detail_past_abilities_inner->abilities) {
    list_ForEach(abilitiesListEntry, pokemon_detail_past_abilities_inner->abilities) {
    cJSON *itemLocal = pokemon_detail_abilities_inner_convertToJSON(abilitiesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(abilities, itemLocal);
    }
    }


    // pokemon_detail_past_abilities_inner->generation
    if (!pokemon_detail_past_abilities_inner->generation) {
        goto fail;
    }
    cJSON *generation_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(pokemon_detail_past_abilities_inner->generation);
    if(generation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "generation", generation_local_JSON);
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

pokemon_detail_past_abilities_inner_t *pokemon_detail_past_abilities_inner_parseFromJSON(cJSON *pokemon_detail_past_abilities_innerJSON){

    pokemon_detail_past_abilities_inner_t *pokemon_detail_past_abilities_inner_local_var = NULL;

    // define the local list for pokemon_detail_past_abilities_inner->abilities
    list_t *abilitiesList = NULL;

    // define the local variable for pokemon_detail_past_abilities_inner->generation
    ability_detail_pokemon_inner_pokemon_t *generation_local_nonprim = NULL;

    // pokemon_detail_past_abilities_inner->abilities
    cJSON *abilities = cJSON_GetObjectItemCaseSensitive(pokemon_detail_past_abilities_innerJSON, "abilities");
    if (cJSON_IsNull(abilities)) {
        abilities = NULL;
    }
    if (!abilities) {
        goto end;
    }

    
    cJSON *abilities_local_nonprimitive = NULL;
    if(!cJSON_IsArray(abilities)){
        goto end; //nonprimitive container
    }

    abilitiesList = list_createList();

    cJSON_ArrayForEach(abilities_local_nonprimitive,abilities )
    {
        if(!cJSON_IsObject(abilities_local_nonprimitive)){
            goto end;
        }
        pokemon_detail_abilities_inner_t *abilitiesItem = pokemon_detail_abilities_inner_parseFromJSON(abilities_local_nonprimitive);

        list_addElement(abilitiesList, abilitiesItem);
    }

    // pokemon_detail_past_abilities_inner->generation
    cJSON *generation = cJSON_GetObjectItemCaseSensitive(pokemon_detail_past_abilities_innerJSON, "generation");
    if (cJSON_IsNull(generation)) {
        generation = NULL;
    }
    if (!generation) {
        goto end;
    }

    
    generation_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(generation); //nonprimitive


    pokemon_detail_past_abilities_inner_local_var = pokemon_detail_past_abilities_inner_create_internal (
        abilitiesList,
        generation_local_nonprim
        );

    return pokemon_detail_past_abilities_inner_local_var;
end:
    if (abilitiesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, abilitiesList) {
            pokemon_detail_abilities_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(abilitiesList);
        abilitiesList = NULL;
    }
    if (generation_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(generation_local_nonprim);
        generation_local_nonprim = NULL;
    }
    return NULL;

}
