-module(openapi_pokeathlon_stat_affecting_nature).

-export([encode/1]).

-export_type([openapi_pokeathlon_stat_affecting_nature/0]).

-type openapi_pokeathlon_stat_affecting_nature() ::
    #{ 'max_change' := integer(),
       'nature' := openapi_nature_summary:openapi_nature_summary()
     }.

encode(#{ 'max_change' := MaxChange,
          'nature' := Nature
        }) ->
    #{ 'max_change' => MaxChange,
       'nature' => Nature
     }.
