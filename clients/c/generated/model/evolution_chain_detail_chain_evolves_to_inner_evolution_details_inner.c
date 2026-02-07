#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner.h"



static evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_create_internal(
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *gender,
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *held_item,
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *item,
    object_t *known_move,
    object_t *known_move_type,
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *location,
    int min_affection,
    int min_beauty,
    int min_happiness,
    int min_level,
    int needs_overworld_rain,
    char *party_species,
    char *party_type,
    char *relative_physical_stats,
    char *time_of_day,
    char *trade_species,
    ability_detail_pokemon_inner_pokemon_t *trigger,
    int turn_upside_down
    ) {
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var = malloc(sizeof(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t));
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var) {
        return NULL;
    }
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->gender = gender;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->held_item = held_item;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->item = item;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->known_move = known_move;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->known_move_type = known_move_type;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->location = location;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->min_affection = min_affection;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->min_beauty = min_beauty;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->min_happiness = min_happiness;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->min_level = min_level;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->needs_overworld_rain = needs_overworld_rain;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->party_species = party_species;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->party_type = party_type;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->relative_physical_stats = relative_physical_stats;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->time_of_day = time_of_day;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->trade_species = trade_species;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->trigger = trigger;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->turn_upside_down = turn_upside_down;

    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var->_library_owned = 1;
    return evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var;
}

__attribute__((deprecated)) evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_create(
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *gender,
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *held_item,
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *item,
    object_t *known_move,
    object_t *known_move_type,
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *location,
    int min_affection,
    int min_beauty,
    int min_happiness,
    int min_level,
    int needs_overworld_rain,
    char *party_species,
    char *party_type,
    char *relative_physical_stats,
    char *time_of_day,
    char *trade_species,
    ability_detail_pokemon_inner_pokemon_t *trigger,
    int turn_upside_down
    ) {
    return evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_create_internal (
        gender,
        held_item,
        item,
        known_move,
        known_move_type,
        location,
        min_affection,
        min_beauty,
        min_happiness,
        min_level,
        needs_overworld_rain,
        party_species,
        party_type,
        relative_physical_stats,
        time_of_day,
        trade_species,
        trigger,
        turn_upside_down
        );
}

void evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner) {
    if(NULL == evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner){
        return ;
    }
    if(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->gender) {
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->gender);
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->gender = NULL;
    }
    if (evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->held_item) {
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->held_item);
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->held_item = NULL;
    }
    if (evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->item) {
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->item);
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->item = NULL;
    }
    if (evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->known_move) {
        object_free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->known_move);
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->known_move = NULL;
    }
    if (evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->known_move_type) {
        object_free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->known_move_type);
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->known_move_type = NULL;
    }
    if (evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->location) {
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->location);
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->location = NULL;
    }
    if (evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->party_species) {
        free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->party_species);
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->party_species = NULL;
    }
    if (evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->party_type) {
        free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->party_type);
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->party_type = NULL;
    }
    if (evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->relative_physical_stats) {
        free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->relative_physical_stats);
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->relative_physical_stats = NULL;
    }
    if (evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->time_of_day) {
        free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->time_of_day);
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->time_of_day = NULL;
    }
    if (evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->trade_species) {
        free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->trade_species);
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->trade_species = NULL;
    }
    if (evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->trigger) {
        ability_detail_pokemon_inner_pokemon_free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->trigger);
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->trigger = NULL;
    }
    free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner);
}

cJSON *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_convertToJSON(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner) {
    cJSON *item = cJSON_CreateObject();

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->gender
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->gender) {
        goto fail;
    }
    cJSON *gender_local_JSON = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_convertToJSON(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->gender);
    if(gender_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "gender", gender_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->held_item
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->held_item) {
        goto fail;
    }
    cJSON *held_item_local_JSON = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_convertToJSON(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->held_item);
    if(held_item_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "held_item", held_item_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->item
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->item) {
        goto fail;
    }
    cJSON *item_local_JSON = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_convertToJSON(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->item);
    if(item_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "item", item_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->known_move
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->known_move) {
        goto fail;
    }
    cJSON *known_move_object = object_convertToJSON(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->known_move);
    if(known_move_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "known_move", known_move_object);
    if(item->child == NULL) {
    goto fail;
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->known_move_type
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->known_move_type) {
        goto fail;
    }
    cJSON *known_move_type_object = object_convertToJSON(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->known_move_type);
    if(known_move_type_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "known_move_type", known_move_type_object);
    if(item->child == NULL) {
    goto fail;
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->location
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->location) {
        goto fail;
    }
    cJSON *location_local_JSON = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_convertToJSON(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->location);
    if(location_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "location", location_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->min_affection
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->min_affection) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "min_affection", evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->min_affection) == NULL) {
    goto fail; //Numeric
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->min_beauty
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->min_beauty) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "min_beauty", evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->min_beauty) == NULL) {
    goto fail; //Numeric
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->min_happiness
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->min_happiness) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "min_happiness", evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->min_happiness) == NULL) {
    goto fail; //Numeric
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->min_level
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->min_level) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "min_level", evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->min_level) == NULL) {
    goto fail; //Numeric
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->needs_overworld_rain
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->needs_overworld_rain) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "needs_overworld_rain", evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->needs_overworld_rain) == NULL) {
    goto fail; //Bool
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->party_species
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->party_species) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "party_species", evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->party_species) == NULL) {
    goto fail; //String
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->party_type
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->party_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "party_type", evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->party_type) == NULL) {
    goto fail; //String
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->relative_physical_stats
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->relative_physical_stats) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "relative_physical_stats", evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->relative_physical_stats) == NULL) {
    goto fail; //String
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->time_of_day
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->time_of_day) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "time_of_day", evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->time_of_day) == NULL) {
    goto fail; //String
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->trade_species
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->trade_species) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "trade_species", evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->trade_species) == NULL) {
    goto fail; //String
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->trigger
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->trigger) {
        goto fail;
    }
    cJSON *trigger_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->trigger);
    if(trigger_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "trigger", trigger_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->turn_upside_down
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->turn_upside_down) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "turn_upside_down", evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->turn_upside_down) == NULL) {
    goto fail; //Bool
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_parseFromJSON(cJSON *evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON){

    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var = NULL;

    // define the local variable for evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->gender
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *gender_local_nonprim = NULL;

    // define the local variable for evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->held_item
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *held_item_local_nonprim = NULL;

    // define the local variable for evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->item
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *item_local_nonprim = NULL;

    // define the local variable for evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->location
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *location_local_nonprim = NULL;

    // define the local variable for evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->trigger
    ability_detail_pokemon_inner_pokemon_t *trigger_local_nonprim = NULL;

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->gender
    cJSON *gender = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "gender");
    if (cJSON_IsNull(gender)) {
        gender = NULL;
    }
    if (!gender) {
        goto end;
    }

    
    gender_local_nonprim = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_parseFromJSON(gender); //nonprimitive

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->held_item
    cJSON *held_item = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "held_item");
    if (cJSON_IsNull(held_item)) {
        held_item = NULL;
    }
    if (!held_item) {
        goto end;
    }

    
    held_item_local_nonprim = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_parseFromJSON(held_item); //nonprimitive

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->item
    cJSON *item = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "item");
    if (cJSON_IsNull(item)) {
        item = NULL;
    }
    if (!item) {
        goto end;
    }

    
    item_local_nonprim = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_parseFromJSON(item); //nonprimitive

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->known_move
    cJSON *known_move = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "known_move");
    if (cJSON_IsNull(known_move)) {
        known_move = NULL;
    }
    if (!known_move) {
        goto end;
    }

    object_t *known_move_local_object = NULL;
    
    known_move_local_object = object_parseFromJSON(known_move); //object

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->known_move_type
    cJSON *known_move_type = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "known_move_type");
    if (cJSON_IsNull(known_move_type)) {
        known_move_type = NULL;
    }
    if (!known_move_type) {
        goto end;
    }

    object_t *known_move_type_local_object = NULL;
    
    known_move_type_local_object = object_parseFromJSON(known_move_type); //object

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->location
    cJSON *location = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "location");
    if (cJSON_IsNull(location)) {
        location = NULL;
    }
    if (!location) {
        goto end;
    }

    
    location_local_nonprim = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_parseFromJSON(location); //nonprimitive

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->min_affection
    cJSON *min_affection = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "min_affection");
    if (cJSON_IsNull(min_affection)) {
        min_affection = NULL;
    }
    if (!min_affection) {
        goto end;
    }

    
    if(!cJSON_IsNumber(min_affection))
    {
    goto end; //Numeric
    }

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->min_beauty
    cJSON *min_beauty = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "min_beauty");
    if (cJSON_IsNull(min_beauty)) {
        min_beauty = NULL;
    }
    if (!min_beauty) {
        goto end;
    }

    
    if(!cJSON_IsNumber(min_beauty))
    {
    goto end; //Numeric
    }

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->min_happiness
    cJSON *min_happiness = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "min_happiness");
    if (cJSON_IsNull(min_happiness)) {
        min_happiness = NULL;
    }
    if (!min_happiness) {
        goto end;
    }

    
    if(!cJSON_IsNumber(min_happiness))
    {
    goto end; //Numeric
    }

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->min_level
    cJSON *min_level = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "min_level");
    if (cJSON_IsNull(min_level)) {
        min_level = NULL;
    }
    if (!min_level) {
        goto end;
    }

    
    if(!cJSON_IsNumber(min_level))
    {
    goto end; //Numeric
    }

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->needs_overworld_rain
    cJSON *needs_overworld_rain = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "needs_overworld_rain");
    if (cJSON_IsNull(needs_overworld_rain)) {
        needs_overworld_rain = NULL;
    }
    if (!needs_overworld_rain) {
        goto end;
    }

    
    if(!cJSON_IsBool(needs_overworld_rain))
    {
    goto end; //Bool
    }

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->party_species
    cJSON *party_species = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "party_species");
    if (cJSON_IsNull(party_species)) {
        party_species = NULL;
    }
    if (!party_species) {
        goto end;
    }

    
    if(!cJSON_IsString(party_species))
    {
    goto end; //String
    }

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->party_type
    cJSON *party_type = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "party_type");
    if (cJSON_IsNull(party_type)) {
        party_type = NULL;
    }
    if (!party_type) {
        goto end;
    }

    
    if(!cJSON_IsString(party_type))
    {
    goto end; //String
    }

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->relative_physical_stats
    cJSON *relative_physical_stats = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "relative_physical_stats");
    if (cJSON_IsNull(relative_physical_stats)) {
        relative_physical_stats = NULL;
    }
    if (!relative_physical_stats) {
        goto end;
    }

    
    if(!cJSON_IsString(relative_physical_stats))
    {
    goto end; //String
    }

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->time_of_day
    cJSON *time_of_day = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "time_of_day");
    if (cJSON_IsNull(time_of_day)) {
        time_of_day = NULL;
    }
    if (!time_of_day) {
        goto end;
    }

    
    if(!cJSON_IsString(time_of_day))
    {
    goto end; //String
    }

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->trade_species
    cJSON *trade_species = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "trade_species");
    if (cJSON_IsNull(trade_species)) {
        trade_species = NULL;
    }
    if (!trade_species) {
        goto end;
    }

    
    if(!cJSON_IsString(trade_species))
    {
    goto end; //String
    }

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->trigger
    cJSON *trigger = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "trigger");
    if (cJSON_IsNull(trigger)) {
        trigger = NULL;
    }
    if (!trigger) {
        goto end;
    }

    
    trigger_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(trigger); //nonprimitive

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner->turn_upside_down
    cJSON *turn_upside_down = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON, "turn_upside_down");
    if (cJSON_IsNull(turn_upside_down)) {
        turn_upside_down = NULL;
    }
    if (!turn_upside_down) {
        goto end;
    }

    
    if(!cJSON_IsBool(turn_upside_down))
    {
    goto end; //Bool
    }


    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_create_internal (
        gender_local_nonprim,
        held_item_local_nonprim,
        item_local_nonprim,
        known_move_local_object,
        known_move_type_local_object,
        location_local_nonprim,
        min_affection->valuedouble,
        min_beauty->valuedouble,
        min_happiness->valuedouble,
        min_level->valuedouble,
        needs_overworld_rain->valueint,
        strdup(party_species->valuestring),
        strdup(party_type->valuestring),
        strdup(relative_physical_stats->valuestring),
        strdup(time_of_day->valuestring),
        strdup(trade_species->valuestring),
        trigger_local_nonprim,
        turn_upside_down->valueint
        );

    return evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_local_var;
end:
    if (gender_local_nonprim) {
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_free(gender_local_nonprim);
        gender_local_nonprim = NULL;
    }
    if (held_item_local_nonprim) {
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_free(held_item_local_nonprim);
        held_item_local_nonprim = NULL;
    }
    if (item_local_nonprim) {
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_free(item_local_nonprim);
        item_local_nonprim = NULL;
    }
    if (location_local_nonprim) {
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_free(location_local_nonprim);
        location_local_nonprim = NULL;
    }
    if (trigger_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(trigger_local_nonprim);
        trigger_local_nonprim = NULL;
    }
    return NULL;

}
