-module(openapi_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details).

-export([encode/1]).

-export_type([openapi_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details/0]).

-type openapi_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details() ::
    #{ 'min_level' := integer(),
       'max_level' := integer(),
       'condition_values' => openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon(),
       'chance' := integer(),
       'method' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'min_level' := MinLevel,
          'max_level' := MaxLevel,
          'condition_values' := ConditionValues,
          'chance' := Chance,
          'method' := Method
        }) ->
    #{ 'min_level' => MinLevel,
       'max_level' => MaxLevel,
       'condition_values' => ConditionValues,
       'chance' => Chance,
       'method' => Method
     }.
