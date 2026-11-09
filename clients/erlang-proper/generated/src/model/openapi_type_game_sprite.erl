-module(openapi_type_game_sprite).

-include("openapi.hrl").

-export([openapi_type_game_sprite/0]).

-export([openapi_type_game_sprite/1]).

-export_type([openapi_type_game_sprite/0]).

-type openapi_type_game_sprite() ::
  [ {'name_icon', binary() }
  | {'symbol_icon', binary() }
  ].


openapi_type_game_sprite() ->
    openapi_type_game_sprite([]).

openapi_type_game_sprite(Fields) ->
  Default = [ {'name_icon', binary() }
            , {'symbol_icon', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

