-module(openapi_pokemon_move).

-export([encode/1]).

-export_type([openapi_pokemon_move/0]).

-type openapi_pokemon_move() ::
    #{ 'move' := openapi_move_summary:openapi_move_summary(),
       'version_group_details' := list()
     }.

encode(#{ 'move' := Move,
          'version_group_details' := VersionGroupDetails
        }) ->
    #{ 'move' => Move,
       'version_group_details' => VersionGroupDetails
     }.
