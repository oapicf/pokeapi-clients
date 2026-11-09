# MoveTargetDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Descriptions** | [**MoveTargetDescription[]**](MoveTargetDescription.md) | The description of this resource listed in different languages. | [readonly] 
**Moves** | [**MoveSummary[]**](MoveSummary.md) | A list of moves that that are directed at this target. | [readonly] 
**Names** | [**MoveTargetName[]**](MoveTargetName.md) | The name of this resource listed in different languages. | [readonly] 

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

