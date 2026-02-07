-module(openapi_move_detail_contest_combos_normal).

-include("openapi.hrl").

-export([openapi_move_detail_contest_combos_normal/0]).

-export([openapi_move_detail_contest_combos_normal/1]).

-export_type([openapi_move_detail_contest_combos_normal/0]).

-type openapi_move_detail_contest_combos_normal() ::
  [ {'use_before', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  | {'use_after', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  ].


openapi_move_detail_contest_combos_normal() ->
    openapi_move_detail_contest_combos_normal([]).

openapi_move_detail_contest_combos_normal(Fields) ->
  Default = [ {'use_before', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            , {'use_after', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

