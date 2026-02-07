# LocationAreaDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** |  | [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**game_index** | **number** |  | [default to undefined]
**encounter_method_rates** | [**Array&lt;LocationAreaDetailEncounterMethodRatesInner&gt;**](LocationAreaDetailEncounterMethodRatesInner.md) |  | [default to undefined]
**location** | [**LocationSummary**](LocationSummary.md) |  | [default to undefined]
**names** | [**Array&lt;LocationAreaName&gt;**](LocationAreaName.md) |  | [default to undefined]
**pokemon_encounters** | [**Array&lt;LocationAreaDetailPokemonEncountersInner&gt;**](LocationAreaDetailPokemonEncountersInner.md) |  | [default to undefined]

## Example

```typescript
import { LocationAreaDetail } from './api';

const instance: LocationAreaDetail = {
    id,
    name,
    game_index,
    encounter_method_rates,
    location,
    names,
    pokemon_encounters,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
