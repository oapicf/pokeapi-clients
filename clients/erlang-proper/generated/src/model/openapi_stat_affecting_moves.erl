-module(openapi_stat_affecting_moves).

-include("openapi.hrl").

-export([openapi_stat_affecting_moves/0]).

-export([openapi_stat_affecting_moves/1]).

-export_type([openapi_stat_affecting_moves/0]).

-type openapi_stat_affecting_moves() ::
  [ {'increase', list(openapi_move_stat_change:openapi_move_stat_change()) }
  | {'decrease', list(openapi_move_stat_change:openapi_move_stat_change()) }
  ].


openapi_stat_affecting_moves() ->
    openapi_stat_affecting_moves([]).

openapi_stat_affecting_moves(Fields) ->
  Default = [ {'increase', list(openapi_move_stat_change:openapi_move_stat_change()) }
            , {'decrease', list(openapi_move_stat_change:openapi_move_stat_change()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

