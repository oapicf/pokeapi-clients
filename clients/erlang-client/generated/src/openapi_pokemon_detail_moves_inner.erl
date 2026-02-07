-module(openapi_pokemon_detail_moves_inner).

-export([encode/1]).

-export_type([openapi_pokemon_detail_moves_inner/0]).

-type openapi_pokemon_detail_moves_inner() ::
    #{ 'move' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon(),
       'version_group_details' := list()
     }.

encode(#{ 'move' := Move,
          'version_group_details' := VersionGroupDetails
        }) ->
    #{ 'move' => Move,
       'version_group_details' => VersionGroupDetails
     }.
