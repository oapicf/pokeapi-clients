-module(openapi_move_detail_contest_combos).

-include("openapi.hrl").

-export([openapi_move_detail_contest_combos/0]).

-export([openapi_move_detail_contest_combos/1]).

-export_type([openapi_move_detail_contest_combos/0]).

-type openapi_move_detail_contest_combos() ::
  [ {'normal', openapi_move_detail_contest_combos_normal:openapi_move_detail_contest_combos_normal() }
  | {'super', openapi_move_detail_contest_combos_normal:openapi_move_detail_contest_combos_normal() }
  ].


openapi_move_detail_contest_combos() ->
    openapi_move_detail_contest_combos([]).

openapi_move_detail_contest_combos(Fields) ->
  Default = [ {'normal', openapi_move_detail_contest_combos_normal:openapi_move_detail_contest_combos_normal() }
            , {'super', openapi_move_detail_contest_combos_normal:openapi_move_detail_contest_combos_normal() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

