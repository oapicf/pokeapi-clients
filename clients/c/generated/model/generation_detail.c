#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generation_detail.h"



static generation_detail_t *generation_detail_create_internal(
    int id,
    char *name,
    list_t *abilities,
    region_summary_t *main_region,
    list_t *moves,
    list_t *names,
    list_t *pokemon_species,
    list_t *types,
    list_t *version_groups
    ) {
    generation_detail_t *generation_detail_local_var = malloc(sizeof(generation_detail_t));
    if (!generation_detail_local_var) {
        return NULL;
    }
    generation_detail_local_var->id = id;
    generation_detail_local_var->name = name;
    generation_detail_local_var->abilities = abilities;
    generation_detail_local_var->main_region = main_region;
    generation_detail_local_var->moves = moves;
    generation_detail_local_var->names = names;
    generation_detail_local_var->pokemon_species = pokemon_species;
    generation_detail_local_var->types = types;
    generation_detail_local_var->version_groups = version_groups;

    generation_detail_local_var->_library_owned = 1;
    return generation_detail_local_var;
}

__attribute__((deprecated)) generation_detail_t *generation_detail_create(
    int id,
    char *name,
    list_t *abilities,
    region_summary_t *main_region,
    list_t *moves,
    list_t *names,
    list_t *pokemon_species,
    list_t *types,
    list_t *version_groups
    ) {
    return generation_detail_create_internal (
        id,
        name,
        abilities,
        main_region,
        moves,
        names,
        pokemon_species,
        types,
        version_groups
        );
}

void generation_detail_free(generation_detail_t *generation_detail) {
    if(NULL == generation_detail){
        return ;
    }
    if(generation_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "generation_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (generation_detail->name) {
        free(generation_detail->name);
        generation_detail->name = NULL;
    }
    if (generation_detail->abilities) {
        list_ForEach(listEntry, generation_detail->abilities) {
            ability_summary_free(listEntry->data);
        }
        list_freeList(generation_detail->abilities);
        generation_detail->abilities = NULL;
    }
    if (generation_detail->main_region) {
        region_summary_free(generation_detail->main_region);
        generation_detail->main_region = NULL;
    }
    if (generation_detail->moves) {
        list_ForEach(listEntry, generation_detail->moves) {
            move_summary_free(listEntry->data);
        }
        list_freeList(generation_detail->moves);
        generation_detail->moves = NULL;
    }
    if (generation_detail->names) {
        list_ForEach(listEntry, generation_detail->names) {
            generation_name_free(listEntry->data);
        }
        list_freeList(generation_detail->names);
        generation_detail->names = NULL;
    }
    if (generation_detail->pokemon_species) {
        list_ForEach(listEntry, generation_detail->pokemon_species) {
            pokemon_species_summary_free(listEntry->data);
        }
        list_freeList(generation_detail->pokemon_species);
        generation_detail->pokemon_species = NULL;
    }
    if (generation_detail->types) {
        list_ForEach(listEntry, generation_detail->types) {
            type_summary_free(listEntry->data);
        }
        list_freeList(generation_detail->types);
        generation_detail->types = NULL;
    }
    if (generation_detail->version_groups) {
        list_ForEach(listEntry, generation_detail->version_groups) {
            version_group_summary_free(listEntry->data);
        }
        list_freeList(generation_detail->version_groups);
        generation_detail->version_groups = NULL;
    }
    free(generation_detail);
}

cJSON *generation_detail_convertToJSON(generation_detail_t *generation_detail) {
    cJSON *item = cJSON_CreateObject();

    // generation_detail->id
    if (!generation_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", generation_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // generation_detail->name
    if (!generation_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", generation_detail->name) == NULL) {
    goto fail; //String
    }


    // generation_detail->abilities
    if (!generation_detail->abilities) {
        goto fail;
    }
    cJSON *abilities = cJSON_AddArrayToObject(item, "abilities");
    if(abilities == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *abilitiesListEntry;
    if (generation_detail->abilities) {
    list_ForEach(abilitiesListEntry, generation_detail->abilities) {
    cJSON *itemLocal = ability_summary_convertToJSON(abilitiesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(abilities, itemLocal);
    }
    }


    // generation_detail->main_region
    if (!generation_detail->main_region) {
        goto fail;
    }
    cJSON *main_region_local_JSON = region_summary_convertToJSON(generation_detail->main_region);
    if(main_region_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "main_region", main_region_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // generation_detail->moves
    if (!generation_detail->moves) {
        goto fail;
    }
    cJSON *moves = cJSON_AddArrayToObject(item, "moves");
    if(moves == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *movesListEntry;
    if (generation_detail->moves) {
    list_ForEach(movesListEntry, generation_detail->moves) {
    cJSON *itemLocal = move_summary_convertToJSON(movesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(moves, itemLocal);
    }
    }


    // generation_detail->names
    if (!generation_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (generation_detail->names) {
    list_ForEach(namesListEntry, generation_detail->names) {
    cJSON *itemLocal = generation_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // generation_detail->pokemon_species
    if (!generation_detail->pokemon_species) {
        goto fail;
    }
    cJSON *pokemon_species = cJSON_AddArrayToObject(item, "pokemon_species");
    if(pokemon_species == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pokemon_speciesListEntry;
    if (generation_detail->pokemon_species) {
    list_ForEach(pokemon_speciesListEntry, generation_detail->pokemon_species) {
    cJSON *itemLocal = pokemon_species_summary_convertToJSON(pokemon_speciesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pokemon_species, itemLocal);
    }
    }


    // generation_detail->types
    if (!generation_detail->types) {
        goto fail;
    }
    cJSON *types = cJSON_AddArrayToObject(item, "types");
    if(types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *typesListEntry;
    if (generation_detail->types) {
    list_ForEach(typesListEntry, generation_detail->types) {
    cJSON *itemLocal = type_summary_convertToJSON(typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(types, itemLocal);
    }
    }


    // generation_detail->version_groups
    if (!generation_detail->version_groups) {
        goto fail;
    }
    cJSON *version_groups = cJSON_AddArrayToObject(item, "version_groups");
    if(version_groups == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *version_groupsListEntry;
    if (generation_detail->version_groups) {
    list_ForEach(version_groupsListEntry, generation_detail->version_groups) {
    cJSON *itemLocal = version_group_summary_convertToJSON(version_groupsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(version_groups, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

generation_detail_t *generation_detail_parseFromJSON(cJSON *generation_detailJSON){

    generation_detail_t *generation_detail_local_var = NULL;

    // define the local list for generation_detail->abilities
    list_t *abilitiesList = NULL;

    // define the local variable for generation_detail->main_region
    region_summary_t *main_region_local_nonprim = NULL;

    // define the local list for generation_detail->moves
    list_t *movesList = NULL;

    // define the local list for generation_detail->names
    list_t *namesList = NULL;

    // define the local list for generation_detail->pokemon_species
    list_t *pokemon_speciesList = NULL;

    // define the local list for generation_detail->types
    list_t *typesList = NULL;

    // define the local list for generation_detail->version_groups
    list_t *version_groupsList = NULL;

    // generation_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(generation_detailJSON, "id");
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

    // generation_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(generation_detailJSON, "name");
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

    // generation_detail->abilities
    cJSON *abilities = cJSON_GetObjectItemCaseSensitive(generation_detailJSON, "abilities");
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
        ability_summary_t *abilitiesItem = ability_summary_parseFromJSON(abilities_local_nonprimitive);

        list_addElement(abilitiesList, abilitiesItem);
    }

    // generation_detail->main_region
    cJSON *main_region = cJSON_GetObjectItemCaseSensitive(generation_detailJSON, "main_region");
    if (cJSON_IsNull(main_region)) {
        main_region = NULL;
    }
    if (!main_region) {
        goto end;
    }

    
    main_region_local_nonprim = region_summary_parseFromJSON(main_region); //nonprimitive

    // generation_detail->moves
    cJSON *moves = cJSON_GetObjectItemCaseSensitive(generation_detailJSON, "moves");
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
        move_summary_t *movesItem = move_summary_parseFromJSON(moves_local_nonprimitive);

        list_addElement(movesList, movesItem);
    }

    // generation_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(generation_detailJSON, "names");
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
        generation_name_t *namesItem = generation_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // generation_detail->pokemon_species
    cJSON *pokemon_species = cJSON_GetObjectItemCaseSensitive(generation_detailJSON, "pokemon_species");
    if (cJSON_IsNull(pokemon_species)) {
        pokemon_species = NULL;
    }
    if (!pokemon_species) {
        goto end;
    }

    
    cJSON *pokemon_species_local_nonprimitive = NULL;
    if(!cJSON_IsArray(pokemon_species)){
        goto end; //nonprimitive container
    }

    pokemon_speciesList = list_createList();

    cJSON_ArrayForEach(pokemon_species_local_nonprimitive,pokemon_species )
    {
        if(!cJSON_IsObject(pokemon_species_local_nonprimitive)){
            goto end;
        }
        pokemon_species_summary_t *pokemon_speciesItem = pokemon_species_summary_parseFromJSON(pokemon_species_local_nonprimitive);

        list_addElement(pokemon_speciesList, pokemon_speciesItem);
    }

    // generation_detail->types
    cJSON *types = cJSON_GetObjectItemCaseSensitive(generation_detailJSON, "types");
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
        type_summary_t *typesItem = type_summary_parseFromJSON(types_local_nonprimitive);

        list_addElement(typesList, typesItem);
    }

    // generation_detail->version_groups
    cJSON *version_groups = cJSON_GetObjectItemCaseSensitive(generation_detailJSON, "version_groups");
    if (cJSON_IsNull(version_groups)) {
        version_groups = NULL;
    }
    if (!version_groups) {
        goto end;
    }

    
    cJSON *version_groups_local_nonprimitive = NULL;
    if(!cJSON_IsArray(version_groups)){
        goto end; //nonprimitive container
    }

    version_groupsList = list_createList();

    cJSON_ArrayForEach(version_groups_local_nonprimitive,version_groups )
    {
        if(!cJSON_IsObject(version_groups_local_nonprimitive)){
            goto end;
        }
        version_group_summary_t *version_groupsItem = version_group_summary_parseFromJSON(version_groups_local_nonprimitive);

        list_addElement(version_groupsList, version_groupsItem);
    }


    generation_detail_local_var = generation_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        abilitiesList,
        main_region_local_nonprim,
        movesList,
        namesList,
        pokemon_speciesList,
        typesList,
        version_groupsList
        );

    return generation_detail_local_var;
end:
    if (abilitiesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, abilitiesList) {
            ability_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(abilitiesList);
        abilitiesList = NULL;
    }
    if (main_region_local_nonprim) {
        region_summary_free(main_region_local_nonprim);
        main_region_local_nonprim = NULL;
    }
    if (movesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, movesList) {
            move_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(movesList);
        movesList = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            generation_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (pokemon_speciesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pokemon_speciesList) {
            pokemon_species_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pokemon_speciesList);
        pokemon_speciesList = NULL;
    }
    if (typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, typesList) {
            type_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(typesList);
        typesList = NULL;
    }
    if (version_groupsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, version_groupsList) {
            version_group_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(version_groupsList);
        version_groupsList = NULL;
    }
    return NULL;

}
