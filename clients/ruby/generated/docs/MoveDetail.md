# PokeApiClient::MoveDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **accuracy** | **Integer** | The percent value of how likely this move is to be successful. | [optional] |
| **effect_chance** | **Integer** | The percent value of how likely it is this moves effect will happen. |  |
| **pp** | **Integer** | Power points. The number of times this move can be used. | [optional] |
| **priority** | **Integer** | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. | [optional] |
| **power** | **Integer** | The base power of this move, or null if it has no fixed base power. | [optional] |
| **contest_combos** | [**MoveCombos**](MoveCombos.md) | A detail of normal and super contest combos that require this move. | [readonly] |
| **contest_type** | [**ContestTypeSummary**](ContestTypeSummary.md) | The type of appeal this move gives a Pokémon when used in a contest. |  |
| **contest_effect** | [**ContestEffectSummary**](ContestEffectSummary.md) | The effect the move has when used in a contest. |  |
| **damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The type of damage the move inflicts on the target, e.g. physical. |  |
| **effect_entries** | [**Array&lt;MoveEffectEffectText&gt;**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] |
| **effect_changes** | [**Array&lt;MoveEffectChange&gt;**](MoveEffectChange.md) | The list of previous effects this move has had across version groups of the games. | [readonly] |
| **generation** | [**GenerationSummary**](GenerationSummary.md) | The generation in which this move was introduced. |  |
| **meta** | [**MoveMeta**](MoveMeta.md) | Metadata about this move | [readonly] |
| **names** | [**Array&lt;MoveName&gt;**](MoveName.md) | The name of this resource listed in different languages. | [readonly] |
| **past_values** | [**Array&lt;MoveChange&gt;**](MoveChange.md) | A list of move resource value changes across version groups of the game. | [readonly] |
| **stat_changes** | [**Array&lt;MoveMetaStatChange&gt;**](MoveMetaStatChange.md) | A list of stats this moves effects and how much it effects them. | [readonly] |
| **super_contest_effect** | [**SuperContestEffectSummary**](SuperContestEffectSummary.md) | The effect the move has when used in a super contest. |  |
| **target** | [**MoveTargetSummary**](MoveTargetSummary.md) | The type of target that will receive the effects of the attack. |  |
| **type** | [**TypeSummary**](TypeSummary.md) | The elemental type of this move. |  |
| **machines** | [**Array&lt;ItemMachine&gt;**](ItemMachine.md) | A list of the machines that teach this move. | [readonly] |
| **flavor_text_entries** | [**Array&lt;MoveFlavorText&gt;**](MoveFlavorText.md) | The flavor text of this move listed in different languages. | [readonly] |
| **learned_by_pokemon** | [**Array&lt;PokemonSummary&gt;**](PokemonSummary.md) | List of Pokemon that can learn the move | [readonly] |

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

