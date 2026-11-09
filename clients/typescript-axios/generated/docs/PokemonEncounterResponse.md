# PokemonEncounterResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location_area** | [**LocationAreaSummary**](LocationAreaSummary.md) | The location area the referenced Pokémon can be encountered in. | [default to undefined]
**version_details** | [**Array&lt;PokemonEncounterVersionDetailResponse&gt;**](PokemonEncounterVersionDetailResponse.md) | A list of versions and encounters with the referenced Pokémon that might happen. | [default to undefined]

## Example

```typescript
import { PokemonEncounterResponse } from './api';

const instance: PokemonEncounterResponse = {
    location_area,
    version_details,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
