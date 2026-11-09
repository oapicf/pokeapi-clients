-module(openapi_nature_pokeathlon_stat).

-include("openapi.hrl").

-export([openapi_nature_pokeathlon_stat/0]).

-export([openapi_nature_pokeathlon_stat/1]).

-export_type([openapi_nature_pokeathlon_stat/0]).

-type openapi_nature_pokeathlon_stat() ::
  [ {'max_change', integer() }
  | {'pokeathlon_stat', openapi_pokeathlon_stat_summary:openapi_pokeathlon_stat_summary() }
  ].


openapi_nature_pokeathlon_stat() ->
    openapi_nature_pokeathlon_stat([]).

openapi_nature_pokeathlon_stat(Fields) ->
  Default = [ {'max_change', integer(-2147483648, 2147483647) }
            , {'pokeathlon_stat', openapi_pokeathlon_stat_summary:openapi_pokeathlon_stat_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

