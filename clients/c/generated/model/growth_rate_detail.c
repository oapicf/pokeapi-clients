#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "growth_rate_detail.h"



static growth_rate_detail_t *growth_rate_detail_create_internal(
    int id,
    char *name,
    char *formula,
    list_t *descriptions,
    list_t *levels,
    list_t *pokemon_species
    ) {
    growth_rate_detail_t *growth_rate_detail_local_var = malloc(sizeof(growth_rate_detail_t));
    if (!growth_rate_detail_local_var) {
        return NULL;
    }
    growth_rate_detail_local_var->id = id;
    growth_rate_detail_local_var->name = name;
    growth_rate_detail_local_var->formula = formula;
    growth_rate_detail_local_var->descriptions = descriptions;
    growth_rate_detail_local_var->levels = levels;
    growth_rate_detail_local_var->pokemon_species = pokemon_species;

    growth_rate_detail_local_var->_library_owned = 1;
    return growth_rate_detail_local_var;
}

__attribute__((deprecated)) growth_rate_detail_t *growth_rate_detail_create(
    int id,
    char *name,
    char *formula,
    list_t *descriptions,
    list_t *levels,
    list_t *pokemon_species
    ) {
    return growth_rate_detail_create_internal (
        id,
        name,
        formula,
        descriptions,
        levels,
        pokemon_species
        );
}

void growth_rate_detail_free(growth_rate_detail_t *growth_rate_detail) {
    if(NULL == growth_rate_detail){
        return ;
    }
    if(growth_rate_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "growth_rate_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (growth_rate_detail->name) {
        free(growth_rate_detail->name);
        growth_rate_detail->name = NULL;
    }
    if (growth_rate_detail->formula) {
        free(growth_rate_detail->formula);
        growth_rate_detail->formula = NULL;
    }
    if (growth_rate_detail->descriptions) {
        list_ForEach(listEntry, growth_rate_detail->descriptions) {
            growth_rate_description_free(listEntry->data);
        }
        list_freeList(growth_rate_detail->descriptions);
        growth_rate_detail->descriptions = NULL;
    }
    if (growth_rate_detail->levels) {
        list_ForEach(listEntry, growth_rate_detail->levels) {
            experience_free(listEntry->data);
        }
        list_freeList(growth_rate_detail->levels);
        growth_rate_detail->levels = NULL;
    }
    if (growth_rate_detail->pokemon_species) {
        list_ForEach(listEntry, growth_rate_detail->pokemon_species) {
            pokemon_species_summary_free(listEntry->data);
        }
        list_freeList(growth_rate_detail->pokemon_species);
        growth_rate_detail->pokemon_species = NULL;
    }
    free(growth_rate_detail);
}

cJSON *growth_rate_detail_convertToJSON(growth_rate_detail_t *growth_rate_detail) {
    cJSON *item = cJSON_CreateObject();

    // growth_rate_detail->id
    if (!growth_rate_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", growth_rate_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // growth_rate_detail->name
    if (!growth_rate_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", growth_rate_detail->name) == NULL) {
    goto fail; //String
    }


    // growth_rate_detail->formula
    if (!growth_rate_detail->formula) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "formula", growth_rate_detail->formula) == NULL) {
    goto fail; //String
    }


    // growth_rate_detail->descriptions
    if (!growth_rate_detail->descriptions) {
        goto fail;
    }
    cJSON *descriptions = cJSON_AddArrayToObject(item, "descriptions");
    if(descriptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *descriptionsListEntry;
    if (growth_rate_detail->descriptions) {
    list_ForEach(descriptionsListEntry, growth_rate_detail->descriptions) {
    cJSON *itemLocal = growth_rate_description_convertToJSON(descriptionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(descriptions, itemLocal);
    }
    }


    // growth_rate_detail->levels
    if (!growth_rate_detail->levels) {
        goto fail;
    }
    cJSON *levels = cJSON_AddArrayToObject(item, "levels");
    if(levels == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *levelsListEntry;
    if (growth_rate_detail->levels) {
    list_ForEach(levelsListEntry, growth_rate_detail->levels) {
    cJSON *itemLocal = experience_convertToJSON(levelsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(levels, itemLocal);
    }
    }


    // growth_rate_detail->pokemon_species
    if (!growth_rate_detail->pokemon_species) {
        goto fail;
    }
    cJSON *pokemon_species = cJSON_AddArrayToObject(item, "pokemon_species");
    if(pokemon_species == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pokemon_speciesListEntry;
    if (growth_rate_detail->pokemon_species) {
    list_ForEach(pokemon_speciesListEntry, growth_rate_detail->pokemon_species) {
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

growth_rate_detail_t *growth_rate_detail_parseFromJSON(cJSON *growth_rate_detailJSON){

    growth_rate_detail_t *growth_rate_detail_local_var = NULL;

    // define the local list for growth_rate_detail->descriptions
    list_t *descriptionsList = NULL;

    // define the local list for growth_rate_detail->levels
    list_t *levelsList = NULL;

    // define the local list for growth_rate_detail->pokemon_species
    list_t *pokemon_speciesList = NULL;

    // growth_rate_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(growth_rate_detailJSON, "id");
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

    // growth_rate_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(growth_rate_detailJSON, "name");
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

    // growth_rate_detail->formula
    cJSON *formula = cJSON_GetObjectItemCaseSensitive(growth_rate_detailJSON, "formula");
    if (cJSON_IsNull(formula)) {
        formula = NULL;
    }
    if (!formula) {
        goto end;
    }

    
    if(!cJSON_IsString(formula))
    {
    goto end; //String
    }

    // growth_rate_detail->descriptions
    cJSON *descriptions = cJSON_GetObjectItemCaseSensitive(growth_rate_detailJSON, "descriptions");
    if (cJSON_IsNull(descriptions)) {
        descriptions = NULL;
    }
    if (!descriptions) {
        goto end;
    }

    
    cJSON *descriptions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(descriptions)){
        goto end; //nonprimitive container
    }

    descriptionsList = list_createList();

    cJSON_ArrayForEach(descriptions_local_nonprimitive,descriptions )
    {
        if(!cJSON_IsObject(descriptions_local_nonprimitive)){
            goto end;
        }
        growth_rate_description_t *descriptionsItem = growth_rate_description_parseFromJSON(descriptions_local_nonprimitive);

        list_addElement(descriptionsList, descriptionsItem);
    }

    // growth_rate_detail->levels
    cJSON *levels = cJSON_GetObjectItemCaseSensitive(growth_rate_detailJSON, "levels");
    if (cJSON_IsNull(levels)) {
        levels = NULL;
    }
    if (!levels) {
        goto end;
    }

    
    cJSON *levels_local_nonprimitive = NULL;
    if(!cJSON_IsArray(levels)){
        goto end; //nonprimitive container
    }

    levelsList = list_createList();

    cJSON_ArrayForEach(levels_local_nonprimitive,levels )
    {
        if(!cJSON_IsObject(levels_local_nonprimitive)){
            goto end;
        }
        experience_t *levelsItem = experience_parseFromJSON(levels_local_nonprimitive);

        list_addElement(levelsList, levelsItem);
    }

    // growth_rate_detail->pokemon_species
    cJSON *pokemon_species = cJSON_GetObjectItemCaseSensitive(growth_rate_detailJSON, "pokemon_species");
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


    growth_rate_detail_local_var = growth_rate_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        strdup(formula->valuestring),
        descriptionsList,
        levelsList,
        pokemon_speciesList
        );

    return growth_rate_detail_local_var;
end:
    if (descriptionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, descriptionsList) {
            growth_rate_description_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(descriptionsList);
        descriptionsList = NULL;
    }
    if (levelsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, levelsList) {
            experience_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(levelsList);
        levelsList = NULL;
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
