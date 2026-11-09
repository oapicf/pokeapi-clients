-module(openapi_pokemon_move).

-include("openapi.hrl").

-export([openapi_pokemon_move/0]).

-export([openapi_pokemon_move/1]).

-export_type([openapi_pokemon_move/0]).

-type openapi_pokemon_move() ::
  [ {'move', openapi_move_summary:openapi_move_summary() }
  | {'version_group_details', list(openapi_pokemon_move_version_group:openapi_pokemon_move_version_group()) }
  ].


openapi_pokemon_move() ->
    openapi_pokemon_move([]).

openapi_pokemon_move(Fields) ->
  Default = [ {'move', openapi_move_summary:openapi_move_summary() }
            , {'version_group_details', list(openapi_pokemon_move_version_group:openapi_pokemon_move_version_group()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

