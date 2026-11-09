-module(openapi_location_area_pokemon_encounter_version).

-export([encode/1]).

-export_type([openapi_location_area_pokemon_encounter_version/0]).

-type openapi_location_area_pokemon_encounter_version() ::
    #{ 'version' := openapi_version_summary:openapi_version_summary(),
       'max_chance' := integer(),
       'encounter_details' := list()
     }.

encode(#{ 'version' := Version,
          'max_chance' := MaxChance,
          'encounter_details' := EncounterDetails
        }) ->
    #{ 'version' => Version,
       'max_chance' => MaxChance,
       'encounter_details' => EncounterDetails
     }.
