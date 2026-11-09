-module(openapi_pokemon_cries).

-include("openapi.hrl").

-export([openapi_pokemon_cries/0]).

-export([openapi_pokemon_cries/1]).

-export_type([openapi_pokemon_cries/0]).

-type openapi_pokemon_cries() ::
  [ {'latest', binary() }
  | {'legacy', binary() }
  ].


openapi_pokemon_cries() ->
    openapi_pokemon_cries([]).

openapi_pokemon_cries(Fields) ->
  Default = [ {'latest', binary() }
            , {'legacy', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

