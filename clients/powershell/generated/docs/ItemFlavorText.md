# ItemFlavorText
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Text** | **String** | The localized flavor text for an API resource in a specific language. | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group which uses this flavor text. | 
**Language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 

## Examples

- Prepare the resource
```powershell
$ItemFlavorText = Initialize-PSOpenAPIToolsItemFlavorText  -Text null `
 -VersionGroup null `
 -Language null
```

- Convert the resource to JSON
```powershell
$ItemFlavorText | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

