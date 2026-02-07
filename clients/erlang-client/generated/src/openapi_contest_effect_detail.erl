-module(openapi_contest_effect_detail).

-export([encode/1]).

-export_type([openapi_contest_effect_detail/0]).

-type openapi_contest_effect_detail() ::
    #{ 'id' := integer(),
       'appeal' := integer(),
       'jam' := integer(),
       'effect_entries' := list(),
       'flavor_text_entries' := list()
     }.

encode(#{ 'id' := Id,
          'appeal' := Appeal,
          'jam' := Jam,
          'effect_entries' := EffectEntries,
          'flavor_text_entries' := FlavorTextEntries
        }) ->
    #{ 'id' => Id,
       'appeal' => Appeal,
       'jam' => Jam,
       'effect_entries' => EffectEntries,
       'flavor_text_entries' => FlavorTextEntries
     }.
