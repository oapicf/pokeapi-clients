-module(openapi_move_combos).

-include("openapi.hrl").

-export([openapi_move_combos/0]).

-export([openapi_move_combos/1]).

-export_type([openapi_move_combos/0]).

-type openapi_move_combos() ::
  [ {'normal', openapi_move_combo_usage:openapi_move_combo_usage() }
  | {'super', openapi_move_combo_usage:openapi_move_combo_usage() }
  ].


openapi_move_combos() ->
    openapi_move_combos([]).

openapi_move_combos(Fields) ->
  Default = [ {'normal', openapi_move_combo_usage:openapi_move_combo_usage() }
            , {'super', openapi_move_combo_usage:openapi_move_combo_usage() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

