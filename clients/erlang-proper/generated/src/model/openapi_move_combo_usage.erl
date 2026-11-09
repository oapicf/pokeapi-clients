-module(openapi_move_combo_usage).

-include("openapi.hrl").

-export([openapi_move_combo_usage/0]).

-export([openapi_move_combo_usage/1]).

-export_type([openapi_move_combo_usage/0]).

-type openapi_move_combo_usage() ::
  [ {'use_before', list(openapi_move_summary:openapi_move_summary()) }
  | {'use_after', list(openapi_move_summary:openapi_move_summary()) }
  ].


openapi_move_combo_usage() ->
    openapi_move_combo_usage([]).

openapi_move_combo_usage(Fields) ->
  Default = [ {'use_before', list(openapi_move_summary:openapi_move_summary()) }
            , {'use_after', list(openapi_move_summary:openapi_move_summary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

