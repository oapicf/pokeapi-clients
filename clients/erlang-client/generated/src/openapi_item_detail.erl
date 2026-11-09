-module(openapi_item_detail).

-export([encode/1]).

-export_type([openapi_item_detail/0]).

-type openapi_item_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'fling_power' => integer(),
       'fling_effect' := openapi_item_fling_effect_summary:openapi_item_fling_effect_summary(),
       'attributes' := list(),
       'category' := openapi_item_category_summary:openapi_item_category_summary(),
       'effect_entries' := list(),
       'flavor_text_entries' := list(),
       'game_indices' := list(),
       'prices' := list(),
       'names' := list(),
       'held_by_pokemon' := list(),
       'sprites' := openapi_item_sprites:openapi_item_sprites(),
       'baby_trigger_for' := openapi_evolution_chain_summary:openapi_evolution_chain_summary(),
       'machines' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'fling_power' := FlingPower,
          'fling_effect' := FlingEffect,
          'attributes' := Attributes,
          'category' := Category,
          'effect_entries' := EffectEntries,
          'flavor_text_entries' := FlavorTextEntries,
          'game_indices' := GameIndices,
          'prices' := Prices,
          'names' := Names,
          'held_by_pokemon' := HeldByPokemon,
          'sprites' := Sprites,
          'baby_trigger_for' := BabyTriggerFor,
          'machines' := Machines
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'fling_power' => FlingPower,
       'fling_effect' => FlingEffect,
       'attributes' => Attributes,
       'category' => Category,
       'effect_entries' => EffectEntries,
       'flavor_text_entries' => FlavorTextEntries,
       'game_indices' => GameIndices,
       'prices' => Prices,
       'names' => Names,
       'held_by_pokemon' => HeldByPokemon,
       'sprites' => Sprites,
       'baby_trigger_for' => BabyTriggerFor,
       'machines' => Machines
     }.
