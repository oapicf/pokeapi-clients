# MoveDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**accuracy** | **number** | The percent value of how likely this move is to be successful. | [optional] [default to undefined]
**effect_chance** | **number** | The percent value of how likely it is this moves effect will happen. | [default to undefined]
**pp** | **number** | Power points. The number of times this move can be used. | [optional] [default to undefined]
**priority** | **number** | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. | [optional] [default to undefined]
**power** | **number** | The base power of this move, or null if it has no fixed base power. | [optional] [default to undefined]
**contest_combos** | [**MoveCombos**](MoveCombos.md) | A detail of normal and super contest combos that require this move. | [readonly] [default to undefined]
**contest_type** | [**ContestTypeSummary**](ContestTypeSummary.md) | The type of appeal this move gives a Pokémon when used in a contest. | [default to undefined]
**contest_effect** | [**ContestEffectSummary**](ContestEffectSummary.md) | The effect the move has when used in a contest. | [default to undefined]
**damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The type of damage the move inflicts on the target, e.g. physical. | [default to undefined]
**effect_entries** | [**Array&lt;MoveEffectEffectText&gt;**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] [default to undefined]
**effect_changes** | [**Array&lt;MoveEffectChange&gt;**](MoveEffectChange.md) | The list of previous effects this move has had across version groups of the games. | [readonly] [default to undefined]
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation in which this move was introduced. | [default to undefined]
**meta** | [**MoveMeta**](MoveMeta.md) | Metadata about this move | [readonly] [default to undefined]
**names** | [**Array&lt;MoveName&gt;**](MoveName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]
**past_values** | [**Array&lt;MoveChange&gt;**](MoveChange.md) | A list of move resource value changes across version groups of the game. | [readonly] [default to undefined]
**stat_changes** | [**Array&lt;MoveMetaStatChange&gt;**](MoveMetaStatChange.md) | A list of stats this moves effects and how much it effects them. | [readonly] [default to undefined]
**super_contest_effect** | [**SuperContestEffectSummary**](SuperContestEffectSummary.md) | The effect the move has when used in a super contest. | [default to undefined]
**target** | [**MoveTargetSummary**](MoveTargetSummary.md) | The type of target that will receive the effects of the attack. | [default to undefined]
**type** | [**TypeSummary**](TypeSummary.md) | The elemental type of this move. | [default to undefined]
**machines** | [**Array&lt;ItemMachine&gt;**](ItemMachine.md) | A list of the machines that teach this move. | [readonly] [default to undefined]
**flavor_text_entries** | [**Array&lt;MoveFlavorText&gt;**](MoveFlavorText.md) | The flavor text of this move listed in different languages. | [readonly] [default to undefined]
**learned_by_pokemon** | [**Array&lt;PokemonSummary&gt;**](PokemonSummary.md) | List of Pokemon that can learn the move | [readonly] [default to undefined]

## Example

```typescript
import { MoveDetail } from './api';

const instance: MoveDetail = {
    id,
    name,
    accuracy,
    effect_chance,
    pp,
    priority,
    power,
    contest_combos,
    contest_type,
    contest_effect,
    damage_class,
    effect_entries,
    effect_changes,
    generation,
    meta,
    names,
    past_values,
    stat_changes,
    super_contest_effect,
    target,
    type,
    machines,
    flavor_text_entries,
    learned_by_pokemon,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
