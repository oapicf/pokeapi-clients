# GenderDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** |  | [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**pokemon_species_details** | [**Array&lt;GenderDetailPokemonSpeciesDetailsInner&gt;**](GenderDetailPokemonSpeciesDetailsInner.md) |  | [default to undefined]
**required_for_evolution** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [default to undefined]

## Example

```typescript
import { GenderDetail } from './api';

const instance: GenderDetail = {
    id,
    name,
    pokemon_species_details,
    required_for_evolution,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
