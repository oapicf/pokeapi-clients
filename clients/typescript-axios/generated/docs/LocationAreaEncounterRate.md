# LocationAreaEncounterRate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encounter_method** | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method in which Pokémon may be encountered in an area.. | [default to undefined]
**version_details** | [**Array&lt;LocationAreaEncounterVersionDetail&gt;**](LocationAreaEncounterVersionDetail.md) | The chance of the encounter to occur on a version of the game. | [default to undefined]

## Example

```typescript
import { LocationAreaEncounterRate } from './api';

const instance: LocationAreaEncounterRate = {
    encounter_method,
    version_details,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
