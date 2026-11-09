-module(openapi_move_meta_stat_change).

-include("openapi.hrl").

-export([openapi_move_meta_stat_change/0]).

-export([openapi_move_meta_stat_change/1]).

-export_type([openapi_move_meta_stat_change/0]).

-type openapi_move_meta_stat_change() ::
  [ {'change', integer() }
  | {'stat', openapi_stat_summary:openapi_stat_summary() }
  ].


openapi_move_meta_stat_change() ->
    openapi_move_meta_stat_change([]).

openapi_move_meta_stat_change(Fields) ->
  Default = [ {'change', integer(-2147483648, 2147483647) }
            , {'stat', openapi_stat_summary:openapi_stat_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

