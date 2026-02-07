-module(openapi_location_area_detail_pokemon_encounters_inner_version_details_inner).

-export([encode/1]).

-export_type([openapi_location_area_detail_pokemon_encounters_inner_version_details_inner/0]).

-type openapi_location_area_detail_pokemon_encounters_inner_version_details_inner() ::
    #{ 'version' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon(),
       'max_chance' := integer(),
       'encounter_details' := openapi_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details:openapi_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details()
     }.

encode(#{ 'version' := Version,
          'max_chance' := MaxChance,
          'encounter_details' := EncounterDetails
        }) ->
    #{ 'version' => Version,
       'max_chance' => MaxChance,
       'encounter_details' => EncounterDetails
     }.
