# ItemDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**fling_power** | **number** | The power of the move Fling when used with this item. | [optional] [default to undefined]
**fling_effect** | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) | The effect of the move Fling when used with this item. | [default to undefined]
**attributes** | [**Array&lt;ItemAttributeSummary&gt;**](ItemAttributeSummary.md) | A list of attributes this item has. | [readonly] [default to undefined]
**category** | [**ItemCategorySummary**](ItemCategorySummary.md) | The category of items this item falls into. | [default to undefined]
**effect_entries** | [**Array&lt;ItemEffectText&gt;**](ItemEffectText.md) | The effect of this ability listed in different languages. | [readonly] [default to undefined]
**flavor_text_entries** | [**Array&lt;ItemFlavorText&gt;**](ItemFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] [default to undefined]
**game_indices** | [**Array&lt;ItemGameIndex&gt;**](ItemGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] [default to undefined]
**prices** | [**Array&lt;ItemPrice&gt;**](ItemPrice.md) | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. | [readonly] [default to undefined]
**names** | [**Array&lt;ItemName&gt;**](ItemName.md) | The name of this item listed in different languages. | [readonly] [default to undefined]
**held_by_pokemon** | [**Array&lt;PokemonHeldItem&gt;**](PokemonHeldItem.md) | A list of Pokémon that might be found in the wild holding this item. | [readonly] [default to undefined]
**sprites** | [**ItemSprites**](ItemSprites.md) | A set of sprites used to depict this item in the game. | [readonly] [default to undefined]
**baby_trigger_for** | [**EvolutionChainSummary**](EvolutionChainSummary.md) | An evolution chain this item requires to produce a bay during mating. | [readonly] [default to undefined]
**machines** | [**Array&lt;ItemMachine&gt;**](ItemMachine.md) | A list of the machines related to this item. | [readonly] [default to undefined]

## Example

```typescript
import { ItemDetail } from './api';

const instance: ItemDetail = {
    id,
    name,
    fling_power,
    fling_effect,
    attributes,
    category,
    effect_entries,
    flavor_text_entries,
    game_indices,
    prices,
    names,
    held_by_pokemon,
    sprites,
    baby_trigger_for,
    machines,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
