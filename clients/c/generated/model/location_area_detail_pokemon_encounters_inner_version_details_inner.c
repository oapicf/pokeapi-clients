#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "location_area_detail_pokemon_encounters_inner_version_details_inner.h"



static location_area_detail_pokemon_encounters_inner_version_details_inner_t *location_area_detail_pokemon_encounters_inner_version_details_inner_create_internal(
    ability_detail_pokemon_inner_pokemon_t *version,
    int max_chance,
    location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t *encounter_details
    ) {
    location_area_detail_pokemon_encounters_inner_version_details_inner_t *location_area_detail_pokemon_encounters_inner_version_details_inner_local_var = malloc(sizeof(location_area_detail_pokemon_encounters_inner_version_details_inner_t));
    if (!location_area_detail_pokemon_encounters_inner_version_details_inner_local_var) {
        return NULL;
    }
    location_area_detail_pokemon_encounters_inner_version_details_inner_local_var->version = version;
    location_area_detail_pokemon_encounters_inner_version_details_inner_local_var->max_chance = max_chance;
    location_area_detail_pokemon_encounters_inner_version_details_inner_local_var->encounter_details = encounter_details;

    location_area_detail_pokemon_encounters_inner_version_details_inner_local_var->_library_owned = 1;
    return location_area_detail_pokemon_encounters_inner_version_details_inner_local_var;
}

__attribute__((deprecated)) location_area_detail_pokemon_encounters_inner_version_details_inner_t *location_area_detail_pokemon_encounters_inner_version_details_inner_create(
    ability_detail_pokemon_inner_pokemon_t *version,
    int max_chance,
    location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t *encounter_details
    ) {
    return location_area_detail_pokemon_encounters_inner_version_details_inner_create_internal (
        version,
        max_chance,
        encounter_details
        );
}

void location_area_detail_pokemon_encounters_inner_version_details_inner_free(location_area_detail_pokemon_encounters_inner_version_details_inner_t *location_area_detail_pokemon_encounters_inner_version_details_inner) {
    if(NULL == location_area_detail_pokemon_encounters_inner_version_details_inner){
        return ;
    }
    if(location_area_detail_pokemon_encounters_inner_version_details_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "location_area_detail_pokemon_encounters_inner_version_details_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (location_area_detail_pokemon_encounters_inner_version_details_inner->version) {
        ability_detail_pokemon_inner_pokemon_free(location_area_detail_pokemon_encounters_inner_version_details_inner->version);
        location_area_detail_pokemon_encounters_inner_version_details_inner->version = NULL;
    }
    if (location_area_detail_pokemon_encounters_inner_version_details_inner->encounter_details) {
        location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_free(location_area_detail_pokemon_encounters_inner_version_details_inner->encounter_details);
        location_area_detail_pokemon_encounters_inner_version_details_inner->encounter_details = NULL;
    }
    free(location_area_detail_pokemon_encounters_inner_version_details_inner);
}

cJSON *location_area_detail_pokemon_encounters_inner_version_details_inner_convertToJSON(location_area_detail_pokemon_encounters_inner_version_details_inner_t *location_area_detail_pokemon_encounters_inner_version_details_inner) {
    cJSON *item = cJSON_CreateObject();

    // location_area_detail_pokemon_encounters_inner_version_details_inner->version
    if (!location_area_detail_pokemon_encounters_inner_version_details_inner->version) {
        goto fail;
    }
    cJSON *version_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(location_area_detail_pokemon_encounters_inner_version_details_inner->version);
    if(version_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version", version_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // location_area_detail_pokemon_encounters_inner_version_details_inner->max_chance
    if (!location_area_detail_pokemon_encounters_inner_version_details_inner->max_chance) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_chance", location_area_detail_pokemon_encounters_inner_version_details_inner->max_chance) == NULL) {
    goto fail; //Numeric
    }


    // location_area_detail_pokemon_encounters_inner_version_details_inner->encounter_details
    if (!location_area_detail_pokemon_encounters_inner_version_details_inner->encounter_details) {
        goto fail;
    }
    cJSON *encounter_details_local_JSON = location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_convertToJSON(location_area_detail_pokemon_encounters_inner_version_details_inner->encounter_details);
    if(encounter_details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "encounter_details", encounter_details_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

location_area_detail_pokemon_encounters_inner_version_details_inner_t *location_area_detail_pokemon_encounters_inner_version_details_inner_parseFromJSON(cJSON *location_area_detail_pokemon_encounters_inner_version_details_innerJSON){

    location_area_detail_pokemon_encounters_inner_version_details_inner_t *location_area_detail_pokemon_encounters_inner_version_details_inner_local_var = NULL;

    // define the local variable for location_area_detail_pokemon_encounters_inner_version_details_inner->version
    ability_detail_pokemon_inner_pokemon_t *version_local_nonprim = NULL;

    // define the local variable for location_area_detail_pokemon_encounters_inner_version_details_inner->encounter_details
    location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t *encounter_details_local_nonprim = NULL;

    // location_area_detail_pokemon_encounters_inner_version_details_inner->version
    cJSON *version = cJSON_GetObjectItemCaseSensitive(location_area_detail_pokemon_encounters_inner_version_details_innerJSON, "version");
    if (cJSON_IsNull(version)) {
        version = NULL;
    }
    if (!version) {
        goto end;
    }

    
    version_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(version); //nonprimitive

    // location_area_detail_pokemon_encounters_inner_version_details_inner->max_chance
    cJSON *max_chance = cJSON_GetObjectItemCaseSensitive(location_area_detail_pokemon_encounters_inner_version_details_innerJSON, "max_chance");
    if (cJSON_IsNull(max_chance)) {
        max_chance = NULL;
    }
    if (!max_chance) {
        goto end;
    }

    
    if(!cJSON_IsNumber(max_chance))
    {
    goto end; //Numeric
    }

    // location_area_detail_pokemon_encounters_inner_version_details_inner->encounter_details
    cJSON *encounter_details = cJSON_GetObjectItemCaseSensitive(location_area_detail_pokemon_encounters_inner_version_details_innerJSON, "encounter_details");
    if (cJSON_IsNull(encounter_details)) {
        encounter_details = NULL;
    }
    if (!encounter_details) {
        goto end;
    }

    
    encounter_details_local_nonprim = location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_parseFromJSON(encounter_details); //nonprimitive


    location_area_detail_pokemon_encounters_inner_version_details_inner_local_var = location_area_detail_pokemon_encounters_inner_version_details_inner_create_internal (
        version_local_nonprim,
        max_chance->valuedouble,
        encounter_details_local_nonprim
        );

    return location_area_detail_pokemon_encounters_inner_version_details_inner_local_var;
end:
    if (version_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(version_local_nonprim);
        version_local_nonprim = NULL;
    }
    if (encounter_details_local_nonprim) {
        location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_free(encounter_details_local_nonprim);
        encounter_details_local_nonprim = NULL;
    }
    return NULL;

}
