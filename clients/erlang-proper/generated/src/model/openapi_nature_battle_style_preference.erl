-module(openapi_nature_battle_style_preference).

-include("openapi.hrl").

-export([openapi_nature_battle_style_preference/0]).

-export([openapi_nature_battle_style_preference/1]).

-export_type([openapi_nature_battle_style_preference/0]).

-type openapi_nature_battle_style_preference() ::
  [ {'low_hp_preference', integer() }
  | {'high_hp_preference', integer() }
  | {'move_battle_style', openapi_move_battle_style_summary:openapi_move_battle_style_summary() }
  ].


openapi_nature_battle_style_preference() ->
    openapi_nature_battle_style_preference([]).

openapi_nature_battle_style_preference(Fields) ->
  Default = [ {'low_hp_preference', integer() }
            , {'high_hp_preference', integer() }
            , {'move_battle_style', openapi_move_battle_style_summary:openapi_move_battle_style_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

