-module(openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner).

-export([encode/1]).

-export_type([openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner/0]).

-type openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner() ::
    #{ 'chance' := integer(),
       'condition_values' := list(),
       'max_level' := integer(),
       'method' := openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method:openapi_pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method(),
       'min_level' := integer()
     }.

encode(#{ 'chance' := Chance,
          'condition_values' := ConditionValues,
          'max_level' := MaxLevel,
          'method' := Method,
          'min_level' := MinLevel
        }) ->
    #{ 'chance' => Chance,
       'condition_values' => ConditionValues,
       'max_level' => MaxLevel,
       'method' => Method,
       'min_level' => MinLevel
     }.
