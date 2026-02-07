-module(openapi_pokemon_detail_held_items).

-export([encode/1]).

-export_type([openapi_pokemon_detail_held_items/0]).

-type openapi_pokemon_detail_held_items() ::
    #{ 'item' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon(),
       'version_details' := list()
     }.

encode(#{ 'item' := Item,
          'version_details' := VersionDetails
        }) ->
    #{ 'item' => Item,
       'version_details' => VersionDetails
     }.
