# PokemonEncounterResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LocationArea** | [**LocationAreaSummary**](LocationAreaSummary.md) | The location area the referenced Pokémon can be encountered in. | 
**VersionDetails** | [**PokemonEncounterVersionDetailResponse[]**](PokemonEncounterVersionDetailResponse.md) | A list of versions and encounters with the referenced Pokémon that might happen. | 

## Examples

- Prepare the resource
```powershell
$PokemonEncounterResponse = Initialize-PSOpenAPIToolsPokemonEncounterResponse  -LocationArea null `
 -VersionDetails null
```

- Convert the resource to JSON
```powershell
$PokemonEncounterResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

