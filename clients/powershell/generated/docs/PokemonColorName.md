# PokemonColorName
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | The localized name for an API resource in a specific language. | 
**Language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 

## Examples

- Prepare the resource
```powershell
$PokemonColorName = Initialize-PSOpenAPIToolsPokemonColorName  -Name null `
 -Language null
```

- Convert the resource to JSON
```powershell
$PokemonColorName | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

