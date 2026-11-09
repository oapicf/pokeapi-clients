-module(openapi_pokeathlon_stat_affecting_nature).

-include("openapi.hrl").

-export([openapi_pokeathlon_stat_affecting_nature/0]).

-export([openapi_pokeathlon_stat_affecting_nature/1]).

-export_type([openapi_pokeathlon_stat_affecting_nature/0]).

-type openapi_pokeathlon_stat_affecting_nature() ::
  [ {'max_change', integer() }
  | {'nature', openapi_nature_summary:openapi_nature_summary() }
  ].


openapi_pokeathlon_stat_affecting_nature() ->
    openapi_pokeathlon_stat_affecting_nature([]).

openapi_pokeathlon_stat_affecting_nature(Fields) ->
  Default = [ {'max_change', integer(-2147483648, 2147483647) }
            , {'nature', openapi_nature_summary:openapi_nature_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

