# GenderPokemonSpecies


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rate** | **number** | The chance of this Pokémon being female, in eighths; or -1 for genderless. | [default to undefined]
**pokemon_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | A Pokémon species that can be the referenced gender. | [default to undefined]

## Example

```typescript
import { GenderPokemonSpecies } from './api';

const instance: GenderPokemonSpecies = {
    rate,
    pokemon_species,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
