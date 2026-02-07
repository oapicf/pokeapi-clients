-module(openapi_pokemon_detail_cries).

-export([encode/1]).

-export_type([openapi_pokemon_detail_cries/0]).

-type openapi_pokemon_detail_cries() ::
    #{ 'latest' := openapi_u_ri:openapi_u_ri(),
       'legacy' := openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'latest' := Latest,
          'legacy' := Legacy
        }) ->
    #{ 'latest' => Latest,
       'legacy' => Legacy
     }.
