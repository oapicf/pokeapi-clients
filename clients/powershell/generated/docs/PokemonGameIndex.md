# PokemonGameIndex
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GameIndex** | **Int32** | The internal id of an API resource within game data. | 
**Version** | [**VersionSummary**](VersionSummary.md) | The version relevent to this game index. | 

## Examples

- Prepare the resource
```powershell
$PokemonGameIndex = Initialize-PSOpenAPIToolsPokemonGameIndex  -GameIndex null `
 -Version null
```

- Convert the resource to JSON
```powershell
$PokemonGameIndex | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

