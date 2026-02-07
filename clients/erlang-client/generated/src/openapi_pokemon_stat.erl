-module(openapi_pokemon_stat).

-export([encode/1]).

-export_type([openapi_pokemon_stat/0]).

-type openapi_pokemon_stat() ::
    #{ 'base_stat' := integer(),
       'effort' := integer(),
       'stat' := openapi_stat_summary:openapi_stat_summary()
     }.

encode(#{ 'base_stat' := BaseStat,
          'effort' := Effort,
          'stat' := Stat
        }) ->
    #{ 'base_stat' => BaseStat,
       'effort' => Effort,
       'stat' => Stat
     }.
