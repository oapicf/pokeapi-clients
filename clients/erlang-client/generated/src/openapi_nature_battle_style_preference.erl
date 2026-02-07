-module(openapi_nature_battle_style_preference).

-export([encode/1]).

-export_type([openapi_nature_battle_style_preference/0]).

-type openapi_nature_battle_style_preference() ::
    #{ 'low_hp_preference' := integer(),
       'high_hp_preference' := integer(),
       'move_battle_style' := openapi_move_battle_style_summary:openapi_move_battle_style_summary()
     }.

encode(#{ 'low_hp_preference' := LowHpPreference,
          'high_hp_preference' := HighHpPreference,
          'move_battle_style' := MoveBattleStyle
        }) ->
    #{ 'low_hp_preference' => LowHpPreference,
       'high_hp_preference' => HighHpPreference,
       'move_battle_style' => MoveBattleStyle
     }.
