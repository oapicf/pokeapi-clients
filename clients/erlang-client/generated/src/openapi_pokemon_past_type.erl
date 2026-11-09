-module(openapi_pokemon_past_type).

-export([encode/1]).

-export_type([openapi_pokemon_past_type/0]).

-type openapi_pokemon_past_type() ::
    #{ 'generation' := openapi_generation_summary:openapi_generation_summary(),
       'types' := list()
     }.

encode(#{ 'generation' := Generation,
          'types' := Types
        }) ->
    #{ 'generation' => Generation,
       'types' => Types
     }.
