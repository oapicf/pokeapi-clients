-module(openapi_item_detail_held_by_pokemon_inner_version_details_inner).

-include("openapi.hrl").

-export([openapi_item_detail_held_by_pokemon_inner_version_details_inner/0]).

-export([openapi_item_detail_held_by_pokemon_inner_version_details_inner/1]).

-export_type([openapi_item_detail_held_by_pokemon_inner_version_details_inner/0]).

-type openapi_item_detail_held_by_pokemon_inner_version_details_inner() ::
  [ {'rarity', integer() }
  | {'version', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_item_detail_held_by_pokemon_inner_version_details_inner() ->
    openapi_item_detail_held_by_pokemon_inner_version_details_inner([]).

openapi_item_detail_held_by_pokemon_inner_version_details_inner(Fields) ->
  Default = [ {'rarity', integer() }
            , {'version', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

