# MoveFlavorText
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FlavorText** | **String** | The localized flavor text for an api resource in a specific language. | 
**Language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group that uses this flavor text. | 

## Examples

- Prepare the resource
```powershell
$MoveFlavorText = Initialize-PSOpenAPIToolsMoveFlavorText  -FlavorText null `
 -Language null `
 -VersionGroup null
```

- Convert the resource to JSON
```powershell
$MoveFlavorText | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

