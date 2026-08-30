#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "egg_group_detail.h"



static egg_group_detail_t *egg_group_detail_create_internal(
    int *id,
    char *name,
    list_t *names,
    list_t *pokemon_species
    ) {
    egg_group_detail_t *egg_group_detail_local_var = malloc(sizeof(egg_group_detail_t));
    if (!egg_group_detail_local_var) {
        return NULL;
    }
    memset(egg_group_detail_local_var, 0, sizeof(egg_group_detail_t));
    egg_group_detail_local_var->_library_owned = 1;
    egg_group_detail_local_var->id = id;
    egg_group_detail_local_var->name = name;
    egg_group_detail_local_var->names = names;
    egg_group_detail_local_var->pokemon_species = pokemon_species;
    return egg_group_detail_local_var;
}

__attribute__((deprecated)) egg_group_detail_t *egg_group_detail_create(
    int *id,
    char *name,
    list_t *names,
    list_t *pokemon_species
    ) {
    int *id_copy = NULL;
    if (id) {
        id_copy = malloc(sizeof(int));
        if (id_copy) *id_copy = *id;
    }
    egg_group_detail_t *result = egg_group_detail_create_internal (
        id_copy,
        name,
        names,
        pokemon_species
        );
    if (!result) {
        free(id_copy);
    }
    return result;
}

void egg_group_detail_free(egg_group_detail_t *egg_group_detail) {
    if(NULL == egg_group_detail){
        return ;
    }
    if(egg_group_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "egg_group_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (egg_group_detail->id) {
        free(egg_group_detail->id);
        egg_group_detail->id = NULL;
    }
    if (egg_group_detail->name) {
        free(egg_group_detail->name);
        egg_group_detail->name = NULL;
    }
    if (egg_group_detail->names) {
        list_ForEach(listEntry, egg_group_detail->names) {
            egg_group_name_free(listEntry->data);
        }
        list_freeList(egg_group_detail->names);
        egg_group_detail->names = NULL;
    }
    if (egg_group_detail->pokemon_species) {
        list_ForEach(listEntry, egg_group_detail->pokemon_species) {
            egg_group_detail_pokemon_species_inner_free(listEntry->data);
        }
        list_freeList(egg_group_detail->pokemon_species);
        egg_group_detail->pokemon_species = NULL;
    }
    free(egg_group_detail);
}

cJSON *egg_group_detail_convertToJSON(egg_group_detail_t *egg_group_detail) {
    cJSON *item = cJSON_CreateObject();

    // egg_group_detail->id
    if (!egg_group_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", *egg_group_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // egg_group_detail->name
    if (!egg_group_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", egg_group_detail->name) == NULL) {
    goto fail; //String
    }


    // egg_group_detail->names
    if (!egg_group_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (egg_group_detail->names) {
    list_ForEach(namesListEntry, egg_group_detail->names) {
    cJSON *itemLocal = egg_group_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // egg_group_detail->pokemon_species
    if (!egg_group_detail->pokemon_species) {
        goto fail;
    }
    cJSON *pokemon_species = cJSON_AddArrayToObject(item, "pokemon_species");
    if(pokemon_species == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pokemon_speciesListEntry;
    if (egg_group_detail->pokemon_species) {
    list_ForEach(pokemon_speciesListEntry, egg_group_detail->pokemon_species) {
    cJSON *itemLocal = egg_group_detail_pokemon_species_inner_convertToJSON(pokemon_speciesListEntry->data);
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

egg_group_detail_t *egg_group_detail_parseFromJSON(cJSON *egg_group_detailJSON){

    egg_group_detail_t *egg_group_detail_local_var = NULL;

    // define the local variable for egg_group_detail->id
    int *id_local_var = NULL;

    char *name_local_str = NULL;

    // define the local list for egg_group_detail->names
    list_t *namesList = NULL;

    // define the local list for egg_group_detail->pokemon_species
    list_t *pokemon_speciesList = NULL;

    // egg_group_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(egg_group_detailJSON, "id");
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
    id_local_var = malloc(sizeof(int));
    if(!id_local_var)
    {
        goto end;
    }
    *id_local_var = id->valuedouble;

    // egg_group_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(egg_group_detailJSON, "name");
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

    // egg_group_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(egg_group_detailJSON, "names");
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
        egg_group_name_t *namesItem = egg_group_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // egg_group_detail->pokemon_species
    cJSON *pokemon_species = cJSON_GetObjectItemCaseSensitive(egg_group_detailJSON, "pokemon_species");
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
        egg_group_detail_pokemon_species_inner_t *pokemon_speciesItem = egg_group_detail_pokemon_species_inner_parseFromJSON(pokemon_species_local_nonprimitive);

        list_addElement(pokemon_speciesList, pokemon_speciesItem);
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    egg_group_detail_local_var = egg_group_detail_create_internal (
        id_local_var,
        name_local_str,
        namesList,
        pokemon_speciesList
        );

    if (!egg_group_detail_local_var) {
        goto end;
    }

    return egg_group_detail_local_var;
end:
    if (id_local_var) {
        free(id_local_var);
        id_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            egg_group_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (pokemon_speciesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pokemon_speciesList) {
            egg_group_detail_pokemon_species_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pokemon_speciesList);
        pokemon_speciesList = NULL;
    }
    return NULL;

}
