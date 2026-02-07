-module(openapi_pokemon_detail_moves_inner).

-include("openapi.hrl").

-export([openapi_pokemon_detail_moves_inner/0]).

-export([openapi_pokemon_detail_moves_inner/1]).

-export_type([openapi_pokemon_detail_moves_inner/0]).

-type openapi_pokemon_detail_moves_inner() ::
  [ {'move', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  | {'version_group_details', list(openapi_pokemon_detail_moves_inner_version_group_details_inner:openapi_pokemon_detail_moves_inner_version_group_details_inner()) }
  ].


openapi_pokemon_detail_moves_inner() ->
    openapi_pokemon_detail_moves_inner([]).

openapi_pokemon_detail_moves_inner(Fields) ->
  Default = [ {'move', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            , {'version_group_details', list(openapi_pokemon_detail_moves_inner_version_group_details_inner:openapi_pokemon_detail_moves_inner_version_group_details_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

