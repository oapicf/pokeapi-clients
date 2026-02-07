-module(openapi_stat_detail_affecting_moves_increase_inner).

-include("openapi.hrl").

-export([openapi_stat_detail_affecting_moves_increase_inner/0]).

-export([openapi_stat_detail_affecting_moves_increase_inner/1]).

-export_type([openapi_stat_detail_affecting_moves_increase_inner/0]).

-type openapi_stat_detail_affecting_moves_increase_inner() ::
  [ {'change', integer() }
  | {'move', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_stat_detail_affecting_moves_increase_inner() ->
    openapi_stat_detail_affecting_moves_increase_inner([]).

openapi_stat_detail_affecting_moves_increase_inner(Fields) ->
  Default = [ {'change', integer() }
            , {'move', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

