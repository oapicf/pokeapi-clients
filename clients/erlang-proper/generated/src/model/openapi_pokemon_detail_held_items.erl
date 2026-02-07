-module(openapi_pokemon_detail_held_items).

-include("openapi.hrl").

-export([openapi_pokemon_detail_held_items/0]).

-export([openapi_pokemon_detail_held_items/1]).

-export_type([openapi_pokemon_detail_held_items/0]).

-type openapi_pokemon_detail_held_items() ::
  [ {'item', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  | {'version_details', list(openapi_item_detail_held_by_pokemon_inner_version_details_inner:openapi_item_detail_held_by_pokemon_inner_version_details_inner()) }
  ].


openapi_pokemon_detail_held_items() ->
    openapi_pokemon_detail_held_items([]).

openapi_pokemon_detail_held_items(Fields) ->
  Default = [ {'item', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            , {'version_details', list(openapi_item_detail_held_by_pokemon_inner_version_details_inner:openapi_item_detail_held_by_pokemon_inner_version_details_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

