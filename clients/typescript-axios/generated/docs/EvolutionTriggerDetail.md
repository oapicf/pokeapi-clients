# EvolutionTriggerDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**names** | [**Array&lt;EvolutionTriggerName&gt;**](EvolutionTriggerName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]
**pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of pokemon species that result from this evolution trigger. | [readonly] [default to undefined]

## Example

```typescript
import { EvolutionTriggerDetail } from './api';

const instance: EvolutionTriggerDetail = {
    id,
    name,
    names,
    pokemon_species,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
