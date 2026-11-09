# ItemEffectText
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Effect** | **String** | The localized effect text for an API resource in a specific language. | 
**ShortEffect** | **String** | The localized effect text in brief. | 
**Language** | [**LanguageSummary**](LanguageSummary.md) | The language this effect is in. | 

## Examples

- Prepare the resource
```powershell
$ItemEffectText = Initialize-PSOpenAPIToolsItemEffectText  -Effect null `
 -ShortEffect null `
 -Language null
```

- Convert the resource to JSON
```powershell
$ItemEffectText | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

