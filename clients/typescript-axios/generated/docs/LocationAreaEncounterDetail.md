# LocationAreaEncounterDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**min_level** | **number** | The lowest level the Pokémon could be encountered at. | [default to undefined]
**max_level** | **number** | The highest level the Pokémon could be encountered at. | [default to undefined]
**chance** | **number** | Percent chance that this encounter will occur. | [optional] [default to 0]
**method** | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method by which this encounter happens. | [optional] [default to undefined]
**condition_values** | [**Array&lt;EncounterConditionValueSummary&gt;**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | [readonly] [default to undefined]
**pokemon_details** | [**EncounterPokemonDetail**](EncounterPokemonDetail.md) | Additional properties of the encountered Pokémon, or null if unspecified. | [readonly] [default to undefined]

## Example

```typescript
import { LocationAreaEncounterDetail } from './api';

const instance: LocationAreaEncounterDetail = {
    min_level,
    max_level,
    chance,
    method,
    condition_values,
    pokemon_details,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
