# PokemonEncounterVersionDetailResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**VersionSummary**](VersionSummary.md) | The game version this encounter happens in. | [default to undefined]
**max_chance** | **number** | The total percentage of all encounter potential. | [default to undefined]
**encounter_details** | [**Array&lt;PokemonEncounterDetailResponse&gt;**](PokemonEncounterDetailResponse.md) | A list of encounters and their specifics. | [default to undefined]

## Example

```typescript
import { PokemonEncounterVersionDetailResponse } from './api';

const instance: PokemonEncounterVersionDetailResponse = {
    version,
    max_chance,
    encounter_details,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
