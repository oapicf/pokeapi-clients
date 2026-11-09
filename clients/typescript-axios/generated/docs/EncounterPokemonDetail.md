# EncounterPokemonDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**min_perfect_ivs** | **number** | The minimum number of perfect IVs, or null if unspecified. | [optional] [default to undefined]
**always_shiny** | **boolean** | Whether the encountered Pokémon is always shiny. | [optional] [default to undefined]
**never_shiny** | **boolean** | Whether the encountered Pokémon can never be shiny. | [optional] [default to undefined]
**is_alpha** | **boolean** | Whether the encountered Pokémon is an alpha Pokémon. | [optional] [default to undefined]

## Example

```typescript
import { EncounterPokemonDetail } from './api';

const instance: EncounterPokemonDetail = {
    min_perfect_ivs,
    always_shiny,
    never_shiny,
    is_alpha,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
