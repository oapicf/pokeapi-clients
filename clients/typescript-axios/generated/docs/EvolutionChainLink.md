# EvolutionChainLink


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_baby** | **boolean** | Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. | [default to undefined]
**species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species at this point in the evolution chain. | [default to undefined]
**evolution_details** | [**Array&lt;PokemonEvolution&gt;**](PokemonEvolution.md) | All details regarding the specific details of the referenced Pokémon species evolution. | [default to undefined]
**evolves_to** | [**Array&lt;EvolutionChainLink&gt;**](EvolutionChainLink.md) | A List of chain objects. | [readonly] [default to undefined]

## Example

```typescript
import { EvolutionChainLink } from './api';

const instance: EvolutionChainLink = {
    is_baby,
    species,
    evolution_details,
    evolves_to,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
