-module(openapi_pokemon_held_item_version).

-include("openapi.hrl").

-export([openapi_pokemon_held_item_version/0]).

-export([openapi_pokemon_held_item_version/1]).

-export_type([openapi_pokemon_held_item_version/0]).

-type openapi_pokemon_held_item_version() ::
  [ {'rarity', integer() }
  | {'version', openapi_version_summary:openapi_version_summary() }
  ].


openapi_pokemon_held_item_version() ->
    openapi_pokemon_held_item_version([]).

openapi_pokemon_held_item_version(Fields) ->
  Default = [ {'rarity', integer() }
            , {'version', openapi_version_summary:openapi_version_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

