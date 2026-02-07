-module(openapi_move_detail_machines_inner).

-export([encode/1]).

-export_type([openapi_move_detail_machines_inner/0]).

-type openapi_move_detail_machines_inner() ::
    #{ 'machine' := openapi_move_detail_machines_inner_machine:openapi_move_detail_machines_inner_machine(),
       'version_group' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'machine' := Machine,
          'version_group' := VersionGroup
        }) ->
    #{ 'machine' => Machine,
       'version_group' => VersionGroup
     }.
