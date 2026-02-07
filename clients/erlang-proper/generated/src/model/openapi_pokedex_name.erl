-module(openapi_pokedex_name).

-include("openapi.hrl").

-export([openapi_pokedex_name/0]).

-export([openapi_pokedex_name/1]).

-export_type([openapi_pokedex_name/0]).

-type openapi_pokedex_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_pokedex_name() ->
    openapi_pokedex_name([]).

openapi_pokedex_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

