-module(openapi_pokemon_stat).

-include("openapi.hrl").

-export([openapi_pokemon_stat/0]).

-export([openapi_pokemon_stat/1]).

-export_type([openapi_pokemon_stat/0]).

-type openapi_pokemon_stat() ::
  [ {'base_stat', integer() }
  | {'effort', integer() }
  | {'stat', openapi_stat_summary:openapi_stat_summary() }
  ].


openapi_pokemon_stat() ->
    openapi_pokemon_stat([]).

openapi_pokemon_stat(Fields) ->
  Default = [ {'base_stat', integer() }
            , {'effort', integer() }
            , {'stat', openapi_stat_summary:openapi_stat_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

