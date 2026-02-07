-module(openapi_stat_detail_affecting_moves).

-include("openapi.hrl").

-export([openapi_stat_detail_affecting_moves/0]).

-export([openapi_stat_detail_affecting_moves/1]).

-export_type([openapi_stat_detail_affecting_moves/0]).

-type openapi_stat_detail_affecting_moves() ::
  [ {'increase', list(openapi_stat_detail_affecting_moves_increase_inner:openapi_stat_detail_affecting_moves_increase_inner()) }
  | {'decrease', list(openapi_stat_detail_affecting_moves_increase_inner:openapi_stat_detail_affecting_moves_increase_inner()) }
  ].


openapi_stat_detail_affecting_moves() ->
    openapi_stat_detail_affecting_moves([]).

openapi_stat_detail_affecting_moves(Fields) ->
  Default = [ {'increase', list(openapi_stat_detail_affecting_moves_increase_inner:openapi_stat_detail_affecting_moves_increase_inner()) }
            , {'decrease', list(openapi_stat_detail_affecting_moves_increase_inner:openapi_stat_detail_affecting_moves_increase_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

