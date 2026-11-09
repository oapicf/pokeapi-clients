# LocationAreaPokemonEncounter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon being encountered. | [default to undefined]
**version_details** | [**Array&lt;LocationAreaPokemonEncounterVersion&gt;**](LocationAreaPokemonEncounterVersion.md) | A list of versions and encounters with Pokémon that might happen in the referenced location area. | [default to undefined]

## Example

```typescript
import { LocationAreaPokemonEncounter } from './api';

const instance: LocationAreaPokemonEncounter = {
    pokemon,
    version_details,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
