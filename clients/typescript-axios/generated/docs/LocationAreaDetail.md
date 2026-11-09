# LocationAreaDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**game_index** | **number** | The internal id of an API resource within game data. | [default to undefined]
**encounter_method_rates** | [**Array&lt;LocationAreaEncounterRate&gt;**](LocationAreaEncounterRate.md) | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. | [readonly] [default to undefined]
**location** | [**LocationSummary**](LocationSummary.md) | The region this location area can be found in. | [default to undefined]
**names** | [**Array&lt;LocationAreaName&gt;**](LocationAreaName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]
**pokemon_encounters** | [**Array&lt;LocationAreaPokemonEncounter&gt;**](LocationAreaPokemonEncounter.md) | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. | [readonly] [default to undefined]

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
