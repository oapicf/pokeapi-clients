-module(openapi_move_detail_effect_changes_inner_effect_entries_inner).

-include("openapi.hrl").

-export([openapi_move_detail_effect_changes_inner_effect_entries_inner/0]).

-export([openapi_move_detail_effect_changes_inner_effect_entries_inner/1]).

-export_type([openapi_move_detail_effect_changes_inner_effect_entries_inner/0]).

-type openapi_move_detail_effect_changes_inner_effect_entries_inner() ::
  [ {'effect', binary() }
  | {'language', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_move_detail_effect_changes_inner_effect_entries_inner() ->
    openapi_move_detail_effect_changes_inner_effect_entries_inner([]).

openapi_move_detail_effect_changes_inner_effect_entries_inner(Fields) ->
  Default = [ {'effect', binary() }
            , {'language', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

