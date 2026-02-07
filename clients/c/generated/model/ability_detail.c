#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ability_detail.h"



static ability_detail_t *ability_detail_create_internal(
    int id,
    char *name,
    int is_main_series,
    generation_summary_t *generation,
    list_t *names,
    list_t *effect_entries,
    list_t *effect_changes,
    list_t *flavor_text_entries,
    list_t *pokemon
    ) {
    ability_detail_t *ability_detail_local_var = malloc(sizeof(ability_detail_t));
    if (!ability_detail_local_var) {
        return NULL;
    }
    ability_detail_local_var->id = id;
    ability_detail_local_var->name = name;
    ability_detail_local_var->is_main_series = is_main_series;
    ability_detail_local_var->generation = generation;
    ability_detail_local_var->names = names;
    ability_detail_local_var->effect_entries = effect_entries;
    ability_detail_local_var->effect_changes = effect_changes;
    ability_detail_local_var->flavor_text_entries = flavor_text_entries;
    ability_detail_local_var->pokemon = pokemon;

    ability_detail_local_var->_library_owned = 1;
    return ability_detail_local_var;
}

__attribute__((deprecated)) ability_detail_t *ability_detail_create(
    int id,
    char *name,
    int is_main_series,
    generation_summary_t *generation,
    list_t *names,
    list_t *effect_entries,
    list_t *effect_changes,
    list_t *flavor_text_entries,
    list_t *pokemon
    ) {
    return ability_detail_create_internal (
        id,
        name,
        is_main_series,
        generation,
        names,
        effect_entries,
        effect_changes,
        flavor_text_entries,
        pokemon
        );
}

void ability_detail_free(ability_detail_t *ability_detail) {
    if(NULL == ability_detail){
        return ;
    }
    if(ability_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ability_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ability_detail->name) {
        free(ability_detail->name);
        ability_detail->name = NULL;
    }
    if (ability_detail->generation) {
        generation_summary_free(ability_detail->generation);
        ability_detail->generation = NULL;
    }
    if (ability_detail->names) {
        list_ForEach(listEntry, ability_detail->names) {
            ability_name_free(listEntry->data);
        }
        list_freeList(ability_detail->names);
        ability_detail->names = NULL;
    }
    if (ability_detail->effect_entries) {
        list_ForEach(listEntry, ability_detail->effect_entries) {
            ability_effect_text_free(listEntry->data);
        }
        list_freeList(ability_detail->effect_entries);
        ability_detail->effect_entries = NULL;
    }
    if (ability_detail->effect_changes) {
        list_ForEach(listEntry, ability_detail->effect_changes) {
            ability_change_free(listEntry->data);
        }
        list_freeList(ability_detail->effect_changes);
        ability_detail->effect_changes = NULL;
    }
    if (ability_detail->flavor_text_entries) {
        list_ForEach(listEntry, ability_detail->flavor_text_entries) {
            ability_flavor_text_free(listEntry->data);
        }
        list_freeList(ability_detail->flavor_text_entries);
        ability_detail->flavor_text_entries = NULL;
    }
    if (ability_detail->pokemon) {
        list_ForEach(listEntry, ability_detail->pokemon) {
            ability_detail_pokemon_inner_free(listEntry->data);
        }
        list_freeList(ability_detail->pokemon);
        ability_detail->pokemon = NULL;
    }
    free(ability_detail);
}

cJSON *ability_detail_convertToJSON(ability_detail_t *ability_detail) {
    cJSON *item = cJSON_CreateObject();

    // ability_detail->id
    if (!ability_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", ability_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // ability_detail->name
    if (!ability_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", ability_detail->name) == NULL) {
    goto fail; //String
    }


    // ability_detail->is_main_series
    if(ability_detail->is_main_series) {
    if(cJSON_AddBoolToObject(item, "is_main_series", ability_detail->is_main_series) == NULL) {
    goto fail; //Bool
    }
    }


    // ability_detail->generation
    if (!ability_detail->generation) {
        goto fail;
    }
    cJSON *generation_local_JSON = generation_summary_convertToJSON(ability_detail->generation);
    if(generation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "generation", generation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // ability_detail->names
    if (!ability_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (ability_detail->names) {
    list_ForEach(namesListEntry, ability_detail->names) {
    cJSON *itemLocal = ability_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // ability_detail->effect_entries
    if (!ability_detail->effect_entries) {
        goto fail;
    }
    cJSON *effect_entries = cJSON_AddArrayToObject(item, "effect_entries");
    if(effect_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *effect_entriesListEntry;
    if (ability_detail->effect_entries) {
    list_ForEach(effect_entriesListEntry, ability_detail->effect_entries) {
    cJSON *itemLocal = ability_effect_text_convertToJSON(effect_entriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(effect_entries, itemLocal);
    }
    }


    // ability_detail->effect_changes
    if (!ability_detail->effect_changes) {
        goto fail;
    }
    cJSON *effect_changes = cJSON_AddArrayToObject(item, "effect_changes");
    if(effect_changes == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *effect_changesListEntry;
    if (ability_detail->effect_changes) {
    list_ForEach(effect_changesListEntry, ability_detail->effect_changes) {
    cJSON *itemLocal = ability_change_convertToJSON(effect_changesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(effect_changes, itemLocal);
    }
    }


    // ability_detail->flavor_text_entries
    if (!ability_detail->flavor_text_entries) {
        goto fail;
    }
    cJSON *flavor_text_entries = cJSON_AddArrayToObject(item, "flavor_text_entries");
    if(flavor_text_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *flavor_text_entriesListEntry;
    if (ability_detail->flavor_text_entries) {
    list_ForEach(flavor_text_entriesListEntry, ability_detail->flavor_text_entries) {
    cJSON *itemLocal = ability_flavor_text_convertToJSON(flavor_text_entriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(flavor_text_entries, itemLocal);
    }
    }


    // ability_detail->pokemon
    if (!ability_detail->pokemon) {
        goto fail;
    }
    cJSON *pokemon = cJSON_AddArrayToObject(item, "pokemon");
    if(pokemon == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pokemonListEntry;
    if (ability_detail->pokemon) {
    list_ForEach(pokemonListEntry, ability_detail->pokemon) {
    cJSON *itemLocal = ability_detail_pokemon_inner_convertToJSON(pokemonListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pokemon, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ability_detail_t *ability_detail_parseFromJSON(cJSON *ability_detailJSON){

    ability_detail_t *ability_detail_local_var = NULL;

    // define the local variable for ability_detail->generation
    generation_summary_t *generation_local_nonprim = NULL;

    // define the local list for ability_detail->names
    list_t *namesList = NULL;

    // define the local list for ability_detail->effect_entries
    list_t *effect_entriesList = NULL;

    // define the local list for ability_detail->effect_changes
    list_t *effect_changesList = NULL;

    // define the local list for ability_detail->flavor_text_entries
    list_t *flavor_text_entriesList = NULL;

    // define the local list for ability_detail->pokemon
    list_t *pokemonList = NULL;

    // ability_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(ability_detailJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // ability_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ability_detailJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // ability_detail->is_main_series
    cJSON *is_main_series = cJSON_GetObjectItemCaseSensitive(ability_detailJSON, "is_main_series");
    if (cJSON_IsNull(is_main_series)) {
        is_main_series = NULL;
    }
    if (is_main_series) { 
    if(!cJSON_IsBool(is_main_series))
    {
    goto end; //Bool
    }
    }

    // ability_detail->generation
    cJSON *generation = cJSON_GetObjectItemCaseSensitive(ability_detailJSON, "generation");
    if (cJSON_IsNull(generation)) {
        generation = NULL;
    }
    if (!generation) {
        goto end;
    }

    
    generation_local_nonprim = generation_summary_parseFromJSON(generation); //nonprimitive

    // ability_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(ability_detailJSON, "names");
    if (cJSON_IsNull(names)) {
        names = NULL;
    }
    if (!names) {
        goto end;
    }

    
    cJSON *names_local_nonprimitive = NULL;
    if(!cJSON_IsArray(names)){
        goto end; //nonprimitive container
    }

    namesList = list_createList();

    cJSON_ArrayForEach(names_local_nonprimitive,names )
    {
        if(!cJSON_IsObject(names_local_nonprimitive)){
            goto end;
        }
        ability_name_t *namesItem = ability_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // ability_detail->effect_entries
    cJSON *effect_entries = cJSON_GetObjectItemCaseSensitive(ability_detailJSON, "effect_entries");
    if (cJSON_IsNull(effect_entries)) {
        effect_entries = NULL;
    }
    if (!effect_entries) {
        goto end;
    }

    
    cJSON *effect_entries_local_nonprimitive = NULL;
    if(!cJSON_IsArray(effect_entries)){
        goto end; //nonprimitive container
    }

    effect_entriesList = list_createList();

    cJSON_ArrayForEach(effect_entries_local_nonprimitive,effect_entries )
    {
        if(!cJSON_IsObject(effect_entries_local_nonprimitive)){
            goto end;
        }
        ability_effect_text_t *effect_entriesItem = ability_effect_text_parseFromJSON(effect_entries_local_nonprimitive);

        list_addElement(effect_entriesList, effect_entriesItem);
    }

    // ability_detail->effect_changes
    cJSON *effect_changes = cJSON_GetObjectItemCaseSensitive(ability_detailJSON, "effect_changes");
    if (cJSON_IsNull(effect_changes)) {
        effect_changes = NULL;
    }
    if (!effect_changes) {
        goto end;
    }

    
    cJSON *effect_changes_local_nonprimitive = NULL;
    if(!cJSON_IsArray(effect_changes)){
        goto end; //nonprimitive container
    }

    effect_changesList = list_createList();

    cJSON_ArrayForEach(effect_changes_local_nonprimitive,effect_changes )
    {
        if(!cJSON_IsObject(effect_changes_local_nonprimitive)){
            goto end;
        }
        ability_change_t *effect_changesItem = ability_change_parseFromJSON(effect_changes_local_nonprimitive);

        list_addElement(effect_changesList, effect_changesItem);
    }

    // ability_detail->flavor_text_entries
    cJSON *flavor_text_entries = cJSON_GetObjectItemCaseSensitive(ability_detailJSON, "flavor_text_entries");
    if (cJSON_IsNull(flavor_text_entries)) {
        flavor_text_entries = NULL;
    }
    if (!flavor_text_entries) {
        goto end;
    }

    
    cJSON *flavor_text_entries_local_nonprimitive = NULL;
    if(!cJSON_IsArray(flavor_text_entries)){
        goto end; //nonprimitive container
    }

    flavor_text_entriesList = list_createList();

    cJSON_ArrayForEach(flavor_text_entries_local_nonprimitive,flavor_text_entries )
    {
        if(!cJSON_IsObject(flavor_text_entries_local_nonprimitive)){
            goto end;
        }
        ability_flavor_text_t *flavor_text_entriesItem = ability_flavor_text_parseFromJSON(flavor_text_entries_local_nonprimitive);

        list_addElement(flavor_text_entriesList, flavor_text_entriesItem);
    }

    // ability_detail->pokemon
    cJSON *pokemon = cJSON_GetObjectItemCaseSensitive(ability_detailJSON, "pokemon");
    if (cJSON_IsNull(pokemon)) {
        pokemon = NULL;
    }
    if (!pokemon) {
        goto end;
    }

    
    cJSON *pokemon_local_nonprimitive = NULL;
    if(!cJSON_IsArray(pokemon)){
        goto end; //nonprimitive container
    }

    pokemonList = list_createList();

    cJSON_ArrayForEach(pokemon_local_nonprimitive,pokemon )
    {
        if(!cJSON_IsObject(pokemon_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_t *pokemonItem = ability_detail_pokemon_inner_parseFromJSON(pokemon_local_nonprimitive);

        list_addElement(pokemonList, pokemonItem);
    }


    ability_detail_local_var = ability_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        is_main_series ? is_main_series->valueint : 0,
        generation_local_nonprim,
        namesList,
        effect_entriesList,
        effect_changesList,
        flavor_text_entriesList,
        pokemonList
        );

    return ability_detail_local_var;
end:
    if (generation_local_nonprim) {
        generation_summary_free(generation_local_nonprim);
        generation_local_nonprim = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            ability_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (effect_entriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, effect_entriesList) {
            ability_effect_text_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(effect_entriesList);
        effect_entriesList = NULL;
    }
    if (effect_changesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, effect_changesList) {
            ability_change_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(effect_changesList);
        effect_changesList = NULL;
    }
    if (flavor_text_entriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, flavor_text_entriesList) {
            ability_flavor_text_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(flavor_text_entriesList);
        flavor_text_entriesList = NULL;
    }
    if (pokemonList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pokemonList) {
            ability_detail_pokemon_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pokemonList);
        pokemonList = NULL;
    }
    return NULL;

}
