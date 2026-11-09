# ContestEffectFlavorText
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FlavorText** | **String** | The localized flavor text for an API resource in a specific language. | 
**Language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 

## Examples

- Prepare the resource
```powershell
$ContestEffectFlavorText = Initialize-PSOpenAPIToolsContestEffectFlavorText  -FlavorText null `
 -Language null
```

- Convert the resource to JSON
```powershell
$ContestEffectFlavorText | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

