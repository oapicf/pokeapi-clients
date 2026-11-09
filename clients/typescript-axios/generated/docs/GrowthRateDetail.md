# GrowthRateDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**formula** | **string** | The formula used to calculate the rate at which the Pokémon species gains level. | [default to undefined]
**descriptions** | [**Array&lt;GrowthRateDescription&gt;**](GrowthRateDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] [default to undefined]
**levels** | [**Array&lt;Experience&gt;**](Experience.md) | A list of levels and the amount of experienced needed to atain them based on this growth rate. | [readonly] [default to undefined]
**pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of Pokémon species that gain levels at this growth rate. | [readonly] [default to undefined]

## Example

```typescript
import { GrowthRateDetail } from './api';

const instance: GrowthRateDetail = {
    id,
    name,
    formula,
    descriptions,
    levels,
    pokemon_species,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
