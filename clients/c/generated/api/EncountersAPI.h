#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/encounter_condition_detail.h"
#include "../model/encounter_condition_value_detail.h"
#include "../model/encounter_method_detail.h"
#include "../model/paginated_encounter_condition_summary_list.h"
#include "../model/paginated_encounter_condition_value_summary_list.h"
#include "../model/paginated_encounter_method_summary_list.h"
#include "../model/pokemon_encounters_retrieve_200_response_inner.h"


// List encounter conditions
//
// Conditions which affect what pokemon might appear in the wild, e.g., day or night.
//
paginated_encounter_condition_summary_list_t*
EncountersAPI_encounterConditionList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get encounter condition
//
// Conditions which affect what pokemon might appear in the wild, e.g., day or night.
//
encounter_condition_detail_t*
EncountersAPI_encounterConditionRetrieve(apiClient_t *apiClient, char *id);


// List encounter condition values
//
// Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
//
paginated_encounter_condition_value_summary_list_t*
EncountersAPI_encounterConditionValueList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get encounter condition value
//
// Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
//
encounter_condition_value_detail_t*
EncountersAPI_encounterConditionValueRetrieve(apiClient_t *apiClient, char *id);


// List encounter methods
//
// Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
//
paginated_encounter_method_summary_list_t*
EncountersAPI_encounterMethodList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get encounter method
//
// Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
//
encounter_method_detail_t*
EncountersAPI_encounterMethodRetrieve(apiClient_t *apiClient, char *id);


// Get pokemon encounter
//
// Handles Pokemon Encounters as a sub-resource.
//
list_t*
EncountersAPI_pokemonEncountersRetrieve(apiClient_t *apiClient, char *pokemon_id);


