-module(openapi_pokemon_past_stat).

-include("openapi.hrl").

-export([openapi_pokemon_past_stat/0]).

-export([openapi_pokemon_past_stat/1]).

-export_type([openapi_pokemon_past_stat/0]).

-type openapi_pokemon_past_stat() ::
  [ {'generation', openapi_generation_summary:openapi_generation_summary() }
  | {'stats', list(openapi_pokemon_stat:openapi_pokemon_stat()) }
  ].


openapi_pokemon_past_stat() ->
    openapi_pokemon_past_stat([]).

openapi_pokemon_past_stat(Fields) ->
  Default = [ {'generation', openapi_generation_summary:openapi_generation_summary() }
            , {'stats', list(openapi_pokemon_stat:openapi_pokemon_stat()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

