-module(openapi_pokemon_encounter_detail_response).

-export([encode/1]).

-export_type([openapi_pokemon_encounter_detail_response/0]).

-type openapi_pokemon_encounter_detail_response() ::
    #{ 'chance' := integer(),
       'condition_values' := list(),
       'max_level' := integer(),
       'method' := openapi_encounter_method_summary:openapi_encounter_method_summary(),
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
