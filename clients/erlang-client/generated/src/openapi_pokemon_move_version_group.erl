-module(openapi_pokemon_move_version_group).

-export([encode/1]).

-export_type([openapi_pokemon_move_version_group/0]).

-type openapi_pokemon_move_version_group() ::
    #{ 'level_learned_at' := integer(),
       'move_learn_method' := openapi_move_learn_method_summary:openapi_move_learn_method_summary(),
       'version_group' := openapi_version_group_summary:openapi_version_group_summary(),
       'order' => integer()
     }.

encode(#{ 'level_learned_at' := LevelLearnedAt,
          'move_learn_method' := MoveLearnMethod,
          'version_group' := VersionGroup,
          'order' := Order
        }) ->
    #{ 'level_learned_at' => LevelLearnedAt,
       'move_learn_method' => MoveLearnMethod,
       'version_group' => VersionGroup,
       'order' => Order
     }.
