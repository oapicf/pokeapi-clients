-module(openapi_move_detail_stat_changes_inner).

-export([encode/1]).

-export_type([openapi_move_detail_stat_changes_inner/0]).

-type openapi_move_detail_stat_changes_inner() ::
    #{ 'change' := integer(),
       'stat' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'change' := Change,
          'stat' := Stat
        }) ->
    #{ 'change' => Change,
       'stat' => Stat
     }.
