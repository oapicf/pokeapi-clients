# PokemonDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** |  | [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**base_experience** | **number** |  | [optional] [default to undefined]
**height** | **number** |  | [optional] [default to undefined]
**is_default** | **boolean** |  | [optional] [default to undefined]
**order** | **number** |  | [optional] [default to undefined]
**weight** | **number** |  | [optional] [default to undefined]
**abilities** | [**Array&lt;PokemonDetailAbilitiesInner&gt;**](PokemonDetailAbilitiesInner.md) |  | [default to undefined]
**past_abilities** | [**Array&lt;PokemonDetailPastAbilitiesInner&gt;**](PokemonDetailPastAbilitiesInner.md) |  | [default to undefined]
**forms** | [**Array&lt;PokemonFormSummary&gt;**](PokemonFormSummary.md) |  | [default to undefined]
**game_indices** | [**Array&lt;PokemonGameIndex&gt;**](PokemonGameIndex.md) |  | [default to undefined]
**held_items** | [**PokemonDetailHeldItems**](PokemonDetailHeldItems.md) |  | [default to undefined]
**location_area_encounters** | **string** |  | [readonly] [default to undefined]
**moves** | [**Array&lt;PokemonDetailMovesInner&gt;**](PokemonDetailMovesInner.md) |  | [default to undefined]
**species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | [default to undefined]
**sprites** | [**PokemonDetailSprites**](PokemonDetailSprites.md) |  | [default to undefined]
**cries** | [**PokemonDetailCries**](PokemonDetailCries.md) |  | [default to undefined]
**stats** | [**Array&lt;PokemonStat&gt;**](PokemonStat.md) |  | [default to undefined]
**types** | [**Array&lt;PokemonDetailTypesInner&gt;**](PokemonDetailTypesInner.md) |  | [default to undefined]
**past_types** | [**Array&lt;PokemonDetailPastTypesInner&gt;**](PokemonDetailPastTypesInner.md) |  | [default to undefined]

## Example

```typescript
import { PokemonDetail } from './api';

const instance: PokemonDetail = {
    id,
    name,
    base_experience,
    height,
    is_default,
    order,
    weight,
    abilities,
    past_abilities,
    forms,
    game_indices,
    held_items,
    location_area_encounters,
    moves,
    species,
    sprites,
    cries,
    stats,
    types,
    past_types,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
