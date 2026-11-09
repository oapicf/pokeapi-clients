# AbilityFlavorText
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FlavorText** | **String** | The localized name for an API resource in a specific language. | 
**Language** | [**LanguageSummary**](LanguageSummary.md) | The language this text resource is in. | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group that uses this flavor text. | 

## Examples

- Prepare the resource
```powershell
$AbilityFlavorText = Initialize-PSOpenAPIToolsAbilityFlavorText  -FlavorText null `
 -Language null `
 -VersionGroup null
```

- Convert the resource to JSON
```powershell
$AbilityFlavorText | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

