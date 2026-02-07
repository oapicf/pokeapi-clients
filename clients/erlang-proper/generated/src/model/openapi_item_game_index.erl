-module(openapi_item_game_index).

-include("openapi.hrl").

-export([openapi_item_game_index/0]).

-export([openapi_item_game_index/1]).

-export_type([openapi_item_game_index/0]).

-type openapi_item_game_index() ::
  [ {'game_index', integer() }
  | {'generation', openapi_generation_summary:openapi_generation_summary() }
  ].


openapi_item_game_index() ->
    openapi_item_game_index([]).

openapi_item_game_index(Fields) ->
  Default = [ {'game_index', integer() }
            , {'generation', openapi_generation_summary:openapi_generation_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

