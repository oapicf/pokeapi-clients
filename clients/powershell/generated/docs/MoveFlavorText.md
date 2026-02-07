# MoveFlavorText
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FlavorText** | **String** |  | 
**Language** | [**LanguageSummary**](LanguageSummary.md) |  | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 

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

