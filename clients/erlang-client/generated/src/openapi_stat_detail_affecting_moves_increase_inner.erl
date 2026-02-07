-module(openapi_stat_detail_affecting_moves_increase_inner).

-export([encode/1]).

-export_type([openapi_stat_detail_affecting_moves_increase_inner/0]).

-type openapi_stat_detail_affecting_moves_increase_inner() ::
    #{ 'change' := integer(),
       'move' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'change' := Change,
          'move' := Move
        }) ->
    #{ 'change' => Change,
       'move' => Move
     }.
