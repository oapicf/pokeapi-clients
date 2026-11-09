-module(openapi_location_area_encounter_detail).

-export([encode/1]).

-export_type([openapi_location_area_encounter_detail/0]).

-type openapi_location_area_encounter_detail() ::
    #{ 'min_level' := integer(),
       'max_level' := integer(),
       'chance' => integer(),
       'method' => openapi_encounter_method_summary:openapi_encounter_method_summary(),
       'condition_values' := list(),
       'pokemon_details' := openapi_encounter_pokemon_detail:openapi_encounter_pokemon_detail()
     }.

encode(#{ 'min_level' := MinLevel,
          'max_level' := MaxLevel,
          'chance' := Chance,
          'method' := Method,
          'condition_values' := ConditionValues,
          'pokemon_details' := PokemonDetails
        }) ->
    #{ 'min_level' => MinLevel,
       'max_level' => MaxLevel,
       'chance' => Chance,
       'method' => Method,
       'condition_values' => ConditionValues,
       'pokemon_details' => PokemonDetails
     }.
