-module(openapi_pokemon_detail_cries).

-include("openapi.hrl").

-export([openapi_pokemon_detail_cries/0]).

-export([openapi_pokemon_detail_cries/1]).

-export_type([openapi_pokemon_detail_cries/0]).

-type openapi_pokemon_detail_cries() ::
  [ {'latest', openapi_u_ri:openapi_u_ri() }
  | {'legacy', openapi_u_ri:openapi_u_ri() }
  ].


openapi_pokemon_detail_cries() ->
    openapi_pokemon_detail_cries([]).

openapi_pokemon_detail_cries(Fields) ->
  Default = [ {'latest', binary() }
            , {'legacy', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

