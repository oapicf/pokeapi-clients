-module(openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner).

-export([encode/1]).

-export_type([openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner/0]).

-type openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner() ::
    #{ 'encounter_details' := list(),
       'max_chance' := integer(),
       'version' := openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_version:openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_version()
     }.

encode(#{ 'encounter_details' := EncounterDetails,
          'max_chance' := MaxChance,
          'version' := Version
        }) ->
    #{ 'encounter_details' => EncounterDetails,
       'max_chance' => MaxChance,
       'version' => Version
     }.
