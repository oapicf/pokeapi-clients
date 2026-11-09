# LocationAreaEncounterRate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EncounterMethod** | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method in which Pokémon may be encountered in an area.. | 
**VersionDetails** | [**LocationAreaEncounterVersionDetail[]**](LocationAreaEncounterVersionDetail.md) | The chance of the encounter to occur on a version of the game. | 

## Examples

- Prepare the resource
```powershell
$LocationAreaEncounterRate = Initialize-PSOpenAPIToolsLocationAreaEncounterRate  -EncounterMethod null `
 -VersionDetails null
```

- Convert the resource to JSON
```powershell
$LocationAreaEncounterRate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

