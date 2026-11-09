-module(openapi_pokemon_held_item_version).

-export([encode/1]).

-export_type([openapi_pokemon_held_item_version/0]).

-type openapi_pokemon_held_item_version() ::
    #{ 'rarity' := integer(),
       'version' := openapi_version_summary:openapi_version_summary()
     }.

encode(#{ 'rarity' := Rarity,
          'version' := Version
        }) ->
    #{ 'rarity' => Rarity,
       'version' => Version
     }.
