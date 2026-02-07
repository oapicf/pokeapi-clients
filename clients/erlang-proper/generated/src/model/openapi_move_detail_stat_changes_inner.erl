-module(openapi_move_detail_stat_changes_inner).

-include("openapi.hrl").

-export([openapi_move_detail_stat_changes_inner/0]).

-export([openapi_move_detail_stat_changes_inner/1]).

-export_type([openapi_move_detail_stat_changes_inner/0]).

-type openapi_move_detail_stat_changes_inner() ::
  [ {'change', integer() }
  | {'stat', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_move_detail_stat_changes_inner() ->
    openapi_move_detail_stat_changes_inner([]).

openapi_move_detail_stat_changes_inner(Fields) ->
  Default = [ {'change', integer() }
            , {'stat', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

