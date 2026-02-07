-module(openapi_item_detail).

-export([encode/1]).

-export_type([openapi_item_detail/0]).

-type openapi_item_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'cost' => integer(),
       'fling_power' => integer(),
       'fling_effect' := openapi_item_fling_effect_summary:openapi_item_fling_effect_summary(),
       'attributes' := list(),
       'category' := openapi_item_category_summary:openapi_item_category_summary(),
       'effect_entries' := list(),
       'flavor_text_entries' := list(),
       'game_indices' := list(),
       'names' := list(),
       'held_by_pokemon' := list(),
       'sprites' := openapi_item_detail_sprites:openapi_item_detail_sprites(),
       'baby_trigger_for' := openapi_item_detail_baby_trigger_for:openapi_item_detail_baby_trigger_for(),
       'machines' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'cost' := Cost,
          'fling_power' := FlingPower,
          'fling_effect' := FlingEffect,
          'attributes' := Attributes,
          'category' := Category,
          'effect_entries' := EffectEntries,
          'flavor_text_entries' := FlavorTextEntries,
          'game_indices' := GameIndices,
          'names' := Names,
          'held_by_pokemon' := HeldByPokemon,
          'sprites' := Sprites,
          'baby_trigger_for' := BabyTriggerFor,
          'machines' := Machines
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'cost' => Cost,
       'fling_power' => FlingPower,
       'fling_effect' => FlingEffect,
       'attributes' => Attributes,
       'category' => Category,
       'effect_entries' => EffectEntries,
       'flavor_text_entries' => FlavorTextEntries,
       'game_indices' => GameIndices,
       'names' => Names,
       'held_by_pokemon' => HeldByPokemon,
       'sprites' => Sprites,
       'baby_trigger_for' => BabyTriggerFor,
       'machines' => Machines
     }.
