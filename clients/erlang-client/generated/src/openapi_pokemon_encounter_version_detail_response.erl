-module(openapi_pokemon_encounter_version_detail_response).

-export([encode/1]).

-export_type([openapi_pokemon_encounter_version_detail_response/0]).

-type openapi_pokemon_encounter_version_detail_response() ::
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
