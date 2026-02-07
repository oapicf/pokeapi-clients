# MoveTargetDescription
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **String** |  | [optional] 
**Language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Examples

- Prepare the resource
```powershell
$MoveTargetDescription = Initialize-PSOpenAPIToolsMoveTargetDescription  -Description null `
 -Language null
```

- Convert the resource to JSON
```powershell
$MoveTargetDescription | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

