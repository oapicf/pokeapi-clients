-module(openapi_pokemon_held_item_summary).

-include("openapi.hrl").

-export([openapi_pokemon_held_item_summary/0]).

-export([openapi_pokemon_held_item_summary/1]).

-export_type([openapi_pokemon_held_item_summary/0]).

-type openapi_pokemon_held_item_summary() ::
  [ {'item', openapi_item_summary:openapi_item_summary() }
  | {'version_details', list(openapi_pokemon_held_item_version:openapi_pokemon_held_item_version()) }
  ].


openapi_pokemon_held_item_summary() ->
    openapi_pokemon_held_item_summary([]).

openapi_pokemon_held_item_summary(Fields) ->
  Default = [ {'item', openapi_item_summary:openapi_item_summary() }
            , {'version_details', list(openapi_pokemon_held_item_version:openapi_pokemon_held_item_version()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

