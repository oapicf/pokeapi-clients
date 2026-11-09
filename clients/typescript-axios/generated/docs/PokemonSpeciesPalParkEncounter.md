# PokemonSpeciesPalParkEncounter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**base_score** | **number** | The base score given to the player when the referenced Pokémon is caught during a pal park run. | [optional] [default to undefined]
**rate** | **number** | The base rate for encountering the referenced Pokémon in this pal park area. | [default to undefined]
**area** | [**PalParkAreaSummary**](PalParkAreaSummary.md) | The pal park area where this encounter happens. | [default to undefined]

## Example

```typescript
import { PokemonSpeciesPalParkEncounter } from './api';

const instance: PokemonSpeciesPalParkEncounter = {
    base_score,
    rate,
    area,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
