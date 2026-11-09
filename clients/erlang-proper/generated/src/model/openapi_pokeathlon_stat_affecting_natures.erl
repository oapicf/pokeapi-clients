-module(openapi_pokeathlon_stat_affecting_natures).

-include("openapi.hrl").

-export([openapi_pokeathlon_stat_affecting_natures/0]).

-export([openapi_pokeathlon_stat_affecting_natures/1]).

-export_type([openapi_pokeathlon_stat_affecting_natures/0]).

-type openapi_pokeathlon_stat_affecting_natures() ::
  [ {'increase', list(openapi_pokeathlon_stat_affecting_nature:openapi_pokeathlon_stat_affecting_nature()) }
  | {'decrease', list(openapi_pokeathlon_stat_affecting_nature:openapi_pokeathlon_stat_affecting_nature()) }
  ].


openapi_pokeathlon_stat_affecting_natures() ->
    openapi_pokeathlon_stat_affecting_natures([]).

openapi_pokeathlon_stat_affecting_natures(Fields) ->
  Default = [ {'increase', list(openapi_pokeathlon_stat_affecting_nature:openapi_pokeathlon_stat_affecting_nature()) }
            , {'decrease', list(openapi_pokeathlon_stat_affecting_nature:openapi_pokeathlon_stat_affecting_nature()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

