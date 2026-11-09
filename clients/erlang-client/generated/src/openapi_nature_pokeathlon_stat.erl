-module(openapi_nature_pokeathlon_stat).

-export([encode/1]).

-export_type([openapi_nature_pokeathlon_stat/0]).

-type openapi_nature_pokeathlon_stat() ::
    #{ 'max_change' := integer(),
       'pokeathlon_stat' := openapi_pokeathlon_stat_summary:openapi_pokeathlon_stat_summary()
     }.

encode(#{ 'max_change' := MaxChange,
          'pokeathlon_stat' := PokeathlonStat
        }) ->
    #{ 'max_change' => MaxChange,
       'pokeathlon_stat' => PokeathlonStat
     }.
