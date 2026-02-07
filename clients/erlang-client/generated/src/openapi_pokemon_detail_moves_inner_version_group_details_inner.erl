-module(openapi_pokemon_detail_moves_inner_version_group_details_inner).

-export([encode/1]).

-export_type([openapi_pokemon_detail_moves_inner_version_group_details_inner/0]).

-type openapi_pokemon_detail_moves_inner_version_group_details_inner() ::
    #{ 'level_learned_at' := integer(),
       'move_learn_method' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon(),
       'version_group' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'level_learned_at' := LevelLearnedAt,
          'move_learn_method' := MoveLearnMethod,
          'version_group' := VersionGroup
        }) ->
    #{ 'level_learned_at' => LevelLearnedAt,
       'move_learn_method' => MoveLearnMethod,
       'version_group' => VersionGroup
     }.
