# ItemDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** |  | [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**cost** | **number** |  | [optional] [default to undefined]
**fling_power** | **number** |  | [optional] [default to undefined]
**fling_effect** | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) |  | [default to undefined]
**attributes** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [default to undefined]
**category** | [**ItemCategorySummary**](ItemCategorySummary.md) |  | [default to undefined]
**effect_entries** | [**Array&lt;ItemEffectText&gt;**](ItemEffectText.md) |  | [default to undefined]
**flavor_text_entries** | [**Array&lt;ItemFlavorText&gt;**](ItemFlavorText.md) |  | [default to undefined]
**game_indices** | [**Array&lt;ItemGameIndex&gt;**](ItemGameIndex.md) |  | [default to undefined]
**names** | [**Array&lt;ItemName&gt;**](ItemName.md) |  | [default to undefined]
**held_by_pokemon** | [**Array&lt;ItemDetailHeldByPokemonInner&gt;**](ItemDetailHeldByPokemonInner.md) |  | [default to undefined]
**sprites** | [**ItemDetailSprites**](ItemDetailSprites.md) |  | [default to undefined]
**baby_trigger_for** | [**ItemDetailBabyTriggerFor**](ItemDetailBabyTriggerFor.md) |  | [default to undefined]
**machines** | [**Array&lt;ItemDetailMachinesInner&gt;**](ItemDetailMachinesInner.md) |  | [default to undefined]

## Example

```typescript
import { ItemDetail } from './api';

const instance: ItemDetail = {
    id,
    name,
    cost,
    fling_power,
    fling_effect,
    attributes,
    category,
    effect_entries,
    flavor_text_entries,
    game_indices,
    names,
    held_by_pokemon,
    sprites,
    baby_trigger_for,
    machines,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
