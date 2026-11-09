# PokemonEncounterDetailResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chance** | **number** | Percent chance that this encounter will occur. | [default to undefined]
**condition_values** | [**Array&lt;EncounterConditionValueSummary&gt;**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | [default to undefined]
**max_level** | **number** | The highest level the Pokémon could be encountered at. | [default to undefined]
**method** | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method by which this encounter happens. | [default to undefined]
**min_level** | **number** | The lowest level the Pokémon could be encountered at. | [default to undefined]

## Example

```typescript
import { PokemonEncounterDetailResponse } from './api';

const instance: PokemonEncounterDetailResponse = {
    chance,
    condition_values,
    max_level,
    method,
    min_level,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
