#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_shape_detail.h"



static pokemon_shape_detail_t *pokemon_shape_detail_create_internal(
    int *id,
    char *name,
    list_t *awesome_names,
    list_t *names,
    list_t *pokemon_species
    ) {
    pokemon_shape_detail_t *pokemon_shape_detail_local_var = malloc(sizeof(pokemon_shape_detail_t));
    if (!pokemon_shape_detail_local_var) {
        return NULL;
    }
    memset(pokemon_shape_detail_local_var, 0, sizeof(pokemon_shape_detail_t));
    pokemon_shape_detail_local_var->_library_owned = 1;
    pokemon_shape_detail_local_var->id = id;
    pokemon_shape_detail_local_var->name = name;
    pokemon_shape_detail_local_var->awesome_names = awesome_names;
    pokemon_shape_detail_local_var->names = names;
    pokemon_shape_detail_local_var->pokemon_species = pokemon_species;
    return pokemon_shape_detail_local_var;
}

__attribute__((deprecated)) pokemon_shape_detail_t *pokemon_shape_detail_create(
    int *id,
    char *name,
    list_t *awesome_names,
    list_t *names,
    list_t *pokemon_species
    ) {
    int *id_copy = NULL;
    if (id) {
        id_copy = malloc(sizeof(int));
        if (id_copy) *id_copy = *id;
    }
    pokemon_shape_detail_t *result = pokemon_shape_detail_create_internal (
        id_copy,
        name,
        awesome_names,
        names,
        pokemon_species
        );
    if (!result) {
        free(id_copy);
    }
    return result;
}

void pokemon_shape_detail_free(pokemon_shape_detail_t *pokemon_shape_detail) {
    if(NULL == pokemon_shape_detail){
        return ;
    }
    if(pokemon_shape_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_shape_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_shape_detail->id) {
        free(pokemon_shape_detail->id);
        pokemon_shape_detail->id = NULL;
    }
    if (pokemon_shape_detail->name) {
        free(pokemon_shape_detail->name);
        pokemon_shape_detail->name = NULL;
    }
    if (pokemon_shape_detail->awesome_names) {
        list_ForEach(listEntry, pokemon_shape_detail->awesome_names) {
            pokemon_shape_detail_awesome_names_inner_free(listEntry->data);
        }
        list_freeList(pokemon_shape_detail->awesome_names);
        pokemon_shape_detail->awesome_names = NULL;
    }
    if (pokemon_shape_detail->names) {
        list_ForEach(listEntry, pokemon_shape_detail->names) {
            pokemon_shape_detail_names_inner_free(listEntry->data);
        }
        list_freeList(pokemon_shape_detail->names);
        pokemon_shape_detail->names = NULL;
    }
    if (pokemon_shape_detail->pokemon_species) {
        list_ForEach(listEntry, pokemon_shape_detail->pokemon_species) {
            pokemon_species_summary_free(listEntry->data);
        }
        list_freeList(pokemon_shape_detail->pokemon_species);
        pokemon_shape_detail->pokemon_species = NULL;
    }
    free(pokemon_shape_detail);
}

cJSON *pokemon_shape_detail_convertToJSON(pokemon_shape_detail_t *pokemon_shape_detail) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_shape_detail->id
    if (!pokemon_shape_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", *pokemon_shape_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_shape_detail->name
    if (!pokemon_shape_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokemon_shape_detail->name) == NULL) {
    goto fail; //String
    }


    // pokemon_shape_detail->awesome_names
    if (!pokemon_shape_detail->awesome_names) {
        goto fail;
    }
    cJSON *awesome_names = cJSON_AddArrayToObject(item, "awesome_names");
    if(awesome_names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *awesome_namesListEntry;
    if (pokemon_shape_detail->awesome_names) {
    list_ForEach(awesome_namesListEntry, pokemon_shape_detail->awesome_names) {
    cJSON *itemLocal = pokemon_shape_detail_awesome_names_inner_convertToJSON(awesome_namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(awesome_names, itemLocal);
    }
    }


    // pokemon_shape_detail->names
    if (!pokemon_shape_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (pokemon_shape_detail->names) {
    list_ForEach(namesListEntry, pokemon_shape_detail->names) {
    cJSON *itemLocal = pokemon_shape_detail_names_inner_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // pokemon_shape_detail->pokemon_species
    if (!pokemon_shape_detail->pokemon_species) {
        goto fail;
    }
    cJSON *pokemon_species = cJSON_AddArrayToObject(item, "pokemon_species");
    if(pokemon_species == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pokemon_speciesListEntry;
    if (pokemon_shape_detail->pokemon_species) {
    list_ForEach(pokemon_speciesListEntry, pokemon_shape_detail->pokemon_species) {
    cJSON *itemLocal = pokemon_species_summary_convertToJSON(pokemon_speciesListEntry->data);
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

pokemon_shape_detail_t *pokemon_shape_detail_parseFromJSON(cJSON *pokemon_shape_detailJSON){

    pokemon_shape_detail_t *pokemon_shape_detail_local_var = NULL;

    // define the local variable for pokemon_shape_detail->id
    int *id_local_var = NULL;

    char *name_local_str = NULL;

    // define the local list for pokemon_shape_detail->awesome_names
    list_t *awesome_namesList = NULL;

    // define the local list for pokemon_shape_detail->names
    list_t *namesList = NULL;

    // define the local list for pokemon_shape_detail->pokemon_species
    list_t *pokemon_speciesList = NULL;

    // pokemon_shape_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(pokemon_shape_detailJSON, "id");
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

    // pokemon_shape_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokemon_shape_detailJSON, "name");
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

    // pokemon_shape_detail->awesome_names
    cJSON *awesome_names = cJSON_GetObjectItemCaseSensitive(pokemon_shape_detailJSON, "awesome_names");
    if (cJSON_IsNull(awesome_names)) {
        awesome_names = NULL;
    }
    if (!awesome_names) {
        goto end;
    }

    
    cJSON *awesome_names_local_nonprimitive = NULL;
    if(!cJSON_IsArray(awesome_names)){
        goto end; //nonprimitive container
    }

    awesome_namesList = list_createList();

    cJSON_ArrayForEach(awesome_names_local_nonprimitive,awesome_names )
    {
        if(!cJSON_IsObject(awesome_names_local_nonprimitive)){
            goto end;
        }
        pokemon_shape_detail_awesome_names_inner_t *awesome_namesItem = pokemon_shape_detail_awesome_names_inner_parseFromJSON(awesome_names_local_nonprimitive);

        list_addElement(awesome_namesList, awesome_namesItem);
    }

    // pokemon_shape_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(pokemon_shape_detailJSON, "names");
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
        pokemon_shape_detail_names_inner_t *namesItem = pokemon_shape_detail_names_inner_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // pokemon_shape_detail->pokemon_species
    cJSON *pokemon_species = cJSON_GetObjectItemCaseSensitive(pokemon_shape_detailJSON, "pokemon_species");
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


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    pokemon_shape_detail_local_var = pokemon_shape_detail_create_internal (
        id_local_var,
        name_local_str,
        awesome_namesList,
        namesList,
        pokemon_speciesList
        );

    if (!pokemon_shape_detail_local_var) {
        goto end;
    }

    return pokemon_shape_detail_local_var;
end:
    if (id_local_var) {
        free(id_local_var);
        id_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (awesome_namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, awesome_namesList) {
            pokemon_shape_detail_awesome_names_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(awesome_namesList);
        awesome_namesList = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            pokemon_shape_detail_names_inner_free(listEntry->data);
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
    return NULL;

}
