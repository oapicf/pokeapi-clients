-module(openapi_move_change).

-export([encode/1]).

-export_type([openapi_move_change/0]).

-type openapi_move_change() ::
    #{ 'accuracy' => integer(),
       'power' => integer(),
       'pp' => integer(),
       'effect_chance' := integer(),
       'effect_entries' := list(),
       'type' := openapi_type_summary:openapi_type_summary(),
       'version_group' := openapi_version_group_summary:openapi_version_group_summary()
     }.

encode(#{ 'accuracy' := Accuracy,
          'power' := Power,
          'pp' := Pp,
          'effect_chance' := EffectChance,
          'effect_entries' := EffectEntries,
          'type' := Type,
          'version_group' := VersionGroup
        }) ->
    #{ 'accuracy' => Accuracy,
       'power' => Power,
       'pp' => Pp,
       'effect_chance' => EffectChance,
       'effect_entries' => EffectEntries,
       'type' => Type,
       'version_group' => VersionGroup
     }.
