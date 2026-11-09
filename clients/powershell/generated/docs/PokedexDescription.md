# PokedexDescription
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **String** | The localized description for an API resource in a specific language. | [optional] 
**Language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 

## Examples

- Prepare the resource
```powershell
$PokedexDescription = Initialize-PSOpenAPIToolsPokedexDescription  -Description null `
 -Language null
```

- Convert the resource to JSON
```powershell
$PokedexDescription | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

