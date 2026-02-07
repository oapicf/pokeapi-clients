#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_detail.h"



static pokemon_detail_t *pokemon_detail_create_internal(
    int id,
    char *name,
    int base_experience,
    int height,
    int is_default,
    int order,
    int weight,
    list_t *abilities,
    list_t *past_abilities,
    list_t *forms,
    list_t *game_indices,
    pokemon_detail_held_items_t *held_items,
    char *location_area_encounters,
    list_t *moves,
    pokemon_species_summary_t *species,
    pokemon_detail_sprites_t *sprites,
    pokemon_detail_cries_t *cries,
    list_t *stats,
    list_t *types,
    list_t *past_types
    ) {
    pokemon_detail_t *pokemon_detail_local_var = malloc(sizeof(pokemon_detail_t));
    if (!pokemon_detail_local_var) {
        return NULL;
    }
    pokemon_detail_local_var->id = id;
    pokemon_detail_local_var->name = name;
    pokemon_detail_local_var->base_experience = base_experience;
    pokemon_detail_local_var->height = height;
    pokemon_detail_local_var->is_default = is_default;
    pokemon_detail_local_var->order = order;
    pokemon_detail_local_var->weight = weight;
    pokemon_detail_local_var->abilities = abilities;
    pokemon_detail_local_var->past_abilities = past_abilities;
    pokemon_detail_local_var->forms = forms;
    pokemon_detail_local_var->game_indices = game_indices;
    pokemon_detail_local_var->held_items = held_items;
    pokemon_detail_local_var->location_area_encounters = location_area_encounters;
    pokemon_detail_local_var->moves = moves;
    pokemon_detail_local_var->species = species;
    pokemon_detail_local_var->sprites = sprites;
    pokemon_detail_local_var->cries = cries;
    pokemon_detail_local_var->stats = stats;
    pokemon_detail_local_var->types = types;
    pokemon_detail_local_var->past_types = past_types;

    pokemon_detail_local_var->_library_owned = 1;
    return pokemon_detail_local_var;
}

__attribute__((deprecated)) pokemon_detail_t *pokemon_detail_create(
    int id,
    char *name,
    int base_experience,
    int height,
    int is_default,
    int order,
    int weight,
    list_t *abilities,
    list_t *past_abilities,
    list_t *forms,
    list_t *game_indices,
    pokemon_detail_held_items_t *held_items,
    char *location_area_encounters,
    list_t *moves,
    pokemon_species_summary_t *species,
    pokemon_detail_sprites_t *sprites,
    pokemon_detail_cries_t *cries,
    list_t *stats,
    list_t *types,
    list_t *past_types
    ) {
    return pokemon_detail_create_internal (
        id,
        name,
        base_experience,
        height,
        is_default,
        order,
        weight,
        abilities,
        past_abilities,
        forms,
        game_indices,
        held_items,
        location_area_encounters,
        moves,
        species,
        sprites,
        cries,
        stats,
        types,
        past_types
        );
}

void pokemon_detail_free(pokemon_detail_t *pokemon_detail) {
    if(NULL == pokemon_detail){
        return ;
    }
    if(pokemon_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_detail->name) {
        free(pokemon_detail->name);
        pokemon_detail->name = NULL;
    }
    if (pokemon_detail->abilities) {
        list_ForEach(listEntry, pokemon_detail->abilities) {
            pokemon_detail_abilities_inner_free(listEntry->data);
        }
        list_freeList(pokemon_detail->abilities);
        pokemon_detail->abilities = NULL;
    }
    if (pokemon_detail->past_abilities) {
        list_ForEach(listEntry, pokemon_detail->past_abilities) {
            pokemon_detail_past_abilities_inner_free(listEntry->data);
        }
        list_freeList(pokemon_detail->past_abilities);
        pokemon_detail->past_abilities = NULL;
    }
    if (pokemon_detail->forms) {
        list_ForEach(listEntry, pokemon_detail->forms) {
            pokemon_form_summary_free(listEntry->data);
        }
        list_freeList(pokemon_detail->forms);
        pokemon_detail->forms = NULL;
    }
    if (pokemon_detail->game_indices) {
        list_ForEach(listEntry, pokemon_detail->game_indices) {
            pokemon_game_index_free(listEntry->data);
        }
        list_freeList(pokemon_detail->game_indices);
        pokemon_detail->game_indices = NULL;
    }
    if (pokemon_detail->held_items) {
        pokemon_detail_held_items_free(pokemon_detail->held_items);
        pokemon_detail->held_items = NULL;
    }
    if (pokemon_detail->location_area_encounters) {
        free(pokemon_detail->location_area_encounters);
        pokemon_detail->location_area_encounters = NULL;
    }
    if (pokemon_detail->moves) {
        list_ForEach(listEntry, pokemon_detail->moves) {
            pokemon_detail_moves_inner_free(listEntry->data);
        }
        list_freeList(pokemon_detail->moves);
        pokemon_detail->moves = NULL;
    }
    if (pokemon_detail->species) {
        pokemon_species_summary_free(pokemon_detail->species);
        pokemon_detail->species = NULL;
    }
    if (pokemon_detail->sprites) {
        pokemon_detail_sprites_free(pokemon_detail->sprites);
        pokemon_detail->sprites = NULL;
    }
    if (pokemon_detail->cries) {
        pokemon_detail_cries_free(pokemon_detail->cries);
        pokemon_detail->cries = NULL;
    }
    if (pokemon_detail->stats) {
        list_ForEach(listEntry, pokemon_detail->stats) {
            pokemon_stat_free(listEntry->data);
        }
        list_freeList(pokemon_detail->stats);
        pokemon_detail->stats = NULL;
    }
    if (pokemon_detail->types) {
        list_ForEach(listEntry, pokemon_detail->types) {
            pokemon_detail_types_inner_free(listEntry->data);
        }
        list_freeList(pokemon_detail->types);
        pokemon_detail->types = NULL;
    }
    if (pokemon_detail->past_types) {
        list_ForEach(listEntry, pokemon_detail->past_types) {
            pokemon_detail_past_types_inner_free(listEntry->data);
        }
        list_freeList(pokemon_detail->past_types);
        pokemon_detail->past_types = NULL;
    }
    free(pokemon_detail);
}

cJSON *pokemon_detail_convertToJSON(pokemon_detail_t *pokemon_detail) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_detail->id
    if (!pokemon_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", pokemon_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_detail->name
    if (!pokemon_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokemon_detail->name) == NULL) {
    goto fail; //String
    }


    // pokemon_detail->base_experience
    if(pokemon_detail->base_experience) {
    if(cJSON_AddNumberToObject(item, "base_experience", pokemon_detail->base_experience) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_detail->height
    if(pokemon_detail->height) {
    if(cJSON_AddNumberToObject(item, "height", pokemon_detail->height) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_detail->is_default
    if(pokemon_detail->is_default) {
    if(cJSON_AddBoolToObject(item, "is_default", pokemon_detail->is_default) == NULL) {
    goto fail; //Bool
    }
    }


    // pokemon_detail->order
    if(pokemon_detail->order) {
    if(cJSON_AddNumberToObject(item, "order", pokemon_detail->order) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_detail->weight
    if(pokemon_detail->weight) {
    if(cJSON_AddNumberToObject(item, "weight", pokemon_detail->weight) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_detail->abilities
    if (!pokemon_detail->abilities) {
        goto fail;
    }
    cJSON *abilities = cJSON_AddArrayToObject(item, "abilities");
    if(abilities == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *abilitiesListEntry;
    if (pokemon_detail->abilities) {
    list_ForEach(abilitiesListEntry, pokemon_detail->abilities) {
    cJSON *itemLocal = pokemon_detail_abilities_inner_convertToJSON(abilitiesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(abilities, itemLocal);
    }
    }


    // pokemon_detail->past_abilities
    if (!pokemon_detail->past_abilities) {
        goto fail;
    }
    cJSON *past_abilities = cJSON_AddArrayToObject(item, "past_abilities");
    if(past_abilities == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *past_abilitiesListEntry;
    if (pokemon_detail->past_abilities) {
    list_ForEach(past_abilitiesListEntry, pokemon_detail->past_abilities) {
    cJSON *itemLocal = pokemon_detail_past_abilities_inner_convertToJSON(past_abilitiesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(past_abilities, itemLocal);
    }
    }


    // pokemon_detail->forms
    if (!pokemon_detail->forms) {
        goto fail;
    }
    cJSON *forms = cJSON_AddArrayToObject(item, "forms");
    if(forms == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *formsListEntry;
    if (pokemon_detail->forms) {
    list_ForEach(formsListEntry, pokemon_detail->forms) {
    cJSON *itemLocal = pokemon_form_summary_convertToJSON(formsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(forms, itemLocal);
    }
    }


    // pokemon_detail->game_indices
    if (!pokemon_detail->game_indices) {
        goto fail;
    }
    cJSON *game_indices = cJSON_AddArrayToObject(item, "game_indices");
    if(game_indices == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *game_indicesListEntry;
    if (pokemon_detail->game_indices) {
    list_ForEach(game_indicesListEntry, pokemon_detail->game_indices) {
    cJSON *itemLocal = pokemon_game_index_convertToJSON(game_indicesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(game_indices, itemLocal);
    }
    }


    // pokemon_detail->held_items
    if (!pokemon_detail->held_items) {
        goto fail;
    }
    cJSON *held_items_local_JSON = pokemon_detail_held_items_convertToJSON(pokemon_detail->held_items);
    if(held_items_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "held_items", held_items_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_detail->location_area_encounters
    if (!pokemon_detail->location_area_encounters) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "location_area_encounters", pokemon_detail->location_area_encounters) == NULL) {
    goto fail; //String
    }


    // pokemon_detail->moves
    if (!pokemon_detail->moves) {
        goto fail;
    }
    cJSON *moves = cJSON_AddArrayToObject(item, "moves");
    if(moves == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *movesListEntry;
    if (pokemon_detail->moves) {
    list_ForEach(movesListEntry, pokemon_detail->moves) {
    cJSON *itemLocal = pokemon_detail_moves_inner_convertToJSON(movesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(moves, itemLocal);
    }
    }


    // pokemon_detail->species
    if (!pokemon_detail->species) {
        goto fail;
    }
    cJSON *species_local_JSON = pokemon_species_summary_convertToJSON(pokemon_detail->species);
    if(species_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "species", species_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_detail->sprites
    if (!pokemon_detail->sprites) {
        goto fail;
    }
    cJSON *sprites_local_JSON = pokemon_detail_sprites_convertToJSON(pokemon_detail->sprites);
    if(sprites_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "sprites", sprites_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // pokemon_detail->cries
    if (!pokemon_detail->cries) {
        goto fail;
    }
    cJSON *cries_local_JSON = pokemon_detail_cries_convertToJSON(pokemon_detail->cries);
    if(cries_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cries", cries_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_detail->stats
    if (!pokemon_detail->stats) {
        goto fail;
    }
    cJSON *stats = cJSON_AddArrayToObject(item, "stats");
    if(stats == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *statsListEntry;
    if (pokemon_detail->stats) {
    list_ForEach(statsListEntry, pokemon_detail->stats) {
    cJSON *itemLocal = pokemon_stat_convertToJSON(statsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(stats, itemLocal);
    }
    }


    // pokemon_detail->types
    if (!pokemon_detail->types) {
        goto fail;
    }
    cJSON *types = cJSON_AddArrayToObject(item, "types");
    if(types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *typesListEntry;
    if (pokemon_detail->types) {
    list_ForEach(typesListEntry, pokemon_detail->types) {
    cJSON *itemLocal = pokemon_detail_types_inner_convertToJSON(typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(types, itemLocal);
    }
    }


    // pokemon_detail->past_types
    if (!pokemon_detail->past_types) {
        goto fail;
    }
    cJSON *past_types = cJSON_AddArrayToObject(item, "past_types");
    if(past_types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *past_typesListEntry;
    if (pokemon_detail->past_types) {
    list_ForEach(past_typesListEntry, pokemon_detail->past_types) {
    cJSON *itemLocal = pokemon_detail_past_types_inner_convertToJSON(past_typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(past_types, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_detail_t *pokemon_detail_parseFromJSON(cJSON *pokemon_detailJSON){

    pokemon_detail_t *pokemon_detail_local_var = NULL;

    // define the local list for pokemon_detail->abilities
    list_t *abilitiesList = NULL;

    // define the local list for pokemon_detail->past_abilities
    list_t *past_abilitiesList = NULL;

    // define the local list for pokemon_detail->forms
    list_t *formsList = NULL;

    // define the local list for pokemon_detail->game_indices
    list_t *game_indicesList = NULL;

    // define the local variable for pokemon_detail->held_items
    pokemon_detail_held_items_t *held_items_local_nonprim = NULL;

    // define the local list for pokemon_detail->moves
    list_t *movesList = NULL;

    // define the local variable for pokemon_detail->species
    pokemon_species_summary_t *species_local_nonprim = NULL;

    // define the local variable for pokemon_detail->sprites
    pokemon_detail_sprites_t *sprites_local_nonprim = NULL;

    // define the local variable for pokemon_detail->cries
    pokemon_detail_cries_t *cries_local_nonprim = NULL;

    // define the local list for pokemon_detail->stats
    list_t *statsList = NULL;

    // define the local list for pokemon_detail->types
    list_t *typesList = NULL;

    // define the local list for pokemon_detail->past_types
    list_t *past_typesList = NULL;

    // pokemon_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "id");
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

    // pokemon_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "name");
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

    // pokemon_detail->base_experience
    cJSON *base_experience = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "base_experience");
    if (cJSON_IsNull(base_experience)) {
        base_experience = NULL;
    }
    if (base_experience) { 
    if(!cJSON_IsNumber(base_experience))
    {
    goto end; //Numeric
    }
    }

    // pokemon_detail->height
    cJSON *height = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "height");
    if (cJSON_IsNull(height)) {
        height = NULL;
    }
    if (height) { 
    if(!cJSON_IsNumber(height))
    {
    goto end; //Numeric
    }
    }

    // pokemon_detail->is_default
    cJSON *is_default = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "is_default");
    if (cJSON_IsNull(is_default)) {
        is_default = NULL;
    }
    if (is_default) { 
    if(!cJSON_IsBool(is_default))
    {
    goto end; //Bool
    }
    }

    // pokemon_detail->order
    cJSON *order = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "order");
    if (cJSON_IsNull(order)) {
        order = NULL;
    }
    if (order) { 
    if(!cJSON_IsNumber(order))
    {
    goto end; //Numeric
    }
    }

    // pokemon_detail->weight
    cJSON *weight = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "weight");
    if (cJSON_IsNull(weight)) {
        weight = NULL;
    }
    if (weight) { 
    if(!cJSON_IsNumber(weight))
    {
    goto end; //Numeric
    }
    }

    // pokemon_detail->abilities
    cJSON *abilities = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "abilities");
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

    // pokemon_detail->past_abilities
    cJSON *past_abilities = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "past_abilities");
    if (cJSON_IsNull(past_abilities)) {
        past_abilities = NULL;
    }
    if (!past_abilities) {
        goto end;
    }

    
    cJSON *past_abilities_local_nonprimitive = NULL;
    if(!cJSON_IsArray(past_abilities)){
        goto end; //nonprimitive container
    }

    past_abilitiesList = list_createList();

    cJSON_ArrayForEach(past_abilities_local_nonprimitive,past_abilities )
    {
        if(!cJSON_IsObject(past_abilities_local_nonprimitive)){
            goto end;
        }
        pokemon_detail_past_abilities_inner_t *past_abilitiesItem = pokemon_detail_past_abilities_inner_parseFromJSON(past_abilities_local_nonprimitive);

        list_addElement(past_abilitiesList, past_abilitiesItem);
    }

    // pokemon_detail->forms
    cJSON *forms = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "forms");
    if (cJSON_IsNull(forms)) {
        forms = NULL;
    }
    if (!forms) {
        goto end;
    }

    
    cJSON *forms_local_nonprimitive = NULL;
    if(!cJSON_IsArray(forms)){
        goto end; //nonprimitive container
    }

    formsList = list_createList();

    cJSON_ArrayForEach(forms_local_nonprimitive,forms )
    {
        if(!cJSON_IsObject(forms_local_nonprimitive)){
            goto end;
        }
        pokemon_form_summary_t *formsItem = pokemon_form_summary_parseFromJSON(forms_local_nonprimitive);

        list_addElement(formsList, formsItem);
    }

    // pokemon_detail->game_indices
    cJSON *game_indices = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "game_indices");
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
        pokemon_game_index_t *game_indicesItem = pokemon_game_index_parseFromJSON(game_indices_local_nonprimitive);

        list_addElement(game_indicesList, game_indicesItem);
    }

    // pokemon_detail->held_items
    cJSON *held_items = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "held_items");
    if (cJSON_IsNull(held_items)) {
        held_items = NULL;
    }
    if (!held_items) {
        goto end;
    }

    
    held_items_local_nonprim = pokemon_detail_held_items_parseFromJSON(held_items); //nonprimitive

    // pokemon_detail->location_area_encounters
    cJSON *location_area_encounters = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "location_area_encounters");
    if (cJSON_IsNull(location_area_encounters)) {
        location_area_encounters = NULL;
    }
    if (!location_area_encounters) {
        goto end;
    }

    
    if(!cJSON_IsString(location_area_encounters))
    {
    goto end; //String
    }

    // pokemon_detail->moves
    cJSON *moves = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "moves");
    if (cJSON_IsNull(moves)) {
        moves = NULL;
    }
    if (!moves) {
        goto end;
    }

    
    cJSON *moves_local_nonprimitive = NULL;
    if(!cJSON_IsArray(moves)){
        goto end; //nonprimitive container
    }

    movesList = list_createList();

    cJSON_ArrayForEach(moves_local_nonprimitive,moves )
    {
        if(!cJSON_IsObject(moves_local_nonprimitive)){
            goto end;
        }
        pokemon_detail_moves_inner_t *movesItem = pokemon_detail_moves_inner_parseFromJSON(moves_local_nonprimitive);

        list_addElement(movesList, movesItem);
    }

    // pokemon_detail->species
    cJSON *species = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "species");
    if (cJSON_IsNull(species)) {
        species = NULL;
    }
    if (!species) {
        goto end;
    }

    
    species_local_nonprim = pokemon_species_summary_parseFromJSON(species); //nonprimitive

    // pokemon_detail->sprites
    cJSON *sprites = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "sprites");
    if (cJSON_IsNull(sprites)) {
        sprites = NULL;
    }
    if (!sprites) {
        goto end;
    }

    
    sprites_local_nonprim = pokemon_detail_sprites_parseFromJSON(sprites); //custom

    // pokemon_detail->cries
    cJSON *cries = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "cries");
    if (cJSON_IsNull(cries)) {
        cries = NULL;
    }
    if (!cries) {
        goto end;
    }

    
    cries_local_nonprim = pokemon_detail_cries_parseFromJSON(cries); //nonprimitive

    // pokemon_detail->stats
    cJSON *stats = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "stats");
    if (cJSON_IsNull(stats)) {
        stats = NULL;
    }
    if (!stats) {
        goto end;
    }

    
    cJSON *stats_local_nonprimitive = NULL;
    if(!cJSON_IsArray(stats)){
        goto end; //nonprimitive container
    }

    statsList = list_createList();

    cJSON_ArrayForEach(stats_local_nonprimitive,stats )
    {
        if(!cJSON_IsObject(stats_local_nonprimitive)){
            goto end;
        }
        pokemon_stat_t *statsItem = pokemon_stat_parseFromJSON(stats_local_nonprimitive);

        list_addElement(statsList, statsItem);
    }

    // pokemon_detail->types
    cJSON *types = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "types");
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

    // pokemon_detail->past_types
    cJSON *past_types = cJSON_GetObjectItemCaseSensitive(pokemon_detailJSON, "past_types");
    if (cJSON_IsNull(past_types)) {
        past_types = NULL;
    }
    if (!past_types) {
        goto end;
    }

    
    cJSON *past_types_local_nonprimitive = NULL;
    if(!cJSON_IsArray(past_types)){
        goto end; //nonprimitive container
    }

    past_typesList = list_createList();

    cJSON_ArrayForEach(past_types_local_nonprimitive,past_types )
    {
        if(!cJSON_IsObject(past_types_local_nonprimitive)){
            goto end;
        }
        pokemon_detail_past_types_inner_t *past_typesItem = pokemon_detail_past_types_inner_parseFromJSON(past_types_local_nonprimitive);

        list_addElement(past_typesList, past_typesItem);
    }


    pokemon_detail_local_var = pokemon_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        base_experience ? base_experience->valuedouble : 0,
        height ? height->valuedouble : 0,
        is_default ? is_default->valueint : 0,
        order ? order->valuedouble : 0,
        weight ? weight->valuedouble : 0,
        abilitiesList,
        past_abilitiesList,
        formsList,
        game_indicesList,
        held_items_local_nonprim,
        strdup(location_area_encounters->valuestring),
        movesList,
        species_local_nonprim,
        sprites_local_nonprim,
        cries_local_nonprim,
        statsList,
        typesList,
        past_typesList
        );

    return pokemon_detail_local_var;
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
    if (past_abilitiesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, past_abilitiesList) {
            pokemon_detail_past_abilities_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(past_abilitiesList);
        past_abilitiesList = NULL;
    }
    if (formsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, formsList) {
            pokemon_form_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(formsList);
        formsList = NULL;
    }
    if (game_indicesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, game_indicesList) {
            pokemon_game_index_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(game_indicesList);
        game_indicesList = NULL;
    }
    if (held_items_local_nonprim) {
        pokemon_detail_held_items_free(held_items_local_nonprim);
        held_items_local_nonprim = NULL;
    }
    if (movesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, movesList) {
            pokemon_detail_moves_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(movesList);
        movesList = NULL;
    }
    if (species_local_nonprim) {
        pokemon_species_summary_free(species_local_nonprim);
        species_local_nonprim = NULL;
    }
    if (sprites_local_nonprim) {
        pokemon_detail_sprites_free(sprites_local_nonprim);
        sprites_local_nonprim = NULL;
    }
    if (cries_local_nonprim) {
        pokemon_detail_cries_free(cries_local_nonprim);
        cries_local_nonprim = NULL;
    }
    if (statsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, statsList) {
            pokemon_stat_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(statsList);
        statsList = NULL;
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
    if (past_typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, past_typesList) {
            pokemon_detail_past_types_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(past_typesList);
        past_typesList = NULL;
    }
    return NULL;

}
