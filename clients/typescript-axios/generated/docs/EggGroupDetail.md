# EggGroupDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**names** | [**Array&lt;EggGroupName&gt;**](EggGroupName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]
**pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of all Pokémon species that are members of this egg group. | [readonly] [default to undefined]

## Example

```typescript
import { EggGroupDetail } from './api';

const instance: EggGroupDetail = {
    id,
    name,
    names,
    pokemon_species,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
