-module(openapi_pokemon_summary).

-include("openapi.hrl").

-export([openapi_pokemon_summary/0]).

-export([openapi_pokemon_summary/1]).

-export_type([openapi_pokemon_summary/0]).

-type openapi_pokemon_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_pokemon_summary() ->
    openapi_pokemon_summary([]).

openapi_pokemon_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

