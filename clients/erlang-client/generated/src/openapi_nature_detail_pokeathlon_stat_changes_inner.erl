-module(openapi_nature_detail_pokeathlon_stat_changes_inner).

-export([encode/1]).

-export_type([openapi_nature_detail_pokeathlon_stat_changes_inner/0]).

-type openapi_nature_detail_pokeathlon_stat_changes_inner() ::
    #{ 'max_change' := integer(),
       'pokeathlon_stat' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'max_change' := MaxChange,
          'pokeathlon_stat' := PokeathlonStat
        }) ->
    #{ 'max_change' => MaxChange,
       'pokeathlon_stat' => PokeathlonStat
     }.
