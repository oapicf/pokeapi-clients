-module(openapi_stat_detail).

-include("openapi.hrl").

-export([openapi_stat_detail/0]).

-export([openapi_stat_detail/1]).

-export_type([openapi_stat_detail/0]).

-type openapi_stat_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'game_index', integer() }
  | {'is_battle_only', boolean() }
  | {'affecting_moves', openapi_stat_detail_affecting_moves:openapi_stat_detail_affecting_moves() }
  | {'affecting_natures', openapi_stat_detail_affecting_natures:openapi_stat_detail_affecting_natures() }
  | {'characteristics', list(openapi_characteristic_summary:openapi_characteristic_summary()) }
  | {'move_damage_class', openapi_move_damage_class_summary:openapi_move_damage_class_summary() }
  | {'names', list(openapi_stat_name:openapi_stat_name()) }
  ].


openapi_stat_detail() ->
    openapi_stat_detail([]).

openapi_stat_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'game_index', integer() }
            , {'is_battle_only', boolean() }
            , {'affecting_moves', openapi_stat_detail_affecting_moves:openapi_stat_detail_affecting_moves() }
            , {'affecting_natures', openapi_stat_detail_affecting_natures:openapi_stat_detail_affecting_natures() }
            , {'characteristics', list(openapi_characteristic_summary:openapi_characteristic_summary()) }
            , {'move_damage_class', openapi_move_damage_class_summary:openapi_move_damage_class_summary() }
            , {'names', list(openapi_stat_name:openapi_stat_name()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

