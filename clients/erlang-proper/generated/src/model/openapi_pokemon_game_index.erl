-module(openapi_pokemon_game_index).

-include("openapi.hrl").

-export([openapi_pokemon_game_index/0]).

-export([openapi_pokemon_game_index/1]).

-export_type([openapi_pokemon_game_index/0]).

-type openapi_pokemon_game_index() ::
  [ {'game_index', integer() }
  | {'version', openapi_version_summary:openapi_version_summary() }
  ].


openapi_pokemon_game_index() ->
    openapi_pokemon_game_index([]).

openapi_pokemon_game_index(Fields) ->
  Default = [ {'game_index', integer() }
            , {'version', openapi_version_summary:openapi_version_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

