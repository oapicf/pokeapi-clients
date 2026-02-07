-module(openapi_move_meta).

-export([encode/1]).

-export_type([openapi_move_meta/0]).

-type openapi_move_meta() ::
    #{ 'ailment' := openapi_move_meta_ailment_summary:openapi_move_meta_ailment_summary(),
       'category' := openapi_move_meta_category_summary:openapi_move_meta_category_summary(),
       'min_hits' => integer(),
       'max_hits' => integer(),
       'min_turns' => integer(),
       'max_turns' => integer(),
       'drain' => integer(),
       'healing' => integer(),
       'crit_rate' => integer(),
       'ailment_chance' => integer(),
       'flinch_chance' => integer(),
       'stat_chance' => integer()
     }.

encode(#{ 'ailment' := Ailment,
          'category' := Category,
          'min_hits' := MinHits,
          'max_hits' := MaxHits,
          'min_turns' := MinTurns,
          'max_turns' := MaxTurns,
          'drain' := Drain,
          'healing' := Healing,
          'crit_rate' := CritRate,
          'ailment_chance' := AilmentChance,
          'flinch_chance' := FlinchChance,
          'stat_chance' := StatChance
        }) ->
    #{ 'ailment' => Ailment,
       'category' => Category,
       'min_hits' => MinHits,
       'max_hits' => MaxHits,
       'min_turns' => MinTurns,
       'max_turns' => MaxTurns,
       'drain' => Drain,
       'healing' => Healing,
       'crit_rate' => CritRate,
       'ailment_chance' => AilmentChance,
       'flinch_chance' => FlinchChance,
       'stat_chance' => StatChance
     }.
