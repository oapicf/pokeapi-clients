#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_detail.h"



static item_detail_t *item_detail_create_internal(
    int id,
    char *name,
    int cost,
    int fling_power,
    item_fling_effect_summary_t *fling_effect,
    list_t *attributes,
    item_category_summary_t *category,
    list_t *effect_entries,
    list_t *flavor_text_entries,
    list_t *game_indices,
    list_t *names,
    list_t *held_by_pokemon,
    item_detail_sprites_t *sprites,
    item_detail_baby_trigger_for_t *baby_trigger_for,
    list_t *machines
    ) {
    item_detail_t *item_detail_local_var = malloc(sizeof(item_detail_t));
    if (!item_detail_local_var) {
        return NULL;
    }
    item_detail_local_var->id = id;
    item_detail_local_var->name = name;
    item_detail_local_var->cost = cost;
    item_detail_local_var->fling_power = fling_power;
    item_detail_local_var->fling_effect = fling_effect;
    item_detail_local_var->attributes = attributes;
    item_detail_local_var->category = category;
    item_detail_local_var->effect_entries = effect_entries;
    item_detail_local_var->flavor_text_entries = flavor_text_entries;
    item_detail_local_var->game_indices = game_indices;
    item_detail_local_var->names = names;
    item_detail_local_var->held_by_pokemon = held_by_pokemon;
    item_detail_local_var->sprites = sprites;
    item_detail_local_var->baby_trigger_for = baby_trigger_for;
    item_detail_local_var->machines = machines;

    item_detail_local_var->_library_owned = 1;
    return item_detail_local_var;
}

__attribute__((deprecated)) item_detail_t *item_detail_create(
    int id,
    char *name,
    int cost,
    int fling_power,
    item_fling_effect_summary_t *fling_effect,
    list_t *attributes,
    item_category_summary_t *category,
    list_t *effect_entries,
    list_t *flavor_text_entries,
    list_t *game_indices,
    list_t *names,
    list_t *held_by_pokemon,
    item_detail_sprites_t *sprites,
    item_detail_baby_trigger_for_t *baby_trigger_for,
    list_t *machines
    ) {
    return item_detail_create_internal (
        id,
        name,
        cost,
        fling_power,
        fling_effect,
        attributes,
        category,
        effect_entries,
        flavor_text_entries,
        game_indices,
        names,
        held_by_pokemon,
        sprites,
        baby_trigger_for,
        machines
        );
}

void item_detail_free(item_detail_t *item_detail) {
    if(NULL == item_detail){
        return ;
    }
    if(item_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_detail->name) {
        free(item_detail->name);
        item_detail->name = NULL;
    }
    if (item_detail->fling_effect) {
        item_fling_effect_summary_free(item_detail->fling_effect);
        item_detail->fling_effect = NULL;
    }
    if (item_detail->attributes) {
        list_ForEach(listEntry, item_detail->attributes) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(item_detail->attributes);
        item_detail->attributes = NULL;
    }
    if (item_detail->category) {
        item_category_summary_free(item_detail->category);
        item_detail->category = NULL;
    }
    if (item_detail->effect_entries) {
        list_ForEach(listEntry, item_detail->effect_entries) {
            item_effect_text_free(listEntry->data);
        }
        list_freeList(item_detail->effect_entries);
        item_detail->effect_entries = NULL;
    }
    if (item_detail->flavor_text_entries) {
        list_ForEach(listEntry, item_detail->flavor_text_entries) {
            item_flavor_text_free(listEntry->data);
        }
        list_freeList(item_detail->flavor_text_entries);
        item_detail->flavor_text_entries = NULL;
    }
    if (item_detail->game_indices) {
        list_ForEach(listEntry, item_detail->game_indices) {
            item_game_index_free(listEntry->data);
        }
        list_freeList(item_detail->game_indices);
        item_detail->game_indices = NULL;
    }
    if (item_detail->names) {
        list_ForEach(listEntry, item_detail->names) {
            item_name_free(listEntry->data);
        }
        list_freeList(item_detail->names);
        item_detail->names = NULL;
    }
    if (item_detail->held_by_pokemon) {
        list_ForEach(listEntry, item_detail->held_by_pokemon) {
            item_detail_held_by_pokemon_inner_free(listEntry->data);
        }
        list_freeList(item_detail->held_by_pokemon);
        item_detail->held_by_pokemon = NULL;
    }
    if (item_detail->sprites) {
        item_detail_sprites_free(item_detail->sprites);
        item_detail->sprites = NULL;
    }
    if (item_detail->baby_trigger_for) {
        item_detail_baby_trigger_for_free(item_detail->baby_trigger_for);
        item_detail->baby_trigger_for = NULL;
    }
    if (item_detail->machines) {
        list_ForEach(listEntry, item_detail->machines) {
            item_detail_machines_inner_free(listEntry->data);
        }
        list_freeList(item_detail->machines);
        item_detail->machines = NULL;
    }
    free(item_detail);
}

cJSON *item_detail_convertToJSON(item_detail_t *item_detail) {
    cJSON *item = cJSON_CreateObject();

    // item_detail->id
    if (!item_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", item_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // item_detail->name
    if (!item_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", item_detail->name) == NULL) {
    goto fail; //String
    }


    // item_detail->cost
    if(item_detail->cost) {
    if(cJSON_AddNumberToObject(item, "cost", item_detail->cost) == NULL) {
    goto fail; //Numeric
    }
    }


    // item_detail->fling_power
    if(item_detail->fling_power) {
    if(cJSON_AddNumberToObject(item, "fling_power", item_detail->fling_power) == NULL) {
    goto fail; //Numeric
    }
    }


    // item_detail->fling_effect
    if (!item_detail->fling_effect) {
        goto fail;
    }
    cJSON *fling_effect_local_JSON = item_fling_effect_summary_convertToJSON(item_detail->fling_effect);
    if(fling_effect_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fling_effect", fling_effect_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // item_detail->attributes
    if (!item_detail->attributes) {
        goto fail;
    }
    cJSON *attributes = cJSON_AddArrayToObject(item, "attributes");
    if(attributes == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *attributesListEntry;
    if (item_detail->attributes) {
    list_ForEach(attributesListEntry, item_detail->attributes) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(attributesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(attributes, itemLocal);
    }
    }


    // item_detail->category
    if (!item_detail->category) {
        goto fail;
    }
    cJSON *category_local_JSON = item_category_summary_convertToJSON(item_detail->category);
    if(category_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "category", category_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // item_detail->effect_entries
    if (!item_detail->effect_entries) {
        goto fail;
    }
    cJSON *effect_entries = cJSON_AddArrayToObject(item, "effect_entries");
    if(effect_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *effect_entriesListEntry;
    if (item_detail->effect_entries) {
    list_ForEach(effect_entriesListEntry, item_detail->effect_entries) {
    cJSON *itemLocal = item_effect_text_convertToJSON(effect_entriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(effect_entries, itemLocal);
    }
    }


    // item_detail->flavor_text_entries
    if (!item_detail->flavor_text_entries) {
        goto fail;
    }
    cJSON *flavor_text_entries = cJSON_AddArrayToObject(item, "flavor_text_entries");
    if(flavor_text_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *flavor_text_entriesListEntry;
    if (item_detail->flavor_text_entries) {
    list_ForEach(flavor_text_entriesListEntry, item_detail->flavor_text_entries) {
    cJSON *itemLocal = item_flavor_text_convertToJSON(flavor_text_entriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(flavor_text_entries, itemLocal);
    }
    }


    // item_detail->game_indices
    if (!item_detail->game_indices) {
        goto fail;
    }
    cJSON *game_indices = cJSON_AddArrayToObject(item, "game_indices");
    if(game_indices == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *game_indicesListEntry;
    if (item_detail->game_indices) {
    list_ForEach(game_indicesListEntry, item_detail->game_indices) {
    cJSON *itemLocal = item_game_index_convertToJSON(game_indicesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(game_indices, itemLocal);
    }
    }


    // item_detail->names
    if (!item_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (item_detail->names) {
    list_ForEach(namesListEntry, item_detail->names) {
    cJSON *itemLocal = item_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // item_detail->held_by_pokemon
    if (!item_detail->held_by_pokemon) {
        goto fail;
    }
    cJSON *held_by_pokemon = cJSON_AddArrayToObject(item, "held_by_pokemon");
    if(held_by_pokemon == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *held_by_pokemonListEntry;
    if (item_detail->held_by_pokemon) {
    list_ForEach(held_by_pokemonListEntry, item_detail->held_by_pokemon) {
    cJSON *itemLocal = item_detail_held_by_pokemon_inner_convertToJSON(held_by_pokemonListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(held_by_pokemon, itemLocal);
    }
    }


    // item_detail->sprites
    if (!item_detail->sprites) {
        goto fail;
    }
    cJSON *sprites_local_JSON = item_detail_sprites_convertToJSON(item_detail->sprites);
    if(sprites_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sprites", sprites_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // item_detail->baby_trigger_for
    if (!item_detail->baby_trigger_for) {
        goto fail;
    }
    cJSON *baby_trigger_for_local_JSON = item_detail_baby_trigger_for_convertToJSON(item_detail->baby_trigger_for);
    if(baby_trigger_for_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "baby_trigger_for", baby_trigger_for_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // item_detail->machines
    if (!item_detail->machines) {
        goto fail;
    }
    cJSON *machines = cJSON_AddArrayToObject(item, "machines");
    if(machines == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *machinesListEntry;
    if (item_detail->machines) {
    list_ForEach(machinesListEntry, item_detail->machines) {
    cJSON *itemLocal = item_detail_machines_inner_convertToJSON(machinesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(machines, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

item_detail_t *item_detail_parseFromJSON(cJSON *item_detailJSON){

    item_detail_t *item_detail_local_var = NULL;

    // define the local variable for item_detail->fling_effect
    item_fling_effect_summary_t *fling_effect_local_nonprim = NULL;

    // define the local list for item_detail->attributes
    list_t *attributesList = NULL;

    // define the local variable for item_detail->category
    item_category_summary_t *category_local_nonprim = NULL;

    // define the local list for item_detail->effect_entries
    list_t *effect_entriesList = NULL;

    // define the local list for item_detail->flavor_text_entries
    list_t *flavor_text_entriesList = NULL;

    // define the local list for item_detail->game_indices
    list_t *game_indicesList = NULL;

    // define the local list for item_detail->names
    list_t *namesList = NULL;

    // define the local list for item_detail->held_by_pokemon
    list_t *held_by_pokemonList = NULL;

    // define the local variable for item_detail->sprites
    item_detail_sprites_t *sprites_local_nonprim = NULL;

    // define the local variable for item_detail->baby_trigger_for
    item_detail_baby_trigger_for_t *baby_trigger_for_local_nonprim = NULL;

    // define the local list for item_detail->machines
    list_t *machinesList = NULL;

    // item_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(item_detailJSON, "id");
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

    // item_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(item_detailJSON, "name");
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

    // item_detail->cost
    cJSON *cost = cJSON_GetObjectItemCaseSensitive(item_detailJSON, "cost");
    if (cJSON_IsNull(cost)) {
        cost = NULL;
    }
    if (cost) { 
    if(!cJSON_IsNumber(cost))
    {
    goto end; //Numeric
    }
    }

    // item_detail->fling_power
    cJSON *fling_power = cJSON_GetObjectItemCaseSensitive(item_detailJSON, "fling_power");
    if (cJSON_IsNull(fling_power)) {
        fling_power = NULL;
    }
    if (fling_power) { 
    if(!cJSON_IsNumber(fling_power))
    {
    goto end; //Numeric
    }
    }

    // item_detail->fling_effect
    cJSON *fling_effect = cJSON_GetObjectItemCaseSensitive(item_detailJSON, "fling_effect");
    if (cJSON_IsNull(fling_effect)) {
        fling_effect = NULL;
    }
    if (!fling_effect) {
        goto end;
    }

    
    fling_effect_local_nonprim = item_fling_effect_summary_parseFromJSON(fling_effect); //nonprimitive

    // item_detail->attributes
    cJSON *attributes = cJSON_GetObjectItemCaseSensitive(item_detailJSON, "attributes");
    if (cJSON_IsNull(attributes)) {
        attributes = NULL;
    }
    if (!attributes) {
        goto end;
    }

    
    cJSON *attributes_local_nonprimitive = NULL;
    if(!cJSON_IsArray(attributes)){
        goto end; //nonprimitive container
    }

    attributesList = list_createList();

    cJSON_ArrayForEach(attributes_local_nonprimitive,attributes )
    {
        if(!cJSON_IsObject(attributes_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_pokemon_t *attributesItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(attributes_local_nonprimitive);

        list_addElement(attributesList, attributesItem);
    }

    // item_detail->category
    cJSON *category = cJSON_GetObjectItemCaseSensitive(item_detailJSON, "category");
    if (cJSON_IsNull(category)) {
        category = NULL;
    }
    if (!category) {
        goto end;
    }

    
    category_local_nonprim = item_category_summary_parseFromJSON(category); //nonprimitive

    // item_detail->effect_entries
    cJSON *effect_entries = cJSON_GetObjectItemCaseSensitive(item_detailJSON, "effect_entries");
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
        item_effect_text_t *effect_entriesItem = item_effect_text_parseFromJSON(effect_entries_local_nonprimitive);

        list_addElement(effect_entriesList, effect_entriesItem);
    }

    // item_detail->flavor_text_entries
    cJSON *flavor_text_entries = cJSON_GetObjectItemCaseSensitive(item_detailJSON, "flavor_text_entries");
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
        item_flavor_text_t *flavor_text_entriesItem = item_flavor_text_parseFromJSON(flavor_text_entries_local_nonprimitive);

        list_addElement(flavor_text_entriesList, flavor_text_entriesItem);
    }

    // item_detail->game_indices
    cJSON *game_indices = cJSON_GetObjectItemCaseSensitive(item_detailJSON, "game_indices");
    if (cJSON_IsNull(game_indices)) {
        game_indices = NULL;
    }
    if (!game_indices) {
        goto end;
    }

    
    cJSON *game_indices_local_nonprimitive = NULL;
    if(!cJSON_IsArray(game_indices)){
        goto end; //nonprimitive container
    }

    game_indicesList = list_createList();

    cJSON_ArrayForEach(game_indices_local_nonprimitive,game_indices )
    {
        if(!cJSON_IsObject(game_indices_local_nonprimitive)){
            goto end;
        }
        item_game_index_t *game_indicesItem = item_game_index_parseFromJSON(game_indices_local_nonprimitive);

        list_addElement(game_indicesList, game_indicesItem);
    }

    // item_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(item_detailJSON, "names");
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
        item_name_t *namesItem = item_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // item_detail->held_by_pokemon
    cJSON *held_by_pokemon = cJSON_GetObjectItemCaseSensitive(item_detailJSON, "held_by_pokemon");
    if (cJSON_IsNull(held_by_pokemon)) {
        held_by_pokemon = NULL;
    }
    if (!held_by_pokemon) {
        goto end;
    }

    
    cJSON *held_by_pokemon_local_nonprimitive = NULL;
    if(!cJSON_IsArray(held_by_pokemon)){
        goto end; //nonprimitive container
    }

    held_by_pokemonList = list_createList();

    cJSON_ArrayForEach(held_by_pokemon_local_nonprimitive,held_by_pokemon )
    {
        if(!cJSON_IsObject(held_by_pokemon_local_nonprimitive)){
            goto end;
        }
        item_detail_held_by_pokemon_inner_t *held_by_pokemonItem = item_detail_held_by_pokemon_inner_parseFromJSON(held_by_pokemon_local_nonprimitive);

        list_addElement(held_by_pokemonList, held_by_pokemonItem);
    }

    // item_detail->sprites
    cJSON *sprites = cJSON_GetObjectItemCaseSensitive(item_detailJSON, "sprites");
    if (cJSON_IsNull(sprites)) {
        sprites = NULL;
    }
    if (!sprites) {
        goto end;
    }

    
    sprites_local_nonprim = item_detail_sprites_parseFromJSON(sprites); //nonprimitive

    // item_detail->baby_trigger_for
    cJSON *baby_trigger_for = cJSON_GetObjectItemCaseSensitive(item_detailJSON, "baby_trigger_for");
    if (cJSON_IsNull(baby_trigger_for)) {
        baby_trigger_for = NULL;
    }
    if (!baby_trigger_for) {
        goto end;
    }

    
    baby_trigger_for_local_nonprim = item_detail_baby_trigger_for_parseFromJSON(baby_trigger_for); //nonprimitive

    // item_detail->machines
    cJSON *machines = cJSON_GetObjectItemCaseSensitive(item_detailJSON, "machines");
    if (cJSON_IsNull(machines)) {
        machines = NULL;
    }
    if (!machines) {
        goto end;
    }

    
    cJSON *machines_local_nonprimitive = NULL;
    if(!cJSON_IsArray(machines)){
        goto end; //nonprimitive container
    }

    machinesList = list_createList();

    cJSON_ArrayForEach(machines_local_nonprimitive,machines )
    {
        if(!cJSON_IsObject(machines_local_nonprimitive)){
            goto end;
        }
        item_detail_machines_inner_t *machinesItem = item_detail_machines_inner_parseFromJSON(machines_local_nonprimitive);

        list_addElement(machinesList, machinesItem);
    }


    item_detail_local_var = item_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        cost ? cost->valuedouble : 0,
        fling_power ? fling_power->valuedouble : 0,
        fling_effect_local_nonprim,
        attributesList,
        category_local_nonprim,
        effect_entriesList,
        flavor_text_entriesList,
        game_indicesList,
        namesList,
        held_by_pokemonList,
        sprites_local_nonprim,
        baby_trigger_for_local_nonprim,
        machinesList
        );

    return item_detail_local_var;
end:
    if (fling_effect_local_nonprim) {
        item_fling_effect_summary_free(fling_effect_local_nonprim);
        fling_effect_local_nonprim = NULL;
    }
    if (attributesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, attributesList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(attributesList);
        attributesList = NULL;
    }
    if (category_local_nonprim) {
        item_category_summary_free(category_local_nonprim);
        category_local_nonprim = NULL;
    }
    if (effect_entriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, effect_entriesList) {
            item_effect_text_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(effect_entriesList);
        effect_entriesList = NULL;
    }
    if (flavor_text_entriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, flavor_text_entriesList) {
            item_flavor_text_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(flavor_text_entriesList);
        flavor_text_entriesList = NULL;
    }
    if (game_indicesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, game_indicesList) {
            item_game_index_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(game_indicesList);
        game_indicesList = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            item_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (held_by_pokemonList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, held_by_pokemonList) {
            item_detail_held_by_pokemon_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(held_by_pokemonList);
        held_by_pokemonList = NULL;
    }
    if (sprites_local_nonprim) {
        item_detail_sprites_free(sprites_local_nonprim);
        sprites_local_nonprim = NULL;
    }
    if (baby_trigger_for_local_nonprim) {
        item_detail_baby_trigger_for_free(baby_trigger_for_local_nonprim);
        baby_trigger_for_local_nonprim = NULL;
    }
    if (machinesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, machinesList) {
            item_detail_machines_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(machinesList);
        machinesList = NULL;
    }
    return NULL;

}
