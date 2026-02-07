-module(openapi_move_battle_style_summary).

-include("openapi.hrl").

-export([openapi_move_battle_style_summary/0]).

-export([openapi_move_battle_style_summary/1]).

-export_type([openapi_move_battle_style_summary/0]).

-type openapi_move_battle_style_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_move_battle_style_summary() ->
    openapi_move_battle_style_summary([]).

openapi_move_battle_style_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

