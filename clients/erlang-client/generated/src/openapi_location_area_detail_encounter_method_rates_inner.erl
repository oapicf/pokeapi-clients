-module(openapi_location_area_detail_encounter_method_rates_inner).

-export([encode/1]).

-export_type([openapi_location_area_detail_encounter_method_rates_inner/0]).

-type openapi_location_area_detail_encounter_method_rates_inner() ::
    #{ 'encounter_method' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon(),
       'version_details' := list()
     }.

encode(#{ 'encounter_method' := EncounterMethod,
          'version_details' := VersionDetails
        }) ->
    #{ 'encounter_method' => EncounterMethod,
       'version_details' => VersionDetails
     }.
