-module(openapi_pokedex_description).

-include("openapi.hrl").

-export([openapi_pokedex_description/0]).

-export([openapi_pokedex_description/1]).

-export_type([openapi_pokedex_description/0]).

-type openapi_pokedex_description() ::
  [ {'description', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_pokedex_description() ->
    openapi_pokedex_description([]).

openapi_pokedex_description(Fields) ->
  Default = [ {'description', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

