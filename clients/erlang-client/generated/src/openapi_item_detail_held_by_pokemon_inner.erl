-module(openapi_item_detail_held_by_pokemon_inner).

-export([encode/1]).

-export_type([openapi_item_detail_held_by_pokemon_inner/0]).

-type openapi_item_detail_held_by_pokemon_inner() ::
    #{ 'pokemon' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon(),
       'version_details' := list()
     }.

encode(#{ 'pokemon' := Pokemon,
          'version_details' := VersionDetails
        }) ->
    #{ 'pokemon' => Pokemon,
       'version-details' => VersionDetails
     }.
