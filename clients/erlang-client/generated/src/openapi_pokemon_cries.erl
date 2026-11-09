-module(openapi_pokemon_cries).

-export([encode/1]).

-export_type([openapi_pokemon_cries/0]).

-type openapi_pokemon_cries() ::
    #{ 'latest' := binary(),
       'legacy' := binary()
     }.

encode(#{ 'latest' := Latest,
          'legacy' := Legacy
        }) ->
    #{ 'latest' => Latest,
       'legacy' => Legacy
     }.
