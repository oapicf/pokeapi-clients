-module(openapi_pokedex_summary).

-include("openapi.hrl").

-export([openapi_pokedex_summary/0]).

-export([openapi_pokedex_summary/1]).

-export_type([openapi_pokedex_summary/0]).

-type openapi_pokedex_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_pokedex_summary() ->
    openapi_pokedex_summary([]).

openapi_pokedex_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

