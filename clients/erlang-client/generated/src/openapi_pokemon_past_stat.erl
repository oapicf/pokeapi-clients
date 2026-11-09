-module(openapi_pokemon_past_stat).

-export([encode/1]).

-export_type([openapi_pokemon_past_stat/0]).

-type openapi_pokemon_past_stat() ::
    #{ 'generation' := openapi_generation_summary:openapi_generation_summary(),
       'stats' := list()
     }.

encode(#{ 'generation' := Generation,
          'stats' := Stats
        }) ->
    #{ 'generation' => Generation,
       'stats' => Stats
     }.
