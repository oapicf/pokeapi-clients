-module(openapi_pokeathlon_stat_detail_affecting_natures_decrease_inner).

-export([encode/1]).

-export_type([openapi_pokeathlon_stat_detail_affecting_natures_decrease_inner/0]).

-type openapi_pokeathlon_stat_detail_affecting_natures_decrease_inner() ::
    #{ 'max_change' := integer(),
       'nature' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'max_change' := MaxChange,
          'nature' := Nature
        }) ->
    #{ 'max_change' => MaxChange,
       'nature' => Nature
     }.
