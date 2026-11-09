# LocationAreaPokemonEncounterVersion
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Version** | [**VersionSummary**](VersionSummary.md) | The game version this encounter happens in. | 
**MaxChance** | **Int32** | The total percentage of all encounter potential. | 
**EncounterDetails** | [**LocationAreaEncounterDetail[]**](LocationAreaEncounterDetail.md) | A list of encounters and their specifics. | 

## Examples

- Prepare the resource
```powershell
$LocationAreaPokemonEncounterVersion = Initialize-PSOpenAPIToolsLocationAreaPokemonEncounterVersion  -Version null `
 -MaxChance null `
 -EncounterDetails null
```

- Convert the resource to JSON
```powershell
$LocationAreaPokemonEncounterVersion | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

