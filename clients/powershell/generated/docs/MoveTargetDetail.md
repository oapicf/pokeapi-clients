# MoveTargetDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Descriptions** | [**MoveTargetDescription[]**](MoveTargetDescription.md) |  | 
**Moves** | [**MoveSummary[]**](MoveSummary.md) |  | 
**Names** | [**MoveTargetName[]**](MoveTargetName.md) |  | 

## Examples

- Prepare the resource
```powershell
$MoveTargetDetail = Initialize-PSOpenAPIToolsMoveTargetDetail  -Id null `
 -Name null `
 -Descriptions null `
 -Moves null `
 -Names null
```

- Convert the resource to JSON
```powershell
$MoveTargetDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

