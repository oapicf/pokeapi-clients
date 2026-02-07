#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "evolution_trigger_detail.h"



static evolution_trigger_detail_t *evolution_trigger_detail_create_internal(
    int id,
    char *name,
    list_t *names,
    list_t *pokemon_species
    ) {
    evolution_trigger_detail_t *evolution_trigger_detail_local_var = malloc(sizeof(evolution_trigger_detail_t));
    if (!evolution_trigger_detail_local_var) {
        return NULL;
    }
    evolution_trigger_detail_local_var->id = id;
    evolution_trigger_detail_local_var->name = name;
    evolution_trigger_detail_local_var->names = names;
    evolution_trigger_detail_local_var->pokemon_species = pokemon_species;

    evolution_trigger_detail_local_var->_library_owned = 1;
    return evolution_trigger_detail_local_var;
}

__attribute__((deprecated)) evolution_trigger_detail_t *evolution_trigger_detail_create(
    int id,
    char *name,
    list_t *names,
    list_t *pokemon_species
    ) {
    return evolution_trigger_detail_create_internal (
        id,
        name,
        names,
        pokemon_species
        );
}

void evolution_trigger_detail_free(evolution_trigger_detail_t *evolution_trigger_detail) {
    if(NULL == evolution_trigger_detail){
        return ;
    }
    if(evolution_trigger_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "evolution_trigger_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (evolution_trigger_detail->name) {
        free(evolution_trigger_detail->name);
        evolution_trigger_detail->name = NULL;
    }
    if (evolution_trigger_detail->names) {
        list_ForEach(listEntry, evolution_trigger_detail->names) {
            evolution_trigger_name_free(listEntry->data);
        }
        list_freeList(evolution_trigger_detail->names);
        evolution_trigger_detail->names = NULL;
    }
    if (evolution_trigger_detail->pokemon_species) {
        list_ForEach(listEntry, evolution_trigger_detail->pokemon_species) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(evolution_trigger_detail->pokemon_species);
        evolution_trigger_detail->pokemon_species = NULL;
    }
    free(evolution_trigger_detail);
}

cJSON *evolution_trigger_detail_convertToJSON(evolution_trigger_detail_t *evolution_trigger_detail) {
    cJSON *item = cJSON_CreateObject();

    // evolution_trigger_detail->id
    if (!evolution_trigger_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", evolution_trigger_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // evolution_trigger_detail->name
    if (!evolution_trigger_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", evolution_trigger_detail->name) == NULL) {
    goto fail; //String
    }


    // evolution_trigger_detail->names
    if (!evolution_trigger_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (evolution_trigger_detail->names) {
    list_ForEach(namesListEntry, evolution_trigger_detail->names) {
    cJSON *itemLocal = evolution_trigger_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // evolution_trigger_detail->pokemon_species
    if (!evolution_trigger_detail->pokemon_species) {
        goto fail;
    }
    cJSON *pokemon_species = cJSON_AddArrayToObject(item, "pokemon_species");
    if(pokemon_species == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pokemon_speciesListEntry;
    if (evolution_trigger_detail->pokemon_species) {
    list_ForEach(pokemon_speciesListEntry, evolution_trigger_detail->pokemon_species) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(pokemon_speciesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pokemon_species, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

evolution_trigger_detail_t *evolution_trigger_detail_parseFromJSON(cJSON *evolution_trigger_detailJSON){

    evolution_trigger_detail_t *evolution_trigger_detail_local_var = NULL;

    // define the local list for evolution_trigger_detail->names
    list_t *namesList = NULL;

    // define the local list for evolution_trigger_detail->pokemon_species
    list_t *pokemon_speciesList = NULL;

    // evolution_trigger_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(evolution_trigger_detailJSON, "id");
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

    // evolution_trigger_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(evolution_trigger_detailJSON, "name");
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

    // evolution_trigger_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(evolution_trigger_detailJSON, "names");
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
        evolution_trigger_name_t *namesItem = evolution_trigger_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // evolution_trigger_detail->pokemon_species
    cJSON *pokemon_species = cJSON_GetObjectItemCaseSensitive(evolution_trigger_detailJSON, "pokemon_species");
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
        ability_detail_pokemon_inner_pokemon_t *pokemon_speciesItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(pokemon_species_local_nonprimitive);

        list_addElement(pokemon_speciesList, pokemon_speciesItem);
    }


    evolution_trigger_detail_local_var = evolution_trigger_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        namesList,
        pokemon_speciesList
        );

    return evolution_trigger_detail_local_var;
end:
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            evolution_trigger_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (pokemon_speciesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pokemon_speciesList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pokemon_speciesList);
        pokemon_speciesList = NULL;
    }
    return NULL;

}
