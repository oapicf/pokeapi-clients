# PokemonSummary
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | The name of the referenced resource. | 
**Url** | **String** | The URL of the referenced resource. | [readonly] 

## Examples

- Prepare the resource
```powershell
$PokemonSummary = Initialize-PSOpenAPIToolsPokemonSummary  -Name null `
 -Url null
```

- Convert the resource to JSON
```powershell
$PokemonSummary | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

