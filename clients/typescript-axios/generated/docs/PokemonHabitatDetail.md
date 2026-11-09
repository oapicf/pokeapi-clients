# PokemonHabitatDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**names** | [**Array&lt;PokemonHabitatName&gt;**](PokemonHabitatName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]
**pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of the Pokémon species that can be found in this habitat. | [readonly] [default to undefined]

## Example

```typescript
import { PokemonHabitatDetail } from './api';

const instance: PokemonHabitatDetail = {
    id,
    name,
    names,
    pokemon_species,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
