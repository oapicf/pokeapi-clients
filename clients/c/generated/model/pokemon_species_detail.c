#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_species_detail.h"



static pokemon_species_detail_t *pokemon_species_detail_create_internal(
    int id,
    char *name,
    int order,
    int gender_rate,
    int capture_rate,
    int base_happiness,
    int is_baby,
    int is_legendary,
    int is_mythical,
    int hatch_counter,
    int has_gender_differences,
    int forms_switchable,
    growth_rate_summary_t *growth_rate,
    list_t *pokedex_numbers,
    list_t *egg_groups,
    pokemon_color_summary_t *color,
    pokemon_shape_summary_t *shape,
    pokemon_species_summary_t *evolves_from_species,
    evolution_chain_summary_t *evolution_chain,
    pokemon_habitat_summary_t *habitat,
    generation_summary_t *generation,
    list_t *names,
    list_t *pal_park_encounters,
    list_t *form_descriptions,
    list_t *flavor_text_entries,
    list_t *genera,
    list_t *varieties
    ) {
    pokemon_species_detail_t *pokemon_species_detail_local_var = malloc(sizeof(pokemon_species_detail_t));
    if (!pokemon_species_detail_local_var) {
        return NULL;
    }
    pokemon_species_detail_local_var->id = id;
    pokemon_species_detail_local_var->name = name;
    pokemon_species_detail_local_var->order = order;
    pokemon_species_detail_local_var->gender_rate = gender_rate;
    pokemon_species_detail_local_var->capture_rate = capture_rate;
    pokemon_species_detail_local_var->base_happiness = base_happiness;
    pokemon_species_detail_local_var->is_baby = is_baby;
    pokemon_species_detail_local_var->is_legendary = is_legendary;
    pokemon_species_detail_local_var->is_mythical = is_mythical;
    pokemon_species_detail_local_var->hatch_counter = hatch_counter;
    pokemon_species_detail_local_var->has_gender_differences = has_gender_differences;
    pokemon_species_detail_local_var->forms_switchable = forms_switchable;
    pokemon_species_detail_local_var->growth_rate = growth_rate;
    pokemon_species_detail_local_var->pokedex_numbers = pokedex_numbers;
    pokemon_species_detail_local_var->egg_groups = egg_groups;
    pokemon_species_detail_local_var->color = color;
    pokemon_species_detail_local_var->shape = shape;
    pokemon_species_detail_local_var->evolves_from_species = evolves_from_species;
    pokemon_species_detail_local_var->evolution_chain = evolution_chain;
    pokemon_species_detail_local_var->habitat = habitat;
    pokemon_species_detail_local_var->generation = generation;
    pokemon_species_detail_local_var->names = names;
    pokemon_species_detail_local_var->pal_park_encounters = pal_park_encounters;
    pokemon_species_detail_local_var->form_descriptions = form_descriptions;
    pokemon_species_detail_local_var->flavor_text_entries = flavor_text_entries;
    pokemon_species_detail_local_var->genera = genera;
    pokemon_species_detail_local_var->varieties = varieties;

    pokemon_species_detail_local_var->_library_owned = 1;
    return pokemon_species_detail_local_var;
}

__attribute__((deprecated)) pokemon_species_detail_t *pokemon_species_detail_create(
    int id,
    char *name,
    int order,
    int gender_rate,
    int capture_rate,
    int base_happiness,
    int is_baby,
    int is_legendary,
    int is_mythical,
    int hatch_counter,
    int has_gender_differences,
    int forms_switchable,
    growth_rate_summary_t *growth_rate,
    list_t *pokedex_numbers,
    list_t *egg_groups,
    pokemon_color_summary_t *color,
    pokemon_shape_summary_t *shape,
    pokemon_species_summary_t *evolves_from_species,
    evolution_chain_summary_t *evolution_chain,
    pokemon_habitat_summary_t *habitat,
    generation_summary_t *generation,
    list_t *names,
    list_t *pal_park_encounters,
    list_t *form_descriptions,
    list_t *flavor_text_entries,
    list_t *genera,
    list_t *varieties
    ) {
    return pokemon_species_detail_create_internal (
        id,
        name,
        order,
        gender_rate,
        capture_rate,
        base_happiness,
        is_baby,
        is_legendary,
        is_mythical,
        hatch_counter,
        has_gender_differences,
        forms_switchable,
        growth_rate,
        pokedex_numbers,
        egg_groups,
        color,
        shape,
        evolves_from_species,
        evolution_chain,
        habitat,
        generation,
        names,
        pal_park_encounters,
        form_descriptions,
        flavor_text_entries,
        genera,
        varieties
        );
}

void pokemon_species_detail_free(pokemon_species_detail_t *pokemon_species_detail) {
    if(NULL == pokemon_species_detail){
        return ;
    }
    if(pokemon_species_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_species_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_species_detail->name) {
        free(pokemon_species_detail->name);
        pokemon_species_detail->name = NULL;
    }
    if (pokemon_species_detail->growth_rate) {
        growth_rate_summary_free(pokemon_species_detail->growth_rate);
        pokemon_species_detail->growth_rate = NULL;
    }
    if (pokemon_species_detail->pokedex_numbers) {
        list_ForEach(listEntry, pokemon_species_detail->pokedex_numbers) {
            pokemon_dex_entry_free(listEntry->data);
        }
        list_freeList(pokemon_species_detail->pokedex_numbers);
        pokemon_species_detail->pokedex_numbers = NULL;
    }
    if (pokemon_species_detail->egg_groups) {
        list_ForEach(listEntry, pokemon_species_detail->egg_groups) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(pokemon_species_detail->egg_groups);
        pokemon_species_detail->egg_groups = NULL;
    }
    if (pokemon_species_detail->color) {
        pokemon_color_summary_free(pokemon_species_detail->color);
        pokemon_species_detail->color = NULL;
    }
    if (pokemon_species_detail->shape) {
        pokemon_shape_summary_free(pokemon_species_detail->shape);
        pokemon_species_detail->shape = NULL;
    }
    if (pokemon_species_detail->evolves_from_species) {
        pokemon_species_summary_free(pokemon_species_detail->evolves_from_species);
        pokemon_species_detail->evolves_from_species = NULL;
    }
    if (pokemon_species_detail->evolution_chain) {
        evolution_chain_summary_free(pokemon_species_detail->evolution_chain);
        pokemon_species_detail->evolution_chain = NULL;
    }
    if (pokemon_species_detail->habitat) {
        pokemon_habitat_summary_free(pokemon_species_detail->habitat);
        pokemon_species_detail->habitat = NULL;
    }
    if (pokemon_species_detail->generation) {
        generation_summary_free(pokemon_species_detail->generation);
        pokemon_species_detail->generation = NULL;
    }
    if (pokemon_species_detail->names) {
        list_ForEach(listEntry, pokemon_species_detail->names) {
            pokemon_form_detail_form_names_inner_free(listEntry->data);
        }
        list_freeList(pokemon_species_detail->names);
        pokemon_species_detail->names = NULL;
    }
    if (pokemon_species_detail->pal_park_encounters) {
        list_ForEach(listEntry, pokemon_species_detail->pal_park_encounters) {
            pokemon_species_detail_pal_park_encounters_inner_free(listEntry->data);
        }
        list_freeList(pokemon_species_detail->pal_park_encounters);
        pokemon_species_detail->pal_park_encounters = NULL;
    }
    if (pokemon_species_detail->form_descriptions) {
        list_ForEach(listEntry, pokemon_species_detail->form_descriptions) {
            pokemon_species_description_free(listEntry->data);
        }
        list_freeList(pokemon_species_detail->form_descriptions);
        pokemon_species_detail->form_descriptions = NULL;
    }
    if (pokemon_species_detail->flavor_text_entries) {
        list_ForEach(listEntry, pokemon_species_detail->flavor_text_entries) {
            pokemon_species_flavor_text_free(listEntry->data);
        }
        list_freeList(pokemon_species_detail->flavor_text_entries);
        pokemon_species_detail->flavor_text_entries = NULL;
    }
    if (pokemon_species_detail->genera) {
        list_ForEach(listEntry, pokemon_species_detail->genera) {
            pokemon_species_detail_genera_inner_free(listEntry->data);
        }
        list_freeList(pokemon_species_detail->genera);
        pokemon_species_detail->genera = NULL;
    }
    if (pokemon_species_detail->varieties) {
        list_ForEach(listEntry, pokemon_species_detail->varieties) {
            pokemon_species_detail_varieties_inner_free(listEntry->data);
        }
        list_freeList(pokemon_species_detail->varieties);
        pokemon_species_detail->varieties = NULL;
    }
    free(pokemon_species_detail);
}

cJSON *pokemon_species_detail_convertToJSON(pokemon_species_detail_t *pokemon_species_detail) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_species_detail->id
    if (!pokemon_species_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", pokemon_species_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_species_detail->name
    if (!pokemon_species_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokemon_species_detail->name) == NULL) {
    goto fail; //String
    }


    // pokemon_species_detail->order
    if(pokemon_species_detail->order) {
    if(cJSON_AddNumberToObject(item, "order", pokemon_species_detail->order) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_species_detail->gender_rate
    if(pokemon_species_detail->gender_rate) {
    if(cJSON_AddNumberToObject(item, "gender_rate", pokemon_species_detail->gender_rate) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_species_detail->capture_rate
    if(pokemon_species_detail->capture_rate) {
    if(cJSON_AddNumberToObject(item, "capture_rate", pokemon_species_detail->capture_rate) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_species_detail->base_happiness
    if(pokemon_species_detail->base_happiness) {
    if(cJSON_AddNumberToObject(item, "base_happiness", pokemon_species_detail->base_happiness) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_species_detail->is_baby
    if(pokemon_species_detail->is_baby) {
    if(cJSON_AddBoolToObject(item, "is_baby", pokemon_species_detail->is_baby) == NULL) {
    goto fail; //Bool
    }
    }


    // pokemon_species_detail->is_legendary
    if(pokemon_species_detail->is_legendary) {
    if(cJSON_AddBoolToObject(item, "is_legendary", pokemon_species_detail->is_legendary) == NULL) {
    goto fail; //Bool
    }
    }


    // pokemon_species_detail->is_mythical
    if(pokemon_species_detail->is_mythical) {
    if(cJSON_AddBoolToObject(item, "is_mythical", pokemon_species_detail->is_mythical) == NULL) {
    goto fail; //Bool
    }
    }


    // pokemon_species_detail->hatch_counter
    if(pokemon_species_detail->hatch_counter) {
    if(cJSON_AddNumberToObject(item, "hatch_counter", pokemon_species_detail->hatch_counter) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_species_detail->has_gender_differences
    if(pokemon_species_detail->has_gender_differences) {
    if(cJSON_AddBoolToObject(item, "has_gender_differences", pokemon_species_detail->has_gender_differences) == NULL) {
    goto fail; //Bool
    }
    }


    // pokemon_species_detail->forms_switchable
    if(pokemon_species_detail->forms_switchable) {
    if(cJSON_AddBoolToObject(item, "forms_switchable", pokemon_species_detail->forms_switchable) == NULL) {
    goto fail; //Bool
    }
    }


    // pokemon_species_detail->growth_rate
    if (!pokemon_species_detail->growth_rate) {
        goto fail;
    }
    cJSON *growth_rate_local_JSON = growth_rate_summary_convertToJSON(pokemon_species_detail->growth_rate);
    if(growth_rate_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "growth_rate", growth_rate_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_species_detail->pokedex_numbers
    if (!pokemon_species_detail->pokedex_numbers) {
        goto fail;
    }
    cJSON *pokedex_numbers = cJSON_AddArrayToObject(item, "pokedex_numbers");
    if(pokedex_numbers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pokedex_numbersListEntry;
    if (pokemon_species_detail->pokedex_numbers) {
    list_ForEach(pokedex_numbersListEntry, pokemon_species_detail->pokedex_numbers) {
    cJSON *itemLocal = pokemon_dex_entry_convertToJSON(pokedex_numbersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pokedex_numbers, itemLocal);
    }
    }


    // pokemon_species_detail->egg_groups
    if (!pokemon_species_detail->egg_groups) {
        goto fail;
    }
    cJSON *egg_groups = cJSON_AddArrayToObject(item, "egg_groups");
    if(egg_groups == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *egg_groupsListEntry;
    if (pokemon_species_detail->egg_groups) {
    list_ForEach(egg_groupsListEntry, pokemon_species_detail->egg_groups) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(egg_groupsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(egg_groups, itemLocal);
    }
    }


    // pokemon_species_detail->color
    if (!pokemon_species_detail->color) {
        goto fail;
    }
    cJSON *color_local_JSON = pokemon_color_summary_convertToJSON(pokemon_species_detail->color);
    if(color_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "color", color_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_species_detail->shape
    if (!pokemon_species_detail->shape) {
        goto fail;
    }
    cJSON *shape_local_JSON = pokemon_shape_summary_convertToJSON(pokemon_species_detail->shape);
    if(shape_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "shape", shape_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_species_detail->evolves_from_species
    if (!pokemon_species_detail->evolves_from_species) {
        goto fail;
    }
    cJSON *evolves_from_species_local_JSON = pokemon_species_summary_convertToJSON(pokemon_species_detail->evolves_from_species);
    if(evolves_from_species_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "evolves_from_species", evolves_from_species_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_species_detail->evolution_chain
    if (!pokemon_species_detail->evolution_chain) {
        goto fail;
    }
    cJSON *evolution_chain_local_JSON = evolution_chain_summary_convertToJSON(pokemon_species_detail->evolution_chain);
    if(evolution_chain_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "evolution_chain", evolution_chain_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_species_detail->habitat
    if (!pokemon_species_detail->habitat) {
        goto fail;
    }
    cJSON *habitat_local_JSON = pokemon_habitat_summary_convertToJSON(pokemon_species_detail->habitat);
    if(habitat_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "habitat", habitat_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_species_detail->generation
    if (!pokemon_species_detail->generation) {
        goto fail;
    }
    cJSON *generation_local_JSON = generation_summary_convertToJSON(pokemon_species_detail->generation);
    if(generation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "generation", generation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_species_detail->names
    if (!pokemon_species_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (pokemon_species_detail->names) {
    list_ForEach(namesListEntry, pokemon_species_detail->names) {
    cJSON *itemLocal = pokemon_form_detail_form_names_inner_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // pokemon_species_detail->pal_park_encounters
    if (!pokemon_species_detail->pal_park_encounters) {
        goto fail;
    }
    cJSON *pal_park_encounters = cJSON_AddArrayToObject(item, "pal_park_encounters");
    if(pal_park_encounters == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pal_park_encountersListEntry;
    if (pokemon_species_detail->pal_park_encounters) {
    list_ForEach(pal_park_encountersListEntry, pokemon_species_detail->pal_park_encounters) {
    cJSON *itemLocal = pokemon_species_detail_pal_park_encounters_inner_convertToJSON(pal_park_encountersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pal_park_encounters, itemLocal);
    }
    }


    // pokemon_species_detail->form_descriptions
    if (!pokemon_species_detail->form_descriptions) {
        goto fail;
    }
    cJSON *form_descriptions = cJSON_AddArrayToObject(item, "form_descriptions");
    if(form_descriptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *form_descriptionsListEntry;
    if (pokemon_species_detail->form_descriptions) {
    list_ForEach(form_descriptionsListEntry, pokemon_species_detail->form_descriptions) {
    cJSON *itemLocal = pokemon_species_description_convertToJSON(form_descriptionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(form_descriptions, itemLocal);
    }
    }


    // pokemon_species_detail->flavor_text_entries
    if (!pokemon_species_detail->flavor_text_entries) {
        goto fail;
    }
    cJSON *flavor_text_entries = cJSON_AddArrayToObject(item, "flavor_text_entries");
    if(flavor_text_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *flavor_text_entriesListEntry;
    if (pokemon_species_detail->flavor_text_entries) {
    list_ForEach(flavor_text_entriesListEntry, pokemon_species_detail->flavor_text_entries) {
    cJSON *itemLocal = pokemon_species_flavor_text_convertToJSON(flavor_text_entriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(flavor_text_entries, itemLocal);
    }
    }


    // pokemon_species_detail->genera
    if (!pokemon_species_detail->genera) {
        goto fail;
    }
    cJSON *genera = cJSON_AddArrayToObject(item, "genera");
    if(genera == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *generaListEntry;
    if (pokemon_species_detail->genera) {
    list_ForEach(generaListEntry, pokemon_species_detail->genera) {
    cJSON *itemLocal = pokemon_species_detail_genera_inner_convertToJSON(generaListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(genera, itemLocal);
    }
    }


    // pokemon_species_detail->varieties
    if (!pokemon_species_detail->varieties) {
        goto fail;
    }
    cJSON *varieties = cJSON_AddArrayToObject(item, "varieties");
    if(varieties == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *varietiesListEntry;
    if (pokemon_species_detail->varieties) {
    list_ForEach(varietiesListEntry, pokemon_species_detail->varieties) {
    cJSON *itemLocal = pokemon_species_detail_varieties_inner_convertToJSON(varietiesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(varieties, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_species_detail_t *pokemon_species_detail_parseFromJSON(cJSON *pokemon_species_detailJSON){

    pokemon_species_detail_t *pokemon_species_detail_local_var = NULL;

    // define the local variable for pokemon_species_detail->growth_rate
    growth_rate_summary_t *growth_rate_local_nonprim = NULL;

    // define the local list for pokemon_species_detail->pokedex_numbers
    list_t *pokedex_numbersList = NULL;

    // define the local list for pokemon_species_detail->egg_groups
    list_t *egg_groupsList = NULL;

    // define the local variable for pokemon_species_detail->color
    pokemon_color_summary_t *color_local_nonprim = NULL;

    // define the local variable for pokemon_species_detail->shape
    pokemon_shape_summary_t *shape_local_nonprim = NULL;

    // define the local variable for pokemon_species_detail->evolves_from_species
    pokemon_species_summary_t *evolves_from_species_local_nonprim = NULL;

    // define the local variable for pokemon_species_detail->evolution_chain
    evolution_chain_summary_t *evolution_chain_local_nonprim = NULL;

    // define the local variable for pokemon_species_detail->habitat
    pokemon_habitat_summary_t *habitat_local_nonprim = NULL;

    // define the local variable for pokemon_species_detail->generation
    generation_summary_t *generation_local_nonprim = NULL;

    // define the local list for pokemon_species_detail->names
    list_t *namesList = NULL;

    // define the local list for pokemon_species_detail->pal_park_encounters
    list_t *pal_park_encountersList = NULL;

    // define the local list for pokemon_species_detail->form_descriptions
    list_t *form_descriptionsList = NULL;

    // define the local list for pokemon_species_detail->flavor_text_entries
    list_t *flavor_text_entriesList = NULL;

    // define the local list for pokemon_species_detail->genera
    list_t *generaList = NULL;

    // define the local list for pokemon_species_detail->varieties
    list_t *varietiesList = NULL;

    // pokemon_species_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "id");
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

    // pokemon_species_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "name");
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

    // pokemon_species_detail->order
    cJSON *order = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "order");
    if (cJSON_IsNull(order)) {
        order = NULL;
    }
    if (order) { 
    if(!cJSON_IsNumber(order))
    {
    goto end; //Numeric
    }
    }

    // pokemon_species_detail->gender_rate
    cJSON *gender_rate = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "gender_rate");
    if (cJSON_IsNull(gender_rate)) {
        gender_rate = NULL;
    }
    if (gender_rate) { 
    if(!cJSON_IsNumber(gender_rate))
    {
    goto end; //Numeric
    }
    }

    // pokemon_species_detail->capture_rate
    cJSON *capture_rate = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "capture_rate");
    if (cJSON_IsNull(capture_rate)) {
        capture_rate = NULL;
    }
    if (capture_rate) { 
    if(!cJSON_IsNumber(capture_rate))
    {
    goto end; //Numeric
    }
    }

    // pokemon_species_detail->base_happiness
    cJSON *base_happiness = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "base_happiness");
    if (cJSON_IsNull(base_happiness)) {
        base_happiness = NULL;
    }
    if (base_happiness) { 
    if(!cJSON_IsNumber(base_happiness))
    {
    goto end; //Numeric
    }
    }

    // pokemon_species_detail->is_baby
    cJSON *is_baby = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "is_baby");
    if (cJSON_IsNull(is_baby)) {
        is_baby = NULL;
    }
    if (is_baby) { 
    if(!cJSON_IsBool(is_baby))
    {
    goto end; //Bool
    }
    }

    // pokemon_species_detail->is_legendary
    cJSON *is_legendary = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "is_legendary");
    if (cJSON_IsNull(is_legendary)) {
        is_legendary = NULL;
    }
    if (is_legendary) { 
    if(!cJSON_IsBool(is_legendary))
    {
    goto end; //Bool
    }
    }

    // pokemon_species_detail->is_mythical
    cJSON *is_mythical = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "is_mythical");
    if (cJSON_IsNull(is_mythical)) {
        is_mythical = NULL;
    }
    if (is_mythical) { 
    if(!cJSON_IsBool(is_mythical))
    {
    goto end; //Bool
    }
    }

    // pokemon_species_detail->hatch_counter
    cJSON *hatch_counter = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "hatch_counter");
    if (cJSON_IsNull(hatch_counter)) {
        hatch_counter = NULL;
    }
    if (hatch_counter) { 
    if(!cJSON_IsNumber(hatch_counter))
    {
    goto end; //Numeric
    }
    }

    // pokemon_species_detail->has_gender_differences
    cJSON *has_gender_differences = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "has_gender_differences");
    if (cJSON_IsNull(has_gender_differences)) {
        has_gender_differences = NULL;
    }
    if (has_gender_differences) { 
    if(!cJSON_IsBool(has_gender_differences))
    {
    goto end; //Bool
    }
    }

    // pokemon_species_detail->forms_switchable
    cJSON *forms_switchable = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "forms_switchable");
    if (cJSON_IsNull(forms_switchable)) {
        forms_switchable = NULL;
    }
    if (forms_switchable) { 
    if(!cJSON_IsBool(forms_switchable))
    {
    goto end; //Bool
    }
    }

    // pokemon_species_detail->growth_rate
    cJSON *growth_rate = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "growth_rate");
    if (cJSON_IsNull(growth_rate)) {
        growth_rate = NULL;
    }
    if (!growth_rate) {
        goto end;
    }

    
    growth_rate_local_nonprim = growth_rate_summary_parseFromJSON(growth_rate); //nonprimitive

    // pokemon_species_detail->pokedex_numbers
    cJSON *pokedex_numbers = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "pokedex_numbers");
    if (cJSON_IsNull(pokedex_numbers)) {
        pokedex_numbers = NULL;
    }
    if (!pokedex_numbers) {
        goto end;
    }

    
    cJSON *pokedex_numbers_local_nonprimitive = NULL;
    if(!cJSON_IsArray(pokedex_numbers)){
        goto end; //nonprimitive container
    }

    pokedex_numbersList = list_createList();

    cJSON_ArrayForEach(pokedex_numbers_local_nonprimitive,pokedex_numbers )
    {
        if(!cJSON_IsObject(pokedex_numbers_local_nonprimitive)){
            goto end;
        }
        pokemon_dex_entry_t *pokedex_numbersItem = pokemon_dex_entry_parseFromJSON(pokedex_numbers_local_nonprimitive);

        list_addElement(pokedex_numbersList, pokedex_numbersItem);
    }

    // pokemon_species_detail->egg_groups
    cJSON *egg_groups = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "egg_groups");
    if (cJSON_IsNull(egg_groups)) {
        egg_groups = NULL;
    }
    if (!egg_groups) {
        goto end;
    }

    
    cJSON *egg_groups_local_nonprimitive = NULL;
    if(!cJSON_IsArray(egg_groups)){
        goto end; //nonprimitive container
    }

    egg_groupsList = list_createList();

    cJSON_ArrayForEach(egg_groups_local_nonprimitive,egg_groups )
    {
        if(!cJSON_IsObject(egg_groups_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_pokemon_t *egg_groupsItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(egg_groups_local_nonprimitive);

        list_addElement(egg_groupsList, egg_groupsItem);
    }

    // pokemon_species_detail->color
    cJSON *color = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "color");
    if (cJSON_IsNull(color)) {
        color = NULL;
    }
    if (!color) {
        goto end;
    }

    
    color_local_nonprim = pokemon_color_summary_parseFromJSON(color); //nonprimitive

    // pokemon_species_detail->shape
    cJSON *shape = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "shape");
    if (cJSON_IsNull(shape)) {
        shape = NULL;
    }
    if (!shape) {
        goto end;
    }

    
    shape_local_nonprim = pokemon_shape_summary_parseFromJSON(shape); //nonprimitive

    // pokemon_species_detail->evolves_from_species
    cJSON *evolves_from_species = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "evolves_from_species");
    if (cJSON_IsNull(evolves_from_species)) {
        evolves_from_species = NULL;
    }
    if (!evolves_from_species) {
        goto end;
    }

    
    evolves_from_species_local_nonprim = pokemon_species_summary_parseFromJSON(evolves_from_species); //nonprimitive

    // pokemon_species_detail->evolution_chain
    cJSON *evolution_chain = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "evolution_chain");
    if (cJSON_IsNull(evolution_chain)) {
        evolution_chain = NULL;
    }
    if (!evolution_chain) {
        goto end;
    }

    
    evolution_chain_local_nonprim = evolution_chain_summary_parseFromJSON(evolution_chain); //nonprimitive

    // pokemon_species_detail->habitat
    cJSON *habitat = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "habitat");
    if (cJSON_IsNull(habitat)) {
        habitat = NULL;
    }
    if (!habitat) {
        goto end;
    }

    
    habitat_local_nonprim = pokemon_habitat_summary_parseFromJSON(habitat); //nonprimitive

    // pokemon_species_detail->generation
    cJSON *generation = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "generation");
    if (cJSON_IsNull(generation)) {
        generation = NULL;
    }
    if (!generation) {
        goto end;
    }

    
    generation_local_nonprim = generation_summary_parseFromJSON(generation); //nonprimitive

    // pokemon_species_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "names");
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
        pokemon_form_detail_form_names_inner_t *namesItem = pokemon_form_detail_form_names_inner_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // pokemon_species_detail->pal_park_encounters
    cJSON *pal_park_encounters = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "pal_park_encounters");
    if (cJSON_IsNull(pal_park_encounters)) {
        pal_park_encounters = NULL;
    }
    if (!pal_park_encounters) {
        goto end;
    }

    
    cJSON *pal_park_encounters_local_nonprimitive = NULL;
    if(!cJSON_IsArray(pal_park_encounters)){
        goto end; //nonprimitive container
    }

    pal_park_encountersList = list_createList();

    cJSON_ArrayForEach(pal_park_encounters_local_nonprimitive,pal_park_encounters )
    {
        if(!cJSON_IsObject(pal_park_encounters_local_nonprimitive)){
            goto end;
        }
        pokemon_species_detail_pal_park_encounters_inner_t *pal_park_encountersItem = pokemon_species_detail_pal_park_encounters_inner_parseFromJSON(pal_park_encounters_local_nonprimitive);

        list_addElement(pal_park_encountersList, pal_park_encountersItem);
    }

    // pokemon_species_detail->form_descriptions
    cJSON *form_descriptions = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "form_descriptions");
    if (cJSON_IsNull(form_descriptions)) {
        form_descriptions = NULL;
    }
    if (!form_descriptions) {
        goto end;
    }

    
    cJSON *form_descriptions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(form_descriptions)){
        goto end; //nonprimitive container
    }

    form_descriptionsList = list_createList();

    cJSON_ArrayForEach(form_descriptions_local_nonprimitive,form_descriptions )
    {
        if(!cJSON_IsObject(form_descriptions_local_nonprimitive)){
            goto end;
        }
        pokemon_species_description_t *form_descriptionsItem = pokemon_species_description_parseFromJSON(form_descriptions_local_nonprimitive);

        list_addElement(form_descriptionsList, form_descriptionsItem);
    }

    // pokemon_species_detail->flavor_text_entries
    cJSON *flavor_text_entries = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "flavor_text_entries");
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
        pokemon_species_flavor_text_t *flavor_text_entriesItem = pokemon_species_flavor_text_parseFromJSON(flavor_text_entries_local_nonprimitive);

        list_addElement(flavor_text_entriesList, flavor_text_entriesItem);
    }

    // pokemon_species_detail->genera
    cJSON *genera = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "genera");
    if (cJSON_IsNull(genera)) {
        genera = NULL;
    }
    if (!genera) {
        goto end;
    }

    
    cJSON *genera_local_nonprimitive = NULL;
    if(!cJSON_IsArray(genera)){
        goto end; //nonprimitive container
    }

    generaList = list_createList();

    cJSON_ArrayForEach(genera_local_nonprimitive,genera )
    {
        if(!cJSON_IsObject(genera_local_nonprimitive)){
            goto end;
        }
        pokemon_species_detail_genera_inner_t *generaItem = pokemon_species_detail_genera_inner_parseFromJSON(genera_local_nonprimitive);

        list_addElement(generaList, generaItem);
    }

    // pokemon_species_detail->varieties
    cJSON *varieties = cJSON_GetObjectItemCaseSensitive(pokemon_species_detailJSON, "varieties");
    if (cJSON_IsNull(varieties)) {
        varieties = NULL;
    }
    if (!varieties) {
        goto end;
    }

    
    cJSON *varieties_local_nonprimitive = NULL;
    if(!cJSON_IsArray(varieties)){
        goto end; //nonprimitive container
    }

    varietiesList = list_createList();

    cJSON_ArrayForEach(varieties_local_nonprimitive,varieties )
    {
        if(!cJSON_IsObject(varieties_local_nonprimitive)){
            goto end;
        }
        pokemon_species_detail_varieties_inner_t *varietiesItem = pokemon_species_detail_varieties_inner_parseFromJSON(varieties_local_nonprimitive);

        list_addElement(varietiesList, varietiesItem);
    }


    pokemon_species_detail_local_var = pokemon_species_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        order ? order->valuedouble : 0,
        gender_rate ? gender_rate->valuedouble : 0,
        capture_rate ? capture_rate->valuedouble : 0,
        base_happiness ? base_happiness->valuedouble : 0,
        is_baby ? is_baby->valueint : 0,
        is_legendary ? is_legendary->valueint : 0,
        is_mythical ? is_mythical->valueint : 0,
        hatch_counter ? hatch_counter->valuedouble : 0,
        has_gender_differences ? has_gender_differences->valueint : 0,
        forms_switchable ? forms_switchable->valueint : 0,
        growth_rate_local_nonprim,
        pokedex_numbersList,
        egg_groupsList,
        color_local_nonprim,
        shape_local_nonprim,
        evolves_from_species_local_nonprim,
        evolution_chain_local_nonprim,
        habitat_local_nonprim,
        generation_local_nonprim,
        namesList,
        pal_park_encountersList,
        form_descriptionsList,
        flavor_text_entriesList,
        generaList,
        varietiesList
        );

    return pokemon_species_detail_local_var;
end:
    if (growth_rate_local_nonprim) {
        growth_rate_summary_free(growth_rate_local_nonprim);
        growth_rate_local_nonprim = NULL;
    }
    if (pokedex_numbersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pokedex_numbersList) {
            pokemon_dex_entry_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pokedex_numbersList);
        pokedex_numbersList = NULL;
    }
    if (egg_groupsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, egg_groupsList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(egg_groupsList);
        egg_groupsList = NULL;
    }
    if (color_local_nonprim) {
        pokemon_color_summary_free(color_local_nonprim);
        color_local_nonprim = NULL;
    }
    if (shape_local_nonprim) {
        pokemon_shape_summary_free(shape_local_nonprim);
        shape_local_nonprim = NULL;
    }
    if (evolves_from_species_local_nonprim) {
        pokemon_species_summary_free(evolves_from_species_local_nonprim);
        evolves_from_species_local_nonprim = NULL;
    }
    if (evolution_chain_local_nonprim) {
        evolution_chain_summary_free(evolution_chain_local_nonprim);
        evolution_chain_local_nonprim = NULL;
    }
    if (habitat_local_nonprim) {
        pokemon_habitat_summary_free(habitat_local_nonprim);
        habitat_local_nonprim = NULL;
    }
    if (generation_local_nonprim) {
        generation_summary_free(generation_local_nonprim);
        generation_local_nonprim = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            pokemon_form_detail_form_names_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (pal_park_encountersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pal_park_encountersList) {
            pokemon_species_detail_pal_park_encounters_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pal_park_encountersList);
        pal_park_encountersList = NULL;
    }
    if (form_descriptionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, form_descriptionsList) {
            pokemon_species_description_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(form_descriptionsList);
        form_descriptionsList = NULL;
    }
    if (flavor_text_entriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, flavor_text_entriesList) {
            pokemon_species_flavor_text_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(flavor_text_entriesList);
        flavor_text_entriesList = NULL;
    }
    if (generaList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, generaList) {
            pokemon_species_detail_genera_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(generaList);
        generaList = NULL;
    }
    if (varietiesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, varietiesList) {
            pokemon_species_detail_varieties_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(varietiesList);
        varietiesList = NULL;
    }
    return NULL;

}
