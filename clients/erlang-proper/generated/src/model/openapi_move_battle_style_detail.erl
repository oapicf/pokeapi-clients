-module(openapi_move_battle_style_detail).

-include("openapi.hrl").

-export([openapi_move_battle_style_detail/0]).

-export([openapi_move_battle_style_detail/1]).

-export_type([openapi_move_battle_style_detail/0]).

-type openapi_move_battle_style_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'names', list(openapi_move_battle_style_name:openapi_move_battle_style_name()) }
  ].


openapi_move_battle_style_detail() ->
    openapi_move_battle_style_detail([]).

openapi_move_battle_style_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'names', list(openapi_move_battle_style_name:openapi_move_battle_style_name()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

