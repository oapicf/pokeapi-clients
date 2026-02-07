-module(openapi_ability_detail).

-export([encode/1]).

-export_type([openapi_ability_detail/0]).

-type openapi_ability_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'is_main_series' => boolean(),
       'generation' := openapi_generation_summary:openapi_generation_summary(),
       'names' := list(),
       'effect_entries' := list(),
       'effect_changes' := list(),
       'flavor_text_entries' := list(),
       'pokemon' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'is_main_series' := IsMainSeries,
          'generation' := Generation,
          'names' := Names,
          'effect_entries' := EffectEntries,
          'effect_changes' := EffectChanges,
          'flavor_text_entries' := FlavorTextEntries,
          'pokemon' := Pokemon
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'is_main_series' => IsMainSeries,
       'generation' => Generation,
       'names' => Names,
       'effect_entries' => EffectEntries,
       'effect_changes' => EffectChanges,
       'flavor_text_entries' => FlavorTextEntries,
       'pokemon' => Pokemon
     }.
