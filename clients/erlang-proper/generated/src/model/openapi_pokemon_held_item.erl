-module(openapi_pokemon_held_item).

-include("openapi.hrl").

-export([openapi_pokemon_held_item/0]).

-export([openapi_pokemon_held_item/1]).

-export_type([openapi_pokemon_held_item/0]).

-type openapi_pokemon_held_item() ::
  [ {'pokemon', openapi_pokemon_summary:openapi_pokemon_summary() }
  | {'version_details', list(openapi_pokemon_held_item_version:openapi_pokemon_held_item_version()) }
  ].


openapi_pokemon_held_item() ->
    openapi_pokemon_held_item([]).

openapi_pokemon_held_item(Fields) ->
  Default = [ {'pokemon', openapi_pokemon_summary:openapi_pokemon_summary() }
            , {'version_details', list(openapi_pokemon_held_item_version:openapi_pokemon_held_item_version()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

