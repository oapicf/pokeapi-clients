# LocationAreaEncounterVersionDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Rate** | **Int32** | The chance of an encounter to occur. | 
**Version** | [**VersionSummary**](VersionSummary.md) | The version of the game in which the encounter can occur with the given chance. | 

## Examples

- Prepare the resource
```powershell
$LocationAreaEncounterVersionDetail = Initialize-PSOpenAPIToolsLocationAreaEncounterVersionDetail  -Rate null `
 -Version null
```

- Convert the resource to JSON
```powershell
$LocationAreaEncounterVersionDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

