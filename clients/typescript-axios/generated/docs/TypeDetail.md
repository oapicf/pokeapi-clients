# TypeDetail

Serializer for the Type resource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** |  | [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**damage_relations** | [**TypeDetailDamageRelations**](TypeDetailDamageRelations.md) |  | [default to undefined]
**past_damage_relations** | [**Array&lt;TypeDetailPastDamageRelationsInner&gt;**](TypeDetailPastDamageRelationsInner.md) |  | [default to undefined]
**game_indices** | [**Array&lt;TypeGameIndex&gt;**](TypeGameIndex.md) |  | [default to undefined]
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | [default to undefined]
**move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | [default to undefined]
**names** | [**Array&lt;AbilityName&gt;**](AbilityName.md) |  | [default to undefined]
**pokemon** | [**Array&lt;TypeDetailPokemonInner&gt;**](TypeDetailPokemonInner.md) |  | [default to undefined]
**moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) |  | [default to undefined]
**sprites** | **{ [key: string]: { [key: string]: TypeDetailSpritesValueValue; }; }** |  | [readonly] [default to undefined]

## Example

```typescript
import { TypeDetail } from './api';

const instance: TypeDetail = {
    id,
    name,
    damage_relations,
    past_damage_relations,
    game_indices,
    generation,
    move_damage_class,
    names,
    pokemon,
    moves,
    sprites,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
