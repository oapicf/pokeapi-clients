-module(openapi_item_detail_held_by_pokemon_inner_version_details_inner).

-export([encode/1]).

-export_type([openapi_item_detail_held_by_pokemon_inner_version_details_inner/0]).

-type openapi_item_detail_held_by_pokemon_inner_version_details_inner() ::
    #{ 'rarity' := integer(),
       'version' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'rarity' := Rarity,
          'version' := Version
        }) ->
    #{ 'rarity' => Rarity,
       'version' => Version
     }.
