#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_past_ability.h"



static pokemon_past_ability_t *pokemon_past_ability_create_internal(
    list_t *abilities,
    generation_summary_t *generation
    ) {
    pokemon_past_ability_t *pokemon_past_ability_local_var = malloc(sizeof(pokemon_past_ability_t));
    if (!pokemon_past_ability_local_var) {
        return NULL;
    }
    memset(pokemon_past_ability_local_var, 0, sizeof(pokemon_past_ability_t));
    pokemon_past_ability_local_var->_library_owned = 1;
    pokemon_past_ability_local_var->abilities = abilities;
    pokemon_past_ability_local_var->generation = generation;
    return pokemon_past_ability_local_var;
}

__attribute__((deprecated)) pokemon_past_ability_t *pokemon_past_ability_create(
    list_t *abilities,
    generation_summary_t *generation
    ) {
    pokemon_past_ability_t *result = pokemon_past_ability_create_internal (
        abilities,
        generation
        );
    if (!result) {
    }
    return result;
}

void pokemon_past_ability_free(pokemon_past_ability_t *pokemon_past_ability) {
    if(NULL == pokemon_past_ability){
        return ;
    }
    if(pokemon_past_ability->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_past_ability_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_past_ability->abilities) {
        list_ForEach(listEntry, pokemon_past_ability->abilities) {
            pokemon_ability_past_free(listEntry->data);
        }
        list_freeList(pokemon_past_ability->abilities);
        pokemon_past_ability->abilities = NULL;
    }
    if (pokemon_past_ability->generation) {
        generation_summary_free(pokemon_past_ability->generation);
        pokemon_past_ability->generation = NULL;
    }
    free(pokemon_past_ability);
}

cJSON *pokemon_past_ability_convertToJSON(pokemon_past_ability_t *pokemon_past_ability) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_past_ability->abilities
    if (!pokemon_past_ability->abilities) {
        goto fail;
    }
    cJSON *abilities = cJSON_AddArrayToObject(item, "abilities");
    if(abilities == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *abilitiesListEntry;
    if (pokemon_past_ability->abilities) {
    list_ForEach(abilitiesListEntry, pokemon_past_ability->abilities) {
    cJSON *itemLocal = pokemon_ability_past_convertToJSON(abilitiesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(abilities, itemLocal);
    }
    }


    // pokemon_past_ability->generation
    if (!pokemon_past_ability->generation) {
        goto fail;
    }
    cJSON *generation_local_JSON = generation_summary_convertToJSON(pokemon_past_ability->generation);
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

pokemon_past_ability_t *pokemon_past_ability_parseFromJSON(cJSON *pokemon_past_abilityJSON){

    pokemon_past_ability_t *pokemon_past_ability_local_var = NULL;

    // define the local list for pokemon_past_ability->abilities
    list_t *abilitiesList = NULL;

    // define the local variable for pokemon_past_ability->generation
    generation_summary_t *generation_local_nonprim = NULL;

    // pokemon_past_ability->abilities
    cJSON *abilities = cJSON_GetObjectItemCaseSensitive(pokemon_past_abilityJSON, "abilities");
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
        pokemon_ability_past_t *abilitiesItem = pokemon_ability_past_parseFromJSON(abilities_local_nonprimitive);

        list_addElement(abilitiesList, abilitiesItem);
    }

    // pokemon_past_ability->generation
    cJSON *generation = cJSON_GetObjectItemCaseSensitive(pokemon_past_abilityJSON, "generation");
    if (cJSON_IsNull(generation)) {
        generation = NULL;
    }
    if (!generation) {
        goto end;
    }

    
    generation_local_nonprim = generation_summary_parseFromJSON(generation); //nonprimitive



    pokemon_past_ability_local_var = pokemon_past_ability_create_internal (
        abilitiesList,
        generation_local_nonprim
        );

    if (!pokemon_past_ability_local_var) {
        goto end;
    }

    return pokemon_past_ability_local_var;
end:
    if (abilitiesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, abilitiesList) {
            pokemon_ability_past_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(abilitiesList);
        abilitiesList = NULL;
    }
    if (generation_local_nonprim) {
        generation_summary_free(generation_local_nonprim);
        generation_local_nonprim = NULL;
    }
    return NULL;

}
