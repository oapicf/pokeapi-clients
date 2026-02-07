# PokeApiClient::MoveDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **accuracy** | **Integer** |  | [optional] |
| **effect_chance** | **Integer** |  |  |
| **pp** | **Integer** |  | [optional] |
| **priority** | **Integer** |  | [optional] |
| **power** | **Integer** |  | [optional] |
| **contest_combos** | [**MoveDetailContestCombos**](MoveDetailContestCombos.md) |  |  |
| **contest_type** | [**ContestTypeSummary**](ContestTypeSummary.md) |  |  |
| **contest_effect** | [**ContestEffectSummary**](ContestEffectSummary.md) |  |  |
| **damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  |  |
| **effect_entries** | [**Array&lt;MoveChangeEffectEntriesInner&gt;**](MoveChangeEffectEntriesInner.md) |  |  |
| **effect_changes** | [**Array&lt;MoveDetailEffectChangesInner&gt;**](MoveDetailEffectChangesInner.md) |  |  |
| **generation** | [**GenerationSummary**](GenerationSummary.md) |  |  |
| **meta** | [**MoveMeta**](MoveMeta.md) |  | [readonly] |
| **names** | [**Array&lt;MoveName&gt;**](MoveName.md) |  |  |
| **past_values** | [**Array&lt;MoveChange&gt;**](MoveChange.md) |  |  |
| **stat_changes** | [**Array&lt;MoveDetailStatChangesInner&gt;**](MoveDetailStatChangesInner.md) |  |  |
| **super_contest_effect** | [**SuperContestEffectSummary**](SuperContestEffectSummary.md) |  |  |
| **target** | [**MoveTargetSummary**](MoveTargetSummary.md) |  |  |
| **type** | [**TypeSummary**](TypeSummary.md) |  |  |
| **machines** | [**Array&lt;MoveDetailMachinesInner&gt;**](MoveDetailMachinesInner.md) |  |  |
| **flavor_text_entries** | [**Array&lt;MoveFlavorText&gt;**](MoveFlavorText.md) |  |  |
| **learned_by_pokemon** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::MoveDetail.new(
  id: null,
  name: null,
  accuracy: null,
  effect_chance: null,
  pp: null,
  priority: null,
  power: null,
  contest_combos: null,
  contest_type: null,
  contest_effect: null,
  damage_class: null,
  effect_entries: null,
  effect_changes: null,
  generation: null,
  meta: null,
  names: null,
  past_values: null,
  stat_changes: null,
  super_contest_effect: null,
  target: null,
  type: null,
  machines: null,
  flavor_text_entries: null,
  learned_by_pokemon: null
)
```

