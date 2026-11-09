# LocationAreaPokemonEncounter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon being encountered. | 
**VersionDetails** | [**LocationAreaPokemonEncounterVersion[]**](LocationAreaPokemonEncounterVersion.md) | A list of versions and encounters with Pokémon that might happen in the referenced location area. | 

## Examples

- Prepare the resource
```powershell
$LocationAreaPokemonEncounter = Initialize-PSOpenAPIToolsLocationAreaPokemonEncounter  -Pokemon null `
 -VersionDetails null
```

- Convert the resource to JSON
```powershell
$LocationAreaPokemonEncounter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

