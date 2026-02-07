-module(openapi_item_fling_effect_detail).

-export([encode/1]).

-export_type([openapi_item_fling_effect_detail/0]).

-type openapi_item_fling_effect_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'effect_entries' := list(),
       'items' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'effect_entries' := EffectEntries,
          'items' := Items
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'effect_entries' => EffectEntries,
       'items' => Items
     }.
