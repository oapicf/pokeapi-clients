# PalParkEncounter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**base_score** | **number** | The base score given to the player when this Pokémon is caught during a pal park run. | [optional] [default to undefined]
**rate** | **number** | The base rate for encountering this Pokémon in this pal park area. | [default to undefined]
**pokemon_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species being encountered. | [default to undefined]

## Example

```typescript
import { PalParkEncounter } from './api';

const instance: PalParkEncounter = {
    base_score,
    rate,
    pokemon_species,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
