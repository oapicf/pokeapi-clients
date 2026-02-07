-module(openapi_stat_detail).

-export([encode/1]).

-export_type([openapi_stat_detail/0]).

-type openapi_stat_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'game_index' := integer(),
       'is_battle_only' => boolean(),
       'affecting_moves' := openapi_stat_detail_affecting_moves:openapi_stat_detail_affecting_moves(),
       'affecting_natures' := openapi_stat_detail_affecting_natures:openapi_stat_detail_affecting_natures(),
       'characteristics' := list(),
       'move_damage_class' := openapi_move_damage_class_summary:openapi_move_damage_class_summary(),
       'names' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'game_index' := GameIndex,
          'is_battle_only' := IsBattleOnly,
          'affecting_moves' := AffectingMoves,
          'affecting_natures' := AffectingNatures,
          'characteristics' := Characteristics,
          'move_damage_class' := MoveDamageClass,
          'names' := Names
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'game_index' => GameIndex,
       'is_battle_only' => IsBattleOnly,
       'affecting_moves' => AffectingMoves,
       'affecting_natures' => AffectingNatures,
       'characteristics' => Characteristics,
       'move_damage_class' => MoveDamageClass,
       'names' => Names
     }.
