# MoveDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** |  | [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**accuracy** | **number** |  | [optional] [default to undefined]
**effect_chance** | **number** |  | [default to undefined]
**pp** | **number** |  | [optional] [default to undefined]
**priority** | **number** |  | [optional] [default to undefined]
**power** | **number** |  | [optional] [default to undefined]
**contest_combos** | [**MoveDetailContestCombos**](MoveDetailContestCombos.md) |  | [default to undefined]
**contest_type** | [**ContestTypeSummary**](ContestTypeSummary.md) |  | [default to undefined]
**contest_effect** | [**ContestEffectSummary**](ContestEffectSummary.md) |  | [default to undefined]
**damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | [default to undefined]
**effect_entries** | [**Array&lt;MoveChangeEffectEntriesInner&gt;**](MoveChangeEffectEntriesInner.md) |  | [default to undefined]
**effect_changes** | [**Array&lt;MoveDetailEffectChangesInner&gt;**](MoveDetailEffectChangesInner.md) |  | [default to undefined]
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | [default to undefined]
**meta** | [**MoveMeta**](MoveMeta.md) |  | [readonly] [default to undefined]
**names** | [**Array&lt;MoveName&gt;**](MoveName.md) |  | [default to undefined]
**past_values** | [**Array&lt;MoveChange&gt;**](MoveChange.md) |  | [default to undefined]
**stat_changes** | [**Array&lt;MoveDetailStatChangesInner&gt;**](MoveDetailStatChangesInner.md) |  | [default to undefined]
**super_contest_effect** | [**SuperContestEffectSummary**](SuperContestEffectSummary.md) |  | [default to undefined]
**target** | [**MoveTargetSummary**](MoveTargetSummary.md) |  | [default to undefined]
**type** | [**TypeSummary**](TypeSummary.md) |  | [default to undefined]
**machines** | [**Array&lt;MoveDetailMachinesInner&gt;**](MoveDetailMachinesInner.md) |  | [default to undefined]
**flavor_text_entries** | [**Array&lt;MoveFlavorText&gt;**](MoveFlavorText.md) |  | [default to undefined]
**learned_by_pokemon** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [default to undefined]

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
