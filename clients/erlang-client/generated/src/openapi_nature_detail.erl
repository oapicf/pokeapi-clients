-module(openapi_nature_detail).

-export([encode/1]).

-export_type([openapi_nature_detail/0]).

-type openapi_nature_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'decreased_stat' := openapi_stat_summary:openapi_stat_summary(),
       'increased_stat' := openapi_stat_summary:openapi_stat_summary(),
       'likes_flavor' := openapi_berry_flavor_summary:openapi_berry_flavor_summary(),
       'hates_flavor' := openapi_berry_flavor_summary:openapi_berry_flavor_summary(),
       'berries' := list(),
       'pokeathlon_stat_changes' := list(),
       'move_battle_style_preferences' := list(),
       'names' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'decreased_stat' := DecreasedStat,
          'increased_stat' := IncreasedStat,
          'likes_flavor' := LikesFlavor,
          'hates_flavor' := HatesFlavor,
          'berries' := Berries,
          'pokeathlon_stat_changes' := PokeathlonStatChanges,
          'move_battle_style_preferences' := MoveBattleStylePreferences,
          'names' := Names
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'decreased_stat' => DecreasedStat,
       'increased_stat' => IncreasedStat,
       'likes_flavor' => LikesFlavor,
       'hates_flavor' => HatesFlavor,
       'berries' => Berries,
       'pokeathlon_stat_changes' => PokeathlonStatChanges,
       'move_battle_style_preferences' => MoveBattleStylePreferences,
       'names' => Names
     }.
